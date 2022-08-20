package Steps;

import Ecommerce.project.base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Fileupload extends Base {


    @Given("User open contact us")
    public void User_open_contact_us() {
        Launchbrowser();
        driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a")).click();


    }

    @When("user fill the fields and upload a file successfully")
    public void userFillTheFieldsAndUploadAFileSuccessfully() {
        WebElement selectele = driver.findElement(By.xpath("//*[@id=\"id_contact\"]"));
        Select selectindex = new Select(selectele);
        selectindex.selectByIndex(1);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Test19999@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"fileUpload\"]")).sendKeys("C:\\Users\\abdo\\Desktop\\selenium-webdriver-java-course-c4.3\\JumiaProject\\ContactUs.txt");
        driver.findElement(By.xpath("//*[@id=\"message\"]")).sendKeys("Here is my message to you!");

    }

    @Then("User send the message")
    public void userSendTheMessage() {
        driver.findElement(By.xpath("//*[@id=\"submitMessage\"]/span\n")).click();

        exit();


    }
}

