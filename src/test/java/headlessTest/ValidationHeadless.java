package headlessTest;

import org.testng.annotations.Test;

import base.HeadlessClass;
import pageObjects.Validation;

public class ValidationHeadless extends HeadlessClass {
	
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
