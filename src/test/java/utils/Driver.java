package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {

    private static WebDriver driver;


    public static WebDriver getDriver(String browser){
        if (driver==null){
            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options=new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*");
                    driver=new ChromeDriver(options);
            }
        }
        return driver;
    }
}
