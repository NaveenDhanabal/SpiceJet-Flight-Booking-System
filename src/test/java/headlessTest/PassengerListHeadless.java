package headlessTest;

import base.HeadlessClass;
import pageObjects.Passengers;

public class PassengerListHeadless extends HeadlessClass{

	public void Date() throws InterruptedException {
		Passengers list = new Passengers(driver);
		list.ContactInfo(prop.getProperty("FirstName"), prop.getProperty("LastName"), prop.getProperty("MpbileNumber"), prop.getProperty("Email"), prop.getProperty("City"));
//		list.PrimaryPassenger();
//		Thread.sleep(2000);
		list.PassengerDetails(prop.getProperty("FirstNameP1"), prop.getProperty("LastNameP1"), prop.getProperty("PhoneNumberP1"),prop.getProperty("IDnumberP1"));
		list.NextButton();
		list.PassengerDetails(prop.getProperty("FirstNameP2"), prop.getProperty("LastNameP2"), prop.getProperty("PhoneNumberP2"),prop.getProperty("IDnumberP2"));
		list.NextButton();
		list.PassengerDetails(prop.getProperty("FirstNameP3"), prop.getProperty("LastNameP3"), prop.getProperty("PhoneNumberP3"),prop.getProperty("IDnumberP3"));
		list.NextButton();
		list.PassengerDetails(prop.getProperty("FirstNameP4"), prop.getProperty("LastNameP4"), prop.getProperty("PhoneNumberP4"),prop.getProperty("IDnumberP4"));
		
		

}
}
