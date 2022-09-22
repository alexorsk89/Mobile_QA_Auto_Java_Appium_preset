package lib.UI;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProfilePageObject extends MainPageObject {


//    My Profile
    private static final String

//        ** Header button **

        EDIT_MY_PROFILE_BUTTON = "com.arround.io.debug:id/icon_edit_top_block",
        MY_QR_CODE_PROFILE = "com.arround.io.debug:id/icon_qr_top_block",
        NOTIFICATION_BUTTON = "com.arround.io.debug:id/icon_notifications",
        BURGER_BUTTON_MY_PROFILE = "com.arround.io.debug:id/icon_menu_hamburger",

//        ** Body profile **
        MY_PROFILE_AVATAR_PIC = "com.arround.io.debug:id/profileImageCardBtn",
        MY_PROFILE_USER_NAME = "com.arround.io.debug:id/profileNewUsername",
        MY_PROFILE_NAME_STRING = "com.arround.io.debug:id/profileNewName",
        MY_SUBSCRIBERS = "com.arround.io.debug:id/subscribers_ll",
        MY_SUBSCRIBERS_COUNTER = "com.arround.io.debug:id/profileSubscribersCountTv",
        MY_SUBSCRIPTIONS = "com.arround.io.debug:id/subscriptions_ll",
        MY_SUBSCRIPTIONS_COUNTER = "com.arround.io.debug:id/profileSubscriptionsCount",
        MY_CHANNEL = "com.arround.io.debug:id/channel_ll",
        MY_CHANNEL_COUNTER = "com.arround.io.debug:id/profileChannelsCount",
        MY_PROFILE_ABOUT_USER_FIELD = "com.arround.io.debug:id/about_user_tv",
        MY_WEB_SITE_USER = "com.arround.io.debug:id/site_user_tv",

//          ** Switch category posts on user profile page - XPath**
        POSTS_CATEGORY = "//android.widget.LinearLayout[@content-desc=\"Posts\"]/android.widget.TextView",
        VIDEO_CATEGORY = "//android.widget.LinearLayout[@content-desc=\"Video\"]/android.widget.TextView",
        STREAMS_CATEGORY = "//android.widget.LinearLayout[@content-desc=\"Streams\"]/android.widget.TextView",
        CHANNEL_CATEGORY = "//android.widget.LinearLayout[@content-desc=\"Channels\"]/android.widget.TextView",

//          ** Subscribe Page Screen **
        BACK_BUTTON = "com.arround.io.debug:id/back__iv",
        TEXT_SEARCH_1 = "",
        SEARCH_FIELD = "com.arround.io.debug:id/search_field",
        SUBSCRIBER_COUNT_TAB = "//android.widget.LinearLayout[@content-desc=\"subscribers__tab_layout\"]/android.widget.TextView",
        SUBSCRIPTION_COUNT_TAB = "subscription__tab_layout",
        SUBSCRIBER_LIST = "com.arround.io.debug:id/recycler_users";


//    Another Profile
private static final String
        MORE_ACTION_ANOTHER_USER = "com.arround.io.debug:id/more",
        ANOTHER_PROFILE_AVATAR_PIC = "com.arround.io.debug:id/profileNewAvatar",
        ANOTHER_PROFILE_USER_NAME = "com.arround.io.debug:id/profileNewUsername",
        ANOTHER_PROFILE_NAME_STRING = "com.arround.io.debug:id/profileNewName",
        ANOTHER_SUBSCRIBERS = "com.arround.io.debug:id/subscribers_ll",
        ANOTHER_SUBSCRIBERS_COUNTER = "com.arround.io.debug:id/profileSubscribersCountTv",
        ANOTHER_SUBSCRIPTIONS = "com.arround.io.debug:id/subscriptions_ll",
        ANOTHER_SUBSCRIPTIONS_COUNTER = "com.arround.io.debug:id/profileSubscriptionsCount",
        ANOTHER_CHANNEL = "com.arround.io.debug:id/channel_ll",
        ANOTHER_CHANNEL_COUNTER = "com.arround.io.debug:id/profileChannelsCount",
        ANOTHER_PROFILE_ABOUT_USER_FIELD = "com.arround.io.debug:id/about_user_tv",
        ANOTHER_WEB_SITE_USER = "com.arround.io.debug:id/site_user_tv",
        FOLLOW_BUTTON = "com.arround.io.debug:id/follow_btn", // May by 2 position
        OPEN_CHAT = "com.arround.io.debug:id/message_btn";

//          ** More actions another user buttons **
private static final String
        CLOSE_MORE_ACTION_SCREEN = "com.arround.io.debug:id/fragment_bottom_sheet__close_button",
        SHARE_LINK = "Share link",
        COPY_LINK = "Copy link",
        QR_CODE = "QR-code",
        SHARE_VK = "VK",
        SHARE_OK = "Odnoklassniki",
        REPORT_USER_BUTTON = "Report",
        BLOCK_USER_BUTTON = "Block";



    public ProfilePageObject(AppiumDriver driver) {
        super(driver);
    }

//          ** Click header navbar buttons **
    public void clickEditMyProfileButton() {
        this.waitForElementAndClick(By.id(EDIT_MY_PROFILE_BUTTON), "Cannot find or click Edit profile button", 15);
    }
    public void clickMyQrCodeButton() {
        this.waitForElementAndClick(By.id(MY_QR_CODE_PROFILE), "Cannot find or click My QR-Code button", 15);
    }
    public void clickNotificationButton() {
        this.waitForElementAndClick(By.id(NOTIFICATION_BUTTON), "Cannot find or click Notification button", 15);
    }
    public void clickBurgerButton() {
        this.waitForElementAndClick(By.id(BURGER_BUTTON_MY_PROFILE), "Cannot find or click Burger button", 15);
    }

//          ** Click Body profile buttons **
    public void clickMyAvatarButton() {
        this.waitForElementAndClick(By.id(MY_PROFILE_AVATAR_PIC), "Cannot find or click My AVATAR", 15);
    }
    public void clickMySubscribersButton() {
        this.waitForElementAndClick(By.id(MY_SUBSCRIBERS_COUNTER), "Cannot find or click My Subscribers button", 15);
    }
    public void clickMySubscriptionsButton() {
        this.waitForElementAndClick(By.id(MY_SUBSCRIPTIONS), "Cannot find or click My Subscription button", 15);
    }
    public void clickMyChannelButton() {
        this.waitForElementAndClick(By.id(MY_CHANNEL), "Cannot find or click My channel button", 15);
    }
    public void clickWebSiteTitle() {
        this.waitForElementAndClick(By.id(MY_WEB_SITE_USER), "Cannot find or click Website title", 15);
    }

//          ** Click category posts - Posts, Video, Streams, Channels **
    public void clickPostCategory() {
        this.waitForElementAndClick(By.xpath(POSTS_CATEGORY), "Cannot find or click Posts Category", 15);
    }
    public void clickVideoCategory() {
        this.waitForElementAndClick(By.xpath(VIDEO_CATEGORY), "Cannot find or click Video Category", 15);
    }
    public void clickStreamsCategory() {
        this.waitForElementAndClick(By.xpath(STREAMS_CATEGORY), "Cannot find or click Streams Category", 15);
    }
    public void clickChannelsCategory() {
        this.waitForElementAndClick(By.xpath(CHANNEL_CATEGORY), "Cannot find or click Channels Category", 15);
    }


    public void clickBackButton() {
        this.waitForElementAndClick(By.xpath(BACK_BUTTON), "Cannot find or click Back button", 15);
    }
    public void sendTextSearchFieldOnSubscribes() {
        this.waitForElementAndSendKeys(By.id(SEARCH_FIELD),TEXT_SEARCH_1, "Cannot send text into search field on subscribes screen", 15 );
    }

    public void moveToProfilePage() {
        NavbarPageObject navbarPageObject = new NavbarPageObject(driver);
        navbarPageObject.clickProfileButton();
    }

    public WebElement getSubscriberCounterOnProfileScreen()
    {
        return this.waitForElementPresent(By.id(MY_SUBSCRIBERS_COUNTER), "Cannot find subscriber profile screen counter", 20);
    }
    public int getSubscriberOnProfileScreenCounterValue()
    {
        String COUNTER_SUBSCRIBER_PROFILE_SCREEN = this.getSubscriberCounterOnProfileScreen().getText();
        return Integer.parseInt(COUNTER_SUBSCRIBER_PROFILE_SCREEN);
    }

    public WebElement getSubscriberCounterOnSubScreen() {
        return this.waitForElementPresent(By.xpath(SUBSCRIBER_COUNT_TAB), "Cannot find subscriber sub screen counter", 20);
    }
    public int getSubscriberOnSubScreenCounterValue() {
        String COUNTER_SUBSCRIBER_SUB_SCREEN = this.getSubscriberCounterOnSubScreen().getText();
        return Integer.parseInt(COUNTER_SUBSCRIBER_SUB_SCREEN.replaceAll("[\\D]", ""));
    }
//    public void getSubscriberList() {
//        By SUBSCRIBER_LIST_PARENT = By.id(SUBSCRIBER_LIST);
//        this.waitForElementPresent(By.id(SUBSCRIBER_LIST), "Cannot find subscriber list", 20);
//        List<WebElement> SubscriberList = SUBSCRIBER_LIST_PARENT.findElements((SearchContext) By.className("android.widget.LinearLayout"));
//        System.out.println(SubscriberList);
//
//    }
    public int getSubscriberList(By by) {
        List elements = driver.findElements(by);
        return elements.size();
    }


}
