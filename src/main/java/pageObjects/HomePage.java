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

public class HomePage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;
    private String homeURL = "http://automationpractice.com";

    @FindBy(css = "a[title='About us']")
    @CacheLookup
    private WebElement aboutUs;

    @FindBy(css = "#homefeatured li:nth-of-type(1) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement addToCart1;

    @FindBy(css = "#blockbestsellers li:nth-of-type(3) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement addToCart10;

    @FindBy(css = "#blockbestsellers li:nth-of-type(4) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement addToCart11;

    @FindBy(css = "#blockbestsellers li:nth-of-type(5) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement addToCart12;

    @FindBy(css = "#blockbestsellers li:nth-of-type(6) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement addToCart13;

    @FindBy(css = "#blockbestsellers li:nth-of-type(7) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement addToCart14;

    @FindBy(css = "#homefeatured li:nth-of-type(2) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement addToCart2;

    @FindBy(css = "#homefeatured li:nth-of-type(3) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement addToCart3;

    @FindBy(css = "#homefeatured li:nth-of-type(4) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement addToCart4;

    @FindBy(css = "#homefeatured li:nth-of-type(5) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement addToCart5;

    @FindBy(css = "#homefeatured li:nth-of-type(6) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement addToCart6;

    @FindBy(css = "#homefeatured li:nth-of-type(7) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement addToCart7;

    @FindBy(css = "#blockbestsellers li:nth-of-type(1) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement addToCart8;

    @FindBy(css = "#blockbestsellers li:nth-of-type(2) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement addToCart9;

    @FindBy(css = "a.blockbestsellers")
    @CacheLookup
    private WebElement bestSellers;

    @FindBy(css = "a[title='Best sellers']")
    @CacheLookup
    private WebElement bestSellers1;

    @FindBy(css = "#homefeatured li:nth-of-type(2) div.product-container div:nth-of-type(2) h5 a.product-name")
    @CacheLookup
    private WebElement blouse1;

    @FindBy(css = "#blockbestsellers li:nth-of-type(3) div.product-container div:nth-of-type(2) h5 a.product-name")
    @CacheLookup
    private WebElement blouse2;

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

    @FindBy(css = "#homefeatured li:nth-of-type(1) div.product-container div:nth-of-type(2) h5 a.product-name")
    @CacheLookup
    private WebElement fadedShortSleeveTshirts1;

    @FindBy(css = "#blockbestsellers li:nth-of-type(2) div.product-container div:nth-of-type(2) h5 a.product-name")
    @CacheLookup
    private WebElement fadedShortSleeveTshirts2;

    @FindBy(css = "a[href='https://plus.google.com/111979135243110831526/posts']")
    @CacheLookup
    private WebElement googlePlus;

    @FindBy(css = "#homefeatured li:nth-of-type(1) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement more1;

    @FindBy(css = "#blockbestsellers li:nth-of-type(3) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement more10;

    @FindBy(css = "#blockbestsellers li:nth-of-type(4) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement more11;

    @FindBy(css = "#blockbestsellers li:nth-of-type(5) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement more12;

    @FindBy(css = "#blockbestsellers li:nth-of-type(6) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement more13;

    @FindBy(css = "#blockbestsellers li:nth-of-type(7) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement more14;

    @FindBy(css = "#homefeatured li:nth-of-type(2) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement more2;

    @FindBy(css = "#homefeatured li:nth-of-type(3) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement more3;

    @FindBy(css = "#homefeatured li:nth-of-type(4) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement more4;

    @FindBy(css = "#homefeatured li:nth-of-type(5) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement more5;

    @FindBy(css = "#homefeatured li:nth-of-type(6) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement more6;

    @FindBy(css = "#homefeatured li:nth-of-type(7) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement more7;

    @FindBy(css = "#blockbestsellers li:nth-of-type(1) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement more8;

    @FindBy(css = "#blockbestsellers li:nth-of-type(2) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement more9;

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

    @FindBy(css = "a[title='New products']")
    @CacheLookup
    private WebElement newProducts;

    @FindBy(css = "a.bx-next")
    @CacheLookup
    private WebElement next;

    @FindBy(name = "submitNewsletter")
    @CacheLookup
    private WebElement ok;

    @FindBy(css = "a[title='Our stores']")
    @CacheLookup
    private WebElement ourStores;

    private final String pageLoadedText = "The website was an inspiration from the fact that there is no website that can bridge the gaps between the differences among various programming languages and help non-programmers get a taste of Automation";

    private final String pageUrl = "/index.php";

    @FindBy(css = "a.homefeatured")
    @CacheLookup
    private WebElement popular;

    @FindBy(css = "a.bx-prev")
    @CacheLookup
    private WebElement prev;

    @FindBy(css = "#homefeatured li:nth-of-type(7) div.product-container div:nth-of-type(2) h5 a.product-name")
    @CacheLookup
    private WebElement printedChiffonDress1;

    @FindBy(css = "#blockbestsellers li:nth-of-type(1) div.product-container div:nth-of-type(2) h5 a.product-name")
    @CacheLookup
    private WebElement printedChiffonDress2;

    @FindBy(css = "#homefeatured li:nth-of-type(3) div.product-container div:nth-of-type(2) h5 a.product-name")
    @CacheLookup
    private WebElement printedDress1;

    @FindBy(css = "#homefeatured li:nth-of-type(4) div.product-container div:nth-of-type(2) h5 a.product-name")
    @CacheLookup
    private WebElement printedDress2;

    @FindBy(css = "#blockbestsellers li:nth-of-type(5) div.product-container div:nth-of-type(2) h5 a.product-name")
    @CacheLookup
    private WebElement printedDress3;

    @FindBy(css = "#blockbestsellers li:nth-of-type(7) div.product-container div:nth-of-type(2) h5 a.product-name")
    @CacheLookup
    private WebElement printedDress4;

    @FindBy(css = "#homefeatured li:nth-of-type(5) div.product-container div:nth-of-type(2) h5 a.product-name")
    @CacheLookup
    private WebElement printedSummerDress1;

    @FindBy(css = "#homefeatured li:nth-of-type(6) div.product-container div:nth-of-type(2) h5 a.product-name")
    @CacheLookup
    private WebElement printedSummerDress2;

    @FindBy(css = "#blockbestsellers li:nth-of-type(4) div.product-container div:nth-of-type(2) h5 a.product-name")
    @CacheLookup
    private WebElement printedSummerDress3;

    @FindBy(css = "#blockbestsellers li:nth-of-type(6) div.product-container div:nth-of-type(2) h5 a.product-name")
    @CacheLookup
    private WebElement printedSummerDress4;

    @FindBy(css = "a.btn.btn-default.button.button-medium")
    @CacheLookup
    private WebElement proceedToCheckout;

    @FindBy(id = "search_query_top")
    @CacheLookup
    private WebElement productSuccessfullyAddedToYourShopping;

    @FindBy(css = "#homefeatured li:nth-of-type(1) div.product-container div:nth-of-type(1) div.product-image-container a:nth-of-type(2)")
    @CacheLookup
    private WebElement quickView1;

    @FindBy(css = "#blockbestsellers li:nth-of-type(3) div.product-container div:nth-of-type(1) div.product-image-container a:nth-of-type(2)")
    @CacheLookup
    private WebElement quickView10;

    @FindBy(css = "#blockbestsellers li:nth-of-type(4) div.product-container div:nth-of-type(1) div.product-image-container a:nth-of-type(2)")
    @CacheLookup
    private WebElement quickView11;

    @FindBy(css = "#blockbestsellers li:nth-of-type(5) div.product-container div:nth-of-type(1) div.product-image-container a:nth-of-type(2)")
    @CacheLookup
    private WebElement quickView12;

    @FindBy(css = "#blockbestsellers li:nth-of-type(6) div.product-container div:nth-of-type(1) div.product-image-container a:nth-of-type(2)")
    @CacheLookup
    private WebElement quickView13;

    @FindBy(css = "#blockbestsellers li:nth-of-type(7) div.product-container div:nth-of-type(1) div.product-image-container a:nth-of-type(2)")
    @CacheLookup
    private WebElement quickView14;

    @FindBy(css = "#homefeatured li:nth-of-type(2) div.product-container div:nth-of-type(1) div.product-image-container a:nth-of-type(2)")
    @CacheLookup
    private WebElement quickView2;

    @FindBy(css = "#homefeatured li:nth-of-type(3) div.product-container div:nth-of-type(1) div.product-image-container a:nth-of-type(2)")
    @CacheLookup
    private WebElement quickView3;

    @FindBy(css = "#homefeatured li:nth-of-type(4) div.product-container div:nth-of-type(1) div.product-image-container a:nth-of-type(2)")
    @CacheLookup
    private WebElement quickView4;

    @FindBy(css = "#homefeatured li:nth-of-type(5) div.product-container div:nth-of-type(1) div.product-image-container a:nth-of-type(2)")
    @CacheLookup
    private WebElement quickView5;

    @FindBy(css = "#homefeatured li:nth-of-type(6) div.product-container div:nth-of-type(1) div.product-image-container a:nth-of-type(2)")
    @CacheLookup
    private WebElement quickView6;

    @FindBy(css = "#homefeatured li:nth-of-type(7) div.product-container div:nth-of-type(1) div.product-image-container a:nth-of-type(2)")
    @CacheLookup
    private WebElement quickView7;

    @FindBy(css = "#blockbestsellers li:nth-of-type(1) div.product-container div:nth-of-type(1) div.product-image-container a:nth-of-type(2)")
    @CacheLookup
    private WebElement quickView8;

    @FindBy(css = "#blockbestsellers li:nth-of-type(2) div.product-container div:nth-of-type(1) div.product-image-container a:nth-of-type(2)")
    @CacheLookup
    private WebElement quickView9;

    @FindBy(name = "submit_search")
    @CacheLookup
    private WebElement search;

    @FindBy(css = "a[href='http://www.seleniumframework.com']")
    @CacheLookup
    private WebElement seleniumFramework;

    @FindBy(css = "#homeslider li:nth-of-type(1) div.homeslider-description p:nth-of-type(2) button.btn.btn-default")
    @CacheLookup
    private WebElement shopNow1;

    @FindBy(css = "#homeslider li:nth-of-type(2) div.homeslider-description p:nth-of-type(2) button.btn.btn-default")
    @CacheLookup
    private WebElement shopNow2;

    @FindBy(css = "#homeslider li:nth-of-type(3) div.homeslider-description p:nth-of-type(2) button.btn.btn-default")
    @CacheLookup
    private WebElement shopNow3;

    @FindBy(css = "#homeslider li:nth-of-type(4) div.homeslider-description p:nth-of-type(2) button.btn.btn-default")
    @CacheLookup
    private WebElement shopNow4;

    @FindBy(css = "#homeslider li:nth-of-type(5) div.homeslider-description p:nth-of-type(2) button.btn.btn-default")
    @CacheLookup
    private WebElement shopNow5;

    @FindBy(css = "a.login")
    @CacheLookup
    private WebElement signIn;

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

    public HomePage() {
    }

    public HomePage(WebDriver driver) {
    	this.driver = driver;
		PageFactory.initElements(driver, this);
    }

    public HomePage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public HomePage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Us Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAboutUsLink() {
        aboutUs.click();
        return this;
    }

    /**
     * Click on Add To Cart Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAddToCart10Link() {
        addToCart10.click();
        return this;
    }

    /**
     * Click on Add To Cart Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAddToCart11Link() {
        addToCart11.click();
        return this;
    }

    /**
     * Click on Add To Cart Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAddToCart12Link() {
        addToCart12.click();
        return this;
    }

    /**
     * Click on Add To Cart Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAddToCart13Link() {
        addToCart13.click();
        return this;
    }

    /**
     * Click on Add To Cart Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAddToCart14Link() {
        addToCart14.click();
        return this;
    }

    /**
     * Click on Add To Cart Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAddToCart1Link() {
        addToCart1.click();
        return this;
    }

    /**
     * Click on Add To Cart Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAddToCart2Link() {
        addToCart2.click();
        return this;
    }

    /**
     * Click on Add To Cart Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAddToCart3Link() {
        addToCart3.click();
        return this;
    }

    /**
     * Click on Add To Cart Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAddToCart4Link() {
        addToCart4.click();
        return this;
    }

    /**
     * Click on Add To Cart Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAddToCart5Link() {
        addToCart5.click();
        return this;
    }

    /**
     * Click on Add To Cart Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAddToCart6Link() {
        addToCart6.click();
        return this;
    }

    /**
     * Click on Add To Cart Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAddToCart7Link() {
        addToCart7.click();
        return this;
    }

    /**
     * Click on Add To Cart Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAddToCart8Link() {
        addToCart8.click();
        return this;
    }

    /**
     * Click on Add To Cart Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAddToCart9Link() {
        addToCart9.click();
        return this;
    }

    /**
     * Click on Best Sellers Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBestSellersLink() {
        bestSellers.click();
        return this;
    }

    /**
     * Click on Best Sellers Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBestSellersLink1() {
        bestSellers.click();
        return this;
    }

    /**
     * Click on Blouse Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBlouse1Link() {
        blouse1.click();
        return this;
    }

    /**
     * Click on Blouse Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBlouse2Link() {
        blouse2.click();
        return this;
    }

    /**
     * Click on Blouses Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBlouses1Link() {
        blouses1.click();
        return this;
    }

    /**
     * Click on Blouses Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBlouses2Link() {
        blouses2.click();
        return this;
    }

    /**
     * Click on Cart 0 Product Products Empty Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCart0ProductProductsEmptyLink() {
        cart0ProductProductsEmpty.click();
        return this;
    }

    /**
     * Click on Casual Dresses Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCasualDresses1Link() {
        casualDresses1.click();
        return this;
    }

    /**
     * Click on Casual Dresses Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCasualDresses2Link() {
        casualDresses2.click();
        return this;
    }

    /**
     * Click on Casual Dresses Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCasualDresses3Link() {
        casualDresses3.click();
        return this;
    }

    /**
     * Click on Check Out Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCheckOutLink() {
        checkOut.click();
        return this;
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
     * Click on Dresses Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickDresses1Link() {
        dresses1.click();
        return this;
    }

    /**
     * Click on Dresses Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickDresses2Link() {
        dresses2.click();
        return this;
    }

    /**
     * Click on Dresses Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickDresses3Link() {
        dresses3.click();
        return this;
    }

    /**
     * Click on Ecommerce Software By Prestashop Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickEcommerceSoftwareByPrestashopLink() {
        ecommerceSoftwareByPrestashop.click();
        return this;
    }

    /**
     * Click on Evening Dresses Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickEveningDresses1Link() {
        eveningDresses1.click();
        return this;
    }

    /**
     * Click on Evening Dresses Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickEveningDresses2Link() {
        eveningDresses2.click();
        return this;
    }

    /**
     * Click on Evening Dresses Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickEveningDresses3Link() {
        eveningDresses3.click();
        return this;
    }

    /**
     * Click on Facebook Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickFacebookLink() {
        facebook.click();
        return this;
    }

    /**
     * Click on Faded Short Sleeve Tshirts Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickFadedShortSleeveTshirts1Link() {
        fadedShortSleeveTshirts1.click();
        return this;
    }

    /**
     * Click on Faded Short Sleeve Tshirts Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickFadedShortSleeveTshirts2Link() {
        fadedShortSleeveTshirts2.click();
        return this;
    }

    /**
     * Click on Google Plus Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickGooglePlusLink() {
        googlePlus.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMore10Link() {
        more10.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMore11Link() {
        more11.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMore12Link() {
        more12.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMore13Link() {
        more13.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMore14Link() {
        more14.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMore1Link() {
        more1.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMore2Link() {
        more2.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMore3Link() {
        more3.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMore4Link() {
        more4.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMore5Link() {
        more5.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMore6Link() {
        more6.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMore7Link() {
        more7.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMore8Link() {
        more8.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMore9Link() {
        more9.click();
        return this;
    }

    /**
     * Click on My Account Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMyAccountLink() {
        myAccount.click();
        return this;
    }

    /**
     * Click on My Addresses Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMyAddressesLink() {
        myAddresses.click();
        return this;
    }

    /**
     * Click on My Credit Slips Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMyCreditSlipsLink() {
        myCreditSlips.click();
        return this;
    }

    /**
     * Click on My Orders Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMyOrdersLink() {
        myOrders.click();
        return this;
    }

    /**
     * Click on My Personal Info Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMyPersonalInfoLink() {
        myPersonalInfo.click();
        return this;
    }

    /**
     * Click on New Products Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickNewProductsLink() {
        newProducts.click();
        return this;
    }

    /**
     * Click on Next Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickNextLink() {
        next.click();
        return this;
    }

    /**
     * Click on Ok Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickOkButton() {
        ok.click();
        return this;
    }

    /**
     * Click on Our Stores Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickOurStoresLink() {
        ourStores.click();
        return this;
    }

    /**
     * Click on Popular Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPopularLink() {
        popular.click();
        return this;
    }

    /**
     * Click on Prev Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPrevLink() {
        prev.click();
        return this;
    }

    /**
     * Click on Printed Chiffon Dress Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPrintedChiffonDress1Link() {
        printedChiffonDress1.click();
        return this;
    }

    /**
     * Click on Printed Chiffon Dress Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPrintedChiffonDress2Link() {
        printedChiffonDress2.click();
        return this;
    }

    /**
     * Click on Printed Dress Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPrintedDress1Link() {
        printedDress1.click();
        return this;
    }

    /**
     * Click on Printed Dress Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPrintedDress2Link() {
        printedDress2.click();
        return this;
    }

    /**
     * Click on Printed Dress Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPrintedDress3Link() {
        printedDress3.click();
        return this;
    }

    /**
     * Click on Printed Dress Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPrintedDress4Link() {
        printedDress4.click();
        return this;
    }

    /**
     * Click on Printed Summer Dress Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPrintedSummerDress1Link() {
        printedSummerDress1.click();
        return this;
    }

    /**
     * Click on Printed Summer Dress Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPrintedSummerDress2Link() {
        printedSummerDress2.click();
        return this;
    }

    /**
     * Click on Printed Summer Dress Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPrintedSummerDress3Link() {
        printedSummerDress3.click();
        return this;
    }

    /**
     * Click on Printed Summer Dress Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPrintedSummerDress4Link() {
        printedSummerDress4.click();
        return this;
    }

    /**
     * Click on Proceed To Checkout Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickProceedToCheckoutLink() {
        proceedToCheckout.click();
        return this;
    }

    /**
     * Click on Quick View Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickQuickView10Link() {
        quickView10.click();
        return this;
    }

    /**
     * Click on Quick View Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickQuickView11Link() {
        quickView11.click();
        return this;
    }

    /**
     * Click on Quick View Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickQuickView12Link() {
        quickView12.click();
        return this;
    }

    /**
     * Click on Quick View Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickQuickView13Link() {
        quickView13.click();
        return this;
    }

    /**
     * Click on Quick View Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickQuickView14Link() {
        quickView14.click();
        return this;
    }

    /**
     * Click on Quick View Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickQuickView1Link() {
        quickView1.click();
        return this;
    }

    /**
     * Click on Quick View Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickQuickView2Link() {
        quickView2.click();
        return this;
    }

    /**
     * Click on Quick View Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickQuickView3Link() {
        quickView3.click();
        return this;
    }

    /**
     * Click on Quick View Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickQuickView4Link() {
        quickView4.click();
        return this;
    }

    /**
     * Click on Quick View Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickQuickView5Link() {
        quickView5.click();
        return this;
    }

    /**
     * Click on Quick View Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickQuickView6Link() {
        quickView6.click();
        return this;
    }

    /**
     * Click on Quick View Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickQuickView7Link() {
        quickView7.click();
        return this;
    }

    /**
     * Click on Quick View Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickQuickView8Link() {
        quickView8.click();
        return this;
    }

    /**
     * Click on Quick View Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickQuickView9Link() {
        quickView9.click();
        return this;
    }

    /**
     * Click on Search Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSearchButton() {
        search.click();
        return this;
    }

    /**
     * Click on Selenium Framework Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSeleniumFrameworkLink() {
        seleniumFramework.click();
        return this;
    }

    /**
     * Click on Shop Now Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickShopNow1Button() {
        shopNow1.click();
        return this;
    }

    /**
     * Click on Shop Now Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickShopNow2Button() {
        shopNow2.click();
        return this;
    }

    /**
     * Click on Shop Now Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickShopNow3Button() {
        shopNow3.click();
        return this;
    }

    /**
     * Click on Shop Now Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickShopNow4Button() {
        shopNow4.click();
        return this;
    }

    /**
     * Click on Shop Now Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickShopNow5Button() {
        shopNow5.click();
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

    /**
     * Click on Sitemap Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSitemapLink() {
        sitemap.click();
        return this;
    }

    /**
     * Click on Specials Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSpecialsLink() {
        specials.click();
        return this;
    }

    /**
     * Click on Summer Dresses Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSummerDresses1Link() {
        summerDresses1.click();
        return this;
    }

    /**
     * Click on Summer Dresses Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSummerDresses2Link() {
        summerDresses2.click();
        return this;
    }

    /**
     * Click on Summer Dresses Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSummerDresses3Link() {
        summerDresses3.click();
        return this;
    }

    /**
     * Click on Supportseleniumframework.com Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSupportseleniumframeworkComLink() {
        supportseleniumframeworkCom.click();
        return this;
    }

    /**
     * Click on Terms And Conditions Of Use Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTermsAndConditionsOfUseLink() {
        termsAndConditionsOfUse.click();
        return this;
    }

    /**
     * Click on Tops Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTops1Link() {
        tops1.click();
        return this;
    }

    /**
     * Click on Tops Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTops2Link() {
        tops2.click();
        return this;
    }

    /**
     * Click on Tshirts Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTshirts1Link() {
        tshirts1.click();
        return this;
    }

    /**
     * Click on Tshirts Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTshirts2Link() {
        tshirts2.click();
        return this;
    }

    /**
     * Click on Tshirts Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTshirts3Link() {
        tshirts3.click();
        return this;
    }

    /**
     * Click on Twitter Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTwitterLink() {
        twitter.click();
        return this;
    }

    /**
     * Click on Women Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWomen1Link() {
        women1.click();
        return this;
    }

    /**
     * Click on Women Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWomen2Link() {
        women2.click();
        return this;
    }

    /**
     * Click on Youtube Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickYoutubeLink() {
        youtube.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the HomePage class instance.
     */
    public HomePage fill() {
        setProductSuccessfullyAddedToYourShoppingTextField();
        setEcommerceSoftwareByPrestashopTextField2014();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the HomePage class instance.
     */
    public HomePage fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to 2014 Ecommerce Software By Prestashop Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setEcommerceSoftwareByPrestashopTextField2014() {
        return setEcommerceSoftwareByPrestashopTextField2014(data.get("ECOMMERCE_SOFTWARE_BY_PRESTASHOP_2014"));
    }

    /**
     * Set value to 2014 Ecommerce Software By Prestashop Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setEcommerceSoftwareByPrestashopTextField2014(String ecommerceSoftwareByPrestashopValue2014) {
        ecommerceSoftwareByPrestashop2014.sendKeys(ecommerceSoftwareByPrestashopValue2014);
        return this;
    }

    /**
     * Set default value to Product Successfully Added To Your Shopping Cart Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setProductSuccessfullyAddedToYourShoppingTextField() {
        return setProductSuccessfullyAddedToYourShoppingTextField(data.get("PRODUCT_SUCCESSFULLY_ADDED_TO_YOUR_SHOPPING"));
    }

    /**
     * Set value to Product Successfully Added To Your Shopping Cart Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setProductSuccessfullyAddedToYourShoppingTextField(String productSuccessfullyAddedToYourShoppingValue) {
        productSuccessfullyAddedToYourShopping.sendKeys(productSuccessfullyAddedToYourShoppingValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the HomePage class instance.
     */
    public HomePage submit() {
        clickSearchButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the HomePage class instance.
     */
    public HomePage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the HomePage class instance.
     */
    public HomePage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
    
    public void navigateTo_HomePage() {
		driver.get(this.homeURL);
	}
    
    
}


   