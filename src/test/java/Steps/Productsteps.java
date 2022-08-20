package Steps;

import Ecommerce.project.base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Productsteps extends Base {




    @Given("User to search for a produch")
    public void userToSearchForAProduch() {
        Launchbrowser();
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Test19999@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("12345");
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
    }


    @When("user to choose the product")
    public void userToChooseTheProduct() {

        driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("Shirt");
        driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
        WebElement selectElement = driver.findElement(By.id("selectProductSort"));
        Select selectObject = new Select(selectElement);
        selectObject.selectByIndex(2);
        WebElement hoverover = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div"));
        Actions action = new Actions(driver);
        action.moveToElement(hoverover).build().perform();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span\n")).click();
        driver.findElement(By.xpath("//*[@id=\"ordermsg\"]/textarea")).sendKeys("good stuff");
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span\n")).click();
        driver.findElement(By.xpath("//*[@id=\"cgv\"]\n")).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span\n")).click();
    }

    @Then("go for payment")
    public void goForPayment() {

        driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();
        driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/p/a")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/a/span")).click();
        exit();



    }
}