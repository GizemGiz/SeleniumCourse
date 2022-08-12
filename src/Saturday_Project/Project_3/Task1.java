package Saturday_Project.Project_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gizem\\Selenium Tool\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://shopdemo.e-junkie.com");


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        WebElement addToCartEBook = driver.findElement(By.xpath("(//button[text()=' Add To Cart'])[2]"));
        addToCartEBook.click();

        WebElement iframe = driver.findElement(By.cssSelector("iframe[class='EJIframeV3 EJOverlayV3']"));
        driver.switchTo().frame(iframe);

        WebElement payDebitCard = driver.findElement(By.cssSelector("button[class='Payment-Button CC']"));
        wait.until(ExpectedConditions.visibilityOf(payDebitCard));
        payDebitCard.click();

        WebElement payButton = driver.findElement(By.cssSelector("button[class='Pay-Button']"));
        wait.until(ExpectedConditions.invisibilityOf(payDebitCard));
        payButton.click();

        WebElement invalid = driver.findElement(By.cssSelector("div[id='SnackBar']"));
        String invalidText = invalid.getText();

        ///if (invalidText.contains("Invalid Email") && invalidText.contains("Invalid Email") && invalidText.contains("Invalid Billing Name")) {
           /// System.out.println("you got the \"" + invalidText + "\"message");

        ///} else
          ///  System.out.println("your text does not matching with " + invalidText);

        WebElement billingDetailsEmail = driver.findElement(By.xpath("//*[@id=\"Overlay\"]/div/div[2]/div/div[2]/form/div[1]/p[1]/input"));
        billingDetailsEmail.sendKeys("test12@technostudy.com");

        WebElement confirmEmail = driver.findElement(By.xpath("//*[@id=\"Overlay\"]/div/div[2]/div/div[2]/form/div[1]/p[2]/input"));
        confirmEmail.sendKeys("test12@technostudy.com");

        WebElement billingNameOnCard = driver.findElement(By.xpath("//*[@id=\"Overlay\"]/div/div[2]/div/div[2]/form/div[1]/p[3]/input"));
        billingNameOnCard.sendKeys("Test Tech");

        WebElement billingPhoneNumber = driver.findElement(By.xpath("//*[@id=\"Overlay\"]/div/div[2]/div/div[2]/form/div[1]/p[4]/input"));
        billingPhoneNumber.sendKeys("123456789");

        WebElement frame = driver.findElement(By.cssSelector("iframe[class='EJIframeV3 EJOverlayV3'])"));
        driver.switchTo().frame(frame);
        

    }
}

