package pageObjects;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentMethodPage {
	private Map<String, String> data;
	private WebDriver driver;
	private int timeout = 15;

	@FindBy(id = "button_order_cart")
	@CacheLookup
	private WebElement checkOut;

	private final String pageLoadedText = "(order processing will be longer)";

	private final String pageUrl = "/index.php?controller=order&multi-shipping=";

	@FindBy(css = "a.bankwire")
	@CacheLookup
	private WebElement payByBankWireOrder;

	@FindBy(css = "a.cheque")
	@CacheLookup
	private WebElement payByCheckOrderProcessing;

	@FindBy(css = "a.btn.btn-default.button.button-medium")
	@CacheLookup
	private WebElement proceedToCheckout;

	@FindBy(id = "search_query_top")
	@CacheLookup
	private WebElement productSuccessfullyAddedToYourShopping;

	public PaymentMethodPage() {
	}

	public PaymentMethodPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public PaymentMethodPage(WebDriver driver, Map<String, String> data) {
		this(driver);
		this.data = data;
	}

	public PaymentMethodPage(WebDriver driver, Map<String, String> data, int timeout) {
		this(driver, data);
		this.timeout = timeout;
	}

	/**
	 * Click on Check Out Link.
	 *
	 * @return the PaymentMethodPage class instance.
	 */
	public PaymentMethodPage clickCheckOutLink() {
		checkOut.click();
		return this;
	}

	/**
	 * Click on Pay By Bank Wire Order Processing Will Be Longer Link.
	 *
	 * @return the PaymentMethodPage class instance.
	 */
	public PaymentMethodPage clickPayByBankWireOrderLink() {
		payByBankWireOrder.click();
		return this;
	}

	/**
	 * Click on Pay By Check Order Processing Will Be Longer Link.
	 *
	 * @return the PaymentMethodPage class instance.
	 */
	public PaymentMethodPage clickPayByCheckOrderProcessingLink() {
		payByCheckOrderProcessing.click();
		return this;
	}

	/**
	 * Click on Proceed To Checkout Link.
	 *
	 * @return the PaymentMethodPage class instance.
	 */
	public PaymentMethodPage clickProceedToCheckoutLink() {
		proceedToCheckout.click();
		return this;
	}

	/**
	 * Verify that the page loaded completely.
	 *
	 * @return the PaymentMethodPage class instance.
	 */
	public PaymentMethodPage verifyPageLoaded() {
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
	 * @return the PaymentMethodPage class instance.
	 */
	public PaymentMethodPage verifyPageUrl() {
		(new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver d) {
				return d.getCurrentUrl().contains(pageUrl);
			}
		});
		return this;
	}
}
