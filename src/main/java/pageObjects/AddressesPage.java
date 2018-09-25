package pageObjects;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressesPage {
	private Map<String, String> data;
	private WebDriver driver;
	private int timeout = 15;

	@FindBy(css = "a[title='About us']")
	@CacheLookup
	private WebElement aboutUs;

	@FindBy(css = "a[title='Add']")
	@CacheLookup
	private WebElement addANewAddress;

	@FindBy(css = "a[title='View my shopping cart']")
	@CacheLookup
	private WebElement cart1ProductProducts1651;

	@FindBy(id = "button_order_cart")
	@CacheLookup
	private WebElement checkOut;

	@FindBy(id = "id_address_invoice")
	@CacheLookup
	private WebElement chooseABillingAddress;

	@FindBy(id = "id_address_delivery")
	@CacheLookup
	private WebElement chooseADeliveryAddress;

	@FindBy(css = "a[title='Contact Us']")
	@CacheLookup
	private WebElement contactUs1;

	@FindBy(css = "a[title='Contact us']")
	@CacheLookup
	private WebElement contactUs2;

	@FindBy(css = "a.button-exclusive.btn.btn-default")
	@CacheLookup
	private WebElement continueShopping;

	@FindBy(css = "a.account")
	@CacheLookup
	private WebElement frodoLastname;

	@FindBy(css = "a[title='Manage my customer account']")
	@CacheLookup
	private WebElement myAccount;

	@FindBy(css = "a[title='My addresses']")
	@CacheLookup
	private WebElement myAddresses;

	@FindBy(css = "a[title='My credit slips']")
	@CacheLookup
	private WebElement myCreditSlips;

	@FindBy(css = "a[title='My orders']")
	@CacheLookup
	private WebElement myOrders;

	@FindBy(css = "a[title='Manage my personal information']")
	@CacheLookup
	private WebElement myPersonalInfo;

	@FindBy(css = "a[title='New products']")
	@CacheLookup
	private WebElement newProducts;

	@FindBy(name = "submitNewsletter")
	@CacheLookup
	private WebElement ok;

	@FindBy(css = "a[title='Product detail']")
	@CacheLookup
	private WebElement orangeS;

	@FindBy(css = "a[title='Our stores']")
	@CacheLookup
	private WebElement ourStores;

	private final String pageLoadedText = "Use the delivery address as the billing address";

	private final String pageUrl = "/index.php?controller=order&step=1";

	@FindBy(css = "a.btn.btn-default.button.button-medium")
	@CacheLookup
	private WebElement proceedToCheckout1;

	@FindBy(name = "processAddress")
	@CacheLookup
	private WebElement proceedToCheckout2;

	@FindBy(id = "search_query_top")
	@CacheLookup
	private WebElement productSuccessfullyAddedToYourShopping;

	@FindBy(name = "submit_search")
	@CacheLookup
	private WebElement search;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?controller=order&step=1&multi-shipping=']")
	@CacheLookup
	private WebElement signIn02;

	@FindBy(css = "a.logout")
	@CacheLookup
	private WebElement signOut1;

	@FindBy(css = "a[title='Sign out']")
	@CacheLookup
	private WebElement signOut2;

	@FindBy(css = "a[title='Sitemap']")
	@CacheLookup
	private WebElement sitemap;

	@FindBy(css = "a[title='Specials']")
	@CacheLookup
	private WebElement specials;

	@FindBy(css = "#order_step li:nth-of-type(1) a")
	@CacheLookup
	private WebElement summary01;

	@FindBy(css = "a[href='mailto:%73%75%70%70%6f%72%74@%73%65%6c%65%6e%69%75%6d%66%72%61%6d%65%77%6f%72%6b.%63%6f%6d']")
	@CacheLookup
	private WebElement supportseleniumframeworkCom;

	@FindBy(css = "a[title='Terms and conditions of use']")
	@CacheLookup
	private WebElement termsAndConditionsOfUse;

	@FindBy(css = "#address_delivery li:nth-of-type(9) a.button.button-small.btn.btn-default")
	@CacheLookup
	private WebElement update1;

	@FindBy(css = "#address_invoice li:nth-of-type(9) a.button.button-small.btn.btn-default")
	@CacheLookup
	private WebElement update2;

	@FindBy(id = "addressesAreEquals")
	@CacheLookup
	private WebElement useTheDeliveryAddressAsThe;

	@FindBy(css = "a[title='Women']")
	@CacheLookup
	private WebElement women1;

	@FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last a")
	@CacheLookup
	private WebElement women2;

	public AddressesPage() {
	}

	public AddressesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public AddressesPage(WebDriver driver, Map<String, String> data) {
		this(driver);
		this.data = data;
	}

	public AddressesPage(WebDriver driver, Map<String, String> data, int timeout) {
		this(driver, data);
		this.timeout = timeout;
	}

	/**
	 * Click on About Us Link.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage clickAboutUsLink() {
		aboutUs.click();
		return this;
	}

	/**
	 * Click on Add A New Address Link.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage clickAddANewAddressLink() {
		addANewAddress.click();
		return this;
	}

	/**
	 * Click on Cart 1 Product Products 16.51 Empty Link.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage clickCart1ProductProducts1651Link() {
		cart1ProductProducts1651.click();
		return this;
	}

	/**
	 * Click on Check Out Link.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage clickCheckOutLink() {
		checkOut.click();
		return this;
	}

	/**
	 * Click on Contact Us Link.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage clickContactUs1Link() {
		contactUs1.click();
		return this;
	}

	/**
	 * Click on Contact Us Link.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage clickContactUs2Link() {
		contactUs2.click();
		return this;
	}

	/**
	 * Click on Continue Shopping Link.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage clickContinueShoppingLink() {
		continueShopping.click();
		return this;
	}

	/**
	 * Click on Frodo Lastname Link.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage clickFrodoLastnameLink() {
		frodoLastname.click();
		return this;
	}

	/**
	 * Click on My Account Link.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage clickMyAccountLink() {
		myAccount.click();
		return this;
	}

	/**
	 * Click on My Addresses Link.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage clickMyAddressesLink() {
		myAddresses.click();
		return this;
	}

	/**
	 * Click on My Credit Slips Link.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage clickMyCreditSlipsLink() {
		myCreditSlips.click();
		return this;
	}

	/**
	 * Click on My Orders Link.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage clickMyOrdersLink() {
		myOrders.click();
		return this;
	}

	/**
	 * Click on My Personal Info Link.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage clickMyPersonalInfoLink() {
		myPersonalInfo.click();
		return this;
	}

	/**
	 * Click on New Products Link.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage clickNewProductsLink() {
		newProducts.click();
		return this;
	}

	/**
	 * Click on Ok Button.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage clickOkButton() {
		ok.click();
		return this;
	}

	/**
	 * Click on Orange S Link.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage clickOrangeSLink() {
		orangeS.click();
		return this;
	}

	/**
	 * Click on Our Stores Link.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage clickOurStoresLink() {
		ourStores.click();
		return this;
	}

	/**
	 * Click on Proceed To Checkout Button.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage clickProceedToCheckout1Button() {
		proceedToCheckout1.click();
		return this;
	}

	/**
	 * Click on Proceed To Checkout Button.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage clickProceedToCheckout2Button() {
		proceedToCheckout2.click();
		return this;
	}

	/**
	 * Click on Search Button.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage clickSearchButton() {
		search.click();
		return this;
	}

	/**
	 * Click on 02. Sign In Link.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage clickSignInLink02() {
		signIn02.click();
		return this;
	}

	/**
	 * Click on Sign Out Link.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage clickSignOut1Link() {
		signOut1.click();
		return this;
	}

	/**
	 * Click on Sign Out Link.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage clickSignOut2Link() {
		signOut2.click();
		return this;
	}

	/**
	 * Click on Sitemap Link.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage clickSitemapLink() {
		sitemap.click();
		return this;
	}

	/**
	 * Click on Specials Link.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage clickSpecialsLink() {
		specials.click();
		return this;
	}

	/**
	 * Click on 01. Summary Link.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage clickSummaryLink01() {
		summary01.click();
		return this;
	}

	/**
	 * Click on Supportseleniumframework.com Link.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage clickSupportseleniumframeworkComLink() {
		supportseleniumframeworkCom.click();
		return this;
	}

	/**
	 * Click on Terms And Conditions Of Use Link.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage clickTermsAndConditionsOfUseLink() {
		termsAndConditionsOfUse.click();
		return this;
	}

	/**
	 * Submit the form to target page.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage submit() {
		clickSearchButton();
		return this;
	}

	/**
	 * Verify that the page loaded completely.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage verifyPageLoaded() {
		(new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver d) {
				return d.getPageSource().contains(pageLoadedText);
			}
		});
		return this;
	}

	/**
	 * Verify that current page URL matches the expected URL.
	 *
	 * @return the AddressesPage class instance.
	 */
	public AddressesPage verifyPageUrl() {
		(new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver d) {
				return d.getCurrentUrl().contains(pageUrl);
			}
		});
		return this;
	}
}
