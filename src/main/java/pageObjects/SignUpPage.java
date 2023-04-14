package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

	public WebDriver driver;
	public SignUpPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	
	@FindBy(xpath="(//div[@class=\"css-76zvg2 r-jwli3a r-ubezar\"])[2]")
	WebElement signupbutton;
	
	@FindBy(xpath="(//option[@value='MR'])[1]")
	WebElement title;
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='last_name']")
	WebElement lastname;
	
	@FindBy(xpath="//select[@class='form-control form-select']")
	WebElement country;
	
	@FindBy(xpath="//input[@id='dobDate']")
	WebElement dateofbirth;
	
	@FindBy(xpath="(//div[@aria-label='Choose Tuesday, January 1st, 1991'])[1]")
	WebElement dob;
	
	@FindBy(xpath="//input[@type='tel']")
	WebElement mobilenumber;
	
	@FindBy(xpath="(//input[@id='email_id'])[1]")
	WebElement emailid;
	
	@FindBy(xpath="//input[@id='new-password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='c-password']")
	WebElement confirmpassword;
	
	@FindBy(xpath="(//input[@id='defaultCheck1'])[1]")
	WebElement defaultcheck;
	
	@FindBy(css = "button[type='button']")
	WebElement submitbutton;
	
	public void SignupButton () {
	signupbutton.click();
	}
	public void Title() {
		title.click();
	}
	public void Firstname(String FirstName) {
		firstname.sendKeys(FirstName);
	}
	public void Lastname (String LastName) {
		lastname.sendKeys(LastName);
	}
	public void Country(String Country) {
		country.sendKeys(Country);
	}
	public void DOB (String DOB) throws InterruptedException {
		dateofbirth.sendKeys(DOB);
		Thread.sleep(2000);
		dob.click();
		Thread.sleep(2000);
	}
	public void MobileNumber(String MobileNumber) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for(int i=0;i<=1;i++) {
			js.executeScript("window.scrollBy(0,250)");
			Thread.sleep(2000);
			}
		mobilenumber.sendKeys(MobileNumber);
	}
	public void EmailId (String Email) {
		emailid.sendKeys(Email);
	}
	public void Password(String Password) {
		password.sendKeys(Password);
	}
	public void ConfirmPassword(String ConfirmPassword) {
		confirmpassword.sendKeys(ConfirmPassword);
	}
	public void DefaultClick () {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",defaultcheck);
	}
	public void SubmitButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",submitbutton);
		
	}
		
	
	
}
