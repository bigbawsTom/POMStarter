package pageObjects;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {
	private Map<String, String> data;
	private WebDriver driver;
	private int timeout = 15;

	@FindBy(id = "button_order_cart")
	@CacheLookup
	private WebElement checkOut;

	@FindBy(css = "a[title='Contact Us']")
	@CacheLookup
	private WebElement contactUs1;

	@FindBy(css = "a[title='Contact us']")
	@CacheLookup
	private WebElement contactUs2;

	@FindBy(css = "a[title='Home']")
	@CacheLookup
	private WebElement home;

	@FindBy(css = "a[title='Manage my customer account']")
	@CacheLookup
	private WebElement myAccount;

	@FindBy(css = "a[title='Addresses']")
	@CacheLookup
	private WebElement myAddresses1;

	@FindBy(css = "a[title='My addresses']")
	@CacheLookup
	private WebElement myAddresses2;

	@FindBy(css = "a[title='Credit slips']")
	@CacheLookup
	private WebElement myCreditSlips1;

	@FindBy(css = "a[title='My credit slips']")
	@CacheLookup
	private WebElement myCreditSlips2;

	@FindBy(css = "a[title='My orders']")
	@CacheLookup
	private WebElement myOrders;

	@FindBy(css = "a[title='Manage my personal information']")
	@CacheLookup
	private WebElement myPersonalInfo;

	@FindBy(css = "a[title='Information']")
	@CacheLookup
	private WebElement myPersonalInformation;

	@FindBy(css = "a[title='My wishlists']")
	@CacheLookup
	private WebElement myWishlists;

	@FindBy(css = "a[title='New products']")
	@CacheLookup
	private WebElement newProducts;

	@FindBy(name = "submitNewsletter")
	@CacheLookup
	private WebElement ok;

	@FindBy(css = "a[title='Orders']")
	@CacheLookup
	private WebElement orderHistoryAndDetails;

	@FindBy(css = "a[title='Our stores']")
	@CacheLookup
	private WebElement ourStores;

	private final String pageLoadedText = "Here you can manage all of your personal information and orders";

	private final String pageUrl = "/index.php?controller=my-account";

	@FindBy(css = "a.btn.btn-default.button.button-medium")
	@CacheLookup
	private WebElement proceedToCheckout;

	@FindBy(id = "search_query_top")
	@CacheLookup
	private WebElement productSuccessfullyAddedToYourShopping;

	@FindBy(name = "submit_search")
	@CacheLookup
	private WebElement search;

	@FindBy(css = "a.logout")
	@CacheLookup
	private WebElement signOut1;

	@FindBy(css = "a[title='Sign out']")
	@CacheLookup
	private WebElement signOut2;

	@FindBy(css = "a[title='Sitemap']")
	@CacheLookup
	private WebElement sitemap;

	@FindBy(css = "#block_top_menu > ul > li:nth-child(3) > a")
	@CacheLookup
	private WebElement tshirts1;

	@FindBy(css = "#block_top_menu > ul > li:nth-child(2) > a")
	@CacheLookup
	private WebElement dresses1;

	@FindBy(css = "a[title='Women']")
	@CacheLookup
	private WebElement women1;

	@FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last a")
	@CacheLookup
	private WebElement women2;

	public MyAccountPage() {
	}

	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public MyAccountPage(WebDriver driver, Map<String, String> data) {
		this(driver);
		this.data = data;
	}

	public MyAccountPage(WebDriver driver, Map<String, String> data, int timeout) {
		this(driver, data);
		this.timeout = timeout;
	}

	/**
	 * Click on Check Out Link.
	 *
	 * @return the MyAccountPage class instance.
	 */
	public MyAccountPage clickCheckOutLink() {
		checkOut.click();
		return this;
	}

	/**
	 * Click on Contact Us Link.
	 *
	 * @return the MyAccountPage class instance.
	 */
	public MyAccountPage clickContactUs1Link() {
		contactUs1.click();
		return this;
	}

	/**
	 * Click on Contact Us Link.
	 *
	 * @return the MyAccountPage class instance.
	 */
	public MyAccountPage clickContactUs2Link() {
		contactUs2.click();
		return this;
	}

	/**
	 * Click on Home Link.
	 *
	 * @return the MyAccountPage class instance.
	 */
	public MyAccountPage clickHomeLink() {
		home.click();
		return this;
	}

	/**
	 * Click on My Account Link.
	 *
	 * @return the MyAccountPage class instance.
	 */
	public MyAccountPage clickMyAccountLink() {
		myAccount.click();
		return this;
	}

	/**
	 * Click on My Addresses Link.
	 *
	 * @return the MyAccountPage class instance.
	 */
	public MyAccountPage clickMyAddresses1Link() {
		myAddresses1.click();
		return this;
	}

	/**
	 * Click on My Addresses Link.
	 *
	 * @return the MyAccountPage class instance.
	 */
	public MyAccountPage clickMyAddresses2Link() {
		myAddresses2.click();
		return this;
	}

	/**
	 * Click on My Credit Slips Link.
	 *
	 * @return the MyAccountPage class instance.
	 */
	public MyAccountPage clickMyCreditSlips1Link() {
		myCreditSlips1.click();
		return this;
	}

	/**
	 * Click on My Credit Slips Link.
	 *
	 * @return the MyAccountPage class instance.
	 */
	public MyAccountPage clickMyCreditSlips2Link() {
		myCreditSlips2.click();
		return this;
	}

	/**
	 * Click on My Orders Link.
	 *
	 * @return the MyAccountPage class instance.
	 */
	public MyAccountPage clickMyOrdersLink() {
		myOrders.click();
		return this;
	}

	/**
	 * Click on My Personal Info Link.
	 *
	 * @return the MyAccountPage class instance.
	 */
	public MyAccountPage clickMyPersonalInfoLink() {
		myPersonalInfo.click();
		return this;
	}

	/**
	 * Click on My Personal Information Link.
	 *
	 * @return the MyAccountPage class instance.
	 */
	public MyAccountPage clickMyPersonalInformationLink() {
		myPersonalInformation.click();
		return this;
	}

	/**
	 * Click on My Wishlists Link.
	 *
	 * @return the MyAccountPage class instance.
	 */
	public MyAccountPage clickMyWishlistsLink() {
		myWishlists.click();
		return this;
	}

	/**
	 * Click on New Products Link.
	 *
	 * @return the MyAccountPage class instance.
	 */
	public MyAccountPage clickNewProductsLink() {
		newProducts.click();
		return this;
	}

	/**
	 * Click on Ok Button.
	 *
	 * @return the MyAccountPage class instance.
	 */
	public MyAccountPage clickOkButton() {
		ok.click();
		return this;
	}

	/**
	 * Click on Order History And Details Link.
	 *
	 * @return the MyAccountPage class instance.
	 */
	public MyAccountPage clickOrderHistoryAndDetailsLink() {
		orderHistoryAndDetails.click();
		return this;
	}

	/**
	 * Click on Our Stores Link.
	 *
	 * @return the MyAccountPage class instance.
	 */
	public MyAccountPage clickOurStoresLink() {
		ourStores.click();
		return this;
	}

	/**
	 * Click on Proceed To Checkout Link.
	 *
	 * @return the MyAccountPage class instance.
	 */
	public MyAccountPage clickProceedToCheckoutLink() {
		proceedToCheckout.click();
		return this;
	}

	/**
	 * Click on Search Button.
	 *
	 * @return the MyAccountPage class instance.
	 */
	public MyAccountPage clickSearchButton() {
		search.click();
		return this;
	}

	/**
	 * Click on Sign Out Link.
	 *
	 * @return the MyAccountPage class instance.
	 */
	public MyAccountPage clickSignOut1Link() {
		signOut1.click();
		return this;
	}

	/**
	 * Click on Sign Out Link.
	 *
	 * @return the MyAccountPage class instance.
	 */
	public MyAccountPage clickSignOut2Link() {
		signOut2.click();
		return this;
	}

	/**
	 * Click on Sitemap Link.
	 *
	 * @return the MyAccountPage class instance.
	 */
	public MyAccountPage clickSitemapLink() {
		sitemap.click();
		return this;
	}

	/**
	 * Click on Tshirts Link.
	 *
	 * @return the MyAccountPage class instance.
	 */
	public MyAccountPage clickTshirts1Link() {
		tshirts1.click();
		return this;
	}

	public MyAccountPage clickDresses1Link() {
		dresses1.click();
		return this;
	}

	/**
	 * Click on Women Link.
	 *
	 * @return the MyAccountPage class instance.
	 */
	public MyAccountPage clickWomen1Link() {
		women1.click();
		return this;
	}

	/**
	 * Click on Women Link.
	 *
	 * @return the MyAccountPage class instance.
	 */
	public MyAccountPage clickWomen2Link() {
		women2.click();
		return this;
	}

	/**
	 * Set default value to Product Successfully Added To Your Shopping Cart Text
	 * field.
	 *
	 * @return the MyAccountPage class instance.
	 */
	public MyAccountPage setProductSuccessfullyAddedToYourShoppingTextField() {
		return setProductSuccessfullyAddedToYourShoppingTextField(
				data.get("PRODUCT_SUCCESSFULLY_ADDED_TO_YOUR_SHOPPING"));
	}

	/**
	 * Set value to Product Successfully Added To Your Shopping Cart Text field.
	 *
	 * @return the MyAccountPage class instance.
	 */
	public MyAccountPage setProductSuccessfullyAddedToYourShoppingTextField(
			String productSuccessfullyAddedToYourShoppingValue) {
		productSuccessfullyAddedToYourShopping.sendKeys(productSuccessfullyAddedToYourShoppingValue);
		return this;
	}

	/**
	 * Submit the form to target page.
	 *
	 * @return the MyAccountPage class instance.
	 */
	public MyAccountPage submit() {
		clickSearchButton();
		return this;
	}

	/**
	 * Verify that the page loaded completely.
	 *
	 * @return the MyAccountPage class instance.
	 */
	public MyAccountPage verifyPageLoaded() {
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
	 * @return the MyAccountPage class instance.
	 */
	public MyAccountPage verifyPageUrl() {
		(new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver d) {
				return d.getCurrentUrl().contains(pageUrl);
			}
		});
		return this;
	}
}
