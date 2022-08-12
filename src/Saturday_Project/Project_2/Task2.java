package Saturday_Project.Project_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gizem\\Selenium Tool\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://shopdemo.e-junkie.com/");

        WebElement clickOnCart = driver.findElement(By.xpath("//*[@id='products']/div[1]/div/div[2]/a/div/div[2]/button"));
        clickOnCart.click();

        WebElement iframe = driver.findElement(By.xpath("/html/body/iframe[1]"));
        Thread.sleep(5000);

        driver.switchTo().frame(iframe);
        System.out.println("iframe sonrasi");
        Thread.sleep(3000);

        WebElement removeButton = driver.findElement(By.xpath("//*[@id='Overlay'']/div/div[2]/div/div[1]/div[2]/div[1]/button"));
        Thread.sleep(3000);
        removeButton.click();
    }
}
