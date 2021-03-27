package dev.selenium;


import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;


public class Tests extends WebDriverSettings {

    @Test
        public void FirstTest() {

        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.firstLink("automation");
        SearchResults searchResults = PageFactory.initElements(driver, SearchResults.class);
        searchResults.firstRes();
        assertThat(searchResults.linkTitle(),containsString("automation"));
    }


    @Test
    public void SecondTest() {

        driver.get("https://www.google.com/");

        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.firstLink("automation");
        SearchResults searchResults = PageFactory.initElements(driver, SearchResults.class);


    }

}

