package pageObjects;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private WebDriver driver;
	private String homeURL = "http://automationpractice.com";

	@FindBy(css = "a[title='Contact Us']")
	@CacheLookup
	private WebElement contactUs1;

	@FindBy(css = "a[title='Contact us']")
	@CacheLookup
	private WebElement contactUs2;

	@FindBy(css = "a[href='http://www.seleniumframework.com']")
	@CacheLookup
	private WebElement seleniumFramework;

	@FindBy(css = "a.login")
	@CacheLookup
	private WebElement signIn;

	public HomePage() {
	}

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public HomePage(WebDriver driver, Map<String, String> data) {
		this(driver);
	}

	public HomePage(WebDriver driver, Map<String, String> data, int timeout) {
		this(driver, data);
	}

	/**
	 * Click on Contact Us Link.
	 *
	 * @return the HomePage class instance.
	 */
	public HomePage clickContactUs1Link() {
		contactUs1.click();
		return this;
	}

	/**
	 * Click on Contact Us Link.
	 *
	 * @return the HomePage class instance.
	 */
	public HomePage clickContactUs2Link() {
		contactUs2.click();
		return this;
	}

	/**
	 * Click on Sign In Link.
	 *
	 * @return the HomePage class instance.
	 */
	public HomePage clickSignInLink() {
		signIn.click();
		return this;
	}

	public void navigateTo_HomePage() {
		driver.get(this.homeURL);
	}

}
