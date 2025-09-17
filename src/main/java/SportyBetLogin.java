import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SportyBetLogin {
    public static void main(String[] args) {
        // Create a new web instance
        WebDriver driver = new ChromeDriver();

        // Navigating to the website
        driver.get("https://www.sportybet.com/ng/");

        // Locating the element by name
        WebElement phoneField = driver.findElement(By.name("phone"));
        WebElement passwordField = driver.findElement(By.name("psd"));
        WebElement loginButton = driver.findElement(By.name("logIn"));

        // Enter phone number and password
        phoneField.sendKeys("7050622105");
        passwordField.sendKeys("O6s7a2z9e3");

        // Login the account
        loginButton.click();
    }
}
