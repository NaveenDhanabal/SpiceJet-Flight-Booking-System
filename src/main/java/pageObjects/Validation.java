package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Validation {

	public WebDriver driver;
	public Validation(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	
//Check-In Validation	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-ymttw5 r-1f1sjgu r-1otgn73'])[1]")
	WebElement chekinbtn;
	@FindBy(xpath="(//input[@placeholder='e.g. W3X3H8'])[1]")
	WebElement pnrnumber;
	@FindBy(xpath="(//input[@placeholder='john.doe@spicejet.com'])[1]")
	WebElement email;
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73 r-13qz1uu'])[1]")
	WebElement searchbtn;
	@FindBy(xpath="(//div[@class='css-76zvg2 css-cens5h r-jwli3a'])[1]")
	WebElement message;
	
	public void CheckIn(String PNR, String Email) throws InterruptedException {
		chekinbtn.click();
		Thread.sleep(2000);
		pnrnumber.sendKeys(PNR);
		Thread.sleep(2000);
		email.sendKeys(Email);
		Thread.sleep(2000);
		searchbtn.click();
		Thread.sleep(2000);
		System.out.println("Please Enter Valid PNR Number/Ticket Number. "+message.getText());
		}
	
//Flight Status Validation
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-ymttw5 r-1f1sjgu r-1otgn73'])[2]")
	WebElement flightstatus;
	@FindBy(xpath="(//div[contains(text(),'From')])[1]")
	WebElement from;
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement fromorigin;
	@FindBy(xpath="(//div[@class='r-1862ga2 r-1loqt21 r-1enofrn r-tceitz r-u8s1d css-76zvg2'][normalize-space()='To'])[1]")
	WebElement to;
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement destination;
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73 r-13qz1uu'])[1]")
	WebElement searchflight;
	
	public void FilghtStatus(String From, String To) throws InterruptedException {
		flightstatus.click();
		Thread.sleep(2000);
		from.click();
		Thread.sleep(2000);
		fromorigin.sendKeys(From);
		Thread.sleep(2000);
		destination.sendKeys(To);
		Thread.sleep(2000);
		searchflight.click();
		Thread.sleep(5000);
		System.out.println("Please Find an Available flights.. Thank You..!!!");
	}

//Manage Booking Validation
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-notknq r-1loqt21 r-18u37iz r-ymttw5 r-1f1sjgu r-1otgn73'])[1]")
	WebElement managebooking;
	
	@FindBy(xpath="(//input[@placeholder='john.doe@spicejet.com / Doe'])[1]")
	WebElement email1;

	public void ManageBooking(String PNR, String Email) throws InterruptedException {
		managebooking.click();
		Thread.sleep(2000);
		pnrnumber.sendKeys(PNR);
		Thread.sleep(2000);
		email1.sendKeys(Email);
		Thread.sleep(2000);
		searchbtn.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		System.out.println("Please Enter Valid PNR Number/Ticket Number. "+message.getText());
		
	}
}