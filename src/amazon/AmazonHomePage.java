package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonHomePage {

    public static String url = "https://www.amazon.com/";
    public static String fireFoxDriver = "webdriver.gecko.driver";
    public static String fireFoxDriverPath = "BrowserDriver\\Drivers\\geckodriver.exe";

    public static void main(String[] args) throws InterruptedException {
        // Open browser and navigate to url
        System.setProperty(fireFoxDriver,fireFoxDriverPath);
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);

        //test case 1: test Best seller link
        driver.findElement(By.linkText("Best Sellers")).click();
        driver.findElement(By.xpath("//*[@id=\"zg_left_col1\"]/div[2]/div[4]/div/div[2]/a/div[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("a-autoid-0-announce")).click();
        driver.findElement(By.id("quantity_1")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(2000);
        driver.close();

        //test case2: test Order& sigh in link

        driver.findElement(By.id("nav-link-accountList")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("kahinchafai@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.className("a-button-input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("0608");
        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(2000);
        driver.close();


        //test case 3:  test Customer service link
        driver.findElement(By.linkText("Customer Service")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div[5]/div[1]/div/div[1]/div[1]/a/div/div/div/div[2]/h3")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("kahinchafai@gmail.com");
        driver.findElement(By.className("a-button-input")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("0608");
        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(2000);
        driver.close();

        // test case 4: test Sell link
        driver.findElement(By.linkText("Sell")).click();
        driver.findElement(By.linkText("Start selling")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("kahinchafai@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("0608");
        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(2000);
        driver.close();

        //Test case 5:test  Whole food link

        driver.findElement(By.linkText("Whole Foods")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Strawberry Organic, 16 Ounce")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("a-autoid-0-announce")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("kahinchafai@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.className("a-button-input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("0608");
        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(2000);
        driver.close();

        // test case 6: test Change language option
        driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[1]/div/label/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("a-button-input")).click();
        Thread.sleep(2000);
        driver.close();

        // test case 7: test Amazon careers link
        driver.findElement(By.linkText("Careers")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/div[1]/div/div/div/div/form/div[1]/div[1]/div/span/input")).sendKeys("Software QA Manager");
        Thread.sleep(2000);
        driver.findElement(By.id("search-button")).click();
        Thread.sleep(2000);
        driver.close();

        // test case 8: Amazon Tour

        driver.findElement(By.linkText("Amazon Tours")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/main/div[4]/div/div/div[2]/div/div[2]/h2/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/ul/li[1]/div[1]/div[1]")).click();
        Thread.sleep(2000);
        driver.close();

        //test case 9:  test Amazon Fresh link
        driver.findElement(By.linkText("Amazon Fresh\n" +"Groceries & More\n" +"Right To Your Door")).click();
        driver.findElement(By.linkText("MEAT & SEAFOOD")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[1]/div/div[2]/a/span/span[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("a-autoid-0-announce")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("kahinchafai@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.className("a-button-input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("0608");
        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(2000);
        driver.close();


        //test case 9: test registry link
        driver.findElement(By.linkText("Registry")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/div/div/div[2]/div[2]/div/div/a/img")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Create a new Baby Registry")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("kahinchafai@gmail.com");
        driver.findElement(By.className("a-button-input")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("0608");
        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(2000);
        driver.close();

        //test case10: test Amazon prime

        driver.findElement(By.linkText("Amazon Prime")).click();
        driver.findElement(By.cssSelector("#prime-header-CTA > span > input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("kahinchafai@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("abcd23");
        Thread.sleep(2000);
        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(2000);
        driver.close();


        // test case 11:  test Today's Deals link
        driver.findElement(By.linkText("Today's Deals")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Fashion")).click();
        driver.findElement(By.cssSelector("#\\31 01\\ 4b787855-announce")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("a-autoid-0-announce")).click();
        driver.findElement(By.id("quantity_1")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("add-to-cart-button")).click();
        driver.close();


        // test case 12: test  press center link

        driver.findElement(By.linkText("Press Center")).click();
        driver.findElement(By.xpath("//*[@id=\"block-nir-pid2497-content\"]/article/div/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[2]/a/span")).click();
        Thread.sleep(2000);
        driver.close();


        //test case 13: Costumer service  link
        driver.findElement(By.linkText("Shop with Points")).click();
        driver.findElement(By.cssSelector("#contentGrid_248223 > div > div:nth-child(4) > div:nth-child(1) > div > div > a > img")).click();
        Thread.sleep(2000);
        driver.close();

    }

}











