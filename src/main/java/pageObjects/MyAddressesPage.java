package pageObjects;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAddressesPage {
	private Map<String, String> data;
	private WebDriver driver;
	private int timeout = 15;

	@FindBy(css = "a[title='About us']")
	@CacheLookup
	private WebElement aboutUs;

	@FindBy(css = "a[title='Add an address']")
	@CacheLookup
	private WebElement addANewAddress;

	@FindBy(css = "#center_column ul.footer_links.clearfix li:nth-of-type(1) a.btn.btn-defaul.button.button-small")
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

	@FindBy(css = "a[href='http://automationpractice.com/index.php?controller=address&id_address=101119&delete=']")
	@CacheLookup
	private WebElement delete1;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?controller=address&id_address=101120&delete=']")
	@CacheLookup
	private WebElement delete2;

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

	@FindBy(css = "#center_column ul.footer_links.clearfix li:nth-of-type(2) a.btn.btn-defaul.button.button-small")
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

	private final String pageLoadedText = "You may also add additional addresses, which can be useful for sending gifts or receiving an order at your office";

	private final String pageUrl = "/index.php?controller=addresses";

	@FindBy(css = "a[title='Proceed to checkout']")
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

	@FindBy(css = "a[href='http://automationpractice.com/index.php?controller=address&id_address=101119']")
	@CacheLookup
	private WebElement update1;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?controller=address&id_address=101120']")
	@CacheLookup
	private WebElement update2;

	@FindBy(css = "a[title='Women']")
	@CacheLookup
	private WebElement women1;

	@FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last a")
	@CacheLookup
	private WebElement women2;

	@FindBy(css = "a[href='https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA']")
	@CacheLookup
	private WebElement youtube;

	public MyAddressesPage() {
	}

	public MyAddressesPage(WebDriver driver) {
		this();
		this.driver = driver;
	}

	public MyAddressesPage(WebDriver driver, Map<String, String> data) {
		this(driver);
		this.data = data;
	}

	public MyAddressesPage(WebDriver driver, Map<String, String> data, int timeout) {
		this(driver, data);
		this.timeout = timeout;
	}

	/**
	 * Click on About Us Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickAboutUsLink() {
		aboutUs.click();
		return this;
	}

	/**
	 * Click on Add A New Address Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickAddANewAddressLink() {
		addANewAddress.click();
		return this;
	}

	/**
	 * Click on Back To Your Account Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickBackToYourAccountLink() {
		backToYourAccount.click();
		return this;
	}

	/**
	 * Click on Best Sellers Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickBestSellersLink() {
		bestSellers.click();
		return this;
	}

	/**
	 * Click on Blouses Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickBlouses1Link() {
		blouses1.click();
		return this;
	}

	/**
	 * Click on Blouses Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickBlouses2Link() {
		blouses2.click();
		return this;
	}

	/**
	 * Click on Cart 0 Product Products Empty Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickCart0ProductProductsEmptyLink() {
		cart0ProductProductsEmpty.click();
		return this;
	}

	/**
	 * Click on Casual Dresses Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickCasualDresses1Link() {
		casualDresses1.click();
		return this;
	}

	/**
	 * Click on Casual Dresses Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickCasualDresses2Link() {
		casualDresses2.click();
		return this;
	}

	/**
	 * Click on Casual Dresses Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickCasualDresses3Link() {
		casualDresses3.click();
		return this;
	}

	/**
	 * Click on Check Out Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickCheckOutLink() {
		checkOut.click();
		return this;
	}

	/**
	 * Click on Contact Us Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickContactUs1Link() {
		contactUs1.click();
		return this;
	}

	/**
	 * Click on Contact Us Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickContactUs2Link() {
		contactUs2.click();
		return this;
	}

	/**
	 * Click on Delete Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickDelete1Link() {
		delete1.click();
		return this;
	}

	/**
	 * Click on Delete Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickDelete2Link() {
		delete2.click();
		return this;
	}

	/**
	 * Click on Dresses Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickDresses1Link() {
		dresses1.click();
		return this;
	}

	/**
	 * Click on Dresses Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickDresses2Link() {
		dresses2.click();
		return this;
	}

	/**
	 * Click on Dresses Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickDresses3Link() {
		dresses3.click();
		return this;
	}

	/**
	 * Click on Ecommerce Software By Prestashop Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickEcommerceSoftwareByPrestashopLink() {
		ecommerceSoftwareByPrestashop.click();
		return this;
	}

	/**
	 * Click on Evening Dresses Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickEveningDresses1Link() {
		eveningDresses1.click();
		return this;
	}

	/**
	 * Click on Evening Dresses Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickEveningDresses2Link() {
		eveningDresses2.click();
		return this;
	}

	/**
	 * Click on Evening Dresses Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickEveningDresses3Link() {
		eveningDresses3.click();
		return this;
	}

	/**
	 * Click on Facebook Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickFacebookLink() {
		facebook.click();
		return this;
	}

	/**
	 * Click on Frodo Lastname Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickFrodoLastnameLink() {
		frodoLastname.click();
		return this;
	}

	/**
	 * Click on Google Plus Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickGooglePlusLink() {
		googlePlus.click();
		return this;
	}

	/**
	 * Click on Home Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickHomeLink() {
		home.click();
		return this;
	}

	/**
	 * Click on My Account Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickMyAccount1Link() {
		myAccount1.click();
		return this;
	}

	/**
	 * Click on My Account Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickMyAccount2Link() {
		myAccount2.click();
		return this;
	}

	/**
	 * Click on My Addresses Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickMyAddressesLink() {
		myAddresses.click();
		return this;
	}

	/**
	 * Click on My Credit Slips Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickMyCreditSlipsLink() {
		myCreditSlips.click();
		return this;
	}

	/**
	 * Click on My Orders Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickMyOrdersLink() {
		myOrders.click();
		return this;
	}

	/**
	 * Click on My Personal Info Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickMyPersonalInfoLink() {
		myPersonalInfo.click();
		return this;
	}

	/**
	 * Click on New Products Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickNewProductsLink() {
		newProducts.click();
		return this;
	}

	/**
	 * Click on Ok Button.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickOkButton() {
		ok.click();
		return this;
	}

	/**
	 * Click on Our Stores Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickOurStoresLink() {
		ourStores.click();
		return this;
	}

	/**
	 * Click on Proceed To Checkout Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickProceedToCheckoutLink() {
		proceedToCheckout.click();
		return this;
	}

	/**
	 * Click on Search Button.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickSearchButton() {
		search.click();
		return this;
	}

	/**
	 * Click on Sign Out Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickSignOut1Link() {
		signOut1.click();
		return this;
	}

	/**
	 * Click on Sign Out Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickSignOut2Link() {
		signOut2.click();
		return this;
	}

	/**
	 * Click on Sitemap Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickSitemapLink() {
		sitemap.click();
		return this;
	}

	/**
	 * Click on Specials Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickSpecialsLink() {
		specials.click();
		return this;
	}

	/**
	 * Click on Summer Dresses Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickSummerDresses1Link() {
		summerDresses1.click();
		return this;
	}

	/**
	 * Click on Summer Dresses Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickSummerDresses2Link() {
		summerDresses2.click();
		return this;
	}

	/**
	 * Click on Summer Dresses Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickSummerDresses3Link() {
		summerDresses3.click();
		return this;
	}

	/**
	 * Click on Supportseleniumframework.com Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickSupportseleniumframeworkComLink() {
		supportseleniumframeworkCom.click();
		return this;
	}

	/**
	 * Click on Terms And Conditions Of Use Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickTermsAndConditionsOfUseLink() {
		termsAndConditionsOfUse.click();
		return this;
	}

	/**
	 * Click on Tops Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickTops1Link() {
		tops1.click();
		return this;
	}

	/**
	 * Click on Tops Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickTops2Link() {
		tops2.click();
		return this;
	}

	/**
	 * Click on Tshirts Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickTshirts1Link() {
		tshirts1.click();
		return this;
	}

	/**
	 * Click on Tshirts Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickTshirts2Link() {
		tshirts2.click();
		return this;
	}

	/**
	 * Click on Tshirts Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickTshirts3Link() {
		tshirts3.click();
		return this;
	}

	/**
	 * Click on Twitter Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickTwitterLink() {
		twitter.click();
		return this;
	}

	/**
	 * Click on Update Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickUpdate1Link() {
		update1.click();
		return this;
	}

	/**
	 * Click on Update Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickUpdate2Link() {
		update2.click();
		return this;
	}

	/**
	 * Click on Women Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickWomen1Link() {
		women1.click();
		return this;
	}

	/**
	 * Click on Women Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickWomen2Link() {
		women2.click();
		return this;
	}

	/**
	 * Click on Youtube Link.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage clickYoutubeLink() {
		youtube.click();
		return this;
	}

	/**
	 * Fill every fields in the page.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage fill() {
		setProductSuccessfullyAddedToYourShoppingTextField();
		setEcommerceSoftwareByPrestashopTextField2014();
		return this;
	}

	/**
	 * Fill every fields in the page and submit it to target page.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage fillAndSubmit() {
		fill();
		return submit();
	}

	/**
	 * Set default value to 2014 Ecommerce Software By Prestashop Text field.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage setEcommerceSoftwareByPrestashopTextField2014() {
		return setEcommerceSoftwareByPrestashopTextField2014(data.get("ECOMMERCE_SOFTWARE_BY_PRESTASHOP_2014"));
	}

	/**
	 * Set value to 2014 Ecommerce Software By Prestashop Text field.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage setEcommerceSoftwareByPrestashopTextField2014(
			String ecommerceSoftwareByPrestashopValue2014) {
		ecommerceSoftwareByPrestashop2014.sendKeys(ecommerceSoftwareByPrestashopValue2014);
		return this;
	}

	/**
	 * Set default value to Product Successfully Added To Your Shopping Cart Text
	 * field.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage setProductSuccessfullyAddedToYourShoppingTextField() {
		return setProductSuccessfullyAddedToYourShoppingTextField(
				data.get("PRODUCT_SUCCESSFULLY_ADDED_TO_YOUR_SHOPPING"));
	}

	/**
	 * Set value to Product Successfully Added To Your Shopping Cart Text field.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage setProductSuccessfullyAddedToYourShoppingTextField(
			String productSuccessfullyAddedToYourShoppingValue) {
		productSuccessfullyAddedToYourShopping.sendKeys(productSuccessfullyAddedToYourShoppingValue);
		return this;
	}

	/**
	 * Submit the form to target page.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage submit() {
		clickSearchButton();
		return this;
	}

	/**
	 * Verify that the page loaded completely.
	 *
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage verifyPageLoaded() {
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
	 * @return the MyAddressesPage class instance.
	 */
	public MyAddressesPage verifyPageUrl() {
		(new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver d) {
				return d.getCurrentUrl().contains(pageUrl);
			}
		});
		return this;
	}
}
