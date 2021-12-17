
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;


public class Print {
//    public static void main(String[] args) {
//      //  System.setProperty("webdriver.chrome.driver", "C:/Users/minh.vl/AppData/Local/Google/Chrome/Application/chromedriver.exe");
//        WebDriver driver = new FirefoxDriver();
//
////        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
////        driver.wait(3);
//        driver.get("https://facebook.com");
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.quit();
//        }
public static void main(String[] args) throws InterruptedException {

//    System.setProperty("webdriver.chrome.driver", "C:/Users/minh.vl/AppData/Local/Google/Chrome/Application/chromedriver.exe");
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--incognito");
//    DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
    WebDriver driver = new ChromeDriver(options);

    driver.manage().window().maximize();
    driver.get("https://marketleminh.kiotviet.vn/");
    driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("admin");
    driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("admin@123");
    driver.findElement(By.xpath("//*[@id=\"loginForm\"]/section/section[2]/span[1]/input")).click();
    Thread.sleep(5000);

    TakesScreenshot ts = (TakesScreenshot) driver;
    File source = ts.getScreenshotAs(OutputType.FILE);
//    for (int i=0;i<5;i++) {
        try {
            FileUtils.copyFile(source, new File("C:/1/anh " + 1 + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
//    }

        }
    }



