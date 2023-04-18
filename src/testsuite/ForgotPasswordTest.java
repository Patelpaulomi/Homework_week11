package testsuite;
/**4. Write down the following test into
 ‘ForgotPasswordTest’ class
 1. userShouldNavigateToForgotPasswordPageSuccessfully
 * click on the ‘Forgot your password’ link
 * Verify the text ‘Forgot Your Password?’
 *
 */

import browserfactory.BaseTest;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //click on the 'Forgot your password' link
        WebElement ForgotPassword = driver.findElement(By.xpath("//p[text()='Forgot your password? ']"));
        ForgotPassword.click();
        String expectedMessage = "Reset Password";
        WebElement actualTextElement = driver.findElement(By.xpath("//h6[text()='Reset Password']"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }
    @After
    public void tearDown(){
        closeBrowser();
    }



}
