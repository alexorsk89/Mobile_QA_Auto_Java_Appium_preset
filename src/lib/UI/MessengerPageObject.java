package lib.UI;

import io.appium.java_client.AppiumDriver;
import lib.CoreTestCase;

public class MessengerPageObject extends MainPageObject {

    private static final String

//    ** Skip Invite friends from contacts **
        SKIP_INVITE_FRIEND = "com.arround.io.debug:id/skipFriendsBtn",

//    ** Header messenger buttons **
        QR_CODE_CHAT_BUTTON = "com.arround.io.debug:id/skipFriendsBtn",
        CREATE_NEW_CHAT = "com.arround.io.debug:id/startMultiChats",

//    ** Category chat buttons **
        CHATS_BUTTON = "com.arround.io.debug:id/btnChat",
        GROUPS_BUTTON = "com.arround.io.debug:id/btnGroup",
        CHANNELS_BUTTON = "com.arround.io.debug:id/btnChannel",
        ALL_CHATS_BUTTON = "com.arround.io.debug:id/btnAllContent",

        SEARCH_BUTTON = "com.arround.io.debug:id/ivSearch";


    public MessengerPageObject(AppiumDriver driver) {
        super(driver);
    }
}
