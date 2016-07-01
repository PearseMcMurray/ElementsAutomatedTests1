package CSS.Components.InputControls.CheckBox;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import ElementsTesting.TestNGBase;
import ElementsTesting.Utilities;

public class CheckBoxes extends TestNGBase {
	@Test(alwaysRun = true)
	public void testCheckBoxes() throws Exception {
		try {
			driver.get(startingUrl + "");
			driver.findElement(By.cssSelector("#angular > #angular")).click();
			driver.findElement(By.cssSelector("span.switcher span.btn-group button.switch-group")).click();
			Thread.sleep(displayWaitTimeMS);
			driver.findElement(By.cssSelector("span.ng-binding.m-l-md")).click();
			driver.findElement(By.cssSelector("span.nav-label")).click();
			driver.findElement(By.linkText("Input Controls")).click();
			driver.findElement(By.linkText("CheckBox")).click();

			String className = getClass().getCanonicalName();
			String methodName = Utilities.getMethodName();

			// Ensure controls are visible for clicking
			WebElement element = driver.findElement(
					By.cssSelector("div.hpebox-content div div.checkbox:nth-child(1) label div.icheckbox-hp"));
			Utilities.performVerticalScroll(driver, element, verticalScrollPixels);

			// Check whether checkboxes are enabled
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(1) label div.icheckbox-hp input"))
						.isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(2) label div.icheckbox-hp input"))
						.isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(3) label div.icheckbox-hp input"))
						.isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(4) label div.icheckbox-hp input"))
						.isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(5) label div.icheckbox-hp input"))
						.isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Check states of checkboxes
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(1) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(2) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(3) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(4) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(5) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the first checkbox
			driver.findElement(
					By.cssSelector("div.hpebox-content div div.checkbox:nth-child(1) label div.icheckbox-hp")).click();

			// Check states of checkboxes
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(1) label div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(2) label div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(3) label div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(4) label div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(5) label div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the second checkbox
			driver.findElement(
					By.cssSelector("div.hpebox-content div div.checkbox:nth-child(2) label div.icheckbox-hp")).click();

			// Check states of checkboxes
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(1) label div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(2) label div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(3) label div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(4) label div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(5) label div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the third checkbox
			driver.findElement(
					By.cssSelector("div.hpebox-content div div.checkbox:nth-child(3) label div.icheckbox-hp")).click();

			// Check states of checkboxes
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(1) label div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(2) label div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(3) label div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(4) label div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(5) label div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the fourth checkbox
			driver.findElement(
					By.cssSelector("div.hpebox-content div div.checkbox:nth-child(4) label div.icheckbox-hp")).click();

			// Check states of checkboxes
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(1) label div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(2) label div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(3) label div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(4) label div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(5) label div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the fifth checkbox
			driver.findElement(
					By.cssSelector("div.hpebox-content div div.checkbox:nth-child(5) label div.icheckbox-hp")).click();

			// Check states of checkboxes
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(1) label div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(2) label div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(3) label div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(4) label div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(5) label div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
		} finally {
			logErrors();
		}
	}

	@Test(alwaysRun = true)
	public void testCheckBoxesSimplified() throws Exception {
		try {
			driver.get(startingUrl + "");
			driver.findElement(By.cssSelector("#angular > #angular")).click();
			driver.findElement(By.cssSelector("span.switcher span.btn-group button.switch-group")).click();
			Thread.sleep(displayWaitTimeMS);
			driver.findElement(By.cssSelector("span.ng-binding.m-l-md")).click();
			driver.findElement(By.cssSelector("span.nav-label")).click();
			driver.findElement(By.linkText("Input Controls")).click();
			driver.findElement(By.linkText("CheckBox")).click();

			String className = getClass().getCanonicalName();
			String methodName = Utilities.getMethodName();

			// Ensure controls are visible for clicking
			WebElement element = driver.findElement(By
					.cssSelector("div.hpebox-content div div.checkbox:nth-child(1) label div.icheckbox-hp-simplified"));
			Utilities.performVerticalScroll(driver, element, verticalScrollPixels);

			// Check whether checkboxes are enabled
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(1) label div.icheckbox-hp-simplified input"))
						.isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(2) label div.icheckbox-hp-simplified input"))
						.isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(3) label div.icheckbox-hp-simplified input"))
						.isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(4) label div.icheckbox-hp-simplified input"))
						.isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(5) label div.icheckbox-hp-simplified input"))
						.isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Check states of checkboxes
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(1) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(2) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(3) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(4) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(5) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the first checkbox
			driver.findElement(By
					.cssSelector("div.hpebox-content div div.checkbox:nth-child(1) label div.icheckbox-hp-simplified"))
					.click();

			// Check states of checkboxes
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(1) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(2) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(3) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(4) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(5) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the second checkbox
			driver.findElement(By
					.cssSelector("div.hpebox-content div div.checkbox:nth-child(2) label div.icheckbox-hp-simplified"))
					.click();

			// Check states of checkboxes
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(1) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(2) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(3) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(4) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(5) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the third checkbox
			driver.findElement(By
					.cssSelector("div.hpebox-content div div.checkbox:nth-child(3) label div.icheckbox-hp-simplified"))
					.click();

			// Check states of checkboxes
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(1) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(2) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(3) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(4) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(5) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the fourth checkbox
			driver.findElement(By
					.cssSelector("div.hpebox-content div div.checkbox:nth-child(4) label div.icheckbox-hp-simplified"))
					.click();

			// Check states of checkboxes
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(1) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(2) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(3) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(4) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(5) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the fifth checkbox
			driver.findElement(By
					.cssSelector("div.hpebox-content div div.checkbox:nth-child(5) label div.icheckbox-hp-simplified"))
					.click();

			// Check states of checkboxes
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(1) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(2) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(3) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(4) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div div.checkbox:nth-child(5) label div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
		} finally {
			logErrors();
		}
	}
}
