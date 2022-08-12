package Day10;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_Scrolling {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gizem\\Selenium Tool\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://techno.study/");


        JavascriptExecutor js = (JavascriptExecutor) driver;

        // scroll down 3000 pixels
        js.executeScript("window.scrollBy(0, 3000)");


        // scroll up 2000 pixels
        js.executeScript("window.scrollBy(0,-2000)");

    }
}
