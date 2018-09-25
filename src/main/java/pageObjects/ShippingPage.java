package pageObjects;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShippingPage {
	private Map<String, String> data;
	private WebDriver driver;
	private int timeout = 15;

	@FindBy(id = "cgv")
	@CacheLookup
	private WebElement iAgreeToTheTermsOf;

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

	private final String pageLoadedText = "I agree to the terms of service and will adhere to them unconditionally";

	private final String pageUrl = "/index.php?controller=order";

	@FindBy(css = "a.btn.btn-default.button.button-medium")
	@CacheLookup
	private WebElement proceedToCheckout1;

	@FindBy(name = "processCarrier")
	@CacheLookup
	private WebElement proceedToCheckout2;

	@FindBy(css = "a[title='Terms and conditions of use']")
	@CacheLookup
	private WebElement termsAndConditionsOfUse;

	public ShippingPage() {
	}

	public ShippingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public ShippingPage(WebDriver driver, Map<String, String> data) {
		this(driver);
		this.data = data;
	}

	public ShippingPage(WebDriver driver, Map<String, String> data, int timeout) {
		this(driver, data);
		this.timeout = timeout;
	}

	/**
	 * Click on My Account Link.
	 *
	 * @return the ShippingPage class instance.
	 */
	public ShippingPage clickMyAccountLink() {
		myAccount.click();
		return this;
	}

	/**
	 * Click on My Addresses Link.
	 *
	 * @return the ShippingPage class instance.
	 */
	public ShippingPage clickMyAddressesLink() {
		myAddresses.click();
		return this;
	}

	/**
	 * Click on My Credit Slips Link.
	 *
	 * @return the ShippingPage class instance.
	 */
	public ShippingPage clickMyCreditSlipsLink() {
		myCreditSlips.click();
		return this;
	}

	/**
	 * Click on My Orders Link.
	 *
	 * @return the ShippingPage class instance.
	 */
	public ShippingPage clickMyOrdersLink() {
		myOrders.click();
		return this;
	}

	/**
	 * Click on My Personal Info Link.
	 *
	 * @return the ShippingPage class instance.
	 */
	public ShippingPage clickMyPersonalInfoLink() {
		myPersonalInfo.click();
		return this;
	}

	/**
	 * Click on New Products Link.
	 *
	 * @return the ShippingPage class instance.
	 */
	public ShippingPage clickNewProductsLink() {
		newProducts.click();
		return this;
	}

	/**
	 * Click on Ok Button.
	 *
	 * @return the ShippingPage class instance.
	 */
	public ShippingPage clickOkButton() {
		ok.click();
		return this;
	}

	/**
	 * Click on Orange S Link.
	 *
	 * @return the ShippingPage class instance.
	 */
	public ShippingPage clickOrangeSLink() {
		orangeS.click();
		return this;
	}

	/**
	 * Click on Our Stores Link.
	 *
	 * @return the ShippingPage class instance.
	 */
	public ShippingPage clickOurStoresLink() {
		ourStores.click();
		return this;
	}

	/**
	 * Click on Proceed To Checkout Button.
	 *
	 * @return the ShippingPage class instance.
	 */
	public ShippingPage clickProceedToCheckout1Button() {
		proceedToCheckout1.click();
		return this;
	}

	/**
	 * Click on Proceed To Checkout Button.
	 *
	 * @return the ShippingPage class instance.
	 */
	public ShippingPage clickProceedToCheckout2Button() {
		proceedToCheckout2.click();
		return this;
	}

	/**
	 * Click on Terms And Conditions Of Use Link.
	 *
	 * @return the ShippingPage class instance.
	 */
	public ShippingPage clickTermsAndConditionsOfUseLink() {
		termsAndConditionsOfUse.click();
		return this;
	}

	/**
	 * Set I Agree To The Terms Of Service And Will Adhere To Them Unconditionally.
	 * Checkbox field.
	 *
	 * @return the ShippingPage class instance.
	 */
	public ShippingPage setIAgreeToTheTermsOfCheckboxField() {
		if (!iAgreeToTheTermsOf.isSelected()) {
			iAgreeToTheTermsOf.click();
		}
		return this;
	}

	/**
	 * Unset I Agree To The Terms Of Service And Will Adhere To Them
	 * Unconditionally. Checkbox field.
	 *
	 * @return the ShippingPage class instance.
	 */
	public ShippingPage unsetIAgreeToTheTermsOfCheckboxField() {
		if (iAgreeToTheTermsOf.isSelected()) {
			iAgreeToTheTermsOf.click();
		}
		return this;
	}

	/**
	 * Verify that the page loaded completely.
	 *
	 * @return the ShippingPage class instance.
	 */
	public ShippingPage verifyPageLoaded() {
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
	 * @return the ShippingPage class instance.
	 */
	public ShippingPage verifyPageUrl() {
		(new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver d) {
				return d.getCurrentUrl().contains(pageUrl);
			}
		});
		return this;
	}
}
