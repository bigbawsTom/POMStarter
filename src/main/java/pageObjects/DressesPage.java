package pageObjects;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DressesPage {
	private Map<String, String> data;
	private WebDriver driver;
	private int timeout = 15;

	@FindBy(css = "#informations_block_left_1 div.block_content.list-block ul li:nth-of-type(4) a")
	@CacheLookup
	private WebElement aboutUs1;

	@FindBy(css = "#block_various_links_footer ul.toggle-footer li:nth-of-type(7) a")
	@CacheLookup
	private WebElement aboutUs2;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?controller=cart&add=1&id_product=3&token=a325baccdd081373907e9abbe36767db']")
	@CacheLookup
	private WebElement addToCart1;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?controller=cart&add=1&id_product=4&token=a325baccdd081373907e9abbe36767db']")
	@CacheLookup
	private WebElement addToCart2;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?controller=cart&add=1&id_product=5&token=a325baccdd081373907e9abbe36767db']")
	@CacheLookup
	private WebElement addToCart3;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?controller=cart&add=1&id_product=6&token=a325baccdd081373907e9abbe36767db']")
	@CacheLookup
	private WebElement addToCart4;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?controller=cart&add=1&id_product=7&token=a325baccdd081373907e9abbe36767db']")
	@CacheLookup
	private WebElement addToCart5;

	@FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(1) div.product-container div:nth-of-type(3) div:nth-of-type(2) a.add_to_compare")
	@CacheLookup
	private WebElement addToCompare1;

	@FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(2) div.product-container div:nth-of-type(3) div:nth-of-type(2) a.add_to_compare")
	@CacheLookup
	private WebElement addToCompare2;

	@FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(3) div.product-container div:nth-of-type(3) div:nth-of-type(2) a.add_to_compare")
	@CacheLookup
	private WebElement addToCompare3;

	@FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(4) div.product-container div:nth-of-type(3) div:nth-of-type(2) a.add_to_compare")
	@CacheLookup
	private WebElement addToCompare4;

	@FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(5) div.product-container div:nth-of-type(3) div:nth-of-type(2) a.add_to_compare")
	@CacheLookup
	private WebElement addToCompare5;

	@FindBy(css = "a.addToWishlist.wishlistProd_3")
	@CacheLookup
	private WebElement addToWishlist1;

	@FindBy(css = "a.addToWishlist.wishlistProd_4")
	@CacheLookup
	private WebElement addToWishlist2;

	@FindBy(css = "a.addToWishlist.wishlistProd_5")
	@CacheLookup
	private WebElement addToWishlist3;

	@FindBy(css = "a.addToWishlist.wishlistProd_6")
	@CacheLookup
	private WebElement addToWishlist4;

	@FindBy(css = "a.addToWishlist.wishlistProd_7")
	@CacheLookup
	private WebElement addToWishlist5;

	@FindBy(css = "a[title='All specials']")
	@CacheLookup
	private WebElement allSpecials;

	@FindBy(id = "layered_id_attribute_group_7")
	@CacheLookup
	private WebElement beige11;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=8&controller=category#color-beige']")
	@CacheLookup
	private WebElement beige12;

	@FindBy(css = "a[title='Best sellers']")
	@CacheLookup
	private WebElement bestSellers;

	@FindBy(id = "layered_id_attribute_group_11")
	@CacheLookup
	private WebElement black11;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=8&controller=category#color-black']")
	@CacheLookup
	private WebElement black12;

	@FindBy(css = "a[title='Blouses']")
	@CacheLookup
	private WebElement blouses1;

	@FindBy(css = "a[title='Match your favorites blouses with the right accessories for the perfect look.']")
	@CacheLookup
	private WebElement blouses2;

	@FindBy(id = "layered_id_attribute_group_14")
	@CacheLookup
	private WebElement blue11;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=8&controller=category#color-blue']")
	@CacheLookup
	private WebElement blue12;

	@FindBy(css = "a[title='View my shopping cart']")
	@CacheLookup
	private WebElement cart0ProductProductsEmpty;

	@FindBy(id = "layered_id_feature_11")
	@CacheLookup
	private WebElement casual11;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=8&controller=category#styles-casual']")
	@CacheLookup
	private WebElement casual12;

	@FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) ul li:nth-of-type(1) a")
	@CacheLookup
	private WebElement casualDresses1;

	@FindBy(id = "layered_category_9")
	@CacheLookup
	private WebElement casualDresses11;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=8&controller=category#categories-casual_dresses']")
	@CacheLookup
	private WebElement casualDresses12;

	@FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(1) a")
	@CacheLookup
	private WebElement casualDresses2;

	@FindBy(css = "#categories_block_left div.block_content ul.tree.dynamized li:nth-of-type(1) a")
	@CacheLookup
	private WebElement casualDresses3;

	@FindBy(css = "#subcategories ul.clearfix li:nth-of-type(1) h5 a.subcategory-name")
	@CacheLookup
	private WebElement casualDresses4;

	@FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(2) ul li:nth-of-type(1) a")
	@CacheLookup
	private WebElement casualDresses5;

	@FindBy(id = "button_order_cart")
	@CacheLookup
	private WebElement checkOut;

	@FindBy(id = "layered_id_feature_18")
	@CacheLookup
	private WebElement colorfulDress11;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=8&controller=category#properties-colorful_dress']")
	@CacheLookup
	private WebElement colorfulDress12;

	@FindBy(css = "#center_column div:nth-of-type(3) div:nth-of-type(2) form.compare-form button.btn.btn-default.button.button-medium.bt_compare.bt_compare")
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

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=8&controller=category#compositions-cotton']")
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

	@FindBy(css = "a.selected")
	@CacheLookup
	private WebElement dresses3;

	@FindBy(id = "layered_id_feature_16")
	@CacheLookup
	private WebElement dressy11;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=8&controller=category#styles-dressy']")
	@CacheLookup
	private WebElement dressy12;

	@FindBy(css = "a._blank")
	@CacheLookup
	private WebElement ecommerceSoftwareByPrestashop;

	@FindBy(id = "newsletter-input")
	@CacheLookup
	private WebElement ecommerceSoftwareByPrestashop2014;

	@FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) ul li:nth-of-type(2) a")
	@CacheLookup
	private WebElement eveningDresses1;

	@FindBy(id = "layered_category_10")
	@CacheLookup
	private WebElement eveningDresses11;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=8&controller=category#categories-evening_dresses']")
	@CacheLookup
	private WebElement eveningDresses12;

	@FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) a")
	@CacheLookup
	private WebElement eveningDresses2;

	@FindBy(css = "#categories_block_left div.block_content ul.tree.dynamized li:nth-of-type(2) a")
	@CacheLookup
	private WebElement eveningDresses3;

	@FindBy(css = "#subcategories ul.clearfix li:nth-of-type(2) h5 a.subcategory-name")
	@CacheLookup
	private WebElement eveningDresses4;

	@FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(2) ul li:nth-of-type(2) a")
	@CacheLookup
	private WebElement eveningDresses5;

	@FindBy(css = "a[href='https://www.facebook.com/groups/525066904174158/']")
	@CacheLookup
	private WebElement facebook;

	@FindBy(css = "#viewed-products_block_left div.block_content.products-block ul li.clearfix.last_item div.product-content h5 a.product-name")
	@CacheLookup
	private WebElement fadedShortSleeve;

	@FindBy(id = "layered_manufacturer_1")
	@CacheLookup
	private WebElement fashionManufacturer51;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=8&controller=category#manufacturer-fashion_manufacturer']")
	@CacheLookup
	private WebElement fashionManufacturer52;

	@FindBy(css = "a.account")
	@CacheLookup
	private WebElement frodoLastname;

	@FindBy(id = "layered_id_feature_13")
	@CacheLookup
	private WebElement girly31;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=8&controller=category#styles-girly']")
	@CacheLookup
	private WebElement girly32;

	@FindBy(css = "a[href='https://plus.google.com/111979135243110831526/posts']")
	@CacheLookup
	private WebElement googlePlus;

	@FindBy(id = "layered_id_attribute_group_15")
	@CacheLookup
	private WebElement green11;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=8&controller=category#color-green']")
	@CacheLookup
	private WebElement green12;

	@FindBy(css = "a[title='Grid']")
	@CacheLookup
	private WebElement grid;

	@FindBy(id = "layered_quantity_1")
	@CacheLookup
	private WebElement inStock51;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=8&controller=category#availability-in_stock']")
	@CacheLookup
	private WebElement inStock52;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_cms_category=1&controller=cms']")
	@CacheLookup
	private WebElement information;

	@FindBy(id = "layered_id_attribute_group_3")
	@CacheLookup
	private WebElement l51;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=8&controller=category#size-l']")
	@CacheLookup
	private WebElement l52;

	@FindBy(css = "a[title='Legal Notice']")
	@CacheLookup
	private WebElement legalNotice;

	@FindBy(css = "a[title='List']")
	@CacheLookup
	private WebElement list;

	@FindBy(id = "layered_id_attribute_group_2")
	@CacheLookup
	private WebElement m51;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=8&controller=category#size-m']")
	@CacheLookup
	private WebElement m52;

	@FindBy(id = "layered_id_feature_21")
	@CacheLookup
	private WebElement maxiDress11;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=8&controller=category#properties-maxi_dress']")
	@CacheLookup
	private WebElement maxiDress12;

	@FindBy(id = "layered_id_feature_20")
	@CacheLookup
	private WebElement midiDress11;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=8&controller=category#properties-midi_dress']")
	@CacheLookup
	private WebElement midiDress12;

	@FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(1) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(2)")
	@CacheLookup
	private WebElement more1;

	@FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(2) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(2)")
	@CacheLookup
	private WebElement more2;

	@FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(3) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(2)")
	@CacheLookup
	private WebElement more3;

	@FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(4) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(2)")
	@CacheLookup
	private WebElement more4;

	@FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(5) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(2)")
	@CacheLookup
	private WebElement more5;

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
	private WebElement new51;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=8&controller=category#condition-new']")
	@CacheLookup
	private WebElement new52;

	@FindBy(css = "a[title='New products']")
	@CacheLookup
	private WebElement newProducts;

	@FindBy(name = "submitNewsletter")
	@CacheLookup
	private WebElement ok;

	@FindBy(id = "layered_id_attribute_group_13")
	@CacheLookup
	private WebElement orange21;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=8&controller=category#color-orange']")
	@CacheLookup
	private WebElement orange22;

	@FindBy(css = "#informations_block_left_1 div.block_content.list-block ul li:nth-of-type(6) a")
	@CacheLookup
	private WebElement ourStores1;

	@FindBy(css = "#stores_block_left p.title_block a")
	@CacheLookup
	private WebElement ourStores2;

	@FindBy(css = "#block_various_links_footer ul.toggle-footer li:nth-of-type(4) a")
	@CacheLookup
	private WebElement ourStores3;

	private final String pageLoadedText = "Find your favorites dresses from our wide choice of evening, casual or summer dresses";

	private final String pageUrl = "/index.php?id_category=8&controller=category";

	@FindBy(id = "layered_id_attribute_group_24")
	@CacheLookup
	private WebElement pink11;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=8&controller=category#color-pink']")
	@CacheLookup
	private WebElement pink12;

	@FindBy(id = "layered_id_feature_1")
	@CacheLookup
	private WebElement polyester21;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=8&controller=category#compositions-polyester']")
	@CacheLookup
	private WebElement polyester22;

	@FindBy(css = "#special_block_right div.block_content.products-block ul li.clearfix div.product-content h5 a.product-name")
	@CacheLookup
	private WebElement printedChiffonDress1;

	@FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(5) div.product-container div:nth-of-type(2) h5 a.product-name")
	@CacheLookup
	private WebElement printedChiffonDress2;

	@FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(1) div.product-container div:nth-of-type(2) h5 a.product-name")
	@CacheLookup
	private WebElement printedDress1;

	@FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(2) div.product-container div:nth-of-type(2) h5 a.product-name")
	@CacheLookup
	private WebElement printedDress2;

	@FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(3) div.product-container div:nth-of-type(2) h5 a.product-name")
	@CacheLookup
	private WebElement printedSummerDress1;

	@FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(4) div.product-container div:nth-of-type(2) h5 a.product-name")
	@CacheLookup
	private WebElement printedSummerDress2;

	@FindBy(css = "a.btn.btn-default.button.button-medium")
	@CacheLookup
	private WebElement proceedToCheckout;

	@FindBy(id = "search_query_top")
	@CacheLookup
	private WebElement productSuccessfullyAddedToYourShopping;

	@FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(1) div.product-container div:nth-of-type(1) div.product-image-container a:nth-of-type(2)")
	@CacheLookup
	private WebElement quickView1;

	@FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(2) div.product-container div:nth-of-type(1) div.product-image-container a:nth-of-type(2)")
	@CacheLookup
	private WebElement quickView2;

	@FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(3) div.product-container div:nth-of-type(1) div.product-image-container a:nth-of-type(2)")
	@CacheLookup
	private WebElement quickView3;

	@FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(4) div.product-container div:nth-of-type(1) div.product-image-container a:nth-of-type(2)")
	@CacheLookup
	private WebElement quickView4;

	@FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(5) div.product-container div:nth-of-type(1) div.product-image-container a:nth-of-type(2)")
	@CacheLookup
	private WebElement quickView5;

	@FindBy(id = "layered_id_attribute_group_1")
	@CacheLookup
	private WebElement s51;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=8&controller=category#size-s']")
	@CacheLookup
	private WebElement s52;

	@FindBy(name = "submit_search")
	@CacheLookup
	private WebElement search;

	@FindBy(css = "a[title='Secure payment']")
	@CacheLookup
	private WebElement securePayment;

	@FindBy(id = "layered_id_feature_19")
	@CacheLookup
	private WebElement shortDress21;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=8&controller=category#properties-short_dress']")
	@CacheLookup
	private WebElement shortDress22;

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

	@FindBy(css = "#categories_block_left div.block_content ul.tree.dynamized li:nth-of-type(3) a")
	@CacheLookup
	private WebElement summerDresses3;

	@FindBy(id = "layered_category_11")
	@CacheLookup
	private WebElement summerDresses31;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=8&controller=category#categories-summer_dresses']")
	@CacheLookup
	private WebElement summerDresses32;

	@FindBy(css = "#subcategories ul.clearfix li:nth-of-type(3) h5 a.subcategory-name")
	@CacheLookup
	private WebElement summerDresses4;

	@FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(2) ul li:nth-of-type(3) a")
	@CacheLookup
	private WebElement summerDresses5;

	@FindBy(css = "a[href='mailto:%73%75%70%70%6f%72%74@%73%65%6c%65%6e%69%75%6d%66%72%61%6d%65%77%6f%72%6b.%63%6f%6d']")
	@CacheLookup
	private WebElement supportseleniumframeworkCom;

	@FindBy(css = "#informations_block_left_1 div.block_content.list-block ul li:nth-of-type(3) a")
	@CacheLookup
	private WebElement termsAndConditionsOfUse1;

	@FindBy(css = "#block_various_links_footer ul.toggle-footer li:nth-of-type(6) a")
	@CacheLookup
	private WebElement termsAndConditionsOfUse2;

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

	@FindBy(id = "layered_id_feature_3")
	@CacheLookup
	private WebElement viscose21;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=8&controller=category#compositions-viscose']")
	@CacheLookup
	private WebElement viscose22;

	@FindBy(id = "layered_id_attribute_group_8")
	@CacheLookup
	private WebElement white11;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=8&controller=category#color-white']")
	@CacheLookup
	private WebElement white12;

	@FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) a.sf-with-ul")
	@CacheLookup
	private WebElement women1;

	@FindBy(css = "#columns div:nth-of-type(1) a:nth-of-type(2)")
	@CacheLookup
	private WebElement women2;

	@FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last a")
	@CacheLookup
	private WebElement women3;

	@FindBy(id = "layered_id_attribute_group_16")
	@CacheLookup
	private WebElement yellow31;

	@FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=8&controller=category#color-yellow']")
	@CacheLookup
	private WebElement yellow32;

	@FindBy(css = "a[href='https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA']")
	@CacheLookup
	private WebElement youtube;

	public DressesPage() {
	}

	public DressesPage(WebDriver driver) {
		this();
		this.driver = driver;
	}

	public DressesPage(WebDriver driver, Map<String, String> data) {
		this(driver);
		this.data = data;
	}

	public DressesPage(WebDriver driver, Map<String, String> data, int timeout) {
		this(driver, data);
		this.timeout = timeout;
	}

	/**
	 * Click on About Us Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickAboutUs1Link() {
		aboutUs1.click();
		return this;
	}

	/**
	 * Click on About Us Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickAboutUs2Link() {
		aboutUs2.click();
		return this;
	}

	/**
	 * Click on Add To Cart Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickAddToCart1Link() {
		addToCart1.click();
		return this;
	}

	/**
	 * Click on Add To Cart Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickAddToCart2Link() {
		addToCart2.click();
		return this;
	}

	/**
	 * Click on Add To Cart Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickAddToCart3Link() {
		addToCart3.click();
		return this;
	}

	/**
	 * Click on Add To Cart Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickAddToCart4Link() {
		addToCart4.click();
		return this;
	}

	/**
	 * Click on Add To Cart Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickAddToCart5Link() {
		addToCart5.click();
		return this;
	}

	/**
	 * Click on Add To Compare Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickAddToCompare1Link() {
		addToCompare1.click();
		return this;
	}

	/**
	 * Click on Add To Compare Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickAddToCompare2Link() {
		addToCompare2.click();
		return this;
	}

	/**
	 * Click on Add To Compare Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickAddToCompare3Link() {
		addToCompare3.click();
		return this;
	}

	/**
	 * Click on Add To Compare Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickAddToCompare4Link() {
		addToCompare4.click();
		return this;
	}

	/**
	 * Click on Add To Compare Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickAddToCompare5Link() {
		addToCompare5.click();
		return this;
	}

	/**
	 * Click on Add To Wishlist Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickAddToWishlist1Link() {
		addToWishlist1.click();
		return this;
	}

	/**
	 * Click on Add To Wishlist Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickAddToWishlist2Link() {
		addToWishlist2.click();
		return this;
	}

	/**
	 * Click on Add To Wishlist Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickAddToWishlist3Link() {
		addToWishlist3.click();
		return this;
	}

	/**
	 * Click on Add To Wishlist Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickAddToWishlist4Link() {
		addToWishlist4.click();
		return this;
	}

	/**
	 * Click on Add To Wishlist Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickAddToWishlist5Link() {
		addToWishlist5.click();
		return this;
	}

	/**
	 * Click on All Specials Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickAllSpecialsLink() {
		allSpecials.click();
		return this;
	}

	/**
	 * Click on Beige 1 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickBeige11Link() {
		beige11.click();
		return this;
	}

	/**
	 * Click on Beige 1 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickBeige12Link() {
		beige12.click();
		return this;
	}

	/**
	 * Click on Best Sellers Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickBestSellersLink() {
		bestSellers.click();
		return this;
	}

	/**
	 * Click on Black 1 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickBlack11Link() {
		black11.click();
		return this;
	}

	/**
	 * Click on Black 1 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickBlack12Link() {
		black12.click();
		return this;
	}

	/**
	 * Click on Blouses Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickBlouses1Link() {
		blouses1.click();
		return this;
	}

	/**
	 * Click on Blouses Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickBlouses2Link() {
		blouses2.click();
		return this;
	}

	/**
	 * Click on Blue 1 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickBlue11Link() {
		blue11.click();
		return this;
	}

	/**
	 * Click on Blue 1 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickBlue12Link() {
		blue12.click();
		return this;
	}

	/**
	 * Click on Cart 0 Product Products Empty Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickCart0ProductProductsEmptyLink() {
		cart0ProductProductsEmpty.click();
		return this;
	}

	/**
	 * Click on Casual 1 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickCasual11Link() {
		if (!casual11.isSelected()) {
			casual11.click();
		}
		return this;
	}

	/**
	 * Click on Casual 1 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickCasual12Link() {
		casual12.click();
		return this;
	}

	/**
	 * Click on Casual Dresses 1 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickCasualDresses11Link() {
		if (!casualDresses11.isSelected()) {
			casualDresses11.click();
		}
		return this;
	}

	/**
	 * Click on Casual Dresses 1 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickCasualDresses12Link() {
		casualDresses12.click();
		return this;
	}

	/**
	 * Click on Casual Dresses Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickCasualDresses1Link() {
		casualDresses1.click();
		return this;
	}

	/**
	 * Click on Casual Dresses Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickCasualDresses2Link() {
		casualDresses2.click();
		return this;
	}

	/**
	 * Click on Casual Dresses Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickCasualDresses3Link() {
		casualDresses3.click();
		return this;
	}

	/**
	 * Click on Casual Dresses Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickCasualDresses4Link() {
		casualDresses4.click();
		return this;
	}

	/**
	 * Click on Casual Dresses Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickCasualDresses5Link() {
		casualDresses5.click();
		return this;
	}

	/**
	 * Click on Check Out Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickCheckOutLink() {
		checkOut.click();
		return this;
	}

	/**
	 * Click on Colorful Dress 1 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickColorfulDress11Link() {
		if (!colorfulDress11.isSelected()) {
			colorfulDress11.click();
		}
		return this;
	}

	/**
	 * Click on Colorful Dress 1 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickColorfulDress12Link() {
		colorfulDress12.click();
		return this;
	}

	/**
	 * Click on Compare 0 Button.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickCompare01Button() {
		compare01.click();
		return this;
	}

	/**
	 * Click on Compare 0 Button.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickCompare02Button() {
		compare02.click();
		return this;
	}

	/**
	 * Click on Contact Us Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickContactUs1Link() {
		contactUs1.click();
		return this;
	}

	/**
	 * Click on Contact Us Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickContactUs2Link() {
		contactUs2.click();
		return this;
	}

	/**
	 * Click on Cotton 1 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickCotton11Link() {
		if (!cotton11.isSelected()) {
			cotton11.click();
		}
		return this;
	}

	/**
	 * Click on Cotton 1 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickCotton12Link() {
		cotton12.click();
		return this;
	}

	/**
	 * Click on Delivery Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickDeliveryLink() {
		delivery.click();
		return this;
	}

	/**
	 * Click on Discover Our Stores Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickDiscoverOurStoresLink() {
		discoverOurStores.click();
		return this;
	}

	/**
	 * Click on Dresses Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickDresses1Link() {
		dresses1.click();
		return this;
	}

	/**
	 * Click on Dresses Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickDresses2Link() {
		dresses2.click();
		return this;
	}

	/**
	 * Click on Dresses Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickDresses3Link() {
		dresses3.click();
		return this;
	}

	/**
	 * Click on Dressy 1 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickDressy11Link() {
		if (!dressy11.isSelected()) {
			dressy11.click();
		}
		return this;
	}

	/**
	 * Click on Dressy 1 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickDressy12Link() {
		dressy12.click();
		return this;
	}

	/**
	 * Click on Ecommerce Software By Prestashop Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickEcommerceSoftwareByPrestashopLink() {
		ecommerceSoftwareByPrestashop.click();
		return this;
	}

	/**
	 * Click on Evening Dresses 1 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickEveningDresses11Link() {
		if (!eveningDresses11.isSelected()) {
			eveningDresses11.click();
		}
		return this;
	}

	/**
	 * Click on Evening Dresses 1 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickEveningDresses12Link() {
		eveningDresses12.click();
		return this;
	}

	/**
	 * Click on Evening Dresses Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickEveningDresses1Link() {
		eveningDresses1.click();
		return this;
	}

	/**
	 * Click on Evening Dresses Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickEveningDresses2Link() {
		eveningDresses2.click();
		return this;
	}

	/**
	 * Click on Evening Dresses Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickEveningDresses3Link() {
		eveningDresses3.click();
		return this;
	}

	/**
	 * Click on Evening Dresses Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickEveningDresses4Link() {
		eveningDresses4.click();
		return this;
	}

	/**
	 * Click on Evening Dresses Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickEveningDresses5Link() {
		eveningDresses5.click();
		return this;
	}

	/**
	 * Click on Facebook Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickFacebookLink() {
		facebook.click();
		return this;
	}

	/**
	 * Click on Faded Short Sleeve... Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickFadedShortSleeveLink() {
		fadedShortSleeve.click();
		return this;
	}

	/**
	 * Click on Fashion Manufacturer 5 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickFashionManufacturer51Link() {
		if (!fashionManufacturer51.isSelected()) {
			fashionManufacturer51.click();
		}
		return this;
	}

	/**
	 * Click on Fashion Manufacturer 5 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickFashionManufacturer52Link() {
		fashionManufacturer52.click();
		return this;
	}

	/**
	 * Click on Frodo Lastname Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickFrodoLastnameLink() {
		frodoLastname.click();
		return this;
	}

	/**
	 * Click on Girly 3 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickGirly31Link() {
		if (!girly31.isSelected()) {
			girly31.click();
		}
		return this;
	}

	/**
	 * Click on Girly 3 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickGirly32Link() {
		girly32.click();
		return this;
	}

	/**
	 * Click on Google Plus Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickGooglePlusLink() {
		googlePlus.click();
		return this;
	}

	/**
	 * Click on Green 1 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickGreen11Link() {
		green11.click();
		return this;
	}

	/**
	 * Click on Green 1 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickGreen12Link() {
		green12.click();
		return this;
	}

	/**
	 * Click on Grid Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickGridLink() {
		grid.click();
		return this;
	}

	/**
	 * Click on In Stock 5 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickInStock51Link() {
		if (!inStock51.isSelected()) {
			inStock51.click();
		}
		return this;
	}

	/**
	 * Click on In Stock 5 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickInStock52Link() {
		inStock52.click();
		return this;
	}

	/**
	 * Click on Information Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickInformationLink() {
		information.click();
		return this;
	}

	/**
	 * Click on L 5 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickL51Link() {
		if (!l51.isSelected()) {
			l51.click();
		}
		return this;
	}

	/**
	 * Click on L 5 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickL52Link() {
		l52.click();
		return this;
	}

	/**
	 * Click on Legal Notice Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickLegalNoticeLink() {
		legalNotice.click();
		return this;
	}

	/**
	 * Click on List Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickListLink() {
		list.click();
		return this;
	}

	/**
	 * Click on M 5 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickM51Link() {
		if (!m51.isSelected()) {
			m51.click();
		}
		return this;
	}

	/**
	 * Click on M 5 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickM52Link() {
		m52.click();
		return this;
	}

	/**
	 * Click on Maxi Dress 1 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickMaxiDress11Link() {
		if (!maxiDress11.isSelected()) {
			maxiDress11.click();
		}
		return this;
	}

	/**
	 * Click on Maxi Dress 1 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickMaxiDress12Link() {
		maxiDress12.click();
		return this;
	}

	/**
	 * Click on Midi Dress 1 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickMidiDress11Link() {
		if (!midiDress11.isSelected()) {
			midiDress11.click();
		}
		return this;
	}

	/**
	 * Click on Midi Dress 1 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickMidiDress12Link() {
		midiDress12.click();
		return this;
	}

	/**
	 * Click on More Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickMore1Link() {
		more1.click();
		return this;
	}

	/**
	 * Click on More Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickMore2Link() {
		more2.click();
		return this;
	}

	/**
	 * Click on More Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickMore3Link() {
		more3.click();
		return this;
	}

	/**
	 * Click on More Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickMore4Link() {
		more4.click();
		return this;
	}

	/**
	 * Click on More Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickMore5Link() {
		more5.click();
		return this;
	}

	/**
	 * Click on My Account Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickMyAccountLink() {
		myAccount.click();
		return this;
	}

	/**
	 * Click on My Addresses Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickMyAddressesLink() {
		myAddresses.click();
		return this;
	}

	/**
	 * Click on My Credit Slips Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickMyCreditSlipsLink() {
		myCreditSlips.click();
		return this;
	}

	/**
	 * Click on My Orders Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickMyOrdersLink() {
		myOrders.click();
		return this;
	}

	/**
	 * Click on My Personal Info Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickMyPersonalInfoLink() {
		myPersonalInfo.click();
		return this;
	}

	/**
	 * Click on New 5 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickNew51Link() {
		if (!new51.isSelected()) {
			new51.click();
		}
		return this;
	}

	/**
	 * Click on New 5 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickNew52Link() {
		new52.click();
		return this;
	}

	/**
	 * Click on New Products Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickNewProductsLink() {
		newProducts.click();
		return this;
	}

	/**
	 * Click on Ok Button.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickOkButton() {
		ok.click();
		return this;
	}

	/**
	 * Click on Orange 2 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickOrange21Link() {
		orange21.click();
		return this;
	}

	/**
	 * Click on Orange 2 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickOrange22Link() {
		orange22.click();
		return this;
	}

	/**
	 * Click on Our Stores Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickOurStores1Link() {
		ourStores1.click();
		return this;
	}

	/**
	 * Click on Our Stores Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickOurStores2Link() {
		ourStores2.click();
		return this;
	}

	/**
	 * Click on Our Stores Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickOurStores3Link() {
		ourStores3.click();
		return this;
	}

	/**
	 * Click on Pink 1 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickPink11Link() {
		pink11.click();
		return this;
	}

	/**
	 * Click on Pink 1 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickPink12Link() {
		pink12.click();
		return this;
	}

	/**
	 * Click on Polyester 2 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickPolyester21Link() {
		if (!polyester21.isSelected()) {
			polyester21.click();
		}
		return this;
	}

	/**
	 * Click on Polyester 2 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickPolyester22Link() {
		polyester22.click();
		return this;
	}

	/**
	 * Click on Printed Chiffon Dress Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickPrintedChiffonDress1Link() {
		printedChiffonDress1.click();
		return this;
	}

	/**
	 * Click on Printed Chiffon Dress Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickPrintedChiffonDress2Link() {
		printedChiffonDress2.click();
		return this;
	}

	/**
	 * Click on Printed Dress Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickPrintedDress1Link() {
		printedDress1.click();
		return this;
	}

	/**
	 * Click on Printed Dress Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickPrintedDress2Link() {
		printedDress2.click();
		return this;
	}

	/**
	 * Click on Printed Summer Dress Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickPrintedSummerDress1Link() {
		printedSummerDress1.click();
		return this;
	}

	/**
	 * Click on Printed Summer Dress Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickPrintedSummerDress2Link() {
		printedSummerDress2.click();
		return this;
	}

	/**
	 * Click on Proceed To Checkout Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickProceedToCheckoutLink() {
		proceedToCheckout.click();
		return this;
	}

	/**
	 * Click on Quick View Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickQuickView1Link() {
		quickView1.click();
		return this;
	}

	/**
	 * Click on Quick View Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickQuickView2Link() {
		quickView2.click();
		return this;
	}

	/**
	 * Click on Quick View Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickQuickView3Link() {
		quickView3.click();
		return this;
	}

	/**
	 * Click on Quick View Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickQuickView4Link() {
		quickView4.click();
		return this;
	}

	/**
	 * Click on Quick View Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickQuickView5Link() {
		quickView5.click();
		return this;
	}

	/**
	 * Click on S 5 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickS51Link() {
		if (!s51.isSelected()) {
			s51.click();
		}
		return this;
	}

	/**
	 * Click on S 5 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickS52Link() {
		s52.click();
		return this;
	}

	/**
	 * Click on Search Button.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickSearchButton() {
		search.click();
		return this;
	}

	/**
	 * Click on Secure Payment Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickSecurePaymentLink() {
		securePayment.click();
		return this;
	}

	/**
	 * Click on Short Dress 2 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickShortDress21Link() {
		if (!shortDress21.isSelected()) {
			shortDress21.click();
		}
		return this;
	}

	/**
	 * Click on Short Dress 2 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickShortDress22Link() {
		shortDress22.click();
		return this;
	}

	/**
	 * Click on Sign Out Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickSignOut1Link() {
		signOut1.click();
		return this;
	}

	/**
	 * Click on Sign Out Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickSignOut2Link() {
		signOut2.click();
		return this;
	}

	/**
	 * Click on Sitemap Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickSitemapLink() {
		sitemap.click();
		return this;
	}

	/**
	 * Click on Specials Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickSpecials1Link() {
		specials1.click();
		return this;
	}

	/**
	 * Click on Specials Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickSpecials2Link() {
		specials2.click();
		return this;
	}

	/**
	 * Click on Summer Dresses Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickSummerDresses1Link() {
		summerDresses1.click();
		return this;
	}

	/**
	 * Click on Summer Dresses Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickSummerDresses2Link() {
		summerDresses2.click();
		return this;
	}

	/**
	 * Click on Summer Dresses 3 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickSummerDresses31Link() {
		if (!summerDresses31.isSelected()) {
			summerDresses31.click();
		}
		return this;
	}

	/**
	 * Click on Summer Dresses 3 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickSummerDresses32Link() {
		summerDresses32.click();
		return this;
	}

	/**
	 * Click on Summer Dresses Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickSummerDresses3Link() {
		summerDresses3.click();
		return this;
	}

	/**
	 * Click on Summer Dresses Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickSummerDresses4Link() {
		summerDresses4.click();
		return this;
	}

	/**
	 * Click on Summer Dresses Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickSummerDresses5Link() {
		summerDresses5.click();
		return this;
	}

	/**
	 * Click on Supportseleniumframework.com Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickSupportseleniumframeworkComLink() {
		supportseleniumframeworkCom.click();
		return this;
	}

	/**
	 * Click on Terms And Conditions Of Use Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickTermsAndConditionsOfUse1Link() {
		termsAndConditionsOfUse1.click();
		return this;
	}

	/**
	 * Click on Terms And Conditions Of Use Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickTermsAndConditionsOfUse2Link() {
		termsAndConditionsOfUse2.click();
		return this;
	}

	/**
	 * Click on Tops Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickTops1Link() {
		tops1.click();
		return this;
	}

	/**
	 * Click on Tops Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickTops2Link() {
		tops2.click();
		return this;
	}

	/**
	 * Click on Tshirts Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickTshirts1Link() {
		tshirts1.click();
		return this;
	}

	/**
	 * Click on Tshirts Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickTshirts2Link() {
		tshirts2.click();
		return this;
	}

	/**
	 * Click on Tshirts Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickTshirts3Link() {
		tshirts3.click();
		return this;
	}

	/**
	 * Click on Twitter Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickTwitterLink() {
		twitter.click();
		return this;
	}

	/**
	 * Click on Viscose 2 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickViscose21Link() {
		if (!viscose21.isSelected()) {
			viscose21.click();
		}
		return this;
	}

	/**
	 * Click on Viscose 2 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickViscose22Link() {
		viscose22.click();
		return this;
	}

	/**
	 * Click on White 1 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickWhite11Link() {
		white11.click();
		return this;
	}

	/**
	 * Click on White 1 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickWhite12Link() {
		white12.click();
		return this;
	}

	/**
	 * Click on Women Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickWomen1Link() {
		women1.click();
		return this;
	}

	/**
	 * Click on Women Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickWomen2Link() {
		women2.click();
		return this;
	}

	/**
	 * Click on Women Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickWomen3Link() {
		women3.click();
		return this;
	}

	/**
	 * Click on Yellow 3 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickYellow31Link() {
		yellow31.click();
		return this;
	}

	/**
	 * Click on Yellow 3 Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickYellow32Link() {
		yellow32.click();
		return this;
	}

	/**
	 * Click on Youtube Link.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage clickYoutubeLink() {
		youtube.click();
		return this;
	}

	/**
	 * Fill every fields in the page.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage fill() {
		setProductSuccessfullyAddedToYourShoppingTextField();
		clickCasualDresses11Link();
		clickEveningDresses11Link();
		clickSummerDresses31Link();
		clickS51Link();
		clickM51Link();
		clickL51Link();
		clickCotton11Link();
		clickPolyester21Link();
		clickViscose21Link();
		clickCasual11Link();
		clickDressy11Link();
		clickGirly31Link();
		clickColorfulDress11Link();
		clickMaxiDress11Link();
		clickMidiDress11Link();
		clickShortDress21Link();
		clickInStock51Link();
		clickFashionManufacturer51Link();
		clickNew51Link();
		setSortByDropDownListField();
		setEcommerceSoftwareByPrestashopTextField2014();
		return this;
	}

	/**
	 * Fill every fields in the page and submit it to target page.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage fillAndSubmit() {
		fill();
		return submit();
	}

	/**
	 * Set default value to 2014 Ecommerce Software By Prestashop Text field.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage setEcommerceSoftwareByPrestashopTextField2014() {
		return setEcommerceSoftwareByPrestashopTextField2014(data.get("ECOMMERCE_SOFTWARE_BY_PRESTASHOP_2014"));
	}

	/**
	 * Set value to 2014 Ecommerce Software By Prestashop Text field.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage setEcommerceSoftwareByPrestashopTextField2014(String ecommerceSoftwareByPrestashopValue2014) {
		ecommerceSoftwareByPrestashop2014.sendKeys(ecommerceSoftwareByPrestashopValue2014);
		return this;
	}

	/**
	 * Set default value to Product Successfully Added To Your Shopping Cart Text
	 * field.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage setProductSuccessfullyAddedToYourShoppingTextField() {
		return setProductSuccessfullyAddedToYourShoppingTextField(
				data.get("PRODUCT_SUCCESSFULLY_ADDED_TO_YOUR_SHOPPING"));
	}

	/**
	 * Set value to Product Successfully Added To Your Shopping Cart Text field.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage setProductSuccessfullyAddedToYourShoppingTextField(
			String productSuccessfullyAddedToYourShoppingValue) {
		productSuccessfullyAddedToYourShopping.sendKeys(productSuccessfullyAddedToYourShoppingValue);
		return this;
	}

	/**
	 * Set default value to Sort By Drop Down List field.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage setSortByDropDownListField() {
		return setSortByDropDownListField(data.get("SORT_BY"));
	}

	/**
	 * Set value to Sort By Drop Down List field.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage setSortByDropDownListField(String sortByValue) {
		new Select(sortBy).selectByVisibleText(sortByValue);
		return this;
	}

	/**
	 * Submit the form to target page.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage submit() {
		clickSearchButton();
		return this;
	}

	/**
	 * Unset Casual Dresses 1 Checkbox field.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage unsetCasualDresses1CheckboxField() {
		if (casualDresses1.isSelected()) {
			casualDresses1.click();
		}
		return this;
	}

	/**
	 * Unset Evening Dresses 1 Checkbox field.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage unsetEveningDresses1CheckboxField() {
		if (eveningDresses1.isSelected()) {
			eveningDresses1.click();
		}
		return this;
	}

	/**
	 * Unset default value from Sort By Drop Down List field.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage unsetSortByDropDownListField() {
		return unsetSortByDropDownListField(data.get("SORT_BY"));
	}

	/**
	 * Unset value from Sort By Drop Down List field.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage unsetSortByDropDownListField(String sortByValue) {
		new Select(sortBy).deselectByVisibleText(sortByValue);
		return this;
	}

	/**
	 * Unset Summer Dresses 3 Checkbox field.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage unsetSummerDresses3CheckboxField() {
		if (summerDresses3.isSelected()) {
			summerDresses3.click();
		}
		return this;
	}

	/**
	 * Verify that the page loaded completely.
	 *
	 * @return the DressesPage class instance.
	 */
	public DressesPage verifyPageLoaded() {
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
	 * @return the DressesPage class instance.
	 */
	public DressesPage verifyPageUrl() {
		(new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver d) {
				return d.getCurrentUrl().contains(pageUrl);
			}
		});
		return this;
	}
}
