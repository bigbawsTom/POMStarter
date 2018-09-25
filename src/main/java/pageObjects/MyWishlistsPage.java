package pageObjects;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyWishlistsPage {
	private Map<String, String> data;
	private WebDriver driver;
	private int timeout = 15;

	@FindBy(css = "#informations_block_left_1 div.block_content.list-block ul li:nth-of-type(4) a")
	@CacheLookup
	private WebElement aboutUs1;

	@FindBy(css = "#block_various_links_footer ul.toggle-footer li:nth-of-type(7) a")
	@CacheLookup
	private WebElement aboutUs2;

	@FindBy(css = "a[title='All best sellers']")
	@CacheLookup
	private WebElement allBestSellers;

	@FindBy(css = "a[title='All specials']")
	@CacheLookup
	private WebElement allSpecials;

	@FindBy(css = "#mywishlist ul.footer_links.clearfix li:nth-of-type(1) a.btn.btn-default.button.button-small")
	@CacheLookup
	private WebElement backToYourAccount;

	@FindBy(css = "a[title='Best sellers']")
	@CacheLookup
	private WebElement bestSellers;

	@FindBy(css = "#best-sellers_block_right div.block_content ul.block_content.products-block li:nth-of-type(3) div.product-content h5 a.product-name")
	@CacheLookup
	private WebElement blouse;

	@FindBy(css = "a[title='Blouses']")
	@CacheLookup
	private WebElement blouses1;

	@FindBy(css = "#categories_block_left div.block_content ul.tree.dynamized li.last ul li:nth-of-type(1) ul li:nth-of-type(2) a")
	@CacheLookup
	private WebElement blouses2;

	@FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(1) ul li:nth-of-type(2) a")
	@CacheLookup
	private WebElement blouses3;

	@FindBy(css = "a[title='View my shopping cart']")
	@CacheLookup
	private WebElement cart0ProductProductsEmpty;

	@FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) ul li:nth-of-type(1) a")
	@CacheLookup
	private WebElement casualDresses1;

	@FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(1) a")
	@CacheLookup
	private WebElement casualDresses2;

	@FindBy(css = "#categories_block_left div.block_content ul.tree.dynamized li.last ul li:nth-of-type(2) ul li:nth-of-type(1) a")
	@CacheLookup
	private WebElement casualDresses3;

	@FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(2) ul li:nth-of-type(1) a")
	@CacheLookup
	private WebElement casualDresses4;

	@FindBy(id = "button_order_cart")
	@CacheLookup
	private WebElement checkOut;

	@FindBy(css = "a[title='Contact Us']")
	@CacheLookup
	private WebElement contactUs1;

	@FindBy(css = "a[title='Contact us']")
	@CacheLookup
	private WebElement contactUs2;

	@FindBy(css = "a[title='Delivery']")
	@CacheLookup
	private WebElement delivery;

	@FindBy(css = "#stores_block_left div.block_content.blockstore div a.btn.btn-default.button.button-small")
	@CacheLookup
	private WebElement discoverOurStores;

	@FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) a.sf-with-ul")
	@CacheLookup
	private WebElement dresses1;

	@FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) a.sf-with-ul")
	@CacheLookup
	private WebElement dresses2;

	@FindBy(css = "#categories_block_left div.block_content ul.tree.dynamized li.last ul li:nth-of-type(2) a")
	@CacheLookup
	private WebElement dresses3;

	@FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(2) a")
	@CacheLookup
	private WebElement dresses4;

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

	@FindBy(css = "#categories_block_left div.block_content ul.tree.dynamized li.last ul li:nth-of-type(2) ul li:nth-of-type(2) a")
	@CacheLookup
	private WebElement eveningDresses3;

	@FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(2) ul li:nth-of-type(2) a")
	@CacheLookup
	private WebElement eveningDresses4;

	@FindBy(css = "a[href='https://www.facebook.com/groups/525066904174158/']")
	@CacheLookup
	private WebElement facebook;

	@FindBy(css = "#viewed-products_block_left div.block_content.products-block ul li.clearfix.last_item div.product-content h5 a.product-name")
	@CacheLookup
	private WebElement fadedShortSleeve;

	@FindBy(css = "#best-sellers_block_right div.block_content ul.block_content.products-block li:nth-of-type(2) div.product-content h5 a.product-name")
	@CacheLookup
	private WebElement fadedShortSleeveTshirts;

	@FindBy(css = "a[title='More about Fashion Manufacturer']")
	@CacheLookup
	private WebElement fashionManufacturer;

	@FindBy(css = "a[title='More about Fashion Supplier']")
	@CacheLookup
	private WebElement fashionSupplier;

	@FindBy(css = "a.account")
	@CacheLookup
	private WebElement frodoLastname;

	@FindBy(css = "a[href='https://plus.google.com/111979135243110831526/posts']")
	@CacheLookup
	private WebElement googlePlus;

	@FindBy(css = "#mywishlist ul.footer_links.clearfix li:nth-of-type(2) a.btn.btn-default.button.button-small")
	@CacheLookup
	private WebElement home;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_cms_category=1&controller=cms']")
	@CacheLookup
	private WebElement information;

	@FindBy(css = "a[title='Legal Notice']")
	@CacheLookup
	private WebElement legalNotice;

	@FindBy(css = "a[title='Manufacturers']")
	@CacheLookup
	private WebElement manufacturers;

	@FindBy(css = "#columns div:nth-of-type(1) a:nth-of-type(2)")
	@CacheLookup
	private WebElement myAccount1;

	@FindBy(css = "a[title='My account']")
	@CacheLookup
	private WebElement myAccount2;

	@FindBy(css = "a[title='Manage my customer account']")
	@CacheLookup
	private WebElement myAccount3;

	@FindBy(css = "#left_column div:nth-of-type(4) div.block_content.list-block ul li:nth-of-type(3) a")
	@CacheLookup
	private WebElement myAddresses1;

	@FindBy(css = "#footer div.row section:nth-of-type(5) div.block_content.toggle-footer ul.bullet li:nth-of-type(3) a")
	@CacheLookup
	private WebElement myAddresses2;

	@FindBy(css = "#left_column div:nth-of-type(4) div.block_content.list-block ul li:nth-of-type(2) a")
	@CacheLookup
	private WebElement myCreditSlips1;

	@FindBy(css = "#footer div.row section:nth-of-type(5) div.block_content.toggle-footer ul.bullet li:nth-of-type(2) a")
	@CacheLookup
	private WebElement myCreditSlips2;

	@FindBy(css = "#left_column div:nth-of-type(4) div.block_content.list-block ul li:nth-of-type(1) a")
	@CacheLookup
	private WebElement myOrders1;

	@FindBy(css = "#footer div.row section:nth-of-type(5) div.block_content.toggle-footer ul.bullet li:nth-of-type(1) a")
	@CacheLookup
	private WebElement myOrders2;

	@FindBy(css = "a[title='My personal info']")
	@CacheLookup
	private WebElement myPersonalInfo1;

	@FindBy(css = "a[title='Manage my personal information']")
	@CacheLookup
	private WebElement myPersonalInfo2;

	@FindBy(css = "#wishlist_3036 td:nth-of-type(1) a")
	@CacheLookup
	private WebElement myWishlist;

	@FindBy(css = "a[title='My wishlists']")
	@CacheLookup
	private WebElement myWishlists;

	@FindBy(id = "name")
	@CacheLookup
	private WebElement name;

	@FindBy(css = "a[title='New products']")
	@CacheLookup
	private WebElement newProducts;

	@FindBy(name = "submitNewsletter")
	@CacheLookup
	private WebElement ok;

	@FindBy(css = "#informations_block_left_1 div.block_content.list-block ul li:nth-of-type(6) a")
	@CacheLookup
	private WebElement ourStores1;

	@FindBy(css = "#stores_block_left p.title_block a")
	@CacheLookup
	private WebElement ourStores2;

	@FindBy(css = "#block_various_links_footer ul.toggle-footer li:nth-of-type(4) a")
	@CacheLookup
	private WebElement ourStores3;

	private final String pageLoadedText = "Printed chiffon knee length dress with tank straps";

	private final String pageUrl = "/index.php?fc=module&module=blockwishlist&controller=mywishlist";

	@FindBy(css = "#best-sellers_block_right div.block_content ul.block_content.products-block li:nth-of-type(1) div.product-content h5 a.product-name")
	@CacheLookup
	private WebElement printedChiffonDress;

	@FindBy(css = "#best-sellers_block_right div.block_content ul.block_content.products-block li:nth-of-type(5) div.product-content h5 a.product-name")
	@CacheLookup
	private WebElement printedDress1;

	@FindBy(css = "#best-sellers_block_right div.block_content ul.block_content.products-block li:nth-of-type(7) div.product-content h5 a.product-name")
	@CacheLookup
	private WebElement printedDress2;

	@FindBy(css = "#best-sellers_block_right div.block_content ul.block_content.products-block li:nth-of-type(4) div.product-content h5 a.product-name")
	@CacheLookup
	private WebElement printedSummerDress1;

	@FindBy(css = "#best-sellers_block_right div.block_content ul.block_content.products-block li:nth-of-type(6) div.product-content h5 a.product-name")
	@CacheLookup
	private WebElement printedSummerDress2;

	@FindBy(css = "a[title='Printed Summer Dress']")
	@CacheLookup
	private WebElement printedSummerDress3;

	@FindBy(css = "a.btn.btn-default.button.button-medium")
	@CacheLookup
	private WebElement proceedToCheckout;

	@FindBy(id = "search_query_top")
	@CacheLookup
	private WebElement productSuccessfullyAddedToYourShopping;

	@FindBy(id = "submitWishlist")
	@CacheLookup
	private WebElement save;

	@FindBy(name = "submit_search")
	@CacheLookup
	private WebElement search;

	@FindBy(css = "a[title='Secure payment']")
	@CacheLookup
	private WebElement securePayment;

	@FindBy(css = "a.logout")
	@CacheLookup
	private WebElement signOut1;

	@FindBy(css = "#left_column div:nth-of-type(4) div.block_content.list-block div.logout a.btn.btn-default.button.button-small")
	@CacheLookup
	private WebElement signOut2;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?mylogout']")
	@CacheLookup
	private WebElement signOut3;

	@FindBy(css = "a[title='Sitemap']")
	@CacheLookup
	private WebElement sitemap;

	@FindBy(css = "#special_block_right p.title_block a")
	@CacheLookup
	private WebElement specials1;

	@FindBy(css = "#block_various_links_footer ul.toggle-footer li:nth-of-type(1) a")
	@CacheLookup
	private WebElement specials2;

	@FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) ul li:nth-of-type(3) a")
	@CacheLookup
	private WebElement summerDresses1;

	@FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(3) a")
	@CacheLookup
	private WebElement summerDresses2;

	@FindBy(css = "#categories_block_left div.block_content ul.tree.dynamized li.last ul li:nth-of-type(2) ul li:nth-of-type(3) a")
	@CacheLookup
	private WebElement summerDresses3;

	@FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(2) ul li:nth-of-type(3) a")
	@CacheLookup
	private WebElement summerDresses4;

	@FindBy(css = "a[title='Suppliers']")
	@CacheLookup
	private WebElement suppliers;

	@FindBy(css = "a[href='mailto:%73%75%70%70%6f%72%74@%73%65%6c%65%6e%69%75%6d%66%72%61%6d%65%77%6f%72%6b.%63%6f%6d']")
	@CacheLookup
	private WebElement supportseleniumframeworkCom;

	@FindBy(css = "#informations_block_left_1 div.block_content.list-block ul li:nth-of-type(3) a")
	@CacheLookup
	private WebElement termsAndConditionsOfUse1;

	@FindBy(name = "manufacturer_list")
	@CacheLookup
	private WebElement termsAndConditionsOfUse2;

	@FindBy(name = "supplier_list")
	@CacheLookup
	private WebElement termsAndConditionsOfUse3;

	@FindBy(css = "#block_various_links_footer ul.toggle-footer li:nth-of-type(6) a")
	@CacheLookup
	private WebElement termsAndConditionsOfUse4;

	@FindBy(css = "a[title='View a top sellers products']")
	@CacheLookup
	private WebElement topSellers;

	@FindBy(css = "a[title='Tops']")
	@CacheLookup
	private WebElement tops1;

	@FindBy(css = "#categories_block_left div.block_content ul.tree.dynamized li.last ul li:nth-of-type(1) a")
	@CacheLookup
	private WebElement tops2;

	@FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(1) a")
	@CacheLookup
	private WebElement tops3;

	@FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(1) ul li:nth-of-type(1) a")
	@CacheLookup
	private WebElement tshirts1;

	@FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(3) a")
	@CacheLookup
	private WebElement tshirts2;

	@FindBy(css = "#categories_block_left div.block_content ul.tree.dynamized li.last ul li:nth-of-type(1) ul li:nth-of-type(1) a")
	@CacheLookup
	private WebElement tshirts3;

	@FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(1) ul li:nth-of-type(1) a")
	@CacheLookup
	private WebElement tshirts4;

	@FindBy(css = "a[href='https://twitter.com/seleniumfrmwrk']")
	@CacheLookup
	private WebElement twitter;

	@FindBy(css = "#wishlist_3036 td:nth-of-type(5) a")
	@CacheLookup
	private WebElement view;

	@FindBy(css = "a[title='Women']")
	@CacheLookup
	private WebElement women1;

	@FindBy(css = "#categories_block_left div.block_content ul.tree.dynamized li.last a")
	@CacheLookup
	private WebElement women2;

	@FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last a")
	@CacheLookup
	private WebElement women3;

	@FindBy(css = "a[href='https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA']")
	@CacheLookup
	private WebElement youtube;

	public MyWishlistsPage() {
	}

	public MyWishlistsPage(WebDriver driver) {
		this();
		this.driver = driver;
	}

	public MyWishlistsPage(WebDriver driver, Map<String, String> data) {
		this(driver);
		this.data = data;
	}

	public MyWishlistsPage(WebDriver driver, Map<String, String> data, int timeout) {
		this(driver, data);
		this.timeout = timeout;
	}

	/**
	 * Click on About Us Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickAboutUs1Link() {
		aboutUs1.click();
		return this;
	}

	/**
	 * Click on About Us Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickAboutUs2Link() {
		aboutUs2.click();
		return this;
	}

	/**
	 * Click on All Best Sellers Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickAllBestSellersLink() {
		allBestSellers.click();
		return this;
	}

	/**
	 * Click on All Specials Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickAllSpecialsLink() {
		allSpecials.click();
		return this;
	}

	/**
	 * Click on Back To Your Account Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickBackToYourAccountLink() {
		backToYourAccount.click();
		return this;
	}

	/**
	 * Click on Best Sellers Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickBestSellersLink() {
		bestSellers.click();
		return this;
	}

	/**
	 * Click on Blouse Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickBlouseLink() {
		blouse.click();
		return this;
	}

	/**
	 * Click on Blouses Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickBlouses1Link() {
		blouses1.click();
		return this;
	}

	/**
	 * Click on Blouses Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickBlouses2Link() {
		blouses2.click();
		return this;
	}

	/**
	 * Click on Blouses Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickBlouses3Link() {
		blouses3.click();
		return this;
	}

	/**
	 * Click on Cart 0 Product Products Empty Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickCart0ProductProductsEmptyLink() {
		cart0ProductProductsEmpty.click();
		return this;
	}

	/**
	 * Click on Casual Dresses Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickCasualDresses1Link() {
		casualDresses1.click();
		return this;
	}

	/**
	 * Click on Casual Dresses Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickCasualDresses2Link() {
		casualDresses2.click();
		return this;
	}

	/**
	 * Click on Casual Dresses Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickCasualDresses3Link() {
		casualDresses3.click();
		return this;
	}

	/**
	 * Click on Casual Dresses Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickCasualDresses4Link() {
		casualDresses4.click();
		return this;
	}

	/**
	 * Click on Check Out Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickCheckOutLink() {
		checkOut.click();
		return this;
	}

	/**
	 * Click on Contact Us Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickContactUs1Link() {
		contactUs1.click();
		return this;
	}

	/**
	 * Click on Contact Us Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickContactUs2Link() {
		contactUs2.click();
		return this;
	}

	/**
	 * Click on Delivery Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickDeliveryLink() {
		delivery.click();
		return this;
	}

	/**
	 * Click on Discover Our Stores Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickDiscoverOurStoresLink() {
		discoverOurStores.click();
		return this;
	}

	/**
	 * Click on Dresses Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickDresses1Link() {
		dresses1.click();
		return this;
	}

	/**
	 * Click on Dresses Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickDresses2Link() {
		dresses2.click();
		return this;
	}

	/**
	 * Click on Dresses Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickDresses3Link() {
		dresses3.click();
		return this;
	}

	/**
	 * Click on Dresses Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickDresses4Link() {
		dresses4.click();
		return this;
	}

	/**
	 * Click on Ecommerce Software By Prestashop Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickEcommerceSoftwareByPrestashopLink() {
		ecommerceSoftwareByPrestashop.click();
		return this;
	}

	/**
	 * Click on Evening Dresses Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickEveningDresses1Link() {
		eveningDresses1.click();
		return this;
	}

	/**
	 * Click on Evening Dresses Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickEveningDresses2Link() {
		eveningDresses2.click();
		return this;
	}

	/**
	 * Click on Evening Dresses Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickEveningDresses3Link() {
		eveningDresses3.click();
		return this;
	}

	/**
	 * Click on Evening Dresses Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickEveningDresses4Link() {
		eveningDresses4.click();
		return this;
	}

	/**
	 * Click on Facebook Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickFacebookLink() {
		facebook.click();
		return this;
	}

	/**
	 * Click on Faded Short Sleeve... Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickFadedShortSleeveLink() {
		fadedShortSleeve.click();
		return this;
	}

	/**
	 * Click on Faded Short Sleeve Tshirts Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickFadedShortSleeveTshirtsLink() {
		fadedShortSleeveTshirts.click();
		return this;
	}

	/**
	 * Click on Fashion Manufacturer Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickFashionManufacturerLink() {
		fashionManufacturer.click();
		return this;
	}

	/**
	 * Click on Fashion Supplier Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickFashionSupplierLink() {
		fashionSupplier.click();
		return this;
	}

	/**
	 * Click on Frodo Lastname Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickFrodoLastnameLink() {
		frodoLastname.click();
		return this;
	}

	/**
	 * Click on Google Plus Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickGooglePlusLink() {
		googlePlus.click();
		return this;
	}

	/**
	 * Click on Home Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickHomeLink() {
		home.click();
		return this;
	}

	/**
	 * Click on Information Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickInformationLink() {
		information.click();
		return this;
	}

	/**
	 * Click on Legal Notice Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickLegalNoticeLink() {
		legalNotice.click();
		return this;
	}

	/**
	 * Click on Manufacturers Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickManufacturersLink() {
		manufacturers.click();
		return this;
	}

	/**
	 * Click on My Account Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickMyAccount1Link() {
		myAccount1.click();
		return this;
	}

	/**
	 * Click on My Account Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickMyAccount2Link() {
		myAccount2.click();
		return this;
	}

	/**
	 * Click on My Account Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickMyAccount3Link() {
		myAccount3.click();
		return this;
	}

	/**
	 * Click on My Addresses Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickMyAddresses1Link() {
		myAddresses1.click();
		return this;
	}

	/**
	 * Click on My Addresses Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickMyAddresses2Link() {
		myAddresses2.click();
		return this;
	}

	/**
	 * Click on My Credit Slips Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickMyCreditSlips1Link() {
		myCreditSlips1.click();
		return this;
	}

	/**
	 * Click on My Credit Slips Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickMyCreditSlips2Link() {
		myCreditSlips2.click();
		return this;
	}

	/**
	 * Click on My Orders Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickMyOrders1Link() {
		myOrders1.click();
		return this;
	}

	/**
	 * Click on My Orders Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickMyOrders2Link() {
		myOrders2.click();
		return this;
	}

	/**
	 * Click on My Personal Info Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickMyPersonalInfo1Link() {
		myPersonalInfo1.click();
		return this;
	}

	/**
	 * Click on My Personal Info Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickMyPersonalInfo2Link() {
		myPersonalInfo2.click();
		return this;
	}

	/**
	 * Click on My Wishlist Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickMyWishlistLink() {
		myWishlist.click();
		return this;
	}

	/**
	 * Click on My Wishlists Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickMyWishlistsLink() {
		myWishlists.click();
		return this;
	}

	/**
	 * Click on New Products Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickNewProductsLink() {
		newProducts.click();
		return this;
	}

	/**
	 * Click on Ok Button.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickOkButton() {
		ok.click();
		return this;
	}

	/**
	 * Click on Our Stores Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickOurStores1Link() {
		ourStores1.click();
		return this;
	}

	/**
	 * Click on Our Stores Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickOurStores2Link() {
		ourStores2.click();
		return this;
	}

	/**
	 * Click on Our Stores Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickOurStores3Link() {
		ourStores3.click();
		return this;
	}

	/**
	 * Click on Printed Chiffon Dress Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickPrintedChiffonDressLink() {
		printedChiffonDress.click();
		return this;
	}

	/**
	 * Click on Printed Dress Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickPrintedDress1Link() {
		printedDress1.click();
		return this;
	}

	/**
	 * Click on Printed Dress Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickPrintedDress2Link() {
		printedDress2.click();
		return this;
	}

	/**
	 * Click on Printed Summer Dress Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickPrintedSummerDress1Link() {
		printedSummerDress1.click();
		return this;
	}

	/**
	 * Click on Printed Summer Dress Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickPrintedSummerDress2Link() {
		printedSummerDress2.click();
		return this;
	}

	/**
	 * Click on Printed Summer Dress Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickPrintedSummerDress3Link() {
		printedSummerDress3.click();
		return this;
	}

	/**
	 * Click on Proceed To Checkout Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickProceedToCheckoutLink() {
		proceedToCheckout.click();
		return this;
	}

	/**
	 * Click on Save Button.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickSaveButton() {
		save.click();
		return this;
	}

	/**
	 * Click on Search Button.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickSearchButton() {
		search.click();
		return this;
	}

	/**
	 * Click on Secure Payment Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickSecurePaymentLink() {
		securePayment.click();
		return this;
	}

	/**
	 * Click on Sign Out Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickSignOut1Link() {
		signOut1.click();
		return this;
	}

	/**
	 * Click on Sign Out Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickSignOut2Link() {
		signOut2.click();
		return this;
	}

	/**
	 * Click on Sign Out Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickSignOut3Link() {
		signOut3.click();
		return this;
	}

	/**
	 * Click on Sitemap Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickSitemapLink() {
		sitemap.click();
		return this;
	}

	/**
	 * Click on Specials Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickSpecials1Link() {
		specials1.click();
		return this;
	}

	/**
	 * Click on Specials Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickSpecials2Link() {
		specials2.click();
		return this;
	}

	/**
	 * Click on Summer Dresses Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickSummerDresses1Link() {
		summerDresses1.click();
		return this;
	}

	/**
	 * Click on Summer Dresses Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickSummerDresses2Link() {
		summerDresses2.click();
		return this;
	}

	/**
	 * Click on Summer Dresses Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickSummerDresses3Link() {
		summerDresses3.click();
		return this;
	}

	/**
	 * Click on Summer Dresses Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickSummerDresses4Link() {
		summerDresses4.click();
		return this;
	}

	/**
	 * Click on Suppliers Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickSuppliersLink() {
		suppliers.click();
		return this;
	}

	/**
	 * Click on Supportseleniumframework.com Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickSupportseleniumframeworkComLink() {
		supportseleniumframeworkCom.click();
		return this;
	}

	/**
	 * Click on Terms And Conditions Of Use Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickTermsAndConditionsOfUse4Link() {
		termsAndConditionsOfUse4.click();
		return this;
	}

	/**
	 * Click on Top Sellers Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickTopSellersLink() {
		topSellers.click();
		return this;
	}

	/**
	 * Click on Tops Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickTops1Link() {
		tops1.click();
		return this;
	}

	/**
	 * Click on Tops Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickTops2Link() {
		tops2.click();
		return this;
	}

	/**
	 * Click on Tops Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickTops3Link() {
		tops3.click();
		return this;
	}

	/**
	 * Click on Tshirts Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickTshirts1Link() {
		tshirts1.click();
		return this;
	}

	/**
	 * Click on Tshirts Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickTshirts2Link() {
		tshirts2.click();
		return this;
	}

	/**
	 * Click on Tshirts Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickTshirts3Link() {
		tshirts3.click();
		return this;
	}

	/**
	 * Click on Tshirts Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickTshirts4Link() {
		tshirts4.click();
		return this;
	}

	/**
	 * Click on Twitter Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickTwitterLink() {
		twitter.click();
		return this;
	}

	/**
	 * Click on View Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickViewLink() {
		view.click();
		return this;
	}

	/**
	 * Click on Women Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickWomen1Link() {
		women1.click();
		return this;
	}

	/**
	 * Click on Women Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickWomen2Link() {
		women2.click();
		return this;
	}

	/**
	 * Click on Women Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickWomen3Link() {
		women3.click();
		return this;
	}

	/**
	 * Click on Youtube Link.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage clickYoutubeLink() {
		youtube.click();
		return this;
	}

	/**
	 * Fill every fields in the page.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage fill() {
		setProductSuccessfullyAddedToYourShoppingTextField();
		setTermsAndConditionsOfUse2DropDownListField();
		setTermsAndConditionsOfUse3DropDownListField();
		setNameTextField();
		setEcommerceSoftwareByPrestashopTextField2014();
		return this;
	}

	/**
	 * Fill every fields in the page and submit it to target page.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage fillAndSubmit() {
		fill();
		return submit();
	}

	/**
	 * Set default value to 2014 Ecommerce Software By Prestashop Text field.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage setEcommerceSoftwareByPrestashopTextField2014() {
		return setEcommerceSoftwareByPrestashopTextField2014(data.get("ECOMMERCE_SOFTWARE_BY_PRESTASHOP_2014"));
	}

	/**
	 * Set value to 2014 Ecommerce Software By Prestashop Text field.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage setEcommerceSoftwareByPrestashopTextField2014(
			String ecommerceSoftwareByPrestashopValue2014) {
		ecommerceSoftwareByPrestashop2014.sendKeys(ecommerceSoftwareByPrestashopValue2014);
		return this;
	}

	/**
	 * Set default value to Name Text field.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage setNameTextField() {
		return setNameTextField(data.get("NAME"));
	}

	/**
	 * Set value to Name Text field.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage setNameTextField(String nameValue) {
		name.sendKeys(nameValue);
		return this;
	}

	/**
	 * Set default value to Product Successfully Added To Your Shopping Cart Text
	 * field.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage setProductSuccessfullyAddedToYourShoppingTextField() {
		return setProductSuccessfullyAddedToYourShoppingTextField(
				data.get("PRODUCT_SUCCESSFULLY_ADDED_TO_YOUR_SHOPPING"));
	}

	/**
	 * Set value to Product Successfully Added To Your Shopping Cart Text field.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage setProductSuccessfullyAddedToYourShoppingTextField(
			String productSuccessfullyAddedToYourShoppingValue) {
		productSuccessfullyAddedToYourShopping.sendKeys(productSuccessfullyAddedToYourShoppingValue);
		return this;
	}

	/**
	 * Set default value to Terms And Conditions Of Use Drop Down List field.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage setTermsAndConditionsOfUse1DropDownListField() {
		return setTermsAndConditionsOfUse1DropDownListField(data.get("TERMS_AND_CONDITIONS_OF_USE_1"));
	}

	/**
	 * Set value to Terms And Conditions Of Use Drop Down List field.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage setTermsAndConditionsOfUse1DropDownListField(String termsAndConditionsOfUse1Value) {
		termsAndConditionsOfUse1.click();
		return this;
	}

	/**
	 * Set default value to Terms And Conditions Of Use Drop Down List field.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage setTermsAndConditionsOfUse2DropDownListField() {
		return setTermsAndConditionsOfUse2DropDownListField(data.get("TERMS_AND_CONDITIONS_OF_USE_2"));
	}

	/**
	 * Set value to Terms And Conditions Of Use Drop Down List field.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage setTermsAndConditionsOfUse2DropDownListField(String termsAndConditionsOfUse2Value) {
		new Select(termsAndConditionsOfUse2).selectByVisibleText(termsAndConditionsOfUse2Value);
		return this;
	}

	/**
	 * Set default value to Terms And Conditions Of Use Drop Down List field.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage setTermsAndConditionsOfUse3DropDownListField() {
		return setTermsAndConditionsOfUse3DropDownListField(data.get("TERMS_AND_CONDITIONS_OF_USE_3"));
	}

	/**
	 * Set value to Terms And Conditions Of Use Drop Down List field.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage setTermsAndConditionsOfUse3DropDownListField(String termsAndConditionsOfUse3Value) {
		new Select(termsAndConditionsOfUse3).selectByVisibleText(termsAndConditionsOfUse3Value);
		return this;
	}

	/**
	 * Submit the form to target page.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage submit() {
		clickSearchButton();
		return this;
	}

	/**
	 * Unset default value from Terms And Conditions Of Use Drop Down List field.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage unsetTermsAndConditionsOfUse2DropDownListField() {
		return unsetTermsAndConditionsOfUse2DropDownListField(data.get("TERMS_AND_CONDITIONS_OF_USE_2"));
	}

	/**
	 * Unset value from Terms And Conditions Of Use Drop Down List field.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage unsetTermsAndConditionsOfUse2DropDownListField(String termsAndConditionsOfUse2Value) {
		new Select(termsAndConditionsOfUse2).deselectByVisibleText(termsAndConditionsOfUse2Value);
		return this;
	}

	/**
	 * Unset default value from Terms And Conditions Of Use Drop Down List field.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage unsetTermsAndConditionsOfUse3DropDownListField() {
		return unsetTermsAndConditionsOfUse3DropDownListField(data.get("TERMS_AND_CONDITIONS_OF_USE_3"));
	}

	/**
	 * Unset value from Terms And Conditions Of Use Drop Down List field.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage unsetTermsAndConditionsOfUse3DropDownListField(String termsAndConditionsOfUse3Value) {
		new Select(termsAndConditionsOfUse3).deselectByVisibleText(termsAndConditionsOfUse3Value);
		return this;
	}

	/**
	 * Verify that the page loaded completely.
	 *
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage verifyPageLoaded() {
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
	 * @return the MyWishlistsPage class instance.
	 */
	public MyWishlistsPage verifyPageUrl() {
		(new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver d) {
				return d.getCurrentUrl().contains(pageUrl);
			}
		});
		return this;
	}
}
