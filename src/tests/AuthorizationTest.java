package tests;

import io.appium.java_client.AppiumDriver;
import lib.CoreTestCase;
import lib.UI.StartScreenObject;
import org.junit.Test;

public class AuthorizationTest extends CoreTestCase
{
    public AuthorizationTest()
    {
        super();
    }

    @Test
    public void testAuthorization()
        {
            StartScreenObject startScreenObject = new StartScreenObject(driver);
            startScreenObject.authorizationStart();
        }
}
