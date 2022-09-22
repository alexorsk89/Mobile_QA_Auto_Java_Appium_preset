package lib.UI;

import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SearchPageObject extends MainPageObject
{
    private static final String
            SEARCH_INIT_ELEMENT = "//*[contains(@text, 'Search Wikipedia')]",
            SEARCH_INPUT = "//*[contains(@text, 'Search…')]",
            SEARCH_CANCEL_BUTTON = "org.wikipedia:id/search_close_btn",
            SEARCH_RESULT_BY_SUBSTRING_TPL = "//*[@resource-id='org.wikipedia:id/page_list_item_container']//*[@text='{SUBSTRING}']",
            SEARCH_RESULT_ELEMENT = "//*[resource-id='org.wikipedia:id/search_results_list']/*[resource-id='org.wikipedia:id/page_list_item_container']",
            SEARCH_EMPTY_RESULT_ELEMENT = "//*[@text='No result found']";

    public SearchPageObject(AppiumDriver driver)
    {
        super(driver);
    }

    /* TEMPLATES METHODS */
    private static String getResultSearchElement(String substring)
    {
        return SEARCH_RESULT_BY_SUBSTRING_TPL.replace("{SUBSTRING}", substring);
    }
    /* TEMPLATES METHODS */

    public void initSearchInput()
    {
        this.waitForElementPresent(By.xpath(SEARCH_INIT_ELEMENT), "Cannot find search input after clicking search init element");
        this.waitForElementAndClick(By.xpath(SEARCH_INIT_ELEMENT), "Cannot find and click search init element", 5);
    }

    public void waitForCancelButtonSearchAppear()
    {
        this.waitForElementPresent(By.id(SEARCH_CANCEL_BUTTON), "Cannot find search cancel button", 5);
    }

    public void waitForCancelButtonSearchDisppear()
    {
        this.waitForElementNotPresent(By.id(SEARCH_CANCEL_BUTTON), "Search cancel button is still present", 5);
    }

    public void clickCancelSearch()
    {
        this.waitForElementAndClick(By.id(SEARCH_CANCEL_BUTTON), "Cannot find and click cancel search button", 5);
    }

    public void typeSearchLine(String search_line)
    {
        this.waitForElementAndSendKeys(By.xpath(SEARCH_INPUT), search_line, "Cannot find and type into search input", 5);
    }

    public void waitForSearchResult(String substring)
    {
        String search_result_substring = getResultSearchElement(substring);
        this.waitForElementPresent(By.xpath(search_result_substring), "Cannot find search result with substring " + substring);
    }

    public void clickByArticleWithSubstring(String substring)
    {
        String search_result_substring = getResultSearchElement(substring);
        this.waitForElementAndClick(By.xpath(search_result_substring), "Cannot find and click search result with substring " + substring, 10);
    }

    public int getAmountOfFoundArticles()
    {
        this.waitForElementPresent(
                By.xpath(SEARCH_RESULT_ELEMENT),
                "Cannot find anything by the request",
                20
        );
        return this.getAmoutntOfElements(By.xpath(SEARCH_RESULT_ELEMENT));
    }

    public void waitForEmptyResultLabel()
    {
        this.waitForElementPresent(By.xpath(SEARCH_EMPTY_RESULT_ELEMENT),"cannot find empty result element", 15);

    }

    public void assertThereIsNoResultLabel()
    {
        this.assertElementsNotPresent(By.xpath(SEARCH_RESULT_ELEMENT),"We supposed not to find any results");
    }
}
