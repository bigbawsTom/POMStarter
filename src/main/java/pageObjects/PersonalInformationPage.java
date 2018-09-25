package pageObjects;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PersonalInformationPage {
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

	@FindBy(id = "confirmation")
	@CacheLookup
	private WebElement confirmation;

	@FindBy(css = "a[title='Contact Us']")
	@CacheLookup
	private WebElement contactUs1;

	@FindBy(css = "a[title='Contact us']")
	@CacheLookup
	private WebElement contactUs2;

	@FindBy(id = "old_passwd")
	@CacheLookup
	private WebElement currentPassword;

	@FindBy(id = "days")
	@CacheLookup
	private WebElement dateOfBirth1;

	@FindBy(id = "months")
	@CacheLookup
	private WebElement dateOfBirth2;

	@FindBy(id = "years")
	@CacheLookup
	private WebElement dateOfBirth3;

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

	@FindBy(id = "email")
	@CacheLookup
	private WebElement emailAddress1;

	@FindBy(id = "newsletter-input")
	@CacheLookup
	private WebElement emailAddress2;

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

	@FindBy(id = "firstname")
	@CacheLookup
	private WebElement firstName;

	@FindBy(css = "a.account")
	@CacheLookup
	private WebElement userName;

	@FindBy(css = "a[href='https://plus.google.com/111979135243110831526/posts']")
	@CacheLookup
	private WebElement googlePlus;

	@FindBy(css = "#center_column ul.footer_links.clearfix li:nth-of-type(2) a.btn.btn-default.button.button-small")
	@CacheLookup
	private WebElement home;

	@FindBy(id = "lastname")
	@CacheLookup
	private WebElement lastName;

	@FindBy(name = "id_gender")
	@CacheLookup
	private List<WebElement> mr;

	private final String mrValue = "1";

	@FindBy(name = "id_gender")
	@CacheLookup
	private List<WebElement> mrs;

	private final String mrsValue = "2";

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

	@FindBy(id = "passwd")
	@CacheLookup
	private WebElement newPassword;

	@FindBy(css = "a[title='New products']")
	@CacheLookup
	private WebElement newProducts;

	@FindBy(name = "submitNewsletter")
	@CacheLookup
	private WebElement ok;

	@FindBy(css = "a[title='Our stores']")
	@CacheLookup
	private WebElement ourStores;

	private final String pageLoadedText = "Please be sure to update your personal information if it has changed";

	private final String pageUrl = "/index.php?controller=identity";

	@FindBy(css = "a.btn.btn-default.button.button-medium")
	@CacheLookup
	private WebElement proceedToCheckout;

	@FindBy(id = "search_query_top")
	@CacheLookup
	private WebElement productSuccessfullyAddedToYourShopping;

	@FindBy(id = "optin")
	@CacheLookup
	private WebElement receiveSpecialOffersFromOurPartners;

	@FindBy(name = "submitIdentity")
	@CacheLookup
	private WebElement save;

	@FindBy(name = "submit_search")
	@CacheLookup
	private WebElement search;

	@FindBy(css = "a.logout")
	@CacheLookup
	private WebElement signOut1;

	@FindBy(css = "a[title='Sign out']")
	@CacheLookup
	private WebElement signOut2;

	@FindBy(id = "newsletter")
	@CacheLookup
	private WebElement signUpForOurNewsletter;

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

	public PersonalInformationPage() {
	}

	public PersonalInformationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public PersonalInformationPage(WebDriver driver, Map<String, String> data) {
		this(driver);
		this.data = data;
	}

	public PersonalInformationPage(WebDriver driver, Map<String, String> data, int timeout) {
		this(driver, data);
		this.timeout = timeout;
	}

	/**
	 * Click on About Us Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickAboutUsLink() {
		aboutUs.click();
		return this;
	}

	/**
	 * Click on Back To Your Account Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickBackToYourAccountLink() {
		backToYourAccount.click();
		return this;
	}

	/**
	 * Click on Best Sellers Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickBestSellersLink() {
		bestSellers.click();
		return this;
	}

	public PersonalInformationPage clear(String field) {
		switch (field.toLowerCase()) {
		case "first name":
			firstName.clear();
			break;
		default:
			System.out.println("field " + field + " not an option, please add if valid");
			break;
		}

		return this;
	}

	/**
	 * Click on Blouses Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickBlouses1Link() {
		blouses1.click();
		return this;
	}

	/**
	 * Click on Blouses Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickBlouses2Link() {
		blouses2.click();
		return this;
	}

	/**
	 * Click on Cart 0 Product Products Empty Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickCart0ProductProductsEmptyLink() {
		cart0ProductProductsEmpty.click();
		return this;
	}

	/**
	 * Click on Casual Dresses Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickCasualDresses1Link() {
		casualDresses1.click();
		return this;
	}

	/**
	 * Click on Casual Dresses Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickCasualDresses2Link() {
		casualDresses2.click();
		return this;
	}

	/**
	 * Click on Casual Dresses Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickCasualDresses3Link() {
		casualDresses3.click();
		return this;
	}

	/**
	 * Click on Check Out Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickCheckOutLink() {
		checkOut.click();
		return this;
	}

	/**
	 * Click on Contact Us Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickContactUs1Link() {
		contactUs1.click();
		return this;
	}

	/**
	 * Click on Contact Us Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickContactUs2Link() {
		contactUs2.click();
		return this;
	}

	/**
	 * Click on Dresses Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickDresses1Link() {
		dresses1.click();
		return this;
	}

	/**
	 * Click on Dresses Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickDresses2Link() {
		dresses2.click();
		return this;
	}

	/**
	 * Click on Dresses Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickDresses3Link() {
		dresses3.click();
		return this;
	}

	/**
	 * Click on Ecommerce Software By Prestashop Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickEcommerceSoftwareByPrestashopLink() {
		ecommerceSoftwareByPrestashop.click();
		return this;
	}

	/**
	 * Click on Evening Dresses Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickEveningDresses1Link() {
		eveningDresses1.click();
		return this;
	}

	/**
	 * Click on Evening Dresses Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickEveningDresses2Link() {
		eveningDresses2.click();
		return this;
	}

	/**
	 * Click on Evening Dresses Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickEveningDresses3Link() {
		eveningDresses3.click();
		return this;
	}

	/**
	 * Click on Facebook Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickFacebookLink() {
		facebook.click();
		return this;
	}

	public String getuserName() {
		String name = userName.getText();
		return name;
	}

	/**
	 * Click on Google Plus Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickGooglePlusLink() {
		googlePlus.click();
		return this;
	}

	/**
	 * Click on Home Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickHomeLink() {
		home.click();
		return this;
	}

	/**
	 * Click on My Account Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickMyAccount1Link() {
		myAccount1.click();
		return this;
	}

	/**
	 * Click on My Account Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickMyAccount2Link() {
		myAccount2.click();
		return this;
	}

	/**
	 * Click on My Addresses Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickMyAddressesLink() {
		myAddresses.click();
		return this;
	}

	/**
	 * Click on My Credit Slips Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickMyCreditSlipsLink() {
		myCreditSlips.click();
		return this;
	}

	/**
	 * Click on My Orders Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickMyOrdersLink() {
		myOrders.click();
		return this;
	}

	/**
	 * Click on My Personal Info Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickMyPersonalInfoLink() {
		myPersonalInfo.click();
		return this;
	}

	/**
	 * Click on New Products Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickNewProductsLink() {
		newProducts.click();
		return this;
	}

	/**
	 * Click on Ok Button.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickOkButton() {
		ok.click();
		return this;
	}

	/**
	 * Click on Our Stores Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickOurStoresLink() {
		ourStores.click();
		return this;
	}

	/**
	 * Click on Proceed To Checkout Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickProceedToCheckoutLink() {
		proceedToCheckout.click();
		return this;
	}

	/**
	 * Click on Save Button.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickSaveButton() {
		save.click();
		return this;
	}

	/**
	 * Click on Search Button.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickSearchButton() {
		search.click();
		return this;
	}

	/**
	 * Click on Sign Out Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickSignOut1Link() {
		signOut1.click();
		return this;
	}

	/**
	 * Click on Sign Out Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickSignOut2Link() {
		signOut2.click();
		return this;
	}

	/**
	 * Click on Sitemap Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickSitemapLink() {
		sitemap.click();
		return this;
	}

	/**
	 * Click on Specials Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickSpecialsLink() {
		specials.click();
		return this;
	}

	/**
	 * Click on Summer Dresses Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickSummerDresses1Link() {
		summerDresses1.click();
		return this;
	}

	/**
	 * Click on Summer Dresses Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickSummerDresses2Link() {
		summerDresses2.click();
		return this;
	}

	/**
	 * Click on Summer Dresses Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickSummerDresses3Link() {
		summerDresses3.click();
		return this;
	}

	/**
	 * Click on Supportseleniumframework.com Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickSupportseleniumframeworkComLink() {
		supportseleniumframeworkCom.click();
		return this;
	}

	/**
	 * Click on Terms And Conditions Of Use Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickTermsAndConditionsOfUseLink() {
		termsAndConditionsOfUse.click();
		return this;
	}

	/**
	 * Click on Tops Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickTops1Link() {
		tops1.click();
		return this;
	}

	/**
	 * Click on Tops Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickTops2Link() {
		tops2.click();
		return this;
	}

	/**
	 * Click on Tshirts Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickTshirts1Link() {
		tshirts1.click();
		return this;
	}

	/**
	 * Click on Tshirts Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickTshirts2Link() {
		tshirts2.click();
		return this;
	}

	/**
	 * Click on Tshirts Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickTshirts3Link() {
		tshirts3.click();
		return this;
	}

	/**
	 * Click on Twitter Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickTwitterLink() {
		twitter.click();
		return this;
	}

	/**
	 * Click on Women Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickWomen1Link() {
		women1.click();
		return this;
	}

	/**
	 * Click on Women Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickWomen2Link() {
		women2.click();
		return this;
	}

	/**
	 * Click on Youtube Link.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage clickYoutubeLink() {
		youtube.click();
		return this;
	}

	/**
	 * Fill every fields in the page.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage fill() {
		setProductSuccessfullyAddedToYourShoppingTextField();
		setMrRadioButtonField();
		setMrsRadioButtonField();
		setFirstNameTextField();
		setLastNameTextField();
		setEmailAddress1TextField();
		setDateOfBirth1DropDownListField();
		setDateOfBirth2DropDownListField();
		setDateOfBirth3DropDownListField();
		setCurrentPasswordPasswordField();
		setNewPasswordPasswordField();
		setConfirmationPasswordField();
		setSignUpForOurNewsletterCheckboxField();
		setReceiveSpecialOffersFromOurPartnersCheckboxField();
		setEmailAddress2TextField();
		return this;
	}

	/**
	 * Fill every fields in the page and submit it to target page.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage fillAndSubmit() {
		fill();
		return submit();
	}

	/**
	 * Set default value to Confirmation Password field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage setConfirmationPasswordField() {
		return setConfirmationPasswordField(data.get("CONFIRMATION"));
	}

	/**
	 * Set value to Confirmation Password field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage setConfirmationPasswordField(String confirmationValue) {
		confirmation.sendKeys(confirmationValue);
		return this;
	}

	/**
	 * Set default value to Current Password Password field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage setCurrentPasswordPasswordField() {
		return setCurrentPasswordPasswordField(data.get("CURRENT_PASSWORD"));
	}

	/**
	 * Set value to Current Password Password field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage setCurrentPasswordPasswordField(String currentPasswordValue) {
		currentPassword.sendKeys(currentPasswordValue);
		return this;
	}

	/**
	 * Set default value to Date Of Birth Drop Down List field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage setDateOfBirth1DropDownListField() {
		return setDateOfBirth1DropDownListField(data.get("DATE_OF_BIRTH_1"));
	}

	/**
	 * Set value to Date Of Birth Drop Down List field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage setDateOfBirth1DropDownListField(String dateOfBirth1Value) {
		new Select(dateOfBirth1).selectByVisibleText(dateOfBirth1Value);
		return this;
	}

	/**
	 * Set default value to Date Of Birth Drop Down List field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage setDateOfBirth2DropDownListField() {
		return setDateOfBirth2DropDownListField(data.get("DATE_OF_BIRTH_2"));
	}

	/**
	 * Set value to Date Of Birth Drop Down List field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage setDateOfBirth2DropDownListField(String dateOfBirth2Value) {
		new Select(dateOfBirth2).selectByVisibleText(dateOfBirth2Value);
		return this;
	}

	/**
	 * Set default value to Date Of Birth Drop Down List field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage setDateOfBirth3DropDownListField() {
		return setDateOfBirth3DropDownListField(data.get("DATE_OF_BIRTH_3"));
	}

	/**
	 * Set value to Date Of Birth Drop Down List field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage setDateOfBirth3DropDownListField(String dateOfBirth3Value) {
		new Select(dateOfBirth3).selectByVisibleText(dateOfBirth3Value);
		return this;
	}

	/**
	 * Set default value to Email Address Text field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage setEmailAddress1TextField() {
		return setEmailAddress1TextField(data.get("EMAIL_ADDRESS_1"));
	}

	/**
	 * Set value to Email Address Text field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage setEmailAddress1TextField(String emailAddress1Value) {
		emailAddress1.sendKeys(emailAddress1Value);
		return this;
	}

	/**
	 * Set default value to Email Address Text field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage setEmailAddress2TextField() {
		return setEmailAddress2TextField(data.get("EMAIL_ADDRESS_2"));
	}

	/**
	 * Set value to Email Address Text field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage setEmailAddress2TextField(String emailAddress2Value) {
		emailAddress2.sendKeys(emailAddress2Value);
		return this;
	}

	/**
	 * Set default value to First Name Text field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage setFirstNameTextField() {
		return setFirstNameTextField(data.get("FIRST_NAME"));
	}

	/**
	 * Set value to First Name Text field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage setFirstNameTextField(String firstNameValue) {
		firstName.sendKeys(firstNameValue);
		return this;
	}

	/**
	 * Set default value to Last Name Text field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage setLastNameTextField() {
		return setLastNameTextField(data.get("LAST_NAME"));
	}

	/**
	 * Set value to Last Name Text field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage setLastNameTextField(String lastNameValue) {
		lastName.sendKeys(lastNameValue);
		return this;
	}

	/**
	 * Set default value to Mr. Radio Button field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage setMrRadioButtonField() {
		for (WebElement el : mr) {
			if (el.getAttribute("value").equals(mrValue)) {
				if (!el.isSelected()) {
					el.click();
				}
				break;
			}
		}
		return this;
	}

	/**
	 * Set default value to Mrs. Radio Button field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage setMrsRadioButtonField() {
		for (WebElement el : mrs) {
			if (el.getAttribute("value").equals(mrsValue)) {
				if (!el.isSelected()) {
					el.click();
				}
				break;
			}
		}
		return this;
	}

	/**
	 * Set default value to New Password Password field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage setNewPasswordPasswordField() {
		return setNewPasswordPasswordField(data.get("NEW_PASSWORD"));
	}

	/**
	 * Set value to New Password Password field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage setNewPasswordPasswordField(String newPasswordValue) {
		newPassword.sendKeys(newPasswordValue);
		return this;
	}

	/**
	 * Set default value to Product Successfully Added To Your Shopping Cart Text
	 * field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage setProductSuccessfullyAddedToYourShoppingTextField() {
		return setProductSuccessfullyAddedToYourShoppingTextField(
				data.get("PRODUCT_SUCCESSFULLY_ADDED_TO_YOUR_SHOPPING"));
	}

	/**
	 * Set value to Product Successfully Added To Your Shopping Cart Text field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage setProductSuccessfullyAddedToYourShoppingTextField(
			String productSuccessfullyAddedToYourShoppingValue) {
		productSuccessfullyAddedToYourShopping.sendKeys(productSuccessfullyAddedToYourShoppingValue);
		return this;
	}

	/**
	 * Set Receive Special Offers From Our Partners Checkbox field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage setReceiveSpecialOffersFromOurPartnersCheckboxField() {
		if (!receiveSpecialOffersFromOurPartners.isSelected()) {
			receiveSpecialOffersFromOurPartners.click();
		}
		return this;
	}

	/**
	 * Set Sign Up For Our Newsletter Checkbox field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage setSignUpForOurNewsletterCheckboxField() {
		if (!signUpForOurNewsletter.isSelected()) {
			signUpForOurNewsletter.click();
		}
		return this;
	}

	/**
	 * Submit the form to target page.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage submit() {
		clickSearchButton();
		return this;
	}

	/**
	 * Unset default value from Date Of Birth Drop Down List field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage unsetDateOfBirth1DropDownListField() {
		return unsetDateOfBirth1DropDownListField(data.get("DATE_OF_BIRTH_1"));
	}

	/**
	 * Unset value from Date Of Birth Drop Down List field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage unsetDateOfBirth1DropDownListField(String dateOfBirth1Value) {
		new Select(dateOfBirth1).deselectByVisibleText(dateOfBirth1Value);
		return this;
	}

	/**
	 * Unset default value from Date Of Birth Drop Down List field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage unsetDateOfBirth2DropDownListField() {
		return unsetDateOfBirth2DropDownListField(data.get("DATE_OF_BIRTH_2"));
	}

	/**
	 * Unset value from Date Of Birth Drop Down List field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage unsetDateOfBirth2DropDownListField(String dateOfBirth2Value) {
		new Select(dateOfBirth2).deselectByVisibleText(dateOfBirth2Value);
		return this;
	}

	/**
	 * Unset default value from Date Of Birth Drop Down List field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage unsetDateOfBirth3DropDownListField() {
		return unsetDateOfBirth3DropDownListField(data.get("DATE_OF_BIRTH_3"));
	}

	/**
	 * Unset value from Date Of Birth Drop Down List field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage unsetDateOfBirth3DropDownListField(String dateOfBirth3Value) {
		new Select(dateOfBirth3).deselectByVisibleText(dateOfBirth3Value);
		return this;
	}

	/**
	 * Unset Receive Special Offers From Our Partners Checkbox field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage unsetReceiveSpecialOffersFromOurPartnersCheckboxField() {
		if (receiveSpecialOffersFromOurPartners.isSelected()) {
			receiveSpecialOffersFromOurPartners.click();
		}
		return this;
	}

	/**
	 * Unset Sign Up For Our Newsletter Checkbox field.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage unsetSignUpForOurNewsletterCheckboxField() {
		if (signUpForOurNewsletter.isSelected()) {
			signUpForOurNewsletter.click();
		}
		return this;
	}

	/**
	 * Verify that the page loaded completely.
	 *
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage verifyPageLoaded() {
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
	 * @return the PersonalInformationPage class instance.
	 */
	public PersonalInformationPage verifyPageUrl() {
		(new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver d) {
				return d.getCurrentUrl().contains(pageUrl);
			}
		});
		return this;
	}
}
