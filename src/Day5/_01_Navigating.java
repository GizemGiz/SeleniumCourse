package Day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_Navigating {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gizem\\Selenium Tool\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // navigate to website and wait until page is load!
        driver.get("https://www.google.com/");

        // thread. sleep force selenium to wait!
        Thread.sleep(3000);

        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);

        // it is not wait for page to load
        // driver.navigate().to("https://www.google.com/");


        // driver.navigate().back() will navigate previous page!
        driver.navigate().back();

        // driver.forward() method will navigate to forward page!
        driver.navigate().forward();

        // for refresh the page
        driver.navigate().refresh();



        driver.quit();
    }
}
