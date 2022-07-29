package Day10.ActionsClassMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_ScrollingAllTheWayDown {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gizem\\Selenium Tool\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://techno.study/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // this will scroll all the way down to bottom of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

    }
}
