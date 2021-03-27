package dev.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;


    private By searchField = By.name("q");
    private By submitButton = By.name("btnK");


    public SearchPage(WebDriver driver){
    this.driver = driver;
    }


    public void firstLink (String search) {
        driver.get("https://www.google.com/");
        driver.findElement(searchField).sendKeys(search);
        driver.findElement(submitButton).click();
    }
}