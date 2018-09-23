package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageObjects.AddressesPage;
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

public class Steps2 {
	WebDriver driver;
	AddressesPage addressesPage = PageFactory.initElements(driver, AddressesPage.class); 
	BankWirePage bankWirePage = PageFactory.initElements(driver, BankWirePage.class);
	CheckPaymentPage checkPaymentPage = PageFactory.initElements(driver, CheckPaymentPage.class);
	ContactPage contactPage = PageFactory.initElements(driver, ContactPage.class);
	CreditSlipsPage creditSlipsPage = PageFactory.initElements(driver, CreditSlipsPage.class);
	HomePage homePage = PageFactory.initElements(driver, HomePage.class);
	DressesPage dressesPage = PageFactory.initElements(driver, DressesPage.class);
	MyAccountPage myAccountPage = PageFactory.initElements(driver, MyAccountPage.class);
	MyAddressesPage myAddressesPage = PageFactory.initElements(driver, MyAddressesPage.class); 
	MyWishlistsPage myWishlistsPage = PageFactory.initElements(driver, MyWishlistsPage.class);
	OrderConfirmationPage OrderConfirmationPage = PageFactory.initElements(driver, OrderConfirmationPage.class);
	OrderHistoryPage orderHistoryPage = PageFactory.initElements(driver, OrderHistoryPage.class);
	PaymentMethodPage paymentMethodPage = PageFactory.initElements(driver, PaymentMethodPage.class);
	PersonalInformationPage personalInformationPage = PageFactory.initElements(driver, PersonalInformationPage.class);
	ShippingPage shippingPage = PageFactory.initElements(driver, ShippingPage.class);
	ShoppingCartPage shoppingCartPage = PageFactory.initElements(driver, ShoppingCartPage.class);
	TshirtsPage tshirtsPage = PageFactory.initElements(driver, TshirtsPage.class);
	WomenPage womenPage = PageFactory.initElements(driver, WomenPage.class);
	
	
	
	
	@Given("^a user has navigated to the landing page$")
	public void a_user_has_navigated_to_the_landing_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com");
	}

	@When("^User enters Credentials to LogIn$")
	public void user_enters_Credentials_to_LogIn(DataTable arg1) throws Throwable {
	    
	}

	@When("^user clicks on \"([^\"]*)\" menu$")
	public void user_clicks_on_menu(String arg1) throws Throwable {
	   
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
