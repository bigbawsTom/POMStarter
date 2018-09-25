package pageObjects;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckPaymentPage {
	private Map<String, String> data;
	private WebDriver driver;
	private int timeout = 15;

	@FindBy(name = "submitNewsletter")
	@CacheLookup
	private WebElement ok;

	@FindBy(css = "#cart_navigation > button")
	@CacheLookup
	private WebElement confirm;

	@FindBy(css = "a[title='Product detail']")
	@CacheLookup
	private WebElement orangeS;

	@FindBy(css = "a.button-exclusive.btn.btn-default")
	@CacheLookup
	private WebElement otherPaymentMethods;

	@FindBy(css = "a[title='Our stores']")
	@CacheLookup
	private WebElement ourStores;

	private final String pageLoadedText = "- Check owner and address information will be displayed on the next page";

	private final String pageUrl = "/index.php?fc=module&module=cheque&controller=payment";

	@FindBy(css = "a.btn.btn-default.button.button-medium")
	@CacheLookup
	private WebElement proceedToCheckout;

	@FindBy(id = "search_query_top")
	@CacheLookup
	private WebElement productSuccessfullyAddedToYourShopping;

	@FindBy(name = "submit_search")
	@CacheLookup
	private WebElement search;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?controller=order&step=2&multi-shipping=0']")
	@CacheLookup
	private WebElement shipping04;

	public CheckPaymentPage() {
	}

	public CheckPaymentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public CheckPaymentPage(WebDriver driver, Map<String, String> data) {
		this(driver);
		this.data = data;
	}

	public CheckPaymentPage(WebDriver driver, Map<String, String> data, int timeout) {
		this(driver, data);
		this.timeout = timeout;
	}

	/**
	 * Click on Ok Button.
	 *
	 * @return the CheckPaymentPage class instance.
	 */
	public CheckPaymentPage clickOkButton() {
		ok.click();
		return this;
	}

	/**
	 * Verify that the page loaded completely.
	 *
	 * @return the CheckPaymentPage class instance.
	 */
	public CheckPaymentPage verifyPageLoaded() {
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
	 * @return the CheckPaymentPage class instance.
	 */
	public CheckPaymentPage verifyPageUrl() {
		(new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver d) {
				return d.getCurrentUrl().contains(pageUrl);
			}
		});
		return this;
	}

	/**
	 * Submit the form to target page.
	 *
	 * @return the checkPage class instance.
	 */
	public CheckPaymentPage clickConfirm() {
		confirm.click();
		return this;
	}
}
