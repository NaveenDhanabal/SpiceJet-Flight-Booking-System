package pageObjects;

import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Passengers {

	public WebDriver driver;
	public Passengers(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}

	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement firstname;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement lastname;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement number;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	WebElement emailid;
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	WebElement townorcity;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73'])[2]")
	WebElement uncheck;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73'])[3]")
	WebElement checkbox;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73'])[5]")
	WebElement primarypassenger;
	
	@FindBy(xpath="(//input[@type='text'])[6]")
	WebElement firstnameP1;
	
	@FindBy(xpath="(//input[@type='text'])[7]")
	WebElement lastnameP1;
	
	@FindBy(xpath="(//input[@type='text'])[8]")
	WebElement phonenumberP1;
	
	@FindBy(xpath="(//input[@type='text'])[9]")
	WebElement studentIDnumber;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-19m6qjp r-z2wwpe r-1loqt21 r-156q2ks r-1sp51qo r-d9fdf6 r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr'])[1]")
	WebElement nextbtn;
	
//for DOB:
	@FindBy(xpath="(//input)[9]")
	WebElement dobselection;
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1loqt21 r-12zupyf r-1otgn73'])[17]")
	WebElement year;
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1loqt21 r-12zupyf r-1otgn73'])[1]")
	WebElement month;
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1loqt21 r-1otgn73'])[12]")
	WebElement date;
	
//for Validupto:
	@FindBy(xpath="(//input)[10]")
	WebElement validupto;
	@FindBy(xpath="(//div[contains(text(),'2031')])[1]")
	WebElement validyear;
	@FindBy(xpath="(//div[contains(text(),'Apr')])[1]")
	WebElement validmonth;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-1awozwy r-14lw9ot r-qsz3a2 r-6koalj r-poiln3 r-1r8g8re r-1777fci r-1acpoxo'][normalize-space()='15'])[2]")
	WebElement validdate;
	
//for passport Number:
	@FindBy(xpath="(//input[@type='text'])[11]")
	WebElement passpoernumber;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-1ugchlj r-1777fci r-ymttw5 r-rjfia r-1otgn73 r-l0lkf8'])[1]")
	WebElement nationality;
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-14lw9ot r-18u37iz r-1e081e0 r-oyd9sg'])[1]")
	WebElement india;
	
	
	public void ContactInfo(String FirstName, String LastName, String PhoneNumber, String Email, String City) throws InterruptedException {
		firstname.sendKeys(FirstName);
		Thread.sleep(1000);
		lastname.sendKeys(LastName);
		Thread.sleep(1000);
		number.sendKeys(PhoneNumber);
		Thread.sleep(1000);
		emailid.sendKeys(Email);
		Thread.sleep(1000);
		townorcity.sendKeys(City);
		Thread.sleep(1000);
		uncheck.click();
		Thread.sleep(1000);
		checkbox.click();
		}
	public void PrimaryPassenger() {
		primarypassenger.click();
	}
	public <PassengerDetails> void PassengerDetails(String FirstName, String LastName, String PhoneNumber, String IDnumber) throws InterruptedException {
		firstnameP1.sendKeys(FirstName);
		Thread.sleep(1000);
		lastnameP1.sendKeys(LastName);
		Thread.sleep(1000);
		phonenumberP1.sendKeys(PhoneNumber);
		Thread.sleep(1000);
		if(studentIDnumber!=null) {
		studentIDnumber.sendKeys(IDnumber);
		}else {
			final PassengerDetails retrun ;
			
		}
	}
	
	public void DOBButton() throws InterruptedException {
		dobselection.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}
	public void DOB() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElements(year));
		year.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfAllElements(month));
		month.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfAllElements(date));
		date.click();
	}
	public void Nationality() throws InterruptedException {
		nationality.click();
		Thread.sleep(1000);
		india.click();		
	}
	public void ValidUpto() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		validupto.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfAllElements(validyear));
		validyear.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfAllElements(validmonth));
		validmonth.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfAllElements(validdate));
		validdate.click();
	}
	public void PassportNumber(String PPNumber) {
		passpoernumber.sendKeys(PPNumber);
	}
	
	public void NextButton() {
		nextbtn.click();
	}

}