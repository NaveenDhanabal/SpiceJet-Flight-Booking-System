package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	
	@FindBy(xpath="//div[contains(text(),'Login')]")
	WebElement loginkey;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa'])[4]")
	WebElement emailbutton;
	
	@FindBy(xpath="(//input[@type='email'])[1]")
	WebElement enteremailid;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement enterpassword;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement enterinvalidpassword;
	
	@FindBy(xpath="//div[@data-testid=\"login-cta\"]")
	WebElement loginbutton;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-13awgt0 r-18u37iz'])[1]")
	WebElement message;
	
	
	//create a methods 
	public void Login() {
		loginkey.click();
	}
	public void EmailButton() {
		emailbutton.click();
	}
	public void EmailId(String EmailId) {
		enteremailid.sendKeys(EmailId);
	}
	public void Password(String Password) {
		enterpassword.sendKeys(Password);
	}
	public void InvalidPassword(String InvalidPassword) {
		enterinvalidpassword.sendKeys(InvalidPassword);
	}
	public void LoginButton() {
		loginbutton.click();
	}
	public void Message() {
		System.out.println(message.getText());
	}

}
