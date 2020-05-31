package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;



public class HomePage {



    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","BrowserDriver\\Drivers\\chromedriver2.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        //find element
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Baby Diapers");
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();


        // find element
        //driver.findElement(By.className("nav-complex-title")).click();
        //Enter username and Password
        //driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[1]/form/div/div[1]/div/label")).sendKeys("asiful6288@yahoo.com");
        //driver.findElement(By.xpath("//*[@id=\"UserPwd\"]")).sendKeys("July1994");
        // driver.findElement(By.className("btn btn-primary btn-wide")).click();

    }
}
