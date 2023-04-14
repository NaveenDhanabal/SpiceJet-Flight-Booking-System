package headlessTest;

import org.testng.annotations.Test;

import base.HeadlessClass;
import pageObjects.Passengers;
import pageObjects.RoundTripPage;

public class RoundTripHeadless extends HeadlessClass{
	
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
		boolean Message = false;
		if(Message==true) {
			roundtrip.Message();
		}else {
			roundtrip.ContinueButton();
			Thread.sleep(5000);
			roundtrip.TripSummary();
			
			Passengers list = new Passengers(driver);
			list.ContactInfo(prop.getProperty("FirstName"), prop.getProperty("LastName"), prop.getProperty("MpbileNumber"), prop.getProperty("Email"), prop.getProperty("City"));
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
