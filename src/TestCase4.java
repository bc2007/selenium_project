import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase4 {
    public static void main(String[] args) {

        /**
         * Test Case 4: Validate Automation Exercise site footer
         * Given user navigates to “https://automationexercise.com/”
         * Then user should see “Copyright © 2021 All rights reserved” text in the footer
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        WebElement footer = driver.findElement(By.cssSelector("p[class='pull-left']"));

        String expectedFooterText = "Copyright © 2021 All rights reserved";

        if(footer.getText().equals(expectedFooterText)) System.out.println("Footer text validation PASSED");
        else System.out.println("Footer text validation FAILED");

        Driver.quitDriver();

    }
}
