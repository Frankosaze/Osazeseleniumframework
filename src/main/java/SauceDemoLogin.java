import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoLogin {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://www.saucedemo.com/");

        // Locate Element by ID and interact with them
//        WebElement usernameField = driver.findElement(By.id("user-name"));
//        WebElement passwordField = driver.findElement(By.id("password"));
//        WebElement loginButton = driver.findElement(By.id("login-button"));

        // Login first
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();

//        Locate Element by Name and interact with them
        WebElement inventoryItem = driver.findElement(By.className("inventory_item"));
        inventoryItem.click();

        WebElement cartIcon = driver.findElement(By.className("shopping_cart_link"));
        cartIcon.click();


        // Login to the website
//        loginButton.click();
//        driver.quit();
    }
}
