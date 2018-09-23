package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import pageObjects.AuthenticationPage;
import pageObjects.BankWirePage;
import pageObjects.CheckPaymentPage;
import pageObjects.ContactPage;
import pageObjects.CreditSlipsPage;
import pageObjects.DressesPage;
import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import pageObjects.MyAddressesPage;
import pageObjects.MyWishlistsPage;
import pageObjects.OrderConfirmationPage;
import pageObjects.OrderHistoryPage;
import pageObjects.PaymentMethodPage;
import pageObjects.PersonalInformationPage;
import pageObjects.ShippingPage;
import pageObjects.ShoppingCartPage;
import pageObjects.TshirtsPage;
import pageObjects.WomenPage;

public class Steps {
	WebDriver driver;
	PageObjectManager pageObjectManager;
	WebElement ele;
	private static Logger logger;
	
	AuthenticationPage authenticationPage;
	BankWirePage bankWirePage;
	CheckPaymentPage checkPaymentPage;
	ContactPage contactPage;
	CreditSlipsPage creditSlipsPage;
	HomePage homePage;
	DressesPage dressesPage;
	MyAccountPage myAccountPage;
	MyAddressesPage myAddressesPage;
	MyWishlistsPage myWishlistsPage;
	OrderConfirmationPage orderConfirmationPage;
	OrderHistoryPage orderHistoryPage;
	PaymentMethodPage paymentMethodPage;
	PersonalInformationPage personalInformationPage;
	ShippingPage shippingPage;
	ShoppingCartPage shoppingCartPage;
	TshirtsPage tshirtsPage;
	WomenPage womenPage;
	
	
	
	
	@Given("^a user has navigated to the landing page$")
	public void a_user_has_navigated_to_the_landing_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		pageObjectManager = new PageObjectManager(driver);
		homePage = pageObjectManager.getHomePage();
		homePage.navigateTo_HomePage();	
	}

	@When("^User enters Credentials to LogIn$")
	public void user_enters_Credentials_to_LogIn(DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
		authenticationPage = pageObjectManager.getAuthenticationPage();
		authenticationPage.setEmail(list.get(0));
		authenticationPage.setPassword(list.get(1));
		authenticationPage.clickSubmit();
	}

	@When("^user clicks on \"([^\"]*)\" navigation bar option$")
	public void user_clicks_on_menu(String option) throws Throwable {
		homePage = pageObjectManager.getHomePage();
		if(option.equalsIgnoreCase("log in")) {
			homePage.clickSignInLink();
		}else if(option.equalsIgnoreCase("contact us")) {
			homePage.clickContactUs1Link();
		}else {
		logger.info("navigation option "+option+" not in list");
		}
	}

	@When("^user selects size \"([^\"]*)\"$")
	public void user_selects_size(String arg1) throws Throwable {
	    
	}

	@When("^user selects color \"([^\"]*)\"$")
	public void user_selects_color(String arg1) throws Throwable {
	   
	}

	@When("^user clicks button \"([^\"]*)\"$")
	public void user_clicks_button(String arg1) throws Throwable {
	    
	}

	@When("^user selects checkbox \"([^\"]*)\"$")
	public void user_selects_checkbox(String arg1) throws Throwable {
	   
	}

	@When("^user selects link \"([^\"]*)\"$")
	public void user_selects_link(String arg1) throws Throwable {
	    
	}

	@Then("^verify order history contains order$")
	public void verify_order_history_contains_order() throws Throwable {
	    
	}

	@When("^user enters \"([^\"]*)\" as \"([^\"]*)\"$")
	public void user_enters_as(String arg1, String arg2) throws Throwable {
	   
	}

	@Then("^verify message \"([^\"]*)\"$")
	public void verify_message(String arg1) throws Throwable {
	    
	}

	@Then("^verify header \"([^\"]*)\" matches \"([^\"]*)\"$")
	public void verify_header_matches(String arg1, String arg2) throws Throwable {
	   
	}
	
	
	
	
	

}
