package testCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import base.BaseClass;
import pageObjects.OnewayTripPage;
import pageObjects.Passengers;
import pageObjects.RoundTripPage;

public class OnewayTripTest extends BaseClass {
	
		@Test
		public void Onewaytrip() throws InterruptedException {
		OnewayTripPage oneway = new OnewayTripPage(driver);
		oneway.OneWay();
		oneway.onBoarding(prop.getProperty("From"));
		Thread.sleep(3000);
		oneway.DestinationTo(prop.getProperty("To"));
		Thread.sleep(3000);
		oneway.DipatureDate();
		Thread.sleep(3000);
		oneway.Passengers();
		Thread.sleep(3000);
		oneway.Adult();
		Thread.sleep(3000);
		oneway.Currency();
		oneway.FamilyandFriends();
		Thread.sleep(3000);
		oneway.SearchFlight();
		Thread.sleep(3000);
		SwitchWindow();
		oneway.TermsandCondition();
		Thread.sleep(3000);
		oneway.Countinue();
		Thread.sleep(3000);
		oneway.Message();
}
		
	
		@Test
		public void Onewaytrip_International2() throws InterruptedException {
		OnewayTripPage oneway = new OnewayTripPage(driver);
		RoundTripPage roundtrip = new RoundTripPage(driver);
		oneway.OneWay();
		oneway.onBoarding(prop.getProperty("IntFrom"));
		Thread.sleep(1000);
		oneway.DestinationTo(prop.getProperty("IntTo"));
		Thread.sleep(1000);
		oneway.DipatureDate();
		Thread.sleep(1000);
		oneway.Passengers();
		Thread.sleep(1000);
		oneway.Adult();
		Thread.sleep(3000);
		oneway.Currency();
		oneway.Students();
		Thread.sleep(1000);
		oneway.SearchFlight();
		Thread.sleep(3000);
		SwitchWindow();
		oneway.IAgree();
		Thread.sleep(2000);
		oneway.TermsandCondition();
		Thread.sleep(2000);
		oneway.Countinue();
		Thread.sleep(3000);
		boolean isFlightAvailable = roundtrip.checkFlightAvailable();
		if(!isFlightAvailable) {
		    try {
		        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'no flights available')]")));
		    } catch (TimeoutException e) {
		        List<WebElement> messageElements = driver.findElements(By.xpath("//*[contains(text(),'no flights available')]"));
		        if (!messageElements.isEmpty()) {
		            roundtrip.Message();
		        }
		    }
		} else {
			roundtrip.ContinueButton();
			Thread.sleep(5000);
			roundtrip.TripSummary();
			
			Passengers list = new Passengers(driver);
			list.ContactInfo(prop.getProperty("FirstName"), prop.getProperty("LastName"), prop.getProperty("MobileNumber"), prop.getProperty("Email"), prop.getProperty("City"));
			Thread.sleep(2000);
			list.PassengerDetails(prop.getProperty("FirstNameP1"), prop.getProperty("LastNameP1"), prop.getProperty("PhoneNumberP1"),prop.getProperty("IDnumberP1"));
			Thread.sleep(2000);
			list.DOBButton();
			Thread.sleep(2000);
			list.DOB();
			Thread.sleep(2000);
			list.Nationality();
			Thread.sleep(2000);
			list.ValidUpto();
			Thread.sleep(2000);
			list.PassportNumber(prop.getProperty("PPNumberp1"));
			list.NextButton();
			list.PassengerDetails(prop.getProperty("FirstNameP2"), prop.getProperty("LastNameP2"), prop.getProperty("PhoneNumberP2"),prop.getProperty("IDnumberP2"));
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			for(int i=0;i<1;i++) {
				js.executeScript("window.scrollBy(0,250)");
				Thread.sleep(1000);
				}
			list.DOBButton();
			Thread.sleep(2000);
			list.DOB();
			Thread.sleep(2000);
			list.Nationality();
			Thread.sleep(2000);
			list.ValidUpto();
			Thread.sleep(2000);
			list.PassportNumber(prop.getProperty("PPNumberp2"));
			list.NextButton();
			list.PassengerDetails(prop.getProperty("FirstNameP3"), prop.getProperty("LastNameP3"), prop.getProperty("PhoneNumberP3"),prop.getProperty("IDnumberP3"));
			Thread.sleep(2000);
			list.DOBButton();
			Thread.sleep(2000);
			list.DOB();
			Thread.sleep(2000);
			list.Nationality();
			Thread.sleep(2000);
			list.ValidUpto();
			Thread.sleep(2000);
			list.PassportNumber(prop.getProperty("PPNumberp3"));
			list.NextButton();
			list.PassengerDetails(prop.getProperty("FirstNameP4"), prop.getProperty("LastNameP4"), prop.getProperty("PhoneNumberP4"),prop.getProperty("IDnumberP4"));
			Thread.sleep(1000);
			list.DOBButton();
			Thread.sleep(1000);
			list.DOB();
			Thread.sleep(1000);
			list.Nationality();
			Thread.sleep(1000);
			list.ValidUpto();
			Thread.sleep(2000);
			list.PassportNumber(prop.getProperty("PPNumberp4"));
			roundtrip.ContinueButton2();
			Thread.sleep(5000);
			roundtrip.ContinueButton3();
			Thread.sleep(5000);
			System.out.println("Ticket has been Booked Successfully..!!! Have A Nice Trip...");
			
		}
	}
		
//without update passanger deteails hence ignored @test to run this.
		public void Onewaytrip_International() throws InterruptedException {
		OnewayTripPage oneway = new OnewayTripPage(driver);
		oneway.OneWay();
		oneway.onBoarding(prop.getProperty("IntFrom"));
		Thread.sleep(3000);
		oneway.DestinationTo(prop.getProperty("IntTo"));
		Thread.sleep(3000);
		oneway.DipatureDate();
		Thread.sleep(3000);
		oneway.Passengers();
		Thread.sleep(3000);
		oneway.Adult();
		Thread.sleep(3000);
		oneway.Currency();
		oneway.Students();
		Thread.sleep(3000);
		oneway.SearchFlight();
		Thread.sleep(3000);
		SwitchWindow();
		oneway.IAgree();
		Thread.sleep(2000);
		oneway.TermsandCondition();
		Thread.sleep(3000);
		oneway.Countinue();
		Thread.sleep(3000);
		oneway.TripDetails();
		boolean ContinueButton = true;
		if(ContinueButton==true) {
			oneway.ContinueButton();
			Thread.sleep(10000);
		System.out.println("Ticket has been Booked successfully ...!!!");
		}else {
			System.out.println("Please Try Again.. :(");
		}
	}
}
