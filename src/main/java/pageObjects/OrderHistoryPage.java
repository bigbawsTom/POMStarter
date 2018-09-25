package pageObjects;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderHistoryPage {
	private Map<String, String> data;
	private WebDriver driver;
	private int timeout = 15;

	@FindBy(css = "#order-list tbody tr:nth-of-type(572) td:nth-of-type(1) a.color-myaccount")
	@CacheLookup
	private WebElement aawlqndqc;

	@FindBy(css = "#center_column ul.footer_links.clearfix li:nth-of-type(1) a.btn.btn-default.button.button-small")
	@CacheLookup
	private WebElement backToYourAccount;

	@FindBy(css = "a[title='View my shopping cart']")
	@CacheLookup
	private WebElement cart0ProductProducts000;

	public OrderHistoryPage() {
	}

	public OrderHistoryPage(WebDriver driver) {
		this();
		this.driver = driver;
	}

	public OrderHistoryPage(WebDriver driver, Map<String, String> data) {
		this(driver);
		this.data = data;
	}

	public OrderHistoryPage(WebDriver driver, Map<String, String> data, int timeout) {
		this(driver, data);
		this.timeout = timeout;
	}

	/**
	 * Click on Aawlqndqc Link.
	 *
	 * @return the OrderHistoryPage class instance.
	 */
	public OrderHistoryPage clickAawlqndqcLink() {
		aawlqndqc.click();
		return this;
	}

	/**
	 * Click on Cart 0 Product Products 0.00 Empty Link.
	 *
	 * @return the OrderHistoryPage class instance.
	 */
	public OrderHistoryPage clickCart0ProductProducts000Link() {
		cart0ProductProducts000.click();
		return this;
	}
}
