import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adam\\IdeaProjects\\selenium_initial_project_5\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        driver.quit();
    }
}
