package testCases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.Validation;

public class ValidationTest  extends BaseClass {

	@Test
	public void CheckIn_Validation() throws InterruptedException{
		Validation checkin = new Validation(driver);
			checkin.CheckIn(prop.getProperty("PNR"),prop.getProperty("Email"));
	}
	
	@Test
	public void FlightStatus_Validation() throws InterruptedException{
		Validation flightstatus = new Validation(driver);
			flightstatus.FilghtStatus(prop.getProperty("From"), prop.getProperty("To"));
	}
	
	@Test
	public void ManageBooking_Validation() throws InterruptedException {
		Validation managebooking = new Validation(driver);
		managebooking.ManageBooking(prop.getProperty("PNR"),prop.getProperty("Email"));
	}
	
	
}
