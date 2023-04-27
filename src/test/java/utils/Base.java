package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Base {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public Base() {
        driver=Driver.getDriver("chrome");
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void click(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();

    }
    public void sendKeys(By locator, CharSequence... text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }

    public void visible(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
