package lib.UI;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class StartScreenObject extends MainPageObject
{
    private static final String
        INPUT_PHONE_NUMBER = "",
        INPUT_PHONE_NUMBER_STEP_2 = "",
        CONTINUE_BUTTON = "",
        CODE_VIEW = "",
        ROUND_LIKE_IMAGE = "";
        // NUMBER_PHONE = "";


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
