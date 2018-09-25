package stepDefinitions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import pageObjects.AddressesPage;
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
	String orderRef = "";

	AddressesPage addressesPage;
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

	public void setupDriver() {
		System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver");
		this.driver = new FirefoxDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		pageObjectManager = new PageObjectManager(driver);
	}

	public void setupDriver(String browser, String os) {
		if ((os.equalsIgnoreCase("windows")) && (browser.equalsIgnoreCase("chrome"))) {
			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
			this.driver = new ChromeDriver();
			this.driver.manage().window().maximize();
			this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			pageObjectManager = new PageObjectManager(driver);
		} else if ((os.equalsIgnoreCase("mac")) && (browser.equalsIgnoreCase("chrome"))) {
			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
			this.driver = new ChromeDriver();
			this.driver.manage().window().maximize();
			this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			pageObjectManager = new PageObjectManager(driver);
		} else {
			System.out.println("browser: " + browser + " and os: " + os + " combination not supported!!!");
		}
	}

	@Given("^a user has navigated to the landing page using \"([^\"]*)\" browser on \"([^\"]*)\"$")
	public void a_user_has_navigated_to_the_landing_page_using_something_browser(String browser, String os)
			throws Throwable {

		if (os.equalsIgnoreCase("windows")) {
			this.setupDriver(browser, os);
		} else if (browser.equalsIgnoreCase("chrome")) {
			this.setupDriver(browser, os);
		} else {
			this.setupDriver();
		}
		homePage = pageObjectManager.getHomePage();
		homePage.navigateTo_HomePage();
	}

	@When("^User enters Credentials to LogIn$")
	public void user_enters_Credentials_to_LogIn(DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
		authenticationPage = pageObjectManager.getAuthenticationPage();
		authenticationPage.login(list.get(0), list.get(1));
	}

	@When("^user clicks on \"([^\"]*)\" navigation bar option$")
	public void user_clicks_on_navigation_bar_option(String option) throws Throwable {
		homePage = pageObjectManager.getHomePage();
		if (option.equalsIgnoreCase("log in")) {
			homePage.clickSignInLink();
		} else if (option.equalsIgnoreCase("contact us")) {
			homePage.clickContactUs1Link();
		} else {
			logger.info("navigation option " + option + " not in list");
		}
	}

	@And("^user clicks on \"([^\"]*)\" menu from account page$")
	public void user_clicks_on_menu_from_account_page(String menu) throws Throwable {
		myAccountPage = pageObjectManager.getMyAccountPage();
		switch (menu.toLowerCase()) {
		case "women":
			myAccountPage.clickWomen1Link();
			break;
		case "dresses":
			myAccountPage.clickDresses1Link();
			break;
		case "t-shirts":
			myAccountPage.clickTshirts1Link();
			Thread.sleep(3000);
			break;
		default:
			System.out.println("menu option " + menu + " not found");
			break;
		}

	}

	@And("^user selects size \"([^\"]*)\" on the t-shirt page$")
	public void user_selects_size_on_the_t_shirt_page(String size) throws Throwable {
		tshirtsPage = pageObjectManager.getTshirtsPage();
		switch (size.toLowerCase()) {
		case "small":
			tshirtsPage.clickS11Link();
			break;
		case "medium":
			tshirtsPage.clickM11Link();
			Thread.sleep(2000);
			break;
		case "large":
			tshirtsPage.clickL11Link();
			break;
		default:
			System.out.println("size " + size + " not an option");
			break;
		}

	}

	@And("^user selects color \"([^\"]*)\" on the t-shirt page$")
	public void user_selects_color_on_the_t_shirt_page(String color) throws Throwable {
		tshirtsPage = pageObjectManager.getTshirtsPage();
		switch (color.toLowerCase()) {
		case "orange":
			tshirtsPage.clickOrange11Link();
			Thread.sleep(2000);
			break;
		case "blue":
			tshirtsPage.clickBlue11Link();
			break;
		default:
			System.out.println("color " + color + " not an option");
			break;
		}

	}

	@And("^user clicks button \"([^\"]*)\" on the t-shirt page$")
	public void user_clicks_button_on_the_t_shirt_page(String button) throws Throwable {
		tshirtsPage = pageObjectManager.getTshirtsPage();
		switch (button.toLowerCase()) {
		case "add to cart":
			tshirtsPage.clickAddToCartLink();
			Thread.sleep(5000);
			break;
		case "list":
			tshirtsPage.clickListLink();
			break;
		case "proceed to checkout":
			tshirtsPage.clickProceedToCheckoutLink();
			break;
		default:
			System.out.println("button " + button + " not an option");
			break;
		}

	}

	@And("^user clicks button \"([^\"]*)\" on the shopping cart page$")
	public void user_clicks_button_on_the_shopping_cart_page(String button) throws Throwable {
		shoppingCartPage = pageObjectManager.getShoppingCartPage();
		switch (button.toLowerCase()) {
		case "proceed to checkout":
			shoppingCartPage.clickProceedToCheckout2Link();
			Thread.sleep(2000);
			break;
		default:
			System.out.println("button " + button + " not an option");
			break;
		}

	}

	@And("^user clicks button \"([^\"]*)\" on the addresses page$")
	public void user_clicks_button_on_the_addresses_page(String button) throws Throwable {
		addressesPage = pageObjectManager.getAddressesPage();
		switch (button.toLowerCase()) {
		case "proceed to checkout":
			addressesPage.clickProceedToCheckout2Button();
			break;
		default:
			System.out.println("button " + button + " not an option");
			break;
		}

	}

	@And("^user selects checkbox \"([^\"]*)\" on the shipping page$")
	public void user_selects_checkbox_on_the_shipping_page(String name) throws Throwable {
		shippingPage = pageObjectManager.getShippingPage();
		switch (name.toLowerCase()) {
		case "terms of service":
			shippingPage.setIAgreeToTheTermsOfCheckboxField();
			break;
		default:
			System.out.println("checkbox name " + name + " not an option");
			break;
		}

	}

	@And("^user clicks button \"([^\"]*)\" on the shipping page$")
	public void user_clicks_button_on_the_shipping_page(String button) throws Throwable {
		shippingPage = pageObjectManager.getShippingPage();
		switch (button.toLowerCase()) {
		case "proceed to checkout":
			shippingPage.clickProceedToCheckout2Button();
			break;
		default:
			System.out.println("button " + button + " not an option");
			break;
		}

	}

	@And("^user clicks button \"([^\"]*)\" on the payment method page$")
	public void user_clicks_button_on_the_payment_method_page(String button) throws Throwable {
		paymentMethodPage = pageObjectManager.getPaymentMethodPage();
		switch (button.toLowerCase()) {
		case "pay by check":
			paymentMethodPage.clickPayByCheckOrderProcessingLink();
			break;
		default:
			System.out.println("button " + button + " not an option");
			break;
		}

	}

	@And("^user clicks button \"([^\"]*)\" on the check payment page$")
	public void user_clicks_button_on_the_check_payment_page(String button) throws Throwable {
		checkPaymentPage = pageObjectManager.getCheckPaymentPage();
		switch (button.toLowerCase()) {
		case "i confirm my order":
			checkPaymentPage.clickConfirm();
			break;
		default:
			System.out.println("button " + button + " not an option");
			break;
		}

	}

	@And("^user selects link \"([^\"]*)\" on the order confirmation page$")
	public void user_selects_link_on_the_order_confirmation_page(String link) throws Throwable {
		orderConfirmationPage = pageObjectManager.getOrderConfirmationPage();
		this.setOrderRef();
		switch (link.toLowerCase()) {
		case "back to orders":
			orderConfirmationPage.clickBackToOrdersLink();
			break;
		default:
			System.out.println("link " + link + " not an option");
			break;
		}

	}

	@And("^verify order history contains order on the order history page$")
	public void verify_order_history_contains_order_on_the_order_history_page() throws Throwable {
		System.out.println("The current saved order reference is " + this.orderRef);
		Assert.assertTrue(isOrderInOrderHistory(this.getOrderRef()));

	}

	public Boolean isOrderInOrderHistory(String ref) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("tr.first_item > td:nth-child(1) > a:nth-child(2)")));
		boolean isFound = false;
		WebElement orderHistoryTable = driver.findElement(By.tagName("table"));
		List<WebElement> tableRows = orderHistoryTable.findElements(By.tagName("tr"));
		for (int i = 1; i < tableRows.size(); i++) {
			WebElement row = tableRows.get(i);
			String value = row.getText();
			System.out.print("the text found in col 1 of this row should match order ref " + value.substring(0, 10));
			isFound = value.contains(ref);
			if (isFound) {
				break;
			}
		}
		return isFound;
	}

	@And("^user clicks button \"([^\"]*)\" on the my account page$")
	public void user_clicks_button_on_the_my_account_page(String button) throws Throwable {
		myAccountPage = pageObjectManager.getMyAccountPage();
		myAccountPage.clickMyPersonalInformationLink();
	}

	@And("^user enters \"([^\"]*)\" as \"([^\"]*)\" on the personal information page$")
	public void user_enters_as_on_the_personal_information_page(String field, String value) throws Throwable {
		personalInformationPage = pageObjectManager.getPersonalInformationPage();
		switch (field.toLowerCase()) {
		case "first name":
			// adding todays day so the test can be run with different values each day
			String newValue = value + this.getToday();
			personalInformationPage.clear("first name");
			personalInformationPage.setFirstNameTextField(newValue);
			break;
		case "current password":
			personalInformationPage.setCurrentPasswordPasswordField(value);
			break;
		default:
			System.out.println("field " + field + " not an option");
			break;
		}

	}

	@And("^user clicks button \"([^\"]*)\" on the personal information page$")
	public void user_clicks_button_on_the_personal_information_page(String button) throws Throwable {
		personalInformationPage = pageObjectManager.getPersonalInformationPage();
		switch (button.toLowerCase()) {
		case "save":
			personalInformationPage.clickSaveButton();
			break;
		default:
			System.out.println("button " + button + " not an option");
			break;
		}
	}

	@Then("^verify message \"([^\"]*)\"$")
	public void verify_message(String expectedMessage) throws Throwable {
		WebElement ele = driver.findElement(By.className("alert"));
		String actualMessage = ele.getText();
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@Then("^verify header \"([^\"]*)\" matches \"([^\"]*)\"$")
	public void verify_header_matches(String header, String value) throws Throwable {
		personalInformationPage = pageObjectManager.getPersonalInformationPage();
		switch (header.toLowerCase()) {
		case "user info":
			String actualName = personalInformationPage.getuserName();

			// splitting value and adding todays day, and rejoining
			String fname = value.contains(" ") ? value.split(" ")[0] : value;
			String fnameAndDay = fname + this.getToday().toLowerCase();
			String Sname = value.contains(" ") ? value.split(" ")[1] : value;
			String jointFornameAndSurname = fnameAndDay + " " + Sname;
			Assert.assertEquals(jointFornameAndSurname, actualName);
			break;
		default:
			System.out.println("header " + header + " not an option");
			break;
		}

	}

	public String getOrderRef() {
		return orderRef;
	}

	public void setOrderRef() {

		WebElement ele = driver.findElement(By.className("box"));
		String eletext = ele.getText();
		String regEx = "([A-Z][A-Z][A-Z][A-Z][A-Z][A-Z][A-Z][A-Z][A-Z])";
		Pattern pattern = Pattern.compile(regEx);
		Matcher matcher = pattern.matcher(eletext);
		while (matcher.find()) {
			this.orderRef = matcher.group();
		}
	}

	public String getToday() {
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		String today = new SimpleDateFormat("EE", Locale.ENGLISH).format(date.getTime());
		today.toLowerCase();
		return today;
	}

	@After
	public void closeDown() throws InterruptedException {
		Thread.sleep(6000);
		driver.close();
	}

}
