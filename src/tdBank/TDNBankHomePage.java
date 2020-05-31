package tdBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TDNBankHomePage {
    public static String url="https://onlinebanking.tdbank.com/#/authentication/login";
    public static String fireFoxDriver="webdriver.gecko.driver";
    public static String fireFoxDriverPath="BrowserDriver\\Drivers\\geckodriver.exe";


    public static void main(String[] args) throws InterruptedException {

        System.setProperty(fireFoxDriver, fireFoxDriverPath);

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);


        //test case1: test the Help option

        driver.findElement(By.linkText("Help")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#login-body-content-cloned > div > div")).click();
        //driver.close();

        // test case 2: test Small Business link

        driver.findElement(By.linkText("Small Business")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"drag-id-tabsCarousel0\"]/div/li[1]/div[1]/p")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"product0\"]/div/div[2]/div[2]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.close();

        // test case 3: test Commercial link

        driver.findElement(By.linkText("Commercial")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"drag-id-tabsCarousel0\"]/div/li[1]/div[1]/p")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"main\"]/section[5]/div/div[2]/div/button")).click();
        Thread.sleep(2000);
        driver.close();

        // test case 4:Test learning link
        driver.findElement(By.linkText("Learning")).click();
        driver.findElement(By.xpath("//*[@id=\"tabsCarousel0_tab0\"]/div/section[2]/div/div[2]/div[1]/div/div/div[3]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("Thread.sleep(2000);")).click();
        Thread.sleep(2000);
        driver.close();


        //test case 5: test Country options

        driver.findElement(By.id("td-desktop-nav-dropdown-link-0")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/header[1]/div[2]/div/div[2]/div/ul/li[1]/ul/li[2]/a")).click();
        Thread.sleep(2000);
        driver.close();

        // test case 6:test privacy link

        driver.findElement(By.linkText("Privacy")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#main > section.td-text-with-link > div > div > div > p:nth-child(3) > a")).click();
        Thread.sleep(2000);
        driver.close();

        //test case 7: Learning link

        driver.findElement(By.linkText("Learning")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#Tab_2 > div.td-tabs-carousel-tab-content > h4")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"tabsCarousel0_tab1\"]/div/section[2]/div/div[2]/div[4]/div/div/div[3]/button")).click();
        Thread.sleep(2000);
        driver.close();


        // test case8: test find td bank location option
        driver.findElement(By.linkText("Find Us")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#q")).sendKeys("22191");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#search-form > div.Locator-searchBar > button > img")).click();
        Thread.sleep(2000);
        driver.close();


        //test case 9: test Investing & Wealth link
        driver.findElement(By.linkText("Investing & Wealth")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"drag-id-tabsCarousel0\"]/div/li[3]/div[1]/p")).click();
        Thread.sleep(2000);
        driver.close();


        // test case 10: Td bank in Twitter link

        driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div/div/div/div[1]/ul/li[2]/a/div/span[1]")).click();
        Thread.sleep(2000);
        driver.close();


    }
    
}

