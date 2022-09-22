package tests;

import com.sun.org.glassfish.gmbal.Description;
import lib.CoreTestCase;
import lib.UI.FeedScreenObject;
import org.junit.Test;

public class FeedTest extends CoreTestCase {

    public FeedTest() {
        super();
    }

    @Test
    @Description("Test work counter like after click like icon")
    public void testLikeCounter() {
        FeedScreenObject feedScreenObject = new FeedScreenObject(driver);

        int likeCounterValueBeforeCLick = feedScreenObject.getLikeCounterValue();
        feedScreenObject.clickLikeRoundButton();
        int likeCounterValueAfterClick = feedScreenObject.getLikeCounterValue();
        assertEquals(likeCounterValueBeforeCLick+1, likeCounterValueAfterClick);

    }

    @Test
    @Description("Assert icon subscribe not present on screen Subscribe posts category")
    public void testSwitchTopRecommendation() {
        FeedScreenObject feedScreenObject = new FeedScreenObject(driver);

        feedScreenObject.clickTopRecSwitch();
        feedScreenObject.subscribeIconNotPresent();
        feedScreenObject.swipeUpPost();
        feedScreenObject.subscribeIconNotPresent();
        feedScreenObject.swipeUpPost();
        feedScreenObject.subscribeIconNotPresent();

    }

    @Test
    @Description("Send comment and reply comment on post recommendation category")
    public void testSendCommentOnPostAndReplyComment () {
        FeedScreenObject feedScreenObject = new FeedScreenObject(driver);

        feedScreenObject.clickTopRecSwitch();
        feedScreenObject.clickCommentRoundButton();
        feedScreenObject.inputCommentTextRound();
        feedScreenObject.clickSendComment();
        feedScreenObject.clickReplyCommentTextRoundButton();
        feedScreenObject.inputReplyCommentTextRound();
        feedScreenObject.clickSendComment();
    }

    @Test
    @Description("Click like button on post and swipe up to next post")
    public void testSwipeUpAndLikePosts () {
        FeedScreenObject feedScreenObject = new FeedScreenObject(driver);

        feedScreenObject.clickLikeRoundButton();
        feedScreenObject.swipeUpQuick();
        feedScreenObject.clickLikeRoundButton();
        feedScreenObject.swipeUpQuick();
        feedScreenObject.clickLikeRoundButton();
        feedScreenObject.swipeUpQuick();
        feedScreenObject.swipeUpQuick();
        feedScreenObject.swipeUpQuick();
    }

    @Test
    @Description("Click like button on post and swipe up to next post on subscribers feed")
    public void testSwitchOnSubscribersSwipeUpAndLikePosts () {
        FeedScreenObject feedScreenObject = new FeedScreenObject(driver);

        feedScreenObject.clickTopRecSwitch();
        feedScreenObject.clickLikeRoundButton();
        feedScreenObject.swipeUpQuick();
        feedScreenObject.clickLikeRoundButton();
        feedScreenObject.swipeUpQuick();
        feedScreenObject.clickLikeRoundButton();
        feedScreenObject.swipeUpQuick();

    }

    @Test
    @Description("Click on User_Avatar on post and transition on User Profile Screen")
    public void testClickUserAvatarOnPostAndTransitionUserProfile () throws InterruptedException {
        FeedScreenObject feedScreenObject = new FeedScreenObject(driver);

        feedScreenObject.swipeUpQuick();
        feedScreenObject.clickRoundUserAvatar();


    }


}
