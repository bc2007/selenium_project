import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestCase5 {
    public static void main(String[] args) {

        /**
         * Test Case 5: Validate Automation Exercise site Test Cases page
         * Given user navigates to “https://automationexercise.com/”
         * When user clicks on “Test Cases” header item
         * Then validate user is navigated to “Test Cases” page successfully by its title and url
         * Expected URL = https://automationexercise.com/test_cases
         * Expected Title = Automation Practice Website for UI Testing - Test Cases
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        driver.findElement(By.cssSelector("a[href='/test_cases']")).click();

        if (driver.getTitle().equals("Automation Practice Website for UI Testing - Test Cases")) System.out.println("Test Cases title validation PASSED");
        else System.out.println("Test Cases title validation FAILED");

        if (driver.getCurrentUrl().equals("https://automationexercise.com/test_cases")) System.out.println("Test Cases URL validation PASSED");
        else System.out.println("Test Cases URL validation FAILED");

        Driver.quitDriver();

    }
}
