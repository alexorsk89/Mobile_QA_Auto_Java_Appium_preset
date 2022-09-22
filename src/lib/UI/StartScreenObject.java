package lib.UI;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class StartScreenObject extends MainPageObject
{
    private static final String
        INPUT_PHONE_NUMBER = "com.arround.io.debug:id/phoneInput",
        INPUT_PHONE_NUMBER_STEP_2 = "com.arround.io.debug:id/phoneInputPhone",
        CONTINUE_BUTTON = "com.arround.io.debug:id/continueBtn",
        CODE_VIEW = "com.arround.io.debug:id/codeView",
        ROUND_LIKE_IMAGE = "com.arround.io.debug:id/like",
        NUMBER_PHONE = "9999999977";


    public StartScreenObject(AppiumDriver driver) {
        super(driver);
    }

    public void authorizationStart()
    {
        this.waitForElementAndClick(By.id(INPUT_PHONE_NUMBER), "Cannot find phone number field", 10 );
        this.waitForElementAndSendKeys(By.id(INPUT_PHONE_NUMBER_STEP_2), NUMBER_PHONE, "Cannot send phone number", 10);
        this.waitForElementAndClick(By.id(CONTINUE_BUTTON), "Cannot click 'Continue' button", 10);
        this.waitForElementAndClick(By.id(CODE_VIEW), "Cannot find CODE VIEW field", 10 );
        this.waitForElementAndSendKeys(By.id(CODE_VIEW), "00000", "Cannot send CODE-SMS for authorization", 10);
//        this.waitForElementPresent(By.id(ROUND_LIKE_IMAGE),"Cannot find like button", 30);

    }

}
