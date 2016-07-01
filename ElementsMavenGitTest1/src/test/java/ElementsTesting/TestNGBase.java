package ElementsTesting;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestNGBase {
	protected WebDriver driver;
	protected String browser = "";
	protected String startingUrl = "";
	protected Integer implicitWaitTimeMS = 0;
	protected Integer displayWaitTimeMS = 0;
	protected Integer verticalScrollPixels = 0;
	
	// Path to chromedriver.exe. It may be downloaded from http://code.google.com/p/selenium/wiki/ChromeDriver.
	protected String chromeDriverLocation = "";
	
	// Path to IEdriver.exe. It may be downloaded from:
	// 32 bits - http://selenium-release.storage.googleapis.com/2.42/IEDriverServer_Win32_2.42.0.zip
	// 64 bits - http://selenium-release.storage.googleapis.com/2.42/IEDriverServer_x64_2.42.0.zip
	protected String IEDriverLocation = "";
	
	protected StringBuffer verificationErrors = new StringBuffer();

	/**  
	 * This function will execute before each Class tag in testng.xml
	 * @param browser
	 * @throws Exception
	 */
	@BeforeClass
	@Parameters({"browser", "startingUrl", "implicitWaitTimeMS", "displayWaitTimeMS", "chromeDriverLocation", "IEDriverLocation", "verticalScrollPixels"})
	protected void setupBaseClass(String browser,
								  @Optional("http://elements.hpswlabs.hp.com/QA_preview/") String startingUrl,
								  @Optional("5000") Integer implicitWaitTimeMS,
								  @Optional("2000") Integer displayWaitTimeMS,
								  @Optional("C:\\chromedriver.exe") String chromeDriverLocation,
								  @Optional("C:\\IEdriverServer.exe") String IEDriverLocation,
								  @Optional("0") Integer verticalScrollPixels) throws Exception{
		this.browser = browser;
		
		//Check if parameter passed from TestNG is 'firefox'
		if(this.browser.equalsIgnoreCase("firefox")){
			// Create Firefox instance
			this.driver = new FirefoxDriver();
		}
		//Check if parameter passed from TestNG is 'chrome'
		else if(this.browser.equalsIgnoreCase("chrome")){			
			if (!chromeDriverLocation.isEmpty()) {
				this.chromeDriverLocation = chromeDriverLocation;
			}
			System.setProperty("webdriver.chrome.driver", this.chromeDriverLocation);

			// Create Chrome instance
			this.driver = new ChromeDriver();
		}
		//Check if parameter passed from TestNG is 'ie'
		else if(this.browser.equalsIgnoreCase("ie")){
			if (!IEDriverLocation.isEmpty()) {
				this.IEDriverLocation = IEDriverLocation;
			}
			System.setProperty("webdriver.ie.driver", this.IEDriverLocation);

			// Create IE instance. Disable persistent hovering.
			DesiredCapabilities returnCapabilities = DesiredCapabilities.internetExplorer();
			returnCapabilities.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
			this.driver = new InternetExplorerDriver(returnCapabilities);
		}
		else{
			//If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}

		// Record the starting URL
		if (!startingUrl.isEmpty()) {
			this.startingUrl = startingUrl;
		}
		
		// Record the implicit wait time, the time to be taken to find an element or elements
		this.implicitWaitTimeMS = implicitWaitTimeMS;
		driver.manage().timeouts().implicitlyWait(this.implicitWaitTimeMS, TimeUnit.MILLISECONDS);
		
		// Record the display wait time, the time to wait to allow a page to be loaded before performing the next action
		this.displayWaitTimeMS = displayWaitTimeMS;

		// Record the number of pixels by which the window may be scrolled to make controls visible
		this.verticalScrollPixels = verticalScrollPixels;

		// Maximise the window
		this.driver.manage().window().maximize();
	}

	@BeforeMethod(alwaysRun = true)
	protected void clearErrors() throws Exception {
		verificationErrors.setLength(0);
	}
	
	//@AfterMethod(alwaysRun = true)
	protected void logErrors() throws Exception {
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}
	
	@AfterClass(alwaysRun = true)
	protected void tearDown() throws Exception {
		this.driver.quit();
	}
	
	protected boolean isElementPresent(By by) {
		try {
			this.driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}

