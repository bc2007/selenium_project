import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase1 {
    public static void main(String[] args) {

        /**
         * Test Case 1: Validate Automation Exercise site logo
         * Given user navigates to “https://automationexercise.com/”
         * Then user should see logo on top-left
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        Waiter.pause(3);

        WebElement logo = driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));

        if (logo.isDisplayed()) System.out.println("Logo validation PASSED");
        else System.out.println("Logo validation FAILED");

        Driver.quitDriver();
    }
}
