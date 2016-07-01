package Angular.Components.InputControls.CheckBox;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import ElementsTesting.TestNGBase;
import ElementsTesting.Utilities;

public class Checkbox extends TestNGBase {
	@Test(alwaysRun = true)
	public void testCheckbox() throws Exception {
		try {
			driver.get(startingUrl + "");
			driver.findElement(By.cssSelector("#angular > #angular")).click();
			driver.findElement(By.cssSelector("span.nav-label")).click();
			Thread.sleep(displayWaitTimeMS);
			driver.findElement(By.linkText("Input Controls")).click();
			driver.findElement(By.linkText("CheckBox")).click();

			String className = getClass().getCanonicalName();
			String methodName = Utilities.getMethodName();

			// Ensure controls are visible for clicking
			WebElement element = driver
					.findElement(By.cssSelector("div.hpebox-content div.check label[for=option1] div.icheckbox-hp"));
			Utilities.performVerticalScroll(driver, element, verticalScrollPixels);

			// Check whether checkboxes are enabled
			try {
				assertTrue(driver
						.findElement(By
								.cssSelector("div.hpebox-content div.check label[for=option1] div.icheckbox-hp input"))
						.isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By
								.cssSelector("div.hpebox-content div.check label[for=option2] div.icheckbox-hp input"))
						.isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By
								.cssSelector("div.hpebox-content div.check label[for=option3] div.icheckbox-hp input"))
						.isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By
								.cssSelector("div.hpebox-content div.check label[for=option4] div.icheckbox-hp input"))
						.isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Check states of checkboxes
			try {
				assertTrue(driver
						.findElement(By
								.cssSelector("div.hpebox-content div.check label[for=option1] div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By
								.cssSelector("div.hpebox-content div.check label[for=option2] div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By
								.cssSelector("div.hpebox-content div.check label[for=option3] div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By
								.cssSelector("div.hpebox-content div.check label[for=option4] div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Check values of text fields
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(1) div.hpebox-content p em:nth-of-type(1)"))
						.getText(), "true");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(1) div.hpebox-content p em:nth-of-type(2)"))
						.getText(), "false");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(1) div.hpebox-content p em:nth-of-type(3)"))
						.getText(), "false");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(1) div.hpebox-content p em:nth-of-type(4)"))
						.getText(), "false");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the first checkbox
			driver.findElement(By.cssSelector("div.hpebox-content div.check label[for=option1] div.icheckbox-hp"))
					.click();

			// Check states of checkboxes
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option1] div.icheckbox-hp.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By
								.cssSelector("div.hpebox-content div.check label[for=option2] div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By
								.cssSelector("div.hpebox-content div.check label[for=option3] div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By
								.cssSelector("div.hpebox-content div.check label[for=option4] div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Check values of text fields
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(1) div.hpebox-content p em:nth-of-type(1)"))
						.getText(), "false");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(1) div.hpebox-content p em:nth-of-type(2)"))
						.getText(), "false");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(1) div.hpebox-content p em:nth-of-type(3)"))
						.getText(), "false");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(1) div.hpebox-content p em:nth-of-type(4)"))
						.getText(), "false");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the second checkbox
			driver.findElement(By.cssSelector("div.hpebox-content div.check label[for=option2] div.icheckbox-hp"))
					.click();

			// Check states of checkboxes
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option1] div.icheckbox-hp.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option2] div.icheckbox-hp.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By
								.cssSelector("div.hpebox-content div.check label[for=option3] div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By
								.cssSelector("div.hpebox-content div.check label[for=option4] div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Check values of text fields
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(1) div.hpebox-content p em:nth-of-type(1)"))
						.getText(), "false");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(1) div.hpebox-content p em:nth-of-type(2)"))
						.getText(), "true");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(1) div.hpebox-content p em:nth-of-type(3)"))
						.getText(), "false");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(1) div.hpebox-content p em:nth-of-type(4)"))
						.getText(), "false");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the third checkbox
			driver.findElement(By.cssSelector("div.hpebox-content div.check label[for=option3] div.icheckbox-hp"))
					.click();

			// Check states of checkboxes
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option1] div.icheckbox-hp.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option2] div.icheckbox-hp.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option3] div.icheckbox-hp.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By
								.cssSelector("div.hpebox-content div.check label[for=option4] div.icheckbox-hp input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Check values of text fields
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(1) div.hpebox-content p em:nth-of-type(1)"))
						.getText(), "false");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(1) div.hpebox-content p em:nth-of-type(2)"))
						.getText(), "true");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(1) div.hpebox-content p em:nth-of-type(3)"))
						.getText(), "true");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(1) div.hpebox-content p em:nth-of-type(4)"))
						.getText(), "false");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the fourth checkbox
			driver.findElement(By.cssSelector("div.hpebox-content div.check label[for=option4] div.icheckbox-hp"))
					.click();

			// Check states of checkboxes
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option1] div.icheckbox-hp.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option2] div.icheckbox-hp.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option3] div.icheckbox-hp.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option4] div.icheckbox-hp.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Check values of text fields
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(1) div.hpebox-content p em:nth-of-type(1)"))
						.getText(), "false");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(1) div.hpebox-content p em:nth-of-type(2)"))
						.getText(), "true");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(1) div.hpebox-content p em:nth-of-type(3)"))
						.getText(), "true");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(1) div.hpebox-content p em:nth-of-type(4)"))
						.getText(), "true");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the 'Disable Option1' button
			driver.findElement(By
					.cssSelector("div.wrapper-content div div:nth-child(1) div.hpebox-content p button:nth-of-type(1)"))
					.click();

			// Check states of checkboxes
			try {
				assertFalse(driver
						.findElement(By
								.cssSelector("div.hpebox-content div.check label[for=option1] div.icheckbox-hp input"))
						.isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By
								.cssSelector("div.hpebox-content div.check label[for=option2] div.icheckbox-hp input"))
						.isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By
								.cssSelector("div.hpebox-content div.check label[for=option3] div.icheckbox-hp input"))
						.isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By
								.cssSelector("div.hpebox-content div.check label[for=option4] div.icheckbox-hp input"))
						.isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the first checkbox
			driver.findElement(By.cssSelector("div.hpebox-content div.check label[for=option1] div.icheckbox-hp"))
					.click();

			// Check states of checkboxes
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option1] div.icheckbox-hp.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option2] div.icheckbox-hp.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option3] div.icheckbox-hp.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option4] div.icheckbox-hp.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Check values of text fields
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(1) div.hpebox-content p em:nth-of-type(1)"))
						.getText(), "false");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(1) div.hpebox-content p em:nth-of-type(2)"))
						.getText(), "true");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(1) div.hpebox-content p em:nth-of-type(3)"))
						.getText(), "true");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(1) div.hpebox-content p em:nth-of-type(4)"))
						.getText(), "true");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the 'Set Option2 To Indeterminate State' button
			driver.findElement(By
					.cssSelector("div.wrapper-content div div:nth-child(1) div.hpebox-content p button:nth-of-type(2)"))
					.click();

			// Check states of checkboxes
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option1] div.icheckbox-hp.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option2] div.icheckbox-hp.checked.indeterminate input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option3] div.icheckbox-hp.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option4] div.icheckbox-hp.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Check values of text fields
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(1) div.hpebox-content p em:nth-of-type(1)"))
						.getText(), "false");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(1) div.hpebox-content p em:nth-of-type(2)"))
						.getText(), "-1");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(1) div.hpebox-content p em:nth-of-type(3)"))
						.getText(), "true");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(1) div.hpebox-content p em:nth-of-type(4)"))
						.getText(), "true");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
		} finally {
			logErrors();
		}
	}

	@Test(alwaysRun = true)
	public void testCheckboxSimplified() throws Exception {
		try {
			driver.get(startingUrl + "");
			driver.findElement(By.cssSelector("#angular > #angular")).click();
			driver.findElement(By.cssSelector("span.nav-label")).click();
			Thread.sleep(displayWaitTimeMS);
			driver.findElement(By.linkText("Input Controls")).click();
			driver.findElement(By.linkText("CheckBox")).click();

			String className = getClass().getCanonicalName();
			String methodName = Utilities.getMethodName();

			// Ensure controls are visible for clicking
			WebElement element = driver.findElement(
					By.cssSelector("div.hpebox-content div.check label[for=option1] div.icheckbox-hp-simplified"));
			Utilities.performVerticalScroll(driver, element, verticalScrollPixels);

			// Check whether checkboxes are enabled
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div.check label[for=option1] div.icheckbox-hp-simplified input"))
						.isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div.check label[for=option2] div.icheckbox-hp-simplified input"))
						.isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div.check label[for=option3] div.icheckbox-hp-simplified input"))
						.isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div.check label[for=option4] div.icheckbox-hp-simplified input"))
						.isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Check states of checkboxes
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div.check label[for=option1] div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div.check label[for=option2] div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div.check label[for=option3] div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div.check label[for=option4] div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Check values of text fields
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(2) div.hpebox-content p em:nth-of-type(1)"))
						.getText(), "true");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(2) div.hpebox-content p em:nth-of-type(2)"))
						.getText(), "false");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(2) div.hpebox-content p em:nth-of-type(3)"))
						.getText(), "false");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(2) div.hpebox-content p em:nth-of-type(4)"))
						.getText(), "false");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the first checkbox
			driver.findElement(
					By.cssSelector("div.hpebox-content div.check label[for=option1] div.icheckbox-hp-simplified"))
					.click();

			// Check states of checkboxes
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option1] div.icheckbox-hp-simplified.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div.check label[for=option2] div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div.check label[for=option3] div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div.check label[for=option4] div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Check values of text fields
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(2) div.hpebox-content p em:nth-of-type(1)"))
						.getText(), "false");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(2) div.hpebox-content p em:nth-of-type(2)"))
						.getText(), "false");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(2) div.hpebox-content p em:nth-of-type(3)"))
						.getText(), "false");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(2) div.hpebox-content p em:nth-of-type(4)"))
						.getText(), "false");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the second checkbox
			driver.findElement(
					By.cssSelector("div.hpebox-content div.check label[for=option2] div.icheckbox-hp-simplified"))
					.click();

			// Check states of checkboxes
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option1] div.icheckbox-hp-simplified.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option2] div.icheckbox-hp-simplified.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div.check label[for=option3] div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div.check label[for=option4] div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Check values of text fields
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(2) div.hpebox-content p em:nth-of-type(1)"))
						.getText(), "false");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(2) div.hpebox-content p em:nth-of-type(2)"))
						.getText(), "true");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(2) div.hpebox-content p em:nth-of-type(3)"))
						.getText(), "false");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(2) div.hpebox-content p em:nth-of-type(4)"))
						.getText(), "false");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the third checkbox
			driver.findElement(
					By.cssSelector("div.hpebox-content div.check label[for=option3] div.icheckbox-hp-simplified"))
					.click();

			// Check states of checkboxes
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option1] div.icheckbox-hp-simplified.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option2] div.icheckbox-hp-simplified.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option3] div.icheckbox-hp-simplified.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div.check label[for=option4] div.icheckbox-hp-simplified input"))
						.isSelected());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Check values of text fields
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(2) div.hpebox-content p em:nth-of-type(1)"))
						.getText(), "false");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(2) div.hpebox-content p em:nth-of-type(2)"))
						.getText(), "true");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(2) div.hpebox-content p em:nth-of-type(3)"))
						.getText(), "true");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(2) div.hpebox-content p em:nth-of-type(4)"))
						.getText(), "false");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the fourth checkbox
			driver.findElement(
					By.cssSelector("div.hpebox-content div.check label[for=option4] div.icheckbox-hp-simplified"))
					.click();

			// Check states of checkboxes
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option1] div.icheckbox-hp-simplified.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option2] div.icheckbox-hp-simplified.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option3] div.icheckbox-hp-simplified.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option4] div.icheckbox-hp-simplified.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Check values of text fields
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(2) div.hpebox-content p em:nth-of-type(1)"))
						.getText(), "false");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(2) div.hpebox-content p em:nth-of-type(2)"))
						.getText(), "true");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(2) div.hpebox-content p em:nth-of-type(3)"))
						.getText(), "true");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(2) div.hpebox-content p em:nth-of-type(4)"))
						.getText(), "true");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the 'Disable Option1' button
			driver.findElement(By
					.cssSelector("div.wrapper-content div div:nth-child(2) div.hpebox-content p button:nth-of-type(1)"))
					.click();

			// Check states of checkboxes
			try {
				assertFalse(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div.check label[for=option1] div.icheckbox-hp-simplified input"))
						.isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div.check label[for=option2] div.icheckbox-hp-simplified input"))
						.isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div.check label[for=option3] div.icheckbox-hp-simplified input"))
						.isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(driver
						.findElement(By.cssSelector(
								"div.hpebox-content div.check label[for=option4] div.icheckbox-hp-simplified input"))
						.isEnabled());
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Click on the first checkbox
			driver.findElement(
					By.cssSelector("div.hpebox-content div.check label[for=option1] div.icheckbox-hp-simplified"))
					.click();

			// Check states of checkboxes
			try {
				assertFalse(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option1] div.icheckbox-hp-simplified.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option2] div.icheckbox-hp-simplified.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option3] div.icheckbox-hp-simplified.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertTrue(isElementPresent(By.cssSelector(
						"div.hpebox-content div.check label[for=option4] div.icheckbox-hp-simplified.checked input")));
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}

			// Check values of text fields
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(2) div.hpebox-content p em:nth-of-type(1)"))
						.getText(), "false");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(2) div.hpebox-content p em:nth-of-type(2)"))
						.getText(), "true");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(2) div.hpebox-content p em:nth-of-type(3)"))
						.getText(), "true");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
			try {
				assertEquals(driver
						.findElement(By.cssSelector(
								"div.wrapper-content div div.hpebox:nth-child(2) div.hpebox-content p em:nth-of-type(4)"))
						.getText(), "true");
			} catch (Error e) {
				Utilities.logError(verificationErrors, className, methodName, e);
			}
		} finally {
			logErrors();
		}
	}
}
