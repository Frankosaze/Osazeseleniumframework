import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPage {
    public static void main (String[] args) {
//        Create New Instance
        WebDriver driver = new ChromeDriver();

//        Navigate to the webpage
        driver.get("https://www.facebook.com/");

//        Enter Email and Password
        driver.findElement(By.id("email")).sendKeys("justfortest@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("notcorrect");

//        Login
        driver.findElement(By.name("login")).click();

//        Print Error message
        String errorMessage = driver.findElement(By.cssSelector("div[class='_9ay7']")).getText();
        System.out.println("errorMessage: " + errorMessage);
    }
}
