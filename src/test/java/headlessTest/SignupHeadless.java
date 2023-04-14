package headlessTest;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import base.HeadlessClass;
import pageObjects.SignUpPage;

public class SignupHeadless extends HeadlessClass {
	

	@Test
	public void Singup() throws InterruptedException {
		SignUpPage signuppage = new SignUpPage(driver);
		signuppage.SignupButton();
		SwitchWindow();
		Thread.sleep(4000);
		signuppage.Title();
		Thread.sleep(2000);
		signuppage.Firstname(prop.getProperty("FirstName"));
		Thread.sleep(2000);
		signuppage.Lastname(prop.getProperty("LastName"));
		Thread.sleep(2000);
		signuppage.Country(prop.getProperty("Country"));
		Thread.sleep(2000);
		signuppage.DOB(prop.getProperty("DOB"));
		Thread.sleep(2000);
		signuppage.MobileNumber(prop.getProperty("MobileNumber"));
		Thread.sleep(2000);
		signuppage.EmailId(prop.getProperty("Email"));
		Thread.sleep(2000);
		signuppage.Password(prop.getProperty("Password"));
		Thread.sleep(2000);
		signuppage.ConfirmPassword(prop.getProperty("ConfirmPassword"));
		Thread.sleep(2000);
		signuppage.DefaultClick();
		Thread.sleep(3000);
		String s = driver.getCurrentUrl();
        System.out.println("Current Page Url: " + s);
		Thread.sleep(2000);
		boolean SubmitButton = true;
		if(SubmitButton==true) {
			signuppage.SubmitButton();
			Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String titleText =  js.executeScript("return document.title;").toString();
		System.out.println("Current Page Title : "+titleText);
		System.out.println("Account has been successfully created...!!!");
		}else {
			System.out.println("Please Try Again.. :(");
		}
		
		
	}
	

	

}
