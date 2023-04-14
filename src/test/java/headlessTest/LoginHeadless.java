package headlessTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base.HeadlessClass;
import pageObjects.LoginPage;

public class LoginHeadless extends HeadlessClass{
	
	@Test
	public void LoginwithValidCredentials() throws InterruptedException {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.Login();
		loginpage.EmailButton();
		loginpage.EmailId(prop.getProperty("Email"));
		loginpage.Password(prop.getProperty("Password"));
		Thread.sleep(2000);
		loginpage.LoginButton();

	}
	
	@Test
	public void LoginwithInValidCredentials() throws InterruptedException {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.Login();
		loginpage.EmailButton();
		loginpage.EmailId(prop.getProperty("Email"));
		loginpage.InvalidPassword(prop.getProperty("InvalidPass"));
		Thread.sleep(2000);
		loginpage.LoginButton();
	}
	
	@Test(dataProvider = "logintestdata")
	public void TestLogin(String EmailId, String Password) throws InterruptedException {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.Login();
		Thread.sleep(3000);
		loginpage.EmailButton();
		Thread.sleep(2000);
		loginpage.EmailId(EmailId);
		loginpage.Password(Password);
		Thread.sleep(2000);
		loginpage.LoginButton();
		Thread.sleep(5000);
	}
	
	@DataProvider(name = "logintestdata")
	public Object[][] logindata(){
		Object[][] data=new Object[4][2];
		
		data[0][0]= "spicejettest@yopmail.com";
		data[0][1]="Test@Password321";
		
				
		data[1][0]= "spicejettest@yopmail.com";
		data[1][1]="Qwerty";
				
		data[2][0]= "spicejettest";
		data[2][1]="Qwerty";
		
		data[3][0]= "spicejettest";
		data[3][1]="Test@Password321";
		
		return data;
				
	}



}
