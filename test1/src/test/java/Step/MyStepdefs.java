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
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class MyStepdefs {
WebDriver driver;
public MyStepdefs(){
    this.driver = Hooks.openAndQuitBrowser();
}
    @Given("open browser")
    public void openBrowser() {
    driver.get("https://marketleminh.kiotviet.vn/");
    }
//    @When("Login")
//    public void login() {
//
////        driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("admin");
////        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("admin@123");
////        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/section/section[2]/span[1]/input")).click();
////        try {
////            Thread.sleep(9000);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//
//        driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("admin");
//        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("admin@123");
//        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/section/section[2]/span[1]/input")).click();
//        try {
//            Thread.sleep(9000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
    @When("Input user {string}")
    public void inputUser(String arg0) {
    driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys(arg0);
    }
   @And("Input password {string}")
    public void inputPassword(String arg0) {
       driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(arg0);
    }
    @And("I click quan ly button")
    public void iClickQuanLyButton() {
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/section/section[2]/span[1]/input")).click();
    }

    @Then("I see dashboard {string}")
    public void iSeeDashboard(String arg0) {
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("/html/body/div[3]/div[1]/section/section/div[1]/div[1]/div[1]/div[1]")));
        String ActualTitle = driver.getCurrentUrl();


        Assert.assertEquals(arg0, ActualTitle);
    }

    @And("Quit browser")
    public void quitBrowser() {

        System.out.println("done");
        driver.quit();
    }
}
