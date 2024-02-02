Ecommerce Automated Testing Documentation
Introduction
This documentation covers the automated testing framework for an Ecommerce website using Selenium, JUnit, and Cucumber. The framework includes features for browser setup, login testing, product search, and file upload functionalities.

1. Class: Base
Purpose
The Base class provides setup and teardown methods for browser configuration using WebDriver. It includes the Launchbrowser method to initialize the ChromeDriver, open the Ecommerce website, and set implicit wait time. The exit method is used for closing the WebDriver after each test.

Methods
Launchbrowser(): Configures the ChromeDriver, maximizes the window, opens the Ecommerce website, and sets implicit wait.
exit(): Closes the WebDriver after test execution.
2. Class: Testrunner
Purpose
The Testrunner class is a Cucumber runner class that specifies the location of feature files and step definitions.

Configuration
@CucumberOptions: Configures the location of feature files (src/test/java/features) and step definitions (Steps).
3. Class: Fileupload (Cucumber Step Definitions)
Purpose
The Fileupload class contains Cucumber step definitions for the "Contact Us" form, including filling fields and uploading a file.

Steps
User_open_contact_us(): Opens the "Contact Us" page.
userFillTheFieldsAndUploadAFileSuccessfully(): Fills form fields, including selecting a file for upload.
userSendTheMessage(): Submits the message and closes the browser.
4. Class: Loginsteps (Cucumber Step Definitions)
Purpose
The Loginsteps class contains Cucumber step definitions for the login functionality.

Steps
User_open_website_and_go_to_login_page(): Opens the Ecommerce website and navigates to the login page.
user_fill_email_and_password_and_click_on_login(String email, String password): Fills the login form with provided email and password, then clicks on the login button.
user_should_navigate_to_home_page(): Navigates to the home page and closes the browser.
5. Class: Productsteps (Cucumber Step Definitions)
Purpose
The Productsteps class contains Cucumber step definitions for searching and purchasing a product.

Steps
userToSearchForAProduct(): Opens the Ecommerce website, logs in, and navigates to the product search page.
userToChooseTheProduct(): Searches for a product, selects a sorting option, hovers over a product, adds it to the cart, proceeds to checkout, and completes the purchase.
goForPayment(): Completes the payment process and exits.
Conclusion
This automated testing framework provides a structured approach to testing various functionalities of an Ecommerce website. It leverages Selenium for browser automation, JUnit for test setup and teardown, and Cucumber for writing human-readable scenarios. The step definitions are organized based on specific features, making the framework modular and easy to maintain.





