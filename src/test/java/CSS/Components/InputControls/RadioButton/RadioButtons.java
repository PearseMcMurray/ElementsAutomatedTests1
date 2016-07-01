package CSS.Components.InputControls.RadioButton;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import ElementsTesting.TestNGBase;
import ElementsTesting.Utilities;

public class RadioButtons extends TestNGBase {
	@Test(alwaysRun = true)
	public void testRadioButtons() throws Exception {
		try {
			driver.get(startingUrl + "");
			driver.findElement(By.cssSelector("#angular > #angular")).click();
			driver.findElement(By.cssSelector("span.switcher span.btn-group button.switch-group")).click();
			Thread.sleep(displayWaitTimeMS);
			driver.findElement(By.cssSelector("span.ng-binding.m-l-md")).click();
			driver.findElement(By.cssSelector("span.nav-label")).click();
			driver.findElement(By.linkText("Input Controls")).click();
			driver.findElement(By.linkText("Radio Button")).click();

			String className = getClass().getCanonicalName();
			String methodName = Utilities.getMethodName();

			// Ensure controls are visible for clicking
			WebElement element = driver
					.findElement(By.cssSelector("div.hpebox-content div.m-b-md div:nth-child(1) label div"));
			Utilities.performVerticalScroll(driver, element, verticalScrollPixels);

			// Check whether radio buttons are enabled
			try {
				assertTrue(driver.findElement(By.cssSelector("input[value=option1]")).isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver.findElement(By.cssSelector("input[value=option2]")).isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver.findElement(By.cssSelector("input[value=option3]")).isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver.findElement(By.cssSelector("input[value=option4]")).isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver.findElement(By.cssSelector("input[value=option5]")).isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Check states of radio buttons
			try {
				assertFalse(driver.findElement(By.cssSelector("input[value=option1]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver.findElement(By.cssSelector("input[value=option2]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver.findElement(By.cssSelector("input[value=option3]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver.findElement(By.cssSelector("input[value=option4]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver.findElement(By.cssSelector("input[value=option5]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the first radio button
			driver.findElement(By.cssSelector("div.hpebox-content div.m-b-md div:nth-child(1) label div")).click();

			// Check states of radio buttons
			try {
				assertTrue(driver.findElement(By.cssSelector("input[value=option1]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver.findElement(By.cssSelector("input[value=option2]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver.findElement(By.cssSelector("input[value=option3]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver.findElement(By.cssSelector("input[value=option4]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver.findElement(By.cssSelector("input[value=option5]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the second radio button
			driver.findElement(By.cssSelector("div.hpebox-content div.m-b-md div:nth-child(2) label div")).click();

			// Check states of radio buttons
			try {
				assertFalse(driver.findElement(By.cssSelector("input[value=option1]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver.findElement(By.cssSelector("input[value=option2]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver.findElement(By.cssSelector("input[value=option3]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver.findElement(By.cssSelector("input[value=option4]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver.findElement(By.cssSelector("input[value=option5]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the third radio button
			driver.findElement(By.cssSelector("div.hpebox-content div.m-b-md div:nth-child(3) label div")).click();

			// Check states of radio buttons
			try {
				assertFalse(driver.findElement(By.cssSelector("input[value=option1]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver.findElement(By.cssSelector("input[value=option2]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver.findElement(By.cssSelector("input[value=option3]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver.findElement(By.cssSelector("input[value=option4]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver.findElement(By.cssSelector("input[value=option5]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the fourth radio button
			driver.findElement(By.cssSelector("div.hpebox-content div.m-b-md div:nth-child(4) label div")).click();

			// Check states of radio buttons
			try {
				assertFalse(driver.findElement(By.cssSelector("input[value=option1]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver.findElement(By.cssSelector("input[value=option2]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver.findElement(By.cssSelector("input[value=option3]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver.findElement(By.cssSelector("input[value=option4]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver.findElement(By.cssSelector("input[value=option5]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the fifth radio button
			driver.findElement(By.cssSelector("div.hpebox-content div.m-b-md div:nth-child(5) label div")).click();

			// Check states of radio buttons
			try {
				assertFalse(driver.findElement(By.cssSelector("input[value=option1]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver.findElement(By.cssSelector("input[value=option2]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver.findElement(By.cssSelector("input[value=option3]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver.findElement(By.cssSelector("input[value=option4]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver.findElement(By.cssSelector("input[value=option5]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
		} finally {
			logErrors();
		}
	}

	@Test(alwaysRun = true)
	public void testInlineRadioButtons() throws Exception {
		try {
			driver.get(startingUrl + "");
			driver.findElement(By.cssSelector("#angular > #angular")).click();
			driver.findElement(By.cssSelector("span.switcher span.btn-group button.switch-group")).click();
			Thread.sleep(displayWaitTimeMS);
			driver.findElement(By.cssSelector("span.ng-binding.m-l-md")).click();
			driver.findElement(By.cssSelector("span.nav-label")).click();
			driver.findElement(By.linkText("Input Controls")).click();
			driver.findElement(By.linkText("Radio Button")).click();

			String className = getClass().getCanonicalName();
			String methodName = Utilities.getMethodName();

			// Ensure controls are visible for clicking
			WebElement element = driver
					.findElement(By.cssSelector("div.hpebox-content div.m-b label:nth-child(1) div"));
			Utilities.performVerticalScroll(driver, element, verticalScrollPixels);

			// Check whether radio buttons are enabled
			try {
				assertTrue(
						driver.findElement(By.cssSelector("label.radio-inline div input[value=option1]")).isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(
						driver.findElement(By.cssSelector("label.radio-inline div input[value=option2]")).isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Check states of radio buttons
			try {
				assertTrue(
						driver.findElement(By.cssSelector("label.radio-inline div input[value=option1]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(
						driver.findElement(By.cssSelector("label.radio-inline div input[value=option2]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the first radio button
			driver.findElement(By.cssSelector("div.hpebox-content div.m-b label:nth-child(1) div")).click();

			// Check states of radio buttons
			try {
				assertTrue(
						driver.findElement(By.cssSelector("label.radio-inline div input[value=option1]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(
						driver.findElement(By.cssSelector("label.radio-inline div input[value=option2]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the second radio button
			driver.findElement(By.cssSelector("div.hpebox-content div.m-b label:nth-child(2) div")).click();

			// Check states of radio buttons
			try {
				assertFalse(
						driver.findElement(By.cssSelector("label.radio-inline div input[value=option1]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(
						driver.findElement(By.cssSelector("label.radio-inline div input[value=option2]")).isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
		} finally {
			logErrors();
		}
	}
}
