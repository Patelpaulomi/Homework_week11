package testsuite;
/**2. Create the package ‘testsuite’ and create the
 following classes inside the ‘testsuite’ package.

 1. LoginTest
 2. ForgotPasswordTest

 3. Write down the following test into ‘LoginTest’ class
 1. userSholdLoginSuccessfullyWithValidCredentials

 * Enter “Admin” username
 * Enter “admin123 password
 * Click on ‘LOGIN’ button
 * Verify the ‘Welcome’ text is display
 *
 */

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = " https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // find the username field element
        WebElement usernameField = driver.findElement(By.name("username"));
        // Type the UserName in username field element
        usernameField.sendKeys("Admin");
        //Find the Password Field Element and send password on password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        //Find the Login btn Element and click
        WebElement loginbutton = driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']"));
        loginbutton.click();
        String expectedMessage = "Dashboard";
        WebElement actualTextElement = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals(expectedMessage,actualMessage);

    }

}