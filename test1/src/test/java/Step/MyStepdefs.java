package Step;
import CucumberOptions.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;

import java.io.File;
import java.io.IOException;

public class MyStepdefs {
WebDriver driver;
public MyStepdefs(){
    this.driver = Hooks.openAndQuitBrowser();
}
    @Given("open browser")
    public void openBrowser() {
//    WebDriver driver = new ChromeDriver();
//    driver.manage().window().maximize();
    driver.get("https://marketleminh.kiotviet.vn/");
    }

    @When("Login")
    public void login() {

        driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("admin@123");
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/section/section[2]/span[1]/input")).click();
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Then("screenshot")
    public void screenshot() {
//        TakesScreenshot ts = (TakesScreenshot) driver;
//        File source = ts.getScreenshotAs(OutputType.FILE);
////    for (int i=0;i<5;i++) {
//        try {
//            FileUtils.copyFile(source, new File("C:/1/anh " + 1 + ".png"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    @And("quit")
    public void quit() {
        System.out.println("done");
        driver.quit();

    }
}
