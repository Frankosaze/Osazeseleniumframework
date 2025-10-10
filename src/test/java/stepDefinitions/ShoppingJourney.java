package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingJourney {

    WebDriver driver;

    @Given("User is on the home page")
    public void UserIsOnTheHomePage() {
        driver = new ChromeDriver();
        driver.get("https://www.jumia.com.ng/");
    }

    @When("User adds items to cart")
    public void UserAddsItemsToCart() {
        driver.findElement(By.xpath("//img[contains(@alt,'Syinix Swallow Maker')]")).click();
        driver.findElement(By.xpath("//button[.//span[contains(text(),'Add to cart')]]")).click();
        driver.findElement(By.xpath("//img[contains(@alt,'TCL 55 Inches UHD 4k Google Smart TV')]")).click();
        driver.findElement(By.xpath("//button[.//span[contains(text(),'Add to cart')]]")).click();
    }

    @Then("The items should be in the cart")
    public void TheItemsShouldBeInTheCart() {
        System.out.println("Registration successful");
//        driver.quit():
    }
}
