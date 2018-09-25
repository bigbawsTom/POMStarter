package pageObjects;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreditSlipsPage {
	private Map<String, String> data;
	private WebDriver driver;
	private int timeout = 15;

	@FindBy(css = "a[title='About us']")
	@CacheLookup
	private WebElement aboutUs;

	@FindBy(css = "#center_column ul.footer_links.clearfix li:nth-of-type(1) a.btn.btn-default.button.button-small")
	@CacheLookup
	private WebElement backToYourAccount;

	@FindBy(css = "a[title='Best sellers']")
	@CacheLookup
	private WebElement bestSellers;

	@FindBy(css = "a[title='Blouses']")
	@CacheLookup
	private WebElement blouses1;

	@FindBy(css = "a[title='Match your favorites blouses with the right accessories for the perfect look.']")
	@CacheLookup
	private WebElement blouses2;

	@FindBy(css = "a[title='View my shopping cart']")
	@CacheLookup
	private WebElement cart0ProductProductsEmpty;

	@FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) ul li:nth-of-type(1) a")
	@CacheLookup
	private WebElement casualDresses1;

	@FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(1) a")
	@CacheLookup
	private WebElement casualDresses2;

	@FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(2) ul li:nth-of-type(1) a")
	@CacheLookup
	private WebElement casualDresses3;

	@FindBy(id = "button_order_cart")
	@CacheLookup
	private WebElement checkOut;

	@FindBy(css = "a[title='Contact Us']")
	@CacheLookup
	private WebElement contactUs1;

	@FindBy(css = "a[title='Contact us']")
	@CacheLookup
	private WebElement contactUs2;

	@FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) a.sf-with-ul")
	@CacheLookup
	private WebElement dresses1;

	@FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) a.sf-with-ul")
	@CacheLookup
	private WebElement dresses2;

	@FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(2) a")
	@CacheLookup
	private WebElement dresses3;

	@FindBy(css = "a._blank")
	@CacheLookup
	private WebElement ecommerceSoftwareByPrestashop;

	@FindBy(id = "newsletter-input")
	@CacheLookup
	private WebElement ecommerceSoftwareByPrestashop2014;

	@FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) ul li:nth-of-type(2) a")
	@CacheLookup
	private WebElement eveningDresses1;

	@FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) a")
	@CacheLookup
	private WebElement eveningDresses2;

	@FindBy(css = "a[title='Browse our different dresses to choose the perfect dress for an unforgettable evening!']")
	@CacheLookup
	private WebElement eveningDresses3;

	@FindBy(css = "a[href='https://www.facebook.com/groups/525066904174158/']")
	@CacheLookup
	private WebElement facebook;

	@FindBy(css = "a.account")
	@CacheLookup
	private WebElement frodoLastname;

	@FindBy(css = "a[href='https://plus.google.com/111979135243110831526/posts']")
	@CacheLookup
	private WebElement googlePlus;

	@FindBy(css = "#center_column ul.footer_links.clearfix li:nth-of-type(2) a.btn.btn-default.button.button-small")
	@CacheLookup
	private WebElement home;

	@FindBy(css = "#columns div:nth-of-type(1) a:nth-of-type(2)")
	@CacheLookup
	private WebElement myAccount1;

	@FindBy(css = "a[title='Manage my customer account']")
	@CacheLookup
	private WebElement myAccount2;

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

	@FindBy(css = "a[title='Our stores']")
	@CacheLookup
	private WebElement ourStores;

	private final String pageLoadedText = "Credit slips you have received after canceled orders";

	private final String pageUrl = "/index.php?controller=order-slip";

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

	@FindBy(css = "a[title='Specials']")
	@CacheLookup
	private WebElement specials;

	@FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) ul li:nth-of-type(3) a")
	@CacheLookup
	private WebElement summerDresses1;

	@FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(3) a")
	@CacheLookup
	private WebElement summerDresses2;

	@FindBy(css = "a[title='Short dress, long dress, silk dress, printed dress, you will find the perfect dress for summer.']")
	@CacheLookup
	private WebElement summerDresses3;

	@FindBy(css = "a[href='mailto:%73%75%70%70%6f%72%74@%73%65%6c%65%6e%69%75%6d%66%72%61%6d%65%77%6f%72%6b.%63%6f%6d']")
	@CacheLookup
	private WebElement supportseleniumframeworkCom;

	@FindBy(css = "a[title='Terms and conditions of use']")
	@CacheLookup
	private WebElement termsAndConditionsOfUse;

	@FindBy(css = "a[title='Tops']")
	@CacheLookup
	private WebElement tops1;

	@FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(1) a")
	@CacheLookup
	private WebElement tops2;

	@FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(1) ul li:nth-of-type(1) a")
	@CacheLookup
	private WebElement tshirts1;

	@FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(3) a")
	@CacheLookup
	private WebElement tshirts2;

	@FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(1) ul li:nth-of-type(1) a")
	@CacheLookup
	private WebElement tshirts3;

	@FindBy(css = "a[href='https://twitter.com/seleniumfrmwrk']")
	@CacheLookup
	private WebElement twitter;

	@FindBy(css = "a[title='Women']")
	@CacheLookup
	private WebElement women1;

	@FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last a")
	@CacheLookup
	private WebElement women2;

	@FindBy(css = "a[href='https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA']")
	@CacheLookup
	private WebElement youtube;

	public CreditSlipsPage() {
	}

	public CreditSlipsPage(WebDriver driver) {
		this();
		this.driver = driver;
	}

	public CreditSlipsPage(WebDriver driver, Map<String, String> data) {
		this(driver);
		this.data = data;
	}

	public CreditSlipsPage(WebDriver driver, Map<String, String> data, int timeout) {
		this(driver, data);
		this.timeout = timeout;
	}

	/**
	 * Click on About Us Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickAboutUsLink() {
		aboutUs.click();
		return this;
	}

	/**
	 * Click on Back To Your Account Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickBackToYourAccountLink() {
		backToYourAccount.click();
		return this;
	}

	/**
	 * Click on Best Sellers Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickBestSellersLink() {
		bestSellers.click();
		return this;
	}

	/**
	 * Click on Blouses Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickBlouses1Link() {
		blouses1.click();
		return this;
	}

	/**
	 * Click on Blouses Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickBlouses2Link() {
		blouses2.click();
		return this;
	}

	/**
	 * Click on Cart 0 Product Products Empty Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickCart0ProductProductsEmptyLink() {
		cart0ProductProductsEmpty.click();
		return this;
	}

	/**
	 * Click on Casual Dresses Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickCasualDresses1Link() {
		casualDresses1.click();
		return this;
	}

	/**
	 * Click on Casual Dresses Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickCasualDresses2Link() {
		casualDresses2.click();
		return this;
	}

	/**
	 * Click on Casual Dresses Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickCasualDresses3Link() {
		casualDresses3.click();
		return this;
	}

	/**
	 * Click on Check Out Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickCheckOutLink() {
		checkOut.click();
		return this;
	}

	/**
	 * Click on Contact Us Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickContactUs1Link() {
		contactUs1.click();
		return this;
	}

	/**
	 * Click on Contact Us Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickContactUs2Link() {
		contactUs2.click();
		return this;
	}

	/**
	 * Click on Dresses Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickDresses1Link() {
		dresses1.click();
		return this;
	}

	/**
	 * Click on Dresses Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickDresses2Link() {
		dresses2.click();
		return this;
	}

	/**
	 * Click on Dresses Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickDresses3Link() {
		dresses3.click();
		return this;
	}

	/**
	 * Click on Ecommerce Software By Prestashop Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickEcommerceSoftwareByPrestashopLink() {
		ecommerceSoftwareByPrestashop.click();
		return this;
	}

	/**
	 * Click on Evening Dresses Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickEveningDresses1Link() {
		eveningDresses1.click();
		return this;
	}

	/**
	 * Click on Evening Dresses Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickEveningDresses2Link() {
		eveningDresses2.click();
		return this;
	}

	/**
	 * Click on Evening Dresses Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickEveningDresses3Link() {
		eveningDresses3.click();
		return this;
	}

	/**
	 * Click on Facebook Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickFacebookLink() {
		facebook.click();
		return this;
	}

	/**
	 * Click on Frodo Lastname Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickFrodoLastnameLink() {
		frodoLastname.click();
		return this;
	}

	/**
	 * Click on Google Plus Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickGooglePlusLink() {
		googlePlus.click();
		return this;
	}

	/**
	 * Click on Home Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickHomeLink() {
		home.click();
		return this;
	}

	/**
	 * Click on My Account Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickMyAccount1Link() {
		myAccount1.click();
		return this;
	}

	/**
	 * Click on My Account Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickMyAccount2Link() {
		myAccount2.click();
		return this;
	}

	/**
	 * Click on My Addresses Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickMyAddressesLink() {
		myAddresses.click();
		return this;
	}

	/**
	 * Click on My Credit Slips Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickMyCreditSlipsLink() {
		myCreditSlips.click();
		return this;
	}

	/**
	 * Click on My Orders Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickMyOrdersLink() {
		myOrders.click();
		return this;
	}

	/**
	 * Click on My Personal Info Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickMyPersonalInfoLink() {
		myPersonalInfo.click();
		return this;
	}

	/**
	 * Click on New Products Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickNewProductsLink() {
		newProducts.click();
		return this;
	}

	/**
	 * Click on Ok Button.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickOkButton() {
		ok.click();
		return this;
	}

	/**
	 * Click on Our Stores Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickOurStoresLink() {
		ourStores.click();
		return this;
	}

	/**
	 * Click on Proceed To Checkout Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickProceedToCheckoutLink() {
		proceedToCheckout.click();
		return this;
	}

	/**
	 * Click on Search Button.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickSearchButton() {
		search.click();
		return this;
	}

	/**
	 * Click on Sign Out Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickSignOut1Link() {
		signOut1.click();
		return this;
	}

	/**
	 * Click on Sign Out Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickSignOut2Link() {
		signOut2.click();
		return this;
	}

	/**
	 * Click on Sitemap Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickSitemapLink() {
		sitemap.click();
		return this;
	}

	/**
	 * Click on Specials Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickSpecialsLink() {
		specials.click();
		return this;
	}

	/**
	 * Click on Summer Dresses Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickSummerDresses1Link() {
		summerDresses1.click();
		return this;
	}

	/**
	 * Click on Summer Dresses Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickSummerDresses2Link() {
		summerDresses2.click();
		return this;
	}

	/**
	 * Click on Summer Dresses Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickSummerDresses3Link() {
		summerDresses3.click();
		return this;
	}

	/**
	 * Click on Supportseleniumframework.com Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickSupportseleniumframeworkComLink() {
		supportseleniumframeworkCom.click();
		return this;
	}

	/**
	 * Click on Terms And Conditions Of Use Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickTermsAndConditionsOfUseLink() {
		termsAndConditionsOfUse.click();
		return this;
	}

	/**
	 * Click on Tops Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickTops1Link() {
		tops1.click();
		return this;
	}

	/**
	 * Click on Tops Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickTops2Link() {
		tops2.click();
		return this;
	}

	/**
	 * Click on Tshirts Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickTshirts1Link() {
		tshirts1.click();
		return this;
	}

	/**
	 * Click on Tshirts Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickTshirts2Link() {
		tshirts2.click();
		return this;
	}

	/**
	 * Click on Tshirts Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickTshirts3Link() {
		tshirts3.click();
		return this;
	}

	/**
	 * Click on Twitter Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickTwitterLink() {
		twitter.click();
		return this;
	}

	/**
	 * Click on Women Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickWomen1Link() {
		women1.click();
		return this;
	}

	/**
	 * Click on Women Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickWomen2Link() {
		women2.click();
		return this;
	}

	/**
	 * Click on Youtube Link.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage clickYoutubeLink() {
		youtube.click();
		return this;
	}

	/**
	 * Fill every fields in the page.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage fill() {
		setProductSuccessfullyAddedToYourShoppingTextField();
		setEcommerceSoftwareByPrestashopTextField2014();
		return this;
	}

	/**
	 * Fill every fields in the page and submit it to target page.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage fillAndSubmit() {
		fill();
		return submit();
	}

	/**
	 * Set default value to 2014 Ecommerce Software By Prestashop Text field.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage setEcommerceSoftwareByPrestashopTextField2014() {
		return setEcommerceSoftwareByPrestashopTextField2014(data.get("ECOMMERCE_SOFTWARE_BY_PRESTASHOP_2014"));
	}

	/**
	 * Set value to 2014 Ecommerce Software By Prestashop Text field.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage setEcommerceSoftwareByPrestashopTextField2014(
			String ecommerceSoftwareByPrestashopValue2014) {
		ecommerceSoftwareByPrestashop2014.sendKeys(ecommerceSoftwareByPrestashopValue2014);
		return this;
	}

	/**
	 * Set default value to Product Successfully Added To Your Shopping Cart Text
	 * field.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage setProductSuccessfullyAddedToYourShoppingTextField() {
		return setProductSuccessfullyAddedToYourShoppingTextField(
				data.get("PRODUCT_SUCCESSFULLY_ADDED_TO_YOUR_SHOPPING"));
	}

	/**
	 * Set value to Product Successfully Added To Your Shopping Cart Text field.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage setProductSuccessfullyAddedToYourShoppingTextField(
			String productSuccessfullyAddedToYourShoppingValue) {
		productSuccessfullyAddedToYourShopping.sendKeys(productSuccessfullyAddedToYourShoppingValue);
		return this;
	}

	/**
	 * Submit the form to target page.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage submit() {
		clickSearchButton();
		return this;
	}

	/**
	 * Verify that the page loaded completely.
	 *
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage verifyPageLoaded() {
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
	 * @return the CreditSlipsPage class instance.
	 */
	public CreditSlipsPage verifyPageUrl() {
		(new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver d) {
				return d.getCurrentUrl().contains(pageUrl);
			}
		});
		return this;
	}
}
