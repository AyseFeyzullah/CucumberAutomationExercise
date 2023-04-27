package pages;

import org.openqa.selenium.By;

public class locator {

    public static final By lLoginLink=By.xpath("//a[@href='/login']");
    public static final By lLoginEmail=By.cssSelector(".login-form input[name='email']");
    public static final By lLoginPassword=By.cssSelector(".login-form input[name='password']");
    public static final By lLoginButton=By.cssSelector(".login-form button");
    public static final By lLoginProfileLink=By.xpath("//a[contains(.,'Logged in as')]");
}
