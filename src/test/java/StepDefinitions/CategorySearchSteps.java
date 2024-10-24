package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CategorySearchSteps {
    private WebDriver driver;
    private By searchBox = By.id("twotabsearchtextbox");
    private By searchButton = By.id("nav-search-submit-button");
    private By categoryName = By.className("a-color-state");

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kerol\\OneDrive\\Desktop\\New folder\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("user in home page")
    public void user_in_home_page() {
        driver.get("https://www.amazon.eg/ref=nav_logo?language=en_AE");
    }

    @When("user write an CategoryName in search bar")
    public void user_write_an_category_name_in_search_bar() {
        driver.findElement(searchBox).sendKeys("car accessories");
    }

    @When("click to the search button")
    public void click_to_the_search_button() {
        driver.findElement(searchButton).click();
    }

    @Then("user should be taken to item's category search result page")
    public void user_should_be_taken_to_item_s_category_search_result_page() {
        String categoryName = driver.findElement(this.categoryName).getText();
        System.out.println(categoryName);

        Assert.assertEquals(categoryName, "\"car accessories\"", "There is an error");
    }

    @After
    public void quitBrowser(){
        if(driver!=null)
            driver.quit();
    }

}
