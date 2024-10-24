package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartSteps {
    private WebDriver driver;
    private By firstItem = By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]");
    private By addToCartButton = By.id("add-to-cart-button");
    private By successMessage = By.id("NATC_SMART_WAGON_CONF_MSG_SUCCESS");

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kerol\\OneDrive\\Desktop\\New folder\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("user in item page")
    public void user_in_item_page() {
        driver.get("https://www.amazon.eg/s?k=car+accessories&crid=16IRFV392HY1K&sprefix=car+a%2Caps%2C171&ref=nb_sb_ss_ts-doa-p_1_5");
        driver.findElement(firstItem).click();
    }

    @When("user add item to cart")
    public void user_add_item_to_cart() {
        driver.findElement(addToCartButton).click();
    }

    @Then("the item should added successfully")
    public void the_item_should_added_successfully() {
        driver.findElement(successMessage).isDisplayed();
    }

    @After
    public void quitBrowser(){
        if(driver!=null)
            driver.quit();
    }

}
