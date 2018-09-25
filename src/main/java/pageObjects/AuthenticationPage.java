package pageObjects;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthenticationPage {
	WebDriver driver;
	@FindBy(id = "passwd")
	@CacheLookup
	private WebElement password;

	@FindBy(how = How.CSS, using = "#email")
	@CacheLookup
	private WebElement email;

	@FindBy(id = "SubmitLogin")
	@CacheLookup
	private WebElement submitLogIn;

	public AuthenticationPage() {
	}

	public AuthenticationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public AuthenticationPage(WebDriver driver, Map<String, String> data) {
		this(driver);
	}

	public AuthenticationPage(WebDriver driver, Map<String, String> data, int timeout) {
		this(driver, data);
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}

	public AuthenticationPage clickSubmit() {
		submitLogIn.click();
		return this;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public void login(String email, String password) {
		setEmail(email);
		setPassword(password);
		clickSubmit();
	}

}
