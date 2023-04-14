package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RoundTripPage {

	public WebDriver driver;
	public RoundTripPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	@FindBy(xpath="//div[@data-testid=\"round-trip-radio-button\"]")
	WebElement roundtripbutton;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	WebElement boardingfrom;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement destinationto;
		
	@FindBy(xpath="(//div[@class=\"css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e\"])[1]")
	WebElement datebutton;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-14lw9ot r-pm2fo r-11u4nky r-z2wwpe r-1phboty r-ou6ah9 r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73'])[1]")
	WebElement returndatebtn; 
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1pi2tsx r-1777fci r-13qz1uu'])[49]")
	WebElement dipaturedate;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1pi2tsx r-1777fci r-13qz1uu'])[53]")
	WebElement returndate;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")
	WebElement passengers;

	@FindBy(xpath="//div[@data-testid='Adult-testID-plus-one-cta']")
	WebElement adult;
	
	@FindBy(xpath="(//div[@class=\"css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep\"])[6]")
	WebElement currency;
		
	@FindBy(xpath="//div[contains(text(),'Family & Friends')]")
	WebElement familyandfriends;
	
	@FindBy(xpath="(//div[contains(text(),'Students')])[1]")
	WebElement students;
	
	@FindBy(xpath="//div[@data-testid='home-page-flight-cta']")
	WebElement searchflight;
	
	@FindBy(xpath="//*[name()='rect' and contains(@width,'100%')]")
	WebElement termsandcondition;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73'])[1]")
	WebElement continuebutton;
	
	@FindBy(xpath="//div[@class=\"css-1dbjc4n r-1awozwy r-1777fci r-1lpndhm\"]")
	WebElement message;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n'])[4]")
	WebElement tripDetail;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1loqt21 r-1otgn73'])[1]")
	WebElement details;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-1ebgqk7 r-1rjd0u6 r-cnkkqs r-156q2ks r-h3f8nf r-1oqcu8e r-u8s1d r-7j9xc5 r-9dcw1g r-8fdsdq'])[1]")
	WebElement tripSummary;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-18u37iz'])[3]")
	WebElement totalprice;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73'])[1]")
	WebElement continuebtn;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1p0dtai r-13qz1uu r-184en5c'])[1]")
	WebElement tripsummary;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73'])[1]")
	WebElement continuebtn2;
	
	@FindBy(xpath="//p[@class=\"tt_skip_link\"]")
	WebElement skip;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73'])[3]")
	WebElement continuebtn3;
	
	public void RoundTrip() throws InterruptedException {
		roundtripbutton.click();
		Thread.sleep(3000);
	}
	public void onBoarding(String From) throws InterruptedException {
		boardingfrom.sendKeys(From);
		Thread.sleep(3000);
	}
	public void DestinationTo(String To) throws InterruptedException {
		destinationto.sendKeys(To);
		Thread.sleep(3000);
	}
	public void Dates() throws InterruptedException {
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElements(dipaturedate));
		action.click(dipaturedate).build().perform();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfAllElements(returndate));
		action.click(returndate).build().perform();
		}

    public void Passengers() throws InterruptedException{
		passengers.click();
		for(int i=0;i<3;i++) {
			adult.click();}
		Thread.sleep(3000);
	}
	public void Currency() throws InterruptedException {
		currency.click();
		Thread.sleep(3000);
	}
	public void FamilyandFriends() throws InterruptedException {
		familyandfriends.click();
		Thread.sleep(3000);
	}	
	public void Students() throws InterruptedException {
		students.click();
		Thread.sleep(3000);
	}
	public void SearchFlight() {
		searchflight.click();
	}
	public void TermsandCondition() {
		termsandcondition.click();
	}
	public void Countinue() throws InterruptedException {
		continuebutton.click();
		Thread.sleep(3000);
	}
	public void Message() {
		System.out.println(message.getText());
	}
	public void TripDetails() throws InterruptedException {
		System.out.print("Trip Details : "+tripDetail.getText());
		Thread.sleep(2000);
		details.click();
		Thread.sleep(2000);
		System.out.println(tripSummary.getText());
		Thread.sleep(3000);
		System.out.println("Total Amount : "+totalprice.getText());
	}
	public void ContinueButton() {
		continuebtn.click();
	}
	public void TripSummary() {
		System.out.println(tripsummary.getText());
	}
	public void ContinueButton2() throws InterruptedException {
		continuebtn2.click();
		Thread.sleep(5000);
	}//After filling passanger details
	public void ContinueButton3() throws InterruptedException {
		continuebtn3.click();//For going into payment page
		Thread.sleep(3000);
		skip.click();
	}

}
