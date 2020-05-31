package unitedHealthCare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UnitedHealthCareHomePage {

    public static String url= "https://www.uhc.com/";
    public static String fireFoxDriver="webdriver.gecko.driver";
    public static String fireFoxDriverPath="BrowserDriver\\Drivers\\geckodriver.exe";





    public static void main(String[] args) throws InterruptedException {

        System.setProperty(fireFoxDriver,fireFoxDriverPath);
        WebDriver driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);


        //test case 1: test  Nutrition link

        driver.findElement(By.linkText("Nutrition")).click();
        Thread.sleep(2000);
        driver.close();

        // test case 2: test Health and wellness link
        driver.findElement(By.linkText("Health and wellness")).click();
        Thread.sleep(2000);
        driver.close();


        //test case 3: test medicare link

        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/footer/div[1]/div/div/div/div/div/div[3]/div/div/div[1]/div/div/div[2]/ul/div/li[2]/a")).click();
        Thread.sleep(2000);
        driver.close();


        // test case 4: test Member resources link
        driver.findElement(By.linkText("Member resources")).click();
        Thread.sleep(2000);
        driver.close();

        //test case 5: test United for reform link
        driver.findElement(By.linkText("United for reform")).click();
        Thread.sleep(2000);
        driver.close();


        //test cas 6: test vision insurance link
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/main/div[2]/div/div[2]/ul/div[1]/li[2]/a")).click();
        Thread.sleep(2000);
        driver.close();

        // test case7:  test hospitalisation insurance link

        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/main/div[2]/div/div[2]/ul/div[2]/li[3]/a")).click();
        Thread.sleep(2000);
        driver.close();

        // test case 8: test Hospital and doctor insurance link

        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/main/div[2]/div/div[2]/ul/div[1]/li[1]/a")).click();
        Thread.sleep(2000);
        driver.close();



        //test case9: test International travel insurance link
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/footer/div[1]/div/div/div/div/div/div[3]/div/div/div[4]/div/div/div[2]/ul/div/li[7]/a")).click();
        Thread.sleep(2000);
        driver.close();

        // test case 10:test Language assistance / Nondiscrimination notice link
        driver.findElement(By.linkText("Language assistance / Nondiscrimination notice")).click();
        Thread.sleep(2000);
        driver.close();

        //test case 11: test find a doctor link
        driver.findElement(By.linkText("Find a doctor")).click();
        Thread.sleep(2000);
        driver.close();


        // test case 12: test Health care fraud link
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/footer/div[2]/div/nav/ul/li[4]/a")).click();
        Thread.sleep(2000);
        driver.close();

        // test case 13:  test view dental plans
        driver.findElement(By.xpath("//*[@id=\"area-dental\"]/div/div/div[4]/a")).click();
        Thread.sleep(2000);
        driver.close();


        // test case 14: test View Short Term Plans link

        driver.findElement(By.xpath("//*[@id=\"area-shortterm\"]/div/div/div[4]/a")).click();
        Thread.sleep(2000);
        driver.close();


        //test case 15: Covid 19 link
        driver.findElement(By.cssSelector("#leadIn\" > a")).click();
        driver.findElement(By.linkText("COVID-19 treatment")).click();
        Thread.sleep(2000);
        driver.close();

    }

}

