package lib.UI;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FeedScreenObject extends MainPageObject {

    public FeedScreenObject(AppiumDriver driver) {
        super(driver);
    }

    private static final String
            CATEGORY_FEED_BUTTON_POST = "Posts",
            CATEGORY_FEED_BUTTON_VIDEO = "Video",
            CATEGORY_FEED_BUTTON_CHANNEL = "Channels",

//    ** Name category **
    //              **  id-selectors in variables

            TOP_FOLLOW_SWITCH = ,

//    ** Round comment screen **
            ROUND_COMMENT_LIKE_ICON = "com.arround.io.debug:id/ivRoundLike";

//    ** Round share screen **
//            ROUND_SHARE_CLOSE_SCREEN = "",
//            ROUND_SHARE_SEND_MESSSAGE_ZHARA = "",
//            ROUND_SHARE_SEND_LINK = "";


//   ** LIKE, COMMENT, SHARE, SOUND buttons **
    public void clickLikeRoundButton()
        {
            this.waitForElementAndClick(By.id(ROUND_LIKE_IMAGE), "Can not find or click like ROUND button", 20) ;
        };
    public void clickCommentRoundButton()
        {
            this.waitForElementAndClick(By.id(ROUND_COMMENT), "Can not find or click Comment ROUND button", 20) ;
        };
    public void clickShareRoundButton()
        {
            this.waitForElementAndClick(By.id(ROUND_SHARE), "Can not find or click Share ROUND button", 20) ;
        };
    public void clickSoundRoundButton()
        {
            this.waitForElementAndClick(By.id(ROUND_SOUND_ON_OFF), "Can not find or click Sound off/on ROUND button", 20) ;
        };

    public void inputCommentTextRound()
    {
        this.waitForElementAndSendKeys(By.id(ROUND_COMMENT_TEXT_FIELD),VALUE_COMMENT,"Can not find or click Sound off/on ROUND button", 20) ;
    };
    public void clickSendComment()
    {
        this.waitForElementAndClick(By.id(ROUND_COMMENT_SEND_TEXT), "Can not find or click Sound off/on ROUND button", 20) ;
    };
    public void clickReplyCommentTextRoundButton()
    {
        this.waitForElementAndClick(By.id(ROUND_COMMENT_REPLY),"Can not find or click Sound off/on ROUND button", 20) ;
    };
    public void inputReplyCommentTextRound()
    {
        this.waitForElementAndSendKeys(By.id(ROUND_COMMENT_TEXT_FIELD), VALUE_REPLY_COMMENT, "Can not find or click Sound off/on ROUND button", 20) ;
    };

//    ** Click USER_Avatar, USER_Avatar_SUBSCRIBTION, USER_NAME, AUDIO **

    public void clickRoundUserAvatar()
    {
        this.waitForElementAndClick(By.id(ROUND_USER_AVATAR), "Can not find or click like User Avatar button", 20) ;
    };
    public void clickRoundUserSubscriptionButton()
    {
        this.waitForElementAndClick(By.id(ROUND_USER_SUBSCRIBE_ICON), "Can not find or click User Subscription ROUND button", 20) ;
    };
    public void clickRoundUserName()
    {
        this.waitForElementAndClick(By.id(ROUND_USER_NAME), "Can not find or click Round User Name string", 20) ;
    };
    public void clickRoundSoundIcon()
    {
        this.waitForElementAndClick(By.id(ROUND_SOUND_ICON), "Can not find or click Sound icon", 20) ;
    };
    public void clickRoundSoundName()
    {
        this.waitForElementAndClick(By.id(ROUND_SOUND_NAME), "Can not find or click Sound name", 20) ;
    };

//    ** Click Category posts (POST, VIDEO, CHANNELS) **

    public void clickCategoryPost()
    {
        this.waitForElementAndClick(By.id(CATEGORY_FEED_BUTTON_POST), "Can not find or click Category Posts", 20) ;
    };
    public void clickCategoryPostVideo()
    {
        this.waitForElementAndClick(By.id(CATEGORY_FEED_BUTTON_VIDEO), "Can not find or click Category Video", 20) ;
    };
    public void clickCategoryPostChannel()
    {
        this.waitForElementAndClick(By.id(CATEGORY_FEED_BUTTON_CHANNEL), "Can not find or click Category Channel", 20) ;
    };

//    ** Top/Recomendation switch and FIND **

    public void clickTopRecSwitch()
    {
        this.waitForElementAndClick(By.id(TOP_FOLLOW_SWITCH), "Can not find or click Top/Recomendation switch", 20) ;
    };
    public void subscribeIconNotPresent()
    {
        this.waitForElementNotPresent(By.id(ROUND_USER_SUBSCRIBE_ICON), "Subscribe icon still present on User Icon", 20);
    }
    public void clickFindIcon()
    {
        this.waitForElementAndClick(By.id(FIND_ICON), "Can not find or click Find icon", 20) ;
    };


    public WebElement getLikeCounter()
    {
        return this.waitForElementPresent(By.id(ROUND_LIKE_COUNTER), "Cannot find ROUND like counter", 20);
    }
    public int getLikeCounterValue()
    {
        String COUNTER_LIKE = this.getLikeCounter().getText();
        return Integer.parseInt(COUNTER_LIKE);
    }

}
