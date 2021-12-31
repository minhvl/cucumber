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
    driver.get("https://booking.kiotviet.vn/");
    }
    @When("Input shop_name {string}")
    public void inputShop_name(String arg0) {
    driver.findElement(By.xpath("//*[@id=\"Retailer\"]")).sendKeys(arg0);
    }
    @And("Input user {string}")
    public void inputUser(String arg0) {
    driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys(arg0);
    }
   @And("Input password {string}")
    public void inputPassword(String arg0) {
       driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(arg0);
    }
    @And("I click quan ly button")
    public void iClickQuanLyButton() {
        driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
    }

    @Then("I see dashboard {string}")
    public void iSeeDashboard(String arg0) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[text()=\'Kết quả bán hàng hôm nay\']")));
        String ActualTitle = driver.getCurrentUrl();


        Assert.assertEquals(arg0, ActualTitle);
    }


    @And("Logut")
    public void logut() {
    driver.findElement(By.xpath("//*[@class=\"dpib userName\"]")).click();
    driver.findElement(By.xpath("//*[@class=\'ng-binding\' and text()=\' Đăng xuất\' ]")).click();
                try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
