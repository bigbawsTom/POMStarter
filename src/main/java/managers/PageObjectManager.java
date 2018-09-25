package managers;

import org.openqa.selenium.WebDriver;
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

public class PageObjectManager {
	WebDriver driver;

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

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	public AddressesPage getAddressesPage() {
		return (addressesPage == null) ? addressesPage = new AddressesPage(driver) : addressesPage;
	}

	public AuthenticationPage getAuthenticationPage() {
		return (authenticationPage == null) ? authenticationPage = new AuthenticationPage(driver) : authenticationPage;
	}

	public BankWirePage getBankWirePage() {
		return (bankWirePage == null) ? bankWirePage = new BankWirePage(driver) : bankWirePage;
	}

	public CheckPaymentPage getCheckPaymentPage() {
		return (checkPaymentPage == null) ? checkPaymentPage = new CheckPaymentPage(driver) : checkPaymentPage;
	}

	public ContactPage getContactPage() {
		return (contactPage == null) ? contactPage = new ContactPage(driver) : contactPage;
	}

	public CreditSlipsPage getCreditSlipsPage() {
		return (creditSlipsPage == null) ? creditSlipsPage = new CreditSlipsPage(driver) : creditSlipsPage;
	}

	public HomePage getHomePage() {
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}

	public DressesPage getDressesPage() {
		return (dressesPage == null) ? dressesPage = new DressesPage(driver) : dressesPage;
	}

	public MyAccountPage getMyAccountPage() {
		return (myAccountPage == null) ? myAccountPage = new MyAccountPage(driver) : myAccountPage;
	}

	public MyAddressesPage getMyAddressesPage() {
		return (myAddressesPage == null) ? myAddressesPage = new MyAddressesPage(driver) : myAddressesPage;
	}

	public MyWishlistsPage getMyWishlistsPage() {
		return (myWishlistsPage == null) ? myWishlistsPage = new MyWishlistsPage(driver) : myWishlistsPage;
	}

	public OrderConfirmationPage getOrderConfirmationPage() {
		return (orderConfirmationPage == null) ? orderConfirmationPage = new OrderConfirmationPage(driver)
				: orderConfirmationPage;
	}

	public OrderHistoryPage getOrderHistoryPage() {
		return (orderHistoryPage == null) ? orderHistoryPage = new OrderHistoryPage(driver) : orderHistoryPage;
	}

	public PaymentMethodPage getPaymentMethodPage() {
		return (paymentMethodPage == null) ? paymentMethodPage = new PaymentMethodPage(driver) : paymentMethodPage;
	}

	public PersonalInformationPage getPersonalInformationPage() {
		return (personalInformationPage == null) ? personalInformationPage = new PersonalInformationPage(driver)
				: personalInformationPage;
	}

	public ShippingPage getShippingPage() {
		return (shippingPage == null) ? shippingPage = new ShippingPage(driver) : shippingPage;
	}

	public ShoppingCartPage getShoppingCartPage() {
		return (shoppingCartPage == null) ? shoppingCartPage = new ShoppingCartPage(driver) : shoppingCartPage;
	}

	public TshirtsPage getTshirtsPage() {
		return (tshirtsPage == null) ? tshirtsPage = new TshirtsPage(driver) : tshirtsPage;
	}

	public WomenPage getWomenPage() {
		return (womenPage == null) ? womenPage = new WomenPage(driver) : womenPage;
	}

}
