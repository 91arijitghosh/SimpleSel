package TestCases;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class OpenGoogle
{

    public WebDriver driver;

    @Test
    public void open_Google() throws MalformedURLException {
        String gridURL = "http://localhost:4444";

        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WIN10);
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.merge(cap);
        driver = new RemoteWebDriver(new URL(gridURL),options);
        //driver.manage().window().maximize();
        //driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        System.out.println("This is title"+driver.getTitle());
        driver.quit();
        System.out.println("This is a demo Maven Project");
    }
}
