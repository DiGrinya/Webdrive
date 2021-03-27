package dev.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResults {

    private WebDriver driver;

    private By link = By.xpath("//div[@class='g']//div[1]/div[1]/a");

    public SearchResults(WebDriver driver){
        this.driver = driver;
    }

    public void firstRes () {
        driver.findElement(link).click();
    }

    public String linkTitle () {
        String title = driver.getTitle();
        String titleck = title.toLowerCase();
        return titleck;
    }

    public void linkFind() {
        List<WebElement> list = driver.findElements(link);

        for (WebElement i : list) {
            System.out.println(i.getAttribute("href"));
        }
    }
}
