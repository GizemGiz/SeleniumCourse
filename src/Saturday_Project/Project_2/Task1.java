package Saturday_Project.Project_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gizem\\Selenium Tool\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://shopdemo.e-junkie.com/");

        WebElement clickOnCart = driver.findElement(By.xpath("//*[@id='products']/div[1]/div/div[2]/a/div/div[2]/button"));
        clickOnCart.click();

        WebElement frameBYCss = driver.findElement(By.cssSelector("iframe[class='EJIframeV3 EJOverlayV3']"));

        driver.switchTo().frame(frameBYCss);
    }
}