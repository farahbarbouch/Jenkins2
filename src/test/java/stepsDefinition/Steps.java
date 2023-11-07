package stepsDefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddProductPage;
import pages.EditInfoPage;
import pages.LogiinPage;
import pages.SortPage;

public class Steps {
	WebDriver driver ;
	LogiinPage logiin ;
	EditInfoPage edit ;
	SortPage sort ;
	AddProductPage add ;
	
	@Before
	public void browserSetup() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
	@Given("the user is on the home page")
	public void the_user_is_on_the_home_page() {
		driver.get("https://cosmetique.tn/");
	}

	@When("the user clicks on connexion")
	public void the_user_clicks_on_connexion() {
		logiin = new LogiinPage(driver);
	    logiin.clickConnexion();
	}

	@When("the user clicks on monCompte")
	public void the_user_clicks_on_mon_compte() {
	    logiin.clickCompte();
	}

	@When("^the user enters (.*) and (.*)$")
	public void the_user_enters_email_and_password(String email, String password) {
	   logiin.credentials(email, password);
	}
	
	@When("the user clicks on login button")
	public void the_user_clicks_on_login_button() {
	    logiin.clickSubmit();
	}

	@Then("the user is on the profil page")
	public void the_user_is_on_the_profil_page() {
		logiin.checkInfoDisplayed();
	}

	@Then("an error message appears")
	public void an_error_message_appears() {
	    logiin.checkErrorDisplayed();
	}
	
	
	@When("the user clicks on informations")
	public void the_user_clicks_on_informations() {
		edit = new EditInfoPage(driver);
		edit.clickInfo();
	}
	
	@When("^the user edits informations (.*) and (.*) and (.*) and (.*)$")
	public void the_user_edits_informations_name_and_lastName_and_mail_and_newPassword(String name, String lastName, String mail, String newPassword) {
	    edit.editInfo(name, lastName, mail, newPassword);
	}

	@When("^the user enters a correct password (.*)$")
	public void the_user_enters_a_correct_password_pass(String pass) {
	    edit.enterPass(pass);
	}

	@When("the user clicks on save button")
	public void the_user_clicks_on_save_button() {
		edit.clickSave();
	}

	@Then("a message {string} is displayed")
	public void a_message_is_displayed(String string) {
	    edit.assertMsg(string);
	}
	
	@When("^the user enters (.*) of product in the search field$")
	public void the_user_enters_type_of_product_in_the_search_field(String type) {
		sort = new SortPage(driver);
	    sort.entertype(type);
	}
	
	@When("the user click on Ok button")
	public void the_user_click_on_ok_button() {
	    sort.clickOk();
	}

	@When("^the user select sort by (.*)$")
	public void the_user_select_sort_by_sortType(String sortType) {
		sort.selectSort(sortType);
	}
	
	@Then("the products are sorted by ascendant price")
	public void the_products_are_sorted_by_ascendant_price() {
	    
	}
	
	@When("the user clicks on add to cart icon")
	public void the_user_clicks_on_add_to_cart_icon() {
		add = new AddProductPage(driver);
		add.clickAdd();
	    
	}

	@When("the user clicks on order button")
	public void the_user_clicks_on_order_button() {
	    add.clickOrder();
	}

	@Then("the product added is displayed in the cart page")
	public void the_product_added_is_displayed_in_the_cart_page() {
	   add.checkPage();
	   add.checkProduct();
	}

	
}
