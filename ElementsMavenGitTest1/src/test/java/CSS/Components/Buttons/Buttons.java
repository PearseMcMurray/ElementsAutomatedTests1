package CSS.Components.Buttons;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import ElementsTesting.TestNGBase;
import ElementsTesting.Utilities;

public class Buttons extends TestNGBase {
	@Test(alwaysRun = true)
	public void testButtonDropdowns() throws Exception {
		try {
			driver.get(startingUrl + "");
			driver.findElement(By.cssSelector("#angular > #angular")).click();
			driver.findElement(By.cssSelector("span.switcher span.btn-group button.switch-group")).click();
			Thread.sleep(displayWaitTimeMS);
			driver.findElement(By.cssSelector("span.ng-binding.m-l-md")).click();
			driver.findElement(By.cssSelector("span.nav-label")).click();
			driver.findElement(By.linkText("Buttons")).click();

			String className = getClass().getCanonicalName();
			String methodName = Utilities.getMethodName();

			// Ensure controls are visible for clicking
			WebElement element = driver.findElement(By.cssSelector(
					"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(2) div.hpebox div.hpebox-content div.btn-group.m-b button.btn.btn-lg.button-primary"));
			Utilities.performVerticalScroll(driver, element, verticalScrollPixels);

			// Verify first button text
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(2) div.hpebox div.hpebox-content div.btn-group.m-b button.btn.btn-lg.button-primary"))
						.getText(), "ACTION");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the first dropdown
			element.click();

			// Verify menu item's titles
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(1) a"))
								.getText(),
						"Action");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(2) a"))
								.getText(),
						"Another action");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(3) a"))
								.getText(),
						"Something else here");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(5) a"))
								.getText(),
						"Separated link");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Verify menu items' links
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(1) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(2) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(3) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(5) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on first menu item and verify new location
			driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(1)")).click();
			try {
				assertEquals(driver.getTitle(), "Elements Documentation");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Return to Buttons page
			driver.findElement(By.cssSelector("span.nav-label")).click();
			Thread.sleep(displayWaitTimeMS);
			driver.findElement(By.linkText("Buttons")).click();

			// Verify second button text
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(2) div.hpebox div.hpebox-content div.btn-group.m-b button.btn.btn-lg.button-secondary"))
						.getText(), "ACTION");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Ensure dropdowns are visible for clicking
			element = driver.findElement(By.cssSelector(
					"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(2) div.hpebox div.hpebox-content div.btn-group.m-b button.btn.btn-lg.button-secondary"));
			Utilities.performVerticalScroll(driver, element, verticalScrollPixels);

			// Click on the second dropdown
			element.click();

			// Verify menu item's titles
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(1) a"))
								.getText(),
						"Action");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(2) a"))
								.getText(),
						"Another action");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(3) a"))
								.getText(),
						"Something else here");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(5) a"))
								.getText(),
						"Separated link");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Verify menu items' links
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(1) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(2) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(3) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(5) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on second menu item and verify new location
			driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(2)")).click();
			try {
				assertEquals(driver.getTitle(), "Elements Documentation");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Return to Buttons page
			driver.findElement(By.cssSelector("span.nav-label")).click();
			Thread.sleep(displayWaitTimeMS);
			driver.findElement(By.linkText("Buttons")).click();

			// Verify third button text
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(2) div.hpebox div.hpebox-content div.btn-group.m-b button.btn.btn.button-primary"))
						.getText(), "ACTION");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Ensure dropdowns are visible for clicking
			element = driver.findElement(By.cssSelector(
					"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(2) div.hpebox div.hpebox-content div.btn-group.m-b button.btn.btn.button-primary"));
			Utilities.performVerticalScroll(driver, element, verticalScrollPixels);

			// Click on the third dropdown
			element.click();

			// Verify menu item's titles
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(1) a"))
								.getText(),
						"Action");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(2) a"))
								.getText(),
						"Another action");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(3) a"))
								.getText(),
						"Something else here");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(5) a"))
								.getText(),
						"Separated link");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Verify menu items' links
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(1) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(2) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(3) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(5) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on third menu item and verify new location
			driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(3)")).click();
			try {
				assertEquals(driver.getTitle(), "Elements Documentation");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Return to Buttons page
			driver.findElement(By.cssSelector("span.nav-label")).click();
			Thread.sleep(displayWaitTimeMS);
			driver.findElement(By.linkText("Buttons")).click();

			// Verify fourth button text
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(2) div.hpebox div.hpebox-content div.btn-group.m-b button.btn.btn.button-secondary"))
						.getText(), "ACTION");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Ensure dropdowns are visible for clicking
			element = driver.findElement(By.cssSelector(
					"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(2) div.hpebox div.hpebox-content div.btn-group.m-b button.btn.btn.button-secondary"));
			Utilities.performVerticalScroll(driver, element, verticalScrollPixels);

			// Click on the fourth dropdown
			element.click();

			// Verify menu item's titles
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(1) a"))
								.getText(),
						"Action");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(2) a"))
								.getText(),
						"Another action");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(3) a"))
								.getText(),
						"Something else here");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(5) a"))
								.getText(),
						"Separated link");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Verify menu items' links
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(1) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(2) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(3) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(5) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on fourth menu item and verify new location
			driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(5)")).click();
			try {
				assertEquals(driver.getTitle(), "Elements Documentation");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Return to Buttons page
			driver.findElement(By.cssSelector("span.nav-label")).click();
			Thread.sleep(displayWaitTimeMS);
			driver.findElement(By.linkText("Buttons")).click();

			// Verify fifth button text
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(2) div.hpebox div.hpebox-content div.btn-group.m-b button.btn.btn-sm.button-primary"))
						.getText(), "ACTION");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Ensure dropdowns are visible for clicking
			element = driver.findElement(By.cssSelector(
					"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(2) div.hpebox div.hpebox-content div.btn-group.m-b button.btn.btn-sm.button-primary"));
			Utilities.performVerticalScroll(driver, element, verticalScrollPixels);

			// Click on the fifth dropdown
			element.click();

			// Verify menu item's titles
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(1) a"))
								.getText(),
						"Action");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(2) a"))
								.getText(),
						"Another action");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(3) a"))
								.getText(),
						"Something else here");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(5) a"))
								.getText(),
						"Separated link");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Verify menu items' links
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(1) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(2) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(3) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(5) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on first menu item and verify new location
			driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(1)")).click();
			try {
				assertEquals(driver.getTitle(), "Elements Documentation");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Return to Buttons page
			driver.findElement(By.cssSelector("span.nav-label")).click();
			Thread.sleep(displayWaitTimeMS);
			driver.findElement(By.linkText("Buttons")).click();

			// Verify sixth button text
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(2) div.hpebox div.hpebox-content div.btn-group.m-b button.btn.btn-sm.button-secondary"))
						.getText(), "ACTION");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Ensure dropdowns are visible for clicking
			element = driver.findElement(By.cssSelector(
					"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(2) div.hpebox div.hpebox-content div.btn-group.m-b button.btn.btn-sm.button-secondary"));
			Utilities.performVerticalScroll(driver, element, verticalScrollPixels);

			// Click on the sixth dropdown
			element.click();

			// Verify menu item's titles
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(1) a"))
								.getText(),
						"Action");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(2) a"))
								.getText(),
						"Another action");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(3) a"))
								.getText(),
						"Something else here");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(5) a"))
								.getText(),
						"Separated link");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Verify menu items' links
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(1) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(2) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(3) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(5) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on second menu item and verify new location
			driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(2)")).click();
			try {
				assertEquals(driver.getTitle(), "Elements Documentation");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
		} finally {
			logErrors();
		}
	}

	@Test(alwaysRun = true)
	public void testSplitButtonDropdowns() throws Exception {
		try {
			driver.get(startingUrl + "");
			driver.findElement(By.cssSelector("#angular > #angular")).click();
			driver.findElement(By.cssSelector("span.switcher span.btn-group button.switch-group")).click();
			Thread.sleep(displayWaitTimeMS);
			driver.findElement(By.cssSelector("span.ng-binding.m-l-md")).click();
			driver.findElement(By.cssSelector("span.nav-label")).click();
			driver.findElement(By.linkText("Buttons")).click();

			String className = getClass().getCanonicalName();
			String methodName = Utilities.getMethodName();

			// Ensure controls are visible for clicking
			WebElement element = driver.findElement(By.cssSelector(
					"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(3) div.hpebox-content div.btn-group.m-b button.btn.btn-lg.button-primary.dropdown-toggle"));
			Utilities.performVerticalScroll(driver, element, verticalScrollPixels);

			// Verify first button text
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(3) div.hpebox-content div.btn-group.m-b button.btn.btn-lg.button-primary"))
						.getText(), "ACTION");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the first dropdown
			element.click();

			// Verify menu item's titles
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(1) a"))
								.getText(),
						"Action");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(2) a"))
								.getText(),
						"Another action");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(3) a"))
								.getText(),
						"Something else here");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(5) a"))
								.getText(),
						"Separated link");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Verify menu items' links
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(1) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(2) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(3) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(5) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on first menu item and verify new location
			driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(1)")).click();
			try {
				assertEquals(driver.getTitle(), "Elements Documentation");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Return to Buttons page
			driver.findElement(By.cssSelector("span.nav-label")).click();
			Thread.sleep(displayWaitTimeMS);
			driver.findElement(By.linkText("Buttons")).click();

			// Ensure dropdowns are visible for clicking
			element = driver.findElement(By.cssSelector(
					"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(3) div.hpebox-content div.btn-group.m-b button.btn.btn-lg.button-secondary.dropdown-toggle"));
			Utilities.performVerticalScroll(driver, element, verticalScrollPixels);

			// Verify second button text
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(3) div.hpebox-content div.btn-group.m-b button.btn.btn-lg.button-secondary"))
						.getText(), "ACTION");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the second dropdown
			element.click();

			// Verify menu item's titles
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(1) a"))
								.getText(),
						"Action");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(2) a"))
								.getText(),
						"Another action");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(3) a"))
								.getText(),
						"Something else here");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(5) a"))
								.getText(),
						"Separated link");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Verify menu items' links
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(1) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(2) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(3) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(5) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on second menu item and verify new location
			driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(2)")).click();
			try {
				assertEquals(driver.getTitle(), "Elements Documentation");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Return to Buttons page
			driver.findElement(By.cssSelector("span.nav-label")).click();
			Thread.sleep(displayWaitTimeMS);
			driver.findElement(By.linkText("Buttons")).click();

			// Ensure dropdowns are visible for clicking
			element = driver.findElement(By.cssSelector(
					"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(3) div.hpebox-content div.btn-group.m-b button.btn.btn.button-primary.dropdown-toggle"));
			Utilities.performVerticalScroll(driver, element, verticalScrollPixels);

			// Verify third button text
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(3) div.hpebox-content div.btn-group.m-b button.btn.btn.button-primary"))
						.getText(), "ACTION");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the third dropdown
			element.click();

			// Verify menu item's titles
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(1) a"))
								.getText(),
						"Action");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(2) a"))
								.getText(),
						"Another action");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(3) a"))
								.getText(),
						"Something else here");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(5) a"))
								.getText(),
						"Separated link");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Verify menu items' links
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(1) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(2) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(3) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(5) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on third menu item and verify new location
			driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(3)")).click();
			try {
				assertEquals(driver.getTitle(), "Elements Documentation");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Return to Buttons page
			driver.findElement(By.cssSelector("span.nav-label")).click();
			Thread.sleep(displayWaitTimeMS);
			driver.findElement(By.linkText("Buttons")).click();

			// Ensure dropdowns are visible for clicking
			element = driver.findElement(By.cssSelector(
					"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(3) div.hpebox-content div.btn-group.m-b button.btn.btn.button-secondary.dropdown-toggle"));
			Utilities.performVerticalScroll(driver, element, verticalScrollPixels);

			// Verify fourth button text
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(3) div.hpebox-content div.btn-group.m-b button.btn.btn.button-secondary"))
						.getText(), "ACTION");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the fourth dropdown
			element.click();

			// Verify menu item's titles
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(1) a"))
								.getText(),
						"Action");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(2) a"))
								.getText(),
						"Another action");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(3) a"))
								.getText(),
						"Something else here");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(5) a"))
								.getText(),
						"Separated link");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Verify menu items' links
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(1) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(2) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(3) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(5) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on fourth menu item and verify new location
			driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(5)")).click();
			try {
				assertEquals(driver.getTitle(), "Elements Documentation");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Return to Buttons page
			driver.findElement(By.cssSelector("span.nav-label")).click();
			Thread.sleep(displayWaitTimeMS);
			driver.findElement(By.linkText("Buttons")).click();

			// Ensure dropdowns are visible for clicking
			element = driver.findElement(By.cssSelector(
					"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(3) div.hpebox-content div.btn-group.m-b button.btn.btn-sm.button-primary.dropdown-toggle"));
			Utilities.performVerticalScroll(driver, element, verticalScrollPixels);

			// Verify fifth button text
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(3) div.hpebox-content div.btn-group.m-b button.btn.btn-sm.button-primary"))
						.getText(), "ACTION");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the fifth dropdown
			element.click();

			// Verify menu item's titles
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(1) a"))
								.getText(),
						"Action");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(2) a"))
								.getText(),
						"Another action");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(3) a"))
								.getText(),
						"Something else here");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(5) a"))
								.getText(),
						"Separated link");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Verify menu items' links
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(1) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(2) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(3) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(5) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on first menu item and verify new location
			driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(1)")).click();
			try {
				assertEquals(driver.getTitle(), "Elements Documentation");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Return to Buttons page
			driver.findElement(By.cssSelector("span.nav-label")).click();
			Thread.sleep(displayWaitTimeMS);
			driver.findElement(By.linkText("Buttons")).click();

			// Ensure dropdowns are visible for clicking
			element = driver.findElement(By.cssSelector(
					"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(3) div.hpebox-content div.btn-group.m-b button.btn.btn-sm.button-secondary.dropdown-toggle"));
			Utilities.performVerticalScroll(driver, element, verticalScrollPixels);

			// Verify sixth button text
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(3) div.hpebox-content div.btn-group.m-b button.btn.btn-sm.button-secondary"))
						.getText(), "ACTION");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the sixth dropdown
			element.click();

			// Verify menu item's titles
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(1) a"))
								.getText(),
						"Action");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(2) a"))
								.getText(),
						"Another action");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(3) a"))
								.getText(),
						"Something else here");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(5) a"))
								.getText(),
						"Separated link");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Verify menu items' links
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(1) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(2) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(3) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(
						driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(5) a"))
								.getAttribute("href"),
						startingUrl + "documentation.html#/");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on second menu item and verify new location
			driver.findElement(By.cssSelector("div.btn-group.m-b.open ul.dropdown-menu li:nth-child(2)")).click();
			try {
				assertEquals(driver.getTitle(), "Elements Documentation");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
		} finally {
			logErrors();
		}
	}

	@Test(alwaysRun = true)
	public void testGroupedButtons() throws Exception {
		try {
			driver.get(startingUrl + "");
			driver.findElement(By.cssSelector("#angular > #angular")).click();
			driver.findElement(By.cssSelector("span.switcher span.btn-group button.switch-group")).click();
			Thread.sleep(displayWaitTimeMS);
			driver.findElement(By.cssSelector("span.ng-binding.m-l-md")).click();
			driver.findElement(By.cssSelector("span.nav-label")).click();
			driver.findElement(By.linkText("Buttons")).click();

			String className = getClass().getCanonicalName();
			String methodName = Utilities.getMethodName();

			// Ensure controls are visible for clicking
			WebElement element = driver.findElement(By.cssSelector(
					"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div.btn-group.m-b button:nth-child(1)"));
			Utilities.performVerticalScroll(driver, element, verticalScrollPixels);

			// Verify titles of first group of buttons
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div.btn-group.m-b button:nth-child(1)"))
						.getText(), "LEFT");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div.btn-group.m-b button:nth-child(2)"))
						.getText(), "MIDDLE");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div.btn-group.m-b button:nth-child(3)"))
						.getText(), "RIGHT");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Verify statuses of first group of buttons
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div.btn-group.m-b button:nth-child(1).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div.btn-group.m-b button:nth-child(2).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div.btn-group.m-b button:nth-child(3).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}

			// Click on 'Left' button
			element = driver.findElement(By.cssSelector(
					"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div.btn-group.m-b button:nth-child(1)"));
			element.click();

			// Verify statuses of first group of buttons
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div.btn-group.m-b button:nth-child(1).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div.btn-group.m-b button:nth-child(2).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div.btn-group.m-b button:nth-child(3).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}

			// Click on 'Right' button
			element = driver.findElement(By.cssSelector(
					"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div.btn-group.m-b button:nth-child(3)"));
			element.click();

			// Verify statuses of first group of buttons
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div.btn-group.m-b button:nth-child(1).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div.btn-group.m-b button:nth-child(2).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div.btn-group.m-b button:nth-child(3).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}

			// Check titles of second group of buttons
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div:nth-of-type(2) button:nth-child(2)"))
						.getText(), "1");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div:nth-of-type(2) button:nth-child(3)"))
						.getText(), "2");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div:nth-of-type(2) button:nth-child(4)"))
						.getText(), "3");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div:nth-of-type(2) button:nth-child(5)"))
						.getText(), "4");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Verify statuses of second group of buttons
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div:nth-of-type(2) button:nth-child(2).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div:nth-of-type(2) button:nth-child(3).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div:nth-of-type(2) button:nth-child(4).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div:nth-of-type(2) button:nth-child(5).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}

			// Click on '3' button
			element = driver.findElement(By.cssSelector(
					"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div:nth-of-type(2) button:nth-child(4)"));
			element.click();

			// Verify statuses of second group of buttons
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div:nth-of-type(2) button:nth-child(2).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div:nth-of-type(2) button:nth-child(3).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div:nth-of-type(2) button:nth-child(4).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div:nth-of-type(2) button:nth-child(5).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}

			// Click on '<' button
			element = driver.findElement(By.cssSelector(
					"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div:nth-of-type(2) button:nth-child(1)"));
			element.click();

			// Verify statuses of second group of buttons
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div:nth-of-type(2) button:nth-child(2).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div:nth-of-type(2) button:nth-child(3).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div:nth-of-type(2) button:nth-child(4).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div:nth-of-type(2) button:nth-child(5).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}

			// Click twice on '>' button
			element = driver.findElement(By.cssSelector(
					"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div:nth-of-type(2) button:nth-child(6)"));
			element.click();
			element.click();

			// Verify statuses of second group of buttons
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div:nth-of-type(2) button:nth-child(2).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div:nth-of-type(2) button:nth-child(3).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div:nth-of-type(2) button:nth-child(4).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-child(2) div:nth-child(4) div.hpebox:nth-child(4) div.hpebox-content div:nth-of-type(2) button:nth-child(5).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}
		} finally {
			logErrors();
		}
	}

	@Test(alwaysRun = true)
	public void testToggleButtonVariations() throws Exception {
		try {
			driver.get(startingUrl + "");
			driver.findElement(By.cssSelector("#angular > #angular")).click();
			driver.findElement(By.cssSelector("span.switcher span.btn-group button.switch-group")).click();
			Thread.sleep(displayWaitTimeMS);
			driver.findElement(By.cssSelector("span.ng-binding.m-l-md")).click();
			driver.findElement(By.cssSelector("span.nav-label")).click();
			driver.findElement(By.linkText("Buttons")).click();

			String className = getClass().getCanonicalName();
			String methodName = Utilities.getMethodName();

			// Ensure controls are visible for clicking
			WebElement element = driver.findElement(By.cssSelector(
					"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(5) div.hpebox div.hpebox-content div:nth-of-type(1) button"));
			Utilities.performVerticalScroll(driver, element, verticalScrollPixels);

			// Verify titles of button
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(5) div.hpebox div.hpebox-content div:nth-of-type(1) button"))
						.getText(), "SINGLE TOGGLE");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Verify status of button
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(5) div.hpebox div.hpebox-content div:nth-of-type(1) button.active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}

			// Click on button
			element = driver.findElement(By.cssSelector(
					"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(5) div.hpebox div.hpebox-content div:nth-of-type(1) button"));
			element.click();

			// Verify title of button
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(5) div.hpebox div.hpebox-content div:nth-of-type(1) button"))
						.getText(), "SINGLE TOGGLE");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Verify status of button
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(5) div.hpebox div.hpebox-content div:nth-of-type(1) button.active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}

			// Test checkboxes

			// Verify titles of buttons
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(5) div.hpebox div.hpebox-content div:nth-of-type(2) div.btn-group label:nth-of-type(1)"))
						.getText(), "BOLD");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(5) div.hpebox div.hpebox-content div:nth-of-type(2) div.btn-group label:nth-of-type(2)"))
						.getText(), "UNDERLINE");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(5) div.hpebox div.hpebox-content div:nth-of-type(2) div.btn-group label:nth-of-type(3)"))
						.getText(), "ITALIC");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Verify statuses of buttons
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(5) div.hpebox div.hpebox-content div:nth-of-type(2) div.btn-group label:nth-of-type(1).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(5) div.hpebox div.hpebox-content div:nth-of-type(2) div.btn-group label:nth-of-type(2).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(5) div.hpebox div.hpebox-content div:nth-of-type(2) div.btn-group label:nth-of-type(3).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}

			// Click on buttons
			element = driver.findElement(By.cssSelector(
					"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(5) div.hpebox div.hpebox-content div:nth-of-type(2) div.btn-group label:nth-of-type(1)"));
			element.click();
			element = driver.findElement(By.cssSelector(
					"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(5) div.hpebox div.hpebox-content div:nth-of-type(2) div.btn-group label:nth-of-type(2)"));
			element.click();
			element = driver.findElement(By.cssSelector(
					"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(5) div.hpebox div.hpebox-content div:nth-of-type(2) div.btn-group label:nth-of-type(3)"));
			element.click();

			// Verify titles of buttons
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(5) div.hpebox div.hpebox-content div:nth-of-type(2) div.btn-group label:nth-of-type(1)"))
						.getText(), "BOLD");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(5) div.hpebox div.hpebox-content div:nth-of-type(2) div.btn-group label:nth-of-type(2)"))
						.getText(), "UNDERLINE");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(5) div.hpebox div.hpebox-content div:nth-of-type(2) div.btn-group label:nth-of-type(3)"))
						.getText(), "ITALIC");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Verify statuses of buttons
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(5) div.hpebox div.hpebox-content div:nth-of-type(2) div.btn-group label:nth-of-type(1).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(5) div.hpebox div.hpebox-content div:nth-of-type(2) div.btn-group label:nth-of-type(2).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.wrapper-content div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(5) div.hpebox div.hpebox-content div:nth-of-type(2) div.btn-group label:nth-of-type(3).active")));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}
		} finally {
			logErrors();
		}
	}
}
