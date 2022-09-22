package lib.UI;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class NavbarPageObject extends MainPageObject {

    private static final String
//              ** Button Bottom Navbar **
        FEED_BUTTON = "com.arround.io.debug:id/iconMain",
        SERVICES_BUTTON = "com.arround.io.debug:id/iconService",
        CREATE_POST_BUTTON = "com.arround.io.debug:id/ivCreation",
        MESSENGER_BUTTON = "com.arround.io.debug:id/iconChats",
        PROFILE_BUTTON = "com.arround.io.debug:id/screen_main_navigation__icon_profile";

    public NavbarPageObject(AppiumDriver driver) {
        super(driver);
    }

//              ** Click on Bottom Navbar Button **

    public void clickFeedButton () {
        this.waitForElementAndClick(By.id(FEED_BUTTON), "Cannot find or click Feed Button", 15);
    }
    public void clickServicesButton () {
        this.waitForElementAndClick(By.id(SERVICES_BUTTON), "Cannot find or click Services Button", 15);
    }
    public void clickCreateNewPostButton () {
        this.waitForElementAndClick(By.id(CREATE_POST_BUTTON), "Cannot find or click Create New Post Button", 15);
    }
    public void clickMessengerButton () {
        this.waitForElementAndClick(By.id(MESSENGER_BUTTON), "Cannot find or click Messenger Button", 15);
    }
    public void clickProfileButton () {
        this.waitForElementAndClick(By.id(PROFILE_BUTTON), "Cannot find or click Profile Button", 15);
    }

}
