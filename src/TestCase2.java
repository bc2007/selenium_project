import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestCase2 {
    public static void main(String[] args) {

        /**
         * Test Case 2: Validate Automation Exercise site header items
         * Given user navigates to “https://automationexercise.com/”
         * Then validate all below header items are displayed and enabled and their text is as below
         * Home
         * Products
         * Cart
         * Signup / Login
         * Test Cases
         * API Testing
         * Video Tutorials
         * Contact us
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        Waiter.pause(3);

        List<WebElement> headerItems = driver.findElements(By.xpath("//ul[@class='nav navbar-nav']/li/a"));

        String[] expectedText = {"Home", "Products", "Cart", "Signup / Login", "Test Cases", "API Testing", "Video Tutorials", "Contact us"};

        for (int i = 0; i < headerItems.size(); i++) {
            System.out.println(headerItems.get(i).isDisplayed());
            System.out.println(headerItems.get(i).isEnabled());
            System.out.println(headerItems.get(i).getText().equals(expectedText[i]));
        }

        Driver.quitDriver();

    }
}
