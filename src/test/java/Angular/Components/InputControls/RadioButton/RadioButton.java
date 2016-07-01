package Angular.Components.InputControls.RadioButton;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import ElementsTesting.TestNGBase;
import ElementsTesting.Utilities;

public class RadioButton extends TestNGBase {
	@Test(alwaysRun = true)
	public void testRadioButton() throws Exception {
		try {
			driver.get(startingUrl + "");
			driver.findElement(By.cssSelector("#angular > #angular")).click();
			driver.findElement(By.cssSelector("span.nav-label")).click();
			Thread.sleep(displayWaitTimeMS);
			driver.findElement(By.linkText("Input Controls")).click();
			driver.findElement(By.linkText("Radio Button")).click();

			String className = getClass().getCanonicalName();
			String methodName = Utilities.getMethodName();

			// Ensure controls are visible for clicking
			WebElement element = driver.findElement(By.cssSelector("label[for=option1] > div"));
			Utilities.performVerticalScroll(driver, element, verticalScrollPixels);

			// Check whether radio buttons are enabled
			try {
				assertTrue(driver.findElement(By.id("option1")).isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver.findElement(By.id("option2")).isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver.findElement(By.id("option3")).isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver.findElement(By.id("option4")).isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Check states of radio buttons
			try {
				assertTrue(driver.findElement(By.id("option1")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver.findElement(By.id("option2")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver.findElement(By.id("option3")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver.findElement(By.id("option4")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Check value of text field
			try {
				assertEquals(driver.findElement(By.cssSelector("code~em")).getText(), "100");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the first radio button
			driver.findElement(By.cssSelector("label[for=option1] > div")).click();

			// Check states of radio buttons
			try {
				assertTrue(driver.findElement(By.id("option1")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver.findElement(By.id("option2")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver.findElement(By.id("option3")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver.findElement(By.id("option4")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Check value of text field
			try {
				assertEquals(driver.findElement(By.cssSelector("code~em")).getText(), "100");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the second radio button
			driver.findElement(By.cssSelector("label[for=option2] > div")).click();

			// Check states of radio buttons
			try {
				assertFalse(driver.findElement(By.id("option1")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver.findElement(By.id("option2")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver.findElement(By.id("option3")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver.findElement(By.id("option4")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Check value of text field
			try {
				assertEquals(driver.findElement(By.cssSelector("code~em")).getText(), "string");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the third radio button
			driver.findElement(By.cssSelector("label[for=option3] > div")).click();

			// Check states of radio buttons
			try {
				assertFalse(driver.findElement(By.id("option1")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver.findElement(By.id("option2")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver.findElement(By.id("option3")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver.findElement(By.id("option4")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Check value of text field
			try {
				assertEquals(driver.findElement(By.cssSelector("code~em")).getText(), "[object Object]");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the fourth radio button
			driver.findElement(By.cssSelector("label[for=option4] > div")).click();

			// Check states of radio buttons
			try {
				assertFalse(driver.findElement(By.id("option1")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver.findElement(By.id("option2")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver.findElement(By.id("option3")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver.findElement(By.id("option4")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Check value of text field
			try {
				assertEquals(driver.findElement(By.cssSelector("code~em")).getText(), "Wrap-Text");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the 'Disable Option1' button
			driver.findElement(By.cssSelector("div.hpebox-content p > button")).click();

			// Check whether radio buttons are enabled
			try {
				assertFalse(driver.findElement(By.id("option1")).isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver.findElement(By.id("option2")).isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver.findElement(By.id("option3")).isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver.findElement(By.id("option4")).isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the first radio button
			driver.findElement(By.cssSelector("label[for=option1] > div")).click();

			// Check states of radio buttons
			try {
				assertFalse(driver.findElement(By.id("option1")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver.findElement(By.id("option2")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver.findElement(By.id("option3")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver.findElement(By.id("option4")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Check value of text field
			try {
				assertEquals(driver.findElement(By.cssSelector("code~em")).getText(), "Wrap-Text");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
		} finally {
			logErrors();
		}
	}
}
