import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

public class FirstTest {

    private AppiumDriver driver;

    @Before
    public void setUp() throws Exception
    {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "AndroidTestDevice");
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("appPackage", "com.arround.io.debug");
        capabilities.setCapability("appActivity", "com.arround.io.new_auth.EnterPhoneActivity");
        capabilities.setCapability("app", "/Users/alexqasinelnikov/Desktop/ZHARA_Android_AutoTest/ZHARA_Android_AutoTest/apks/ZHARA_5.1.1(1).apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }


    /*    Первый тестовый сценарий для ЖАРЫ.
    Шаги воспроизведения:
    1. Запустить приложение
    2. Ввести номер телефона (+7999-999-99-78 (Алекс Куа))
    3. Нажать на кнопку "Продолжить"
    4. Ввести код авторизации
    5. Нажать кнопку "Пропустить" для синхронизации контактов
    6. Нажать кнопку "Мессенджер"
    7. Нажать кнопку "Поиск" в мессенджере
    8. В поле ввода поиска ввести имя "Толя"
    9. Тапнуть по строке "Толя" из результата поиска
    10. В поле ввода сообщения набрать текст "Первый автотест для Android, запущенный на JAVA"
    11. Нажать кнопку "Отправить"

*/
    @Test
    public void firstTest()
    {
//        1. Запуск приложения ЖАРА и ввод номера телефона для авторизации
        waitForElementAndSendKeys(
                By.id("com.arround.io.debug:id/phoneInputPhone"),
                "+79999999978",
                "RU. Не удалось найти поле ввода номера телефона. EN. Cannot find phone number input",
                10
        );
//        2. Клик по кнопке "Продолжить"
        waitForElementAndCLick(
                By.id("com.arround.io.debug:id/subscribe_text"),
                "RU.Не удалось найти кнопку 'Продолжить' EN.Cannot find 'Continue' button",
                10
        );
//        3. Ввод кода авторизации
        waitForElementAndSendKeys(
                By.id("com.arround.io.debug:id/codeView"),
                "00000",
                "RU. Не удалось найти поле ввода кода авторизации. EN. Cannot find CODE input",
                10
        );
//        4. Пропустить синхронизацию телефонной книги
        waitForElementAndCLick(
                By.id("com.arround.io.debug:id/skipFriendsBtn"),
                "RU.Не удалось найти кнопку 'Пропустить' EN.Cannot find 'Skip' button",
                10
        );
//        5. Переход в мессенджер
        waitForElementAndCLick(
                By.id("com.arround.io.debug:id/iconChats"),
                "RU.Не удалось найти кнопку 'Мессенджер' EN.Cannot find 'Messenger' button",
                10
        );
//        6. Тап по иконке поиска
        waitForElementAndCLick(
                By.id("com.arround.io.debug:id/ivSearch"),
                "RU.Не удалось найти кнопку 'Поиск' EN.Cannot find 'Search' button",
                10
        );
//        7. Ввод имени "Толя" в строку поиска
        waitForElementAndSendKeys(
                By.id("com.arround.io.debug:id/etInputFriendsText"),
                "Толя",
                "RU.Не удалось  ввести текст Толя. EN.Cannot paste input text Толя",
                15
        );
//        8. Тап по результату поиска "Толя"
        waitForElementAndCLick(
                By.id("com.arround.io.debug:id/userSearchItemAvatar"),
                "RU.Не удалось кликнуть на результат поиска Толя EN.Cannot click search result Толя",
                15
        );
//        9. Ввод сообщения в поле ввода
        waitForElementAndSendKeys(
                By.id("com.arround.io.debug:id/textMessageInput"),
                "Первый автотест для Android, запущенный на JAVA",
                "RU.Не удалось  ввести текст сообщения. EN.Cannot input text message",
                10
        );
//        10. Тап по кнопке "Отправить"
        waitForElementAndCLick(
                By.id("com.arround.io.debug:id/message_post"),
                "RU.Не удалось кликнуть на результат поиска Толя EN.Cannot click search result Толя",
                20
        );

    }

    private WebElement waitForElementPresent(By by, String error_message, long timeoutInSecond)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSecond);
        wait.withMessage(error_message + "\n");
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(by)
        );
    }

    private WebElement waitForElementPresent(By by, String error_message)
    {
        return waitForElementPresent(by, error_message, 5);
    }

    private WebElement waitForElementAndCLick(By by, String error_message, long timeoutInSecond)
    {
        WebElement element = waitForElementPresent(by, error_message, timeoutInSecond);
        element.click();
        return element;
    }

    private WebElement waitForElementAndSendKeys(By by, String value, String error_message, long timeoutInSecond)
    {
        WebElement element = waitForElementPresent(by, error_message, timeoutInSecond);
        element.sendKeys(value);
        return element;
    }

    private boolean waitForElementNotPresent(By by, String error_message, long timeoutInSecond)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSecond);
        wait.withMessage(error_message + "\n");
        return wait.until(
                ExpectedConditions.invisibilityOfElementLocated(by)
        );
    }


}
