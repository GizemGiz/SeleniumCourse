package Day5;

import com.sun.tools.javac.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _07_ClickAndSendKeysTASK {

    public static void main(String[] args) throws InterruptedException {

        //Tes Data

        String num1 = "29";
        String num2 = "30";

        int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
        String expectedResult = Integer.toString(sum);


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gizem\\Selenium Tool\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        Thread.sleep(3000);

        WebElement closePopUpButton = driver.findElement(By.id("at-cv-lightbox-close"));
        closePopUpButton.click();

        Thread.sleep(3000);

        WebElement numberInput1 = driver.findElement(By.id("sum1"));
        WebElement numberInput2 = driver.findElement(By.id("sum2"));

        numberInput1.sendKeys(num1);
        numberInput2.sendKeys(num2);

        Thread.sleep(3000);

        WebElement getTotalButton = driver.findElement(By.cssSelector("button[onclick='return total()']"));
        getTotalButton.click();

        Thread.sleep(3000);

        WebElement resultTotal = driver.findElement(By.id("displayvalue"));
        String actualResult = resultTotal.getText();

        if (actualResult.equals(expectedResult)){
            System.out.println("Success!");
        }else{
            throw new RuntimeException();
        }
        driver.quit();

    }
}
