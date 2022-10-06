package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BasePackage.BaseHRMClass;
import Pompackage.Pomlogin;
import testdata.ExcelSheet;


public class LoginTest extends BaseHRMClass {
		Pomlogin Log;
		public LoginTest() {
			super();
		}
	
	
		@BeforeMethod
		
		public void initsetup() {
			initiation();
			screenshots("Login");
			
			 Log = new Pomlogin();
		}
		
		@Test(priority=1)
		
		public void Title() {
			Log.verify();
			String actual = Log.verify();
			
			Assert.assertEquals(actual,"OrangeHRM");
		}
		@DataProvider
		public Object[][] Details() {
			Object result[][] = ExcelSheet.readdata("Sheet1");
			return result;
		}
		@Test(priority=2, dataProvider="Details")
		public void Login(String name,String password) {
			Log.typeusername(name);
			Log.typepassword(password);
			Log.clickbtn();
		}
		
		@AfterMethod
		public void close() {
			driver.close();
		}
	

}

