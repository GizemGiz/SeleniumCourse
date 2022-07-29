package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_ClickAndSendKeys {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gizem\\Selenium Tool\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement closePopUpButton = driver.findElement(By.id("at-cv-lightbox-close"));
        closePopUpButton.click();

        Thread.sleep(3000);

        String value  ="Hello World!";

        WebElement messageInput = driver.findElement(By.cssSelector("input[id='user-message']"));
        messageInput.sendKeys(value);

        Thread.sleep(3000);


        WebElement showMessageButton = driver.findElement(By.cssSelector("button[onclick='showInput();']"));
        showMessageButton.click();

        Thread.sleep(3000);

        WebElement displayedMessage = driver.findElement(By.id("display"));
        String displayMessageText = displayedMessage.getText();


        if (displayMessageText.equals(value)){
            System.out.println("Success!");
        }else {
            System.out.println("Fail");
        }


        driver.quit();




    }
}
