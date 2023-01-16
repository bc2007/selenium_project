import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase3 {
    public static void main(String[] args) {

        /**
         * Test Case 3: Validate Automation Exercise site SUBSCRIPTION form
         * Given user navigates to “https://automationexercise.com/”
         * Then user should see heading2 as “SUBSCRIPTION”
         * And user should see an email input box with “Your email address” placeholder
         * And user should see arrow submit button
         * And user should see “Get the most recent updates from our site and be updated your self...” text under the email input box
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        Waiter.pause(3);

        WebElement heading = driver.findElement(By.xpath("//div[@class='single-widget']/h2"));

        if (heading.getText().equals("SUBSCRIPTION")) System.out.println("Heading2 text validation PASSED");
        else System.out.println("Heading2 text validation FAILED");

        if (driver.findElement(By.id("susbscribe_email")).isDisplayed()) System.out.println("Email input box validation PASSED");
        else System.out.println("Email input box validation FAILED");

        if (driver.findElement(By.id("susbscribe_email")).getAttribute("placeholder").equals("Your email address"))
            System.out.println("Placeholder text validation PASSED");
        else System.out.println("Placeholder text validation FAILED");

        if (driver.findElement(By.id("subscribe")).isDisplayed()) System.out.println("Submit button DISPLAYED");
        else System.out.println("Submit button NOT displayed");

        if (driver.findElement(By.id("subscribe")).isEnabled()) System.out.println("Submit button ENABLED");
        else System.out.println("Submit button NOT enabled");

        if (driver.findElement(By.xpath("//div[@class='single-widget']//p")).getText().equals("Get the most recent updates from " +
                "our site and be updated your self..."))
            System.out.println("Text validation PASSED");
        else System.out.println("Text validation FAILED");

        Driver.quitDriver();

    }
}
