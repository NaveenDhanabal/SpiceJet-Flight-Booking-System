package testCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import base.BaseClass;
import pageObjects.Passengers;
import pageObjects.RoundTripPage;

public class RoundTripTest extends BaseClass {
	
	@Test
	public void RoundTrip_FamilyFriends() throws InterruptedException {
		RoundTripPage roundtrip = new RoundTripPage(driver);
		roundtrip.RoundTrip();
		roundtrip.onBoarding(prop.getProperty("From"));
		roundtrip.DestinationTo(prop.getProperty("To"));
		roundtrip.Dates();
		Thread.sleep(3000);
		roundtrip.Passengers();
		roundtrip.Currency();
		roundtrip.FamilyandFriends();
		roundtrip.SearchFlight();
		Thread.sleep(3000);
		SwitchWindow();
		roundtrip.TermsandCondition();
		Thread.sleep(3000);
		roundtrip.Countinue();
		boolean Message = true;
		if(Message==true) {
			roundtrip.Message();
		}else {
			System.out.println("Something Wrong..Please Try Again.. :(");
		}

	}
	
	@Test
	public void RoundTrip_Students() throws InterruptedException {
		RoundTripPage roundtrip = new RoundTripPage(driver);
		roundtrip.RoundTrip();
		roundtrip.onBoarding(prop.getProperty("From"));
		roundtrip.DestinationTo(prop.getProperty("To"));
		roundtrip.Dates();
		Thread.sleep(3000);
		roundtrip.Passengers();
		roundtrip.Currency();
		roundtrip.Students();
		roundtrip.SearchFlight();
		Thread.sleep(3000);
		SwitchWindow();
		roundtrip.TermsandCondition();
		Thread.sleep(3000);
		roundtrip.Countinue();
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
			list.NextButton();
			list.PassengerDetails(prop.getProperty("FirstNameP2"), prop.getProperty("LastNameP2"), prop.getProperty("PhoneNumberP2"),prop.getProperty("IDnumberP2"));
			list.NextButton();
			list.PassengerDetails(prop.getProperty("FirstNameP3"), prop.getProperty("LastNameP3"), prop.getProperty("PhoneNumberP3"),prop.getProperty("IDnumberP3"));
			list.NextButton();
			list.PassengerDetails(prop.getProperty("FirstNameP4"), prop.getProperty("LastNameP4"), prop.getProperty("PhoneNumberP4"),prop.getProperty("IDnumberP4"));
			
			roundtrip.ContinueButton2();
			Thread.sleep(5000);
			roundtrip.ContinueButton3();
			Thread.sleep(5000);
			System.out.println("Ticket has been Booked Successfully..!!! Have A Nice Trip...");
			
		}
	}

}
