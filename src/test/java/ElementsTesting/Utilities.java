package ElementsTesting;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utilities {
    private static String separator = System.getProperty("line.separator");

    /*
     * Code to determine name of calling method derived from http://stackoverflow.com/questions/442747/getting-the-name-of-the-current-executing-method/5891326#5891326
     */
    private static final int CLIENT_CODE_STACK_INDEX;
    
    static {
        // Finds out the index of "this code" in the returned stack trace - funny but it differs in JDK 1.5 and 1.6
        int i = -1;
        for (StackTraceElement ste : Thread.currentThread().getStackTrace()) {
            i++;
            if (ste.getClassName().equals(Utilities.class.getName())) {
                break;
            }
        }
        CLIENT_CODE_STACK_INDEX = i + 1;	// Index of calling code in stack is this code plus 1
    }

    public static String getMethodName() {
        // Return the name of the calling method
    	return Thread.currentThread().getStackTrace()[CLIENT_CODE_STACK_INDEX].getMethodName();
    }
    
    public static int getLineNumber(Error e, String soughtMethodName) {
    	int lineNumber = -1;
    	for (StackTraceElement ste : e.getStackTrace()) {
    		String methodName = ste.getMethodName();
    		if (methodName.equalsIgnoreCase(soughtMethodName)) {
    			lineNumber = ste.getLineNumber();
    			break;
    		}
    	}
    	return lineNumber;
    }
    
    public static void logError(StringBuffer verificationErrors, String className, String methodName, Error e) {
		Integer lineNumber = getLineNumber(e, methodName);
		verificationErrors.append(separator);
		verificationErrors.append(className + "." + methodName + ":" + lineNumber.toString() + " - " + e.toString() + separator);
    }
    
    public static void performVerticalScroll(WebDriver driver, WebElement element, Integer verticalScrollPixels) {
		if (verticalScrollPixels != 0) {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].scrollIntoView(true);", element);
			jse.executeScript("window.scrollBy(0," + String.valueOf(verticalScrollPixels) + ")", "");
		}
    }
}

