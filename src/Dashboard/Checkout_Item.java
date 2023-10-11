package Dashboard;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class co {
    public static void main(String[] args) throws InterruptedException {
        String email = "standard_user";
        String pwd = "Sekol@hmu123";
        String urlDashboard = "https://www.saucedemo.com/";

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/libs/chromedriver");
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(ops);
        driver.get(urlDashboard);
        driver.manage().window().maximize();
    }
}
