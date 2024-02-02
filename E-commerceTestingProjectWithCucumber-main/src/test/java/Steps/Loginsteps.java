package Steps;

import Ecommerce.project.base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;


public class Loginsteps extends Base {

    @Given("User open website and go to login page")
    public void User_open_website_and_go_to_login_page(){
        Launchbrowser();




    }

    @When("user fill email as {string} and {string} and click on login")
    public void user_fill_email_and_password_and_click_on_login(String email, String password){
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
        driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();

    }

    @Then("user should navigate to home page")
    public void user_should_navigate_to_home_page()
    {
        driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a")).click();
        exit();

    }

}
