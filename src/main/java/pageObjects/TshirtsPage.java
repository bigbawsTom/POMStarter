package pageObjects;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TshirtsPage {
	private Map<String, String> data;
	private WebDriver driver;
	private int timeout = 15;

	@FindBy(css = "#informations_block_left_1 div.block_content.list-block ul li:nth-of-type(4) a")
	@CacheLookup
	private WebElement aboutUs1;

	@FindBy(css = "#block_various_links_footer ul.toggle-footer li:nth-of-type(7) a")
	@CacheLookup
	private WebElement aboutUs2;

	@FindBy(css = "a.button.ajax_add_to_cart_button.btn.btn-default")
	@CacheLookup
	private WebElement addToCart;

	@FindBy(css = "a.add_to_compare")
	@CacheLookup
	private WebElement addToCompare;

	@FindBy(css = "a.addToWishlist.wishlistProd_1")
	@CacheLookup
	private WebElement addToWishlist;

	@FindBy(css = "a[title='All specials']")
	@CacheLookup
	private WebElement allSpecials;

	@FindBy(css = "a[title='Best sellers']")
	@CacheLookup
	private WebElement bestSellers;

	@FindBy(css = "a[title='Blouses']")
	@CacheLookup
	private WebElement blouses1;

	@FindBy(css = "a[title='Match your favorites blouses with the right accessories for the perfect look.']")
	@CacheLookup
	private WebElement blouses2;

	@FindBy(id = "layered_id_attribute_group_14")
	@CacheLookup
	private WebElement blue11;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#color-blue']")
	@CacheLookup
	private WebElement blue12;

	@FindBy(css = "a[title='View my shopping cart']")
	@CacheLookup
	private WebElement cart0ProductProductsEmpty;

	@FindBy(id = "layered_id_feature_11")
	@CacheLookup
	private WebElement casual11;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#styles-casual']")
	@CacheLookup
	private WebElement casual12;

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

	@FindBy(css = "#center_column div:nth-of-type(2) div:nth-of-type(2) form.compare-form button.btn.btn-default.button.button-medium.bt_compare.bt_compare")
	@CacheLookup
	private WebElement compare01;

	@FindBy(css = "button.btn.btn-default.button.button-medium.bt_compare.bt_compare_bottom")
	@CacheLookup
	private WebElement compare02;

	@FindBy(css = "a[title='Contact Us']")
	@CacheLookup
	private WebElement contactUs1;

	@FindBy(css = "a[title='Contact us']")
	@CacheLookup
	private WebElement contactUs2;

	@FindBy(id = "layered_id_feature_5")
	@CacheLookup
	private WebElement cotton11;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#compositions-cotton']")
	@CacheLookup
	private WebElement cotton12;

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

	@FindBy(css = "#viewed-products_block_left div.block_content.products-block ul li.clearfix.last_item div.product-content h5 a.product-name")
	@CacheLookup
	private WebElement fadedShortSleeve;

	@FindBy(css = "#center_column ul.product_list.grid.row li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.last-line.first-item-of-tablet-line.first-item-of-mobile-line.last-mobile-line div.product-container div:nth-of-type(2) h5 a.product-name")
	@CacheLookup
	private WebElement fadedShortSleeveTshirts;

	@FindBy(id = "layered_manufacturer_1")
	@CacheLookup
	private WebElement fashionManufacturer11;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#manufacturer-fashion_manufacturer']")
	@CacheLookup
	private WebElement fashionManufacturer12;

	@FindBy(css = "a.account")
	@CacheLookup
	private WebElement frodoLastname;

	@FindBy(css = "a[href='https://plus.google.com/111979135243110831526/posts']")
	@CacheLookup
	private WebElement googlePlus;

	@FindBy(css = "a[title='Grid']")
	@CacheLookup
	private WebElement grid;

	@FindBy(id = "layered_quantity_1")
	@CacheLookup
	private WebElement inStock11;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#availability-in_stock']")
	@CacheLookup
	private WebElement inStock12;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_cms_category=1&controller=cms']")
	@CacheLookup
	private WebElement information;

	@FindBy(id = "layered_id_attribute_group_3")
	@CacheLookup
	private WebElement l11;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#size-l']")
	@CacheLookup
	private WebElement l12;

	@FindBy(css = "a[title='Legal Notice']")
	@CacheLookup
	private WebElement legalNotice;

	@FindBy(css = "a[title='List']")
	@CacheLookup
	private WebElement list;

	@FindBy(id = "layered_id_attribute_group_2")
	@CacheLookup
	private WebElement m11;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#size-m']")
	@CacheLookup
	private WebElement m12;

	@FindBy(css = "a.button.lnk_view.btn.btn-default")
	@CacheLookup
	private WebElement more;

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

	@FindBy(id = "layered_condition_new")
	@CacheLookup
	private WebElement new11;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#condition-new']")
	@CacheLookup
	private WebElement new12;

	@FindBy(css = "a[title='New products']")
	@CacheLookup
	private WebElement newProducts;

	@FindBy(name = "submitNewsletter")
	@CacheLookup
	private WebElement ok;

	@FindBy(id = "layered_id_attribute_group_13")
	@CacheLookup
	private WebElement orange11;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#color-orange']")
	@CacheLookup
	private WebElement orange12;

	@FindBy(css = "#informations_block_left_1 div.block_content.list-block ul li:nth-of-type(6) a")
	@CacheLookup
	private WebElement ourStores1;

	@FindBy(css = "#stores_block_left p.title_block a")
	@CacheLookup
	private WebElement ourStores2;

	@FindBy(css = "#block_various_links_footer ul.toggle-footer li:nth-of-type(4) a")
	@CacheLookup
	private WebElement ourStores3;

	private final String pageLoadedText = "Terms and conditions of use";

	private final String pageUrl = "/index.php?id_category=5&controller=category";

	@FindBy(css = "a[title='Printed Summer Dress']")
	@CacheLookup
	private WebElement printedSummerDress;

	@FindBy(css = "a.btn.btn-default.button.button-medium")
	@CacheLookup
	private WebElement proceedToCheckout;

	@FindBy(id = "search_query_top")
	@CacheLookup
	private WebElement productSuccessfullyAddedToYourShopping;

	@FindBy(css = "a.quick-view")
	@CacheLookup
	private WebElement quickView;

	@FindBy(id = "layered_id_attribute_group_1")
	@CacheLookup
	private WebElement s11;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#size-s']")
	@CacheLookup
	private WebElement s12;

	@FindBy(name = "submit_search")
	@CacheLookup
	private WebElement search;

	@FindBy(css = "a[title='Secure payment']")
	@CacheLookup
	private WebElement securePayment;

	@FindBy(id = "layered_id_feature_17")
	@CacheLookup
	private WebElement shortSleeve11;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#properties-short_sleeve']")
	@CacheLookup
	private WebElement shortSleeve12;

	@FindBy(css = "a.logout")
	@CacheLookup
	private WebElement signOut1;

	@FindBy(css = "a[title='Sign out']")
	@CacheLookup
	private WebElement signOut2;

	@FindBy(css = "a[title='Sitemap']")
	@CacheLookup
	private WebElement sitemap;

	@FindBy(id = "selectProductSort")
	@CacheLookup
	private WebElement sortBy;

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

	@FindBy(css = "a[title='Short dress, long dress, silk dress, printed dress, you will find the perfect dress for summer.']")
	@CacheLookup
	private WebElement summerDresses3;

	@FindBy(css = "a[href='mailto:%73%75%70%70%6f%72%74@%73%65%6c%65%6e%69%75%6d%66%72%61%6d%65%77%6f%72%6b.%63%6f%6d']")
	@CacheLookup
	private WebElement supportseleniumframeworkCom;

	@FindBy(css = "#informations_block_left_1 div.block_content.list-block ul li:nth-of-type(3) a")
	@CacheLookup
	private WebElement termsAndConditionsOfUse1;

	@FindBy(css = "#block_various_links_footer ul.toggle-footer li:nth-of-type(6) a")
	@CacheLookup
	private WebElement termsAndConditionsOfUse2;

	@FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(1) a.sf-with-ul")
	@CacheLookup
	private WebElement tops1;

	@FindBy(css = "#columns div:nth-of-type(1) a:nth-of-type(3)")
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

	@FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(1) ul li:nth-of-type(1) a")
	@CacheLookup
	private WebElement tshirts3;

	@FindBy(css = "a[href='https://twitter.com/seleniumfrmwrk']")
	@CacheLookup
	private WebElement twitter;

	@FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) a.sf-with-ul")
	@CacheLookup
	private WebElement women1;

	@FindBy(css = "#columns div:nth-of-type(1) a:nth-of-type(2)")
	@CacheLookup
	private WebElement women2;

	@FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last a")
	@CacheLookup
	private WebElement women3;

	@FindBy(css = "a[href='https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA']")
	@CacheLookup
	private WebElement youtube;

	public TshirtsPage() {
	}

	public TshirtsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public TshirtsPage(WebDriver driver, Map<String, String> data) {
		this(driver);
		this.data = data;
	}

	public TshirtsPage(WebDriver driver, Map<String, String> data, int timeout) {
		this(driver, data);
		this.timeout = timeout;
	}

	/**
	 * Click on About Us Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickAboutUs1Link() {
		aboutUs1.click();
		return this;
	}

	/**
	 * Click on About Us Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickAboutUs2Link() {
		aboutUs2.click();
		return this;
	}

	/**
	 * Click on Add To Cart Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickAddToCartLink() {
		addToCart.click();
		return this;
	}

	/**
	 * Click on Add To Compare Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickAddToCompareLink() {
		addToCompare.click();
		return this;
	}

	/**
	 * Click on Add To Wishlist Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickAddToWishlistLink() {
		addToWishlist.click();
		return this;
	}

	/**
	 * Click on All Specials Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickAllSpecialsLink() {
		allSpecials.click();
		return this;
	}

	/**
	 * Click on Best Sellers Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickBestSellersLink() {
		bestSellers.click();
		return this;
	}

	/**
	 * Click on Blouses Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickBlouses1Link() {
		blouses1.click();
		return this;
	}

	/**
	 * Click on Blouses Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickBlouses2Link() {
		blouses2.click();
		return this;
	}

	/**
	 * Click on Blue 1 Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickBlue11Link() {
		blue11.click();
		return this;
	}

	/**
	 * Click on Blue 1 Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickBlue12Link() {
		blue12.click();
		return this;
	}

	/**
	 * Click on Cart 0 Product Products Empty Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickCart0ProductProductsEmptyLink() {
		cart0ProductProductsEmpty.click();
		return this;
	}

	/**
	 * Click on Casual 1 Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickCasual11Link() {
		if (!casual11.isSelected()) {
			casual11.click();
		}
		return this;
	}

	/**
	 * Click on Casual 1 Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickCasual12Link() {
		casual12.click();
		return this;
	}

	/**
	 * Click on Casual Dresses Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickCasualDresses1Link() {
		casualDresses1.click();
		return this;
	}

	/**
	 * Click on Casual Dresses Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickCasualDresses2Link() {
		casualDresses2.click();
		return this;
	}

	/**
	 * Click on Casual Dresses Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickCasualDresses3Link() {
		casualDresses3.click();
		return this;
	}

	/**
	 * Click on Check Out Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickCheckOutLink() {
		checkOut.click();
		return this;
	}

	/**
	 * Click on Compare 0 Button.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickCompare01Button() {
		compare01.click();
		return this;
	}

	/**
	 * Click on Compare 0 Button.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickCompare02Button() {
		compare02.click();
		return this;
	}

	/**
	 * Click on Contact Us Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickContactUs1Link() {
		contactUs1.click();
		return this;
	}

	/**
	 * Click on Contact Us Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickContactUs2Link() {
		contactUs2.click();
		return this;
	}

	/**
	 * Click on Cotton 1 Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickCotton11Link() {
		if (!cotton11.isSelected()) {
			cotton11.click();
		}
		return this;
	}

	/**
	 * Click on Cotton 1 Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickCotton12Link() {
		cotton12.click();
		return this;
	}

	/**
	 * Click on Delivery Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickDeliveryLink() {
		delivery.click();
		return this;
	}

	/**
	 * Click on Discover Our Stores Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickDiscoverOurStoresLink() {
		discoverOurStores.click();
		return this;
	}

	/**
	 * Click on Dresses Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickDresses1Link() {
		dresses1.click();
		return this;
	}

	/**
	 * Click on Dresses Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickDresses2Link() {
		dresses2.click();
		return this;
	}

	/**
	 * Click on Dresses Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickDresses3Link() {
		dresses3.click();
		return this;
	}

	/**
	 * Click on Ecommerce Software By Prestashop Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickEcommerceSoftwareByPrestashopLink() {
		ecommerceSoftwareByPrestashop.click();
		return this;
	}

	/**
	 * Click on Evening Dresses Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickEveningDresses1Link() {
		eveningDresses1.click();
		return this;
	}

	/**
	 * Click on Evening Dresses Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickEveningDresses2Link() {
		eveningDresses2.click();
		return this;
	}

	/**
	 * Click on Evening Dresses Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickEveningDresses3Link() {
		eveningDresses3.click();
		return this;
	}

	/**
	 * Click on Facebook Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickFacebookLink() {
		facebook.click();
		return this;
	}

	/**
	 * Click on Faded Short Sleeve... Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickFadedShortSleeveLink() {
		fadedShortSleeve.click();
		return this;
	}

	/**
	 * Click on Faded Short Sleeve Tshirts Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickFadedShortSleeveTshirtsLink() {
		fadedShortSleeveTshirts.click();
		return this;
	}

	/**
	 * Click on Fashion Manufacturer 1 Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickFashionManufacturer11Link() {
		if (!fashionManufacturer11.isSelected()) {
			fashionManufacturer11.click();
		}
		return this;
	}

	/**
	 * Click on Fashion Manufacturer 1 Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickFashionManufacturer12Link() {
		fashionManufacturer12.click();
		return this;
	}

	/**
	 * Click on Frodo Lastname Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickFrodoLastnameLink() {
		frodoLastname.click();
		return this;
	}

	/**
	 * Click on Google Plus Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickGooglePlusLink() {
		googlePlus.click();
		return this;
	}

	/**
	 * Click on Grid Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickGridLink() {
		grid.click();
		return this;
	}

	/**
	 * Click on In Stock 1 Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickInStock11Link() {
		if (!inStock11.isSelected()) {
			inStock11.click();
		}
		return this;
	}

	/**
	 * Click on In Stock 1 Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickInStock12Link() {
		inStock12.click();
		return this;
	}

	/**
	 * Click on Information Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickInformationLink() {
		information.click();
		return this;
	}

	/**
	 * Click on L 1 Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickL11Link() {
		if (!l11.isSelected()) {
			l11.click();
		}
		return this;
	}

	/**
	 * Click on L 1 Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickL12Link() {
		l12.click();
		return this;
	}

	/**
	 * Click on Legal Notice Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickLegalNoticeLink() {
		legalNotice.click();
		return this;
	}

	/**
	 * Click on List Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickListLink() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", list);
//    	try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        list.click();
		return this;
	}

	/**
	 * Click on M 1 Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickM11Link() {
		if (!m11.isSelected()) {
			m11.click();
		}
		return this;
	}

	/**
	 * Click on M 1 Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickM12Link() {
		m12.click();
		return this;
	}

	/**
	 * Click on More Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickMoreLink() {
		more.click();
		return this;
	}

	/**
	 * Click on My Account Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickMyAccountLink() {
		myAccount.click();
		return this;
	}

	/**
	 * Click on My Addresses Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickMyAddressesLink() {
		myAddresses.click();
		return this;
	}

	/**
	 * Click on My Credit Slips Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickMyCreditSlipsLink() {
		myCreditSlips.click();
		return this;
	}

	/**
	 * Click on My Orders Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickMyOrdersLink() {
		myOrders.click();
		return this;
	}

	/**
	 * Click on My Personal Info Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickMyPersonalInfoLink() {
		myPersonalInfo.click();
		return this;
	}

	/**
	 * Click on New 1 Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickNew11Link() {
		if (!new11.isSelected()) {
			new11.click();
		}
		return this;
	}

	/**
	 * Click on New 1 Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickNew12Link() {
		new12.click();
		return this;
	}

	/**
	 * Click on New Products Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickNewProductsLink() {
		newProducts.click();
		return this;
	}

	/**
	 * Click on Ok Button.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickOkButton() {
		ok.click();
		return this;
	}

	/**
	 * Click on Orange 1 Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickOrange11Link() {
		orange11.click();
		return this;
	}

	/**
	 * Click on Orange 1 Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickOrange12Link() {
		orange12.click();
		return this;
	}

	/**
	 * Click on Our Stores Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickOurStores1Link() {
		ourStores1.click();
		return this;
	}

	/**
	 * Click on Our Stores Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickOurStores2Link() {
		ourStores2.click();
		return this;
	}

	/**
	 * Click on Our Stores Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickOurStores3Link() {
		ourStores3.click();
		return this;
	}

	/**
	 * Click on Printed Summer Dress Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickPrintedSummerDressLink() {
		printedSummerDress.click();
		return this;
	}

	/**
	 * Click on Proceed To Checkout Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickProceedToCheckoutLink() {
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("arguments[0].click();", proceedToCheckout);

		// proceedToCheckout.click();
		return this;
	}

	/**
	 * Click on Quick View Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickQuickViewLink() {
		quickView.click();
		return this;
	}

	/**
	 * Click on S 1 Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickS11Link() {
		if (!s11.isSelected()) {
			s11.click();
		}
		return this;
	}

	/**
	 * Click on S 1 Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickS12Link() {
		s12.click();
		return this;
	}

	/**
	 * Click on Search Button.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickSearchButton() {
		search.click();
		return this;
	}

	/**
	 * Click on Secure Payment Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickSecurePaymentLink() {
		securePayment.click();
		return this;
	}

	/**
	 * Click on Short Sleeve 1 Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickShortSleeve11Link() {
		if (!shortSleeve11.isSelected()) {
			shortSleeve11.click();
		}
		return this;
	}

	/**
	 * Click on Short Sleeve 1 Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickShortSleeve12Link() {
		shortSleeve12.click();
		return this;
	}

	/**
	 * Click on Sign Out Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickSignOut1Link() {
		signOut1.click();
		return this;
	}

	/**
	 * Click on Sign Out Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickSignOut2Link() {
		signOut2.click();
		return this;
	}

	/**
	 * Click on Sitemap Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickSitemapLink() {
		sitemap.click();
		return this;
	}

	/**
	 * Click on Specials Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickSpecials1Link() {
		specials1.click();
		return this;
	}

	/**
	 * Click on Specials Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickSpecials2Link() {
		specials2.click();
		return this;
	}

	/**
	 * Click on Summer Dresses Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickSummerDresses1Link() {
		summerDresses1.click();
		return this;
	}

	/**
	 * Click on Summer Dresses Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickSummerDresses2Link() {
		summerDresses2.click();
		return this;
	}

	/**
	 * Click on Summer Dresses Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickSummerDresses3Link() {
		summerDresses3.click();
		return this;
	}

	/**
	 * Click on Supportseleniumframework.com Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickSupportseleniumframeworkComLink() {
		supportseleniumframeworkCom.click();
		return this;
	}

	/**
	 * Click on Terms And Conditions Of Use Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickTermsAndConditionsOfUse1Link() {
		termsAndConditionsOfUse1.click();
		return this;
	}

	/**
	 * Click on Terms And Conditions Of Use Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickTermsAndConditionsOfUse2Link() {
		termsAndConditionsOfUse2.click();
		return this;
	}

	/**
	 * Click on Tops Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickTops1Link() {
		tops1.click();
		return this;
	}

	/**
	 * Click on Tops Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickTops2Link() {
		tops2.click();
		return this;
	}

	/**
	 * Click on Tops Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickTops3Link() {
		tops3.click();
		return this;
	}

	/**
	 * Click on Tshirts Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickTshirts1Link() {
		tshirts1.click();
		return this;
	}

	/**
	 * Click on Tshirts Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickTshirts2Link() {
		tshirts2.click();
		return this;
	}

	/**
	 * Click on Tshirts Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickTshirts3Link() {
		tshirts3.click();
		return this;
	}

	/**
	 * Click on Twitter Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickTwitterLink() {
		twitter.click();
		return this;
	}

	/**
	 * Click on Women Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickWomen1Link() {
		women1.click();
		return this;
	}

	/**
	 * Click on Women Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickWomen2Link() {
		women2.click();
		return this;
	}

	/**
	 * Click on Women Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickWomen3Link() {
		women3.click();
		return this;
	}

	/**
	 * Click on Youtube Link.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage clickYoutubeLink() {
		youtube.click();
		return this;
	}

	/**
	 * Fill every fields in the page.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage fill() {
		setProductSuccessfullyAddedToYourShoppingTextField();
		clickS11Link();
		clickM11Link();
		clickL11Link();
		clickCotton11Link();
		clickCasual11Link();
		clickShortSleeve11Link();
		clickInStock11Link();
		clickFashionManufacturer11Link();
		clickNew11Link();
		setSortByDropDownListField();
		setEcommerceSoftwareByPrestashopTextField2014();
		return this;
	}

	/**
	 * Fill every fields in the page and submit it to target page.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage fillAndSubmit() {
		fill();
		return submit();
	}

	/**
	 * Set default value to 2014 Ecommerce Software By Prestashop Text field.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage setEcommerceSoftwareByPrestashopTextField2014() {
		return setEcommerceSoftwareByPrestashopTextField2014(data.get("ECOMMERCE_SOFTWARE_BY_PRESTASHOP_2014"));
	}

	/**
	 * Set value to 2014 Ecommerce Software By Prestashop Text field.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage setEcommerceSoftwareByPrestashopTextField2014(String ecommerceSoftwareByPrestashopValue2014) {
		ecommerceSoftwareByPrestashop2014.sendKeys(ecommerceSoftwareByPrestashopValue2014);
		return this;
	}

	/**
	 * Set default value to Product Successfully Added To Your Shopping Cart Text
	 * field.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage setProductSuccessfullyAddedToYourShoppingTextField() {
		return setProductSuccessfullyAddedToYourShoppingTextField(
				data.get("PRODUCT_SUCCESSFULLY_ADDED_TO_YOUR_SHOPPING"));
	}

	/**
	 * Set value to Product Successfully Added To Your Shopping Cart Text field.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage setProductSuccessfullyAddedToYourShoppingTextField(
			String productSuccessfullyAddedToYourShoppingValue) {
		productSuccessfullyAddedToYourShopping.sendKeys(productSuccessfullyAddedToYourShoppingValue);
		return this;
	}

	/**
	 * Set default value to Sort By Drop Down List field.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage setSortByDropDownListField() {
		return setSortByDropDownListField(data.get("SORT_BY"));
	}

	/**
	 * Set value to Sort By Drop Down List field.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage setSortByDropDownListField(String sortByValue) {
		new Select(sortBy).selectByVisibleText(sortByValue);
		return this;
	}

	/**
	 * Submit the form to target page.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage submit() {
		clickSearchButton();
		return this;
	}

	/**
	 * Unset default value from Sort By Drop Down List field.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage unsetSortByDropDownListField() {
		return unsetSortByDropDownListField(data.get("SORT_BY"));
	}

	/**
	 * Unset value from Sort By Drop Down List field.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage unsetSortByDropDownListField(String sortByValue) {
		new Select(sortBy).deselectByVisibleText(sortByValue);
		return this;
	}

	/**
	 * Verify that the page loaded completely.
	 *
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage verifyPageLoaded() {
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
	 * @return the TshirtsPage class instance.
	 */
	public TshirtsPage verifyPageUrl() {
		(new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver d) {
				return d.getCurrentUrl().contains(pageUrl);
			}
		});
		return this;
	}
}
