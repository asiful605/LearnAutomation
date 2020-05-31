package cigna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CignaHomePage {

    public static String url="https://www.cigna.com/";
    public static String fireFoxDriver="webdriver.gecko.driver";
    public static String fireFoxDriverPath="BrowserDriver\\Drivers\\geckodriver.exe";


    public static void main(String[] args) throws InterruptedException {

        System.setProperty(fireFoxDriver,fireFoxDriverPath);
        WebDriver driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);

        // test case 1: test cigna International link

        driver.findElement(By.linkText("Cigna International")).click();
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"1438512008989\"]/div/div/div/div[1]/div[3]/ul/li[1]/div/div/div/div[1]/h2")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#\\31 438512008622 > div > div > div.marketing-promo-container > div:nth-child(1) > div > div.description")).click();
        Thread.sleep(3000);
        driver.close();


        //test case 2: Test Health Care Providers option/Medical credentialing
        driver.findElement(By.linkText("Health Care Providers")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("li.dropdown:nth-child(1) > button:nth-child(1)")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Medical Credentialing")).click();
        Thread.sleep(3000);
        driver.close();


        // case 3: test Health Care Providers/ pharmacy
        driver.findElement(By.linkText("Health Care Providers")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("li.dropdown:nth-child(3) > button:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Formulary Drug Lists")).click();
        Thread.sleep(3000);
        driver.close();

        //test case 4: test Individuals and Families options
        driver.findElement(By.linkText("Individuals and Families")).click();
        driver.findElement(By.linkText("Health Insurance for Individuals and Families")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("24/7/365 Customer Service")).click();
        Thread.sleep(3000);
        driver.close();

//        // test case 5: Search Dental Insurance plan
        driver.findElement(By.xpath("//*[@id=\"csng-search-header\"]/search-header-bar/form/div/cigna-typeahead/input")).sendKeys("dental insurance plan");
        driver.findElement(By.cssSelector("#csng-search-header > search-header-bar > form > div > cigna-typeahead > div > button")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Dental Insurance | No Waiting Period | MyCigna Dental 1500")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#\\31 523788056393 > div > div:nth-child(1) > button > h4")).click();
        Thread.sleep(3000);
        driver.close();



        //test case 6:test Employers and Brokers option
        driver.findElement(By.linkText("Employers and Brokers")).click();
        driver.findElement(By.xpath("//*[@id=\"includes-content\"]/header/div[2]/nav[5]/div/ul/li[3]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Controlling Costs and Improving Quality")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Read more about Cigna Collaborative Care")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("view1349")).click();
        Thread.sleep(2000);
        driver.close();

        // test case 7: test Member Resources link

        driver.findElement(By.linkText("Member Resources")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Explore our handy mobile apps")).click();
        Thread.sleep(2000);
        driver.close();


        //test case 8: Find different forms via Find a Form link
//
        driver.findElement(By.linkText("Find a Form")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Medical Forms")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("CO Customer Appeal Request Form")).click();
        Thread.sleep(2000);
        driver.close();

        //test case 9: test Covid 19 link

        driver.findElement(By.linkText("Visit our COVID-19 Resource Center")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#featured-topic-ABC > div:nth-child(1) > a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"1583802541223\"]/div/div/div[2]/div/div/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#quiz-step-1 > p:nth-child(3) > a")).click();
        Thread.sleep(2000);
        driver.close();

        // test case 10: test Employers and Brokers / more options
        driver.findElement(By.linkText("Employers and Brokers")). click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"includes-content\"]/header/div[2]/nav[5]/div/ul/li[5]/a")). click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Broker and consultant agreement form [PDF]")).click();
        Thread.sleep(2000);
        driver.close();


        // test case 11: test Employers and Brokers / more options

        driver.findElement(By.linkText("Employers and Brokers")). click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"includes-content\"]/header/div[2]/nav[5]/div/ul/li[2]/button")). click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Small Employers (51-499)")).click();
        Thread.sleep(2000);
        driver.close();



        //test case 12: test About us option
        driver.findElement(By.linkText("About Us")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=1573385722195]/div/div[2]/div/div/ul/li[1]/a")).click();
        Thread.sleep(2000);
        driver.close();

    }

}
