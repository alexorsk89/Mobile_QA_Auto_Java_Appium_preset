package tests;

import com.sun.org.glassfish.gmbal.Description;
import lib.CoreTestCase;
import lib.UI.NavbarPageObject;
import lib.UI.ProfilePageObject;
import org.junit.Test;

public class ProfileTest extends CoreTestCase {

    public ProfileTest() {
        super();
    }

    @Test
    @Description("")
    public void testCounterSubscriptions() {
        ProfilePageObject profilePageObject = new ProfilePageObject(driver);
        profilePageObject.moveToProfilePage();

        int subscriberCounterOnProfileScreen = profilePageObject.getSubscriberOnProfileScreenCounterValue();
        profilePageObject.clickMySubscribersButton();
        int subscriberCounterOnSubScreen = profilePageObject.getSubscriberOnSubScreenCounterValue();
        assertEquals(subscriberCounterOnProfileScreen, subscriberCounterOnSubScreen);
        profilePageObject.getSubscriberList();

        System.out.println(subscriberCounterOnProfileScreen);
        System.out.println(subscriberCounterOnSubScreen);







    }


}
