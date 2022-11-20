import org.junit.rules.Timeout;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class test {
    public static   void  main(String[] args) throws InterruptedException {

        System.setProperty("chromedriver","/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.network.com.tr");
        driver.manage().window().maximize();

        WebElement home = driver.findElement(By.id("search"));
        home.click();

        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        home.sendKeys("ceket");
        driver.findElement(By.id("search")).sendKeys(Keys.ENTER);

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,15650)");

        //kodum buraya kadar tamam ama eksik geri kalanı için manuel ilerleme yaptım.

        String getUrl = driver.getCurrentUrl();
        driver.get(getUrl + "&page=2");

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,11650)");


        WebElement html = driver.findElement(By.tagName("html"));
        html.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));



        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/div[2]/div[47]/div/div[1]/a[2]/div/div[1]"));
                we.click();

                WebElement beden = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div[5]/div[3]/div[6]/label"));
                beden.click();


                driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

                WebElement sepet = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div[7]/button[2]"));
                sepet.click();


        WebElement sepet2 = driver.findElement(By.xpath("/html/body/div[2]/header/div/div/div[3]/div[2]/a/svg/use"));
                //sepet2.click();

        WebElement sepetcontrol = driver.findElement(By.xpath("/html/body/div[2]/header/div/div/div[3]/div[2]/div/div/div[3]/a"));
                //sepetcontrol.click();

        WebElement sepettamamla = driver.findElement(By.xpath("/html/body/div[2]/header/div/div/div[3]/div[2]/div/div/div[3]/a"));
                //sepettamamla.click();

        WebElement devamet = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div/div[2]/button"));
                //devamet.click();



        driver.findElement(By.id("onetrust-accept-btn-handler")).click();


        driver.findElement(By.className("-secondary -sm")).click();
        WebElement test = driver.findElement(By.className("-secondary"));
        test.click();

    }
}
