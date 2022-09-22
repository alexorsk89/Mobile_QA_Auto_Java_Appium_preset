package tests;

import io.appium.java_client.AppiumDriver;
import lib.CoreTestCase;
import lib.UI.SearchPageObject;
import org.junit.Test;


public class SearchTest extends CoreTestCase
{
    public SearchTest() {
        super();
    }

    @Test
    public void testSearch() {
        SearchPageObject SearchPageObject = new SearchPageObject(driver);

        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine("Java");
        SearchPageObject.waitForSearchResult("Object-oriented programming language");

    }

    @Test
    public void testCancelSearch() {

        SearchPageObject SearchPageObject = new SearchPageObject(driver);

        SearchPageObject.initSearchInput();
//        SearchPageObject.typeSearchLine("Java");
        SearchPageObject.waitForCancelButtonSearchAppear();
        SearchPageObject.clickCancelSearch();
        SearchPageObject.waitForCancelButtonSearchDisppear();

    }

    @Test
    public void testAmountOfNotEmptySearch()
    {
        SearchPageObject SearchPageObject = new SearchPageObject(driver);

        SearchPageObject.initSearchInput();
        String search_line = "Muse";
        SearchPageObject.typeSearchLine(search_line);
        SearchPageObject.getAmountOfFoundArticles();
        int amount_of_Search_results = SearchPageObject.getAmountOfFoundArticles();

        assertTrue(
                "We found too few results",
                amount_of_Search_results > 0
        );
    }

    @Test
    public void testAmountOfEmptySearch()
    {

        SearchPageObject SearchPageObject = new SearchPageObject(driver);
        SearchPageObject.initSearchInput();
        String search_line = "ghytghj";
        SearchPageObject.typeSearchLine(search_line);
        SearchPageObject.waitForEmptyResultLabel();
        SearchPageObject.assertThereIsNoResultLabel();
    }
}
