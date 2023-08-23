package testClasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseClass.Base;
import pomClasses.HomePage;
import pomClasses.LoginPage;

public class LoginTestClass extends Base{
	
LoginPage log = new LoginPage(driver);
HomePage head= new HomePage(driver);

	
	@BeforeMethod
	public void Launch() throws IOException, InterruptedException {
		Thread.sleep(5000);
		 
		LaunchUrl();
		log = new LoginPage(driver);
		head= new HomePage(driver);
		
		Thread.sleep(3000);
	}
  @Test
  public void UserRegister() throws IOException, InterruptedException {
	        head.LoginBtnClick();
	        Thread.sleep(2000);
	        log.EnterUserNameField();
	        Thread.sleep(2000);
	        log.EnterPasswordField();
	        Thread.sleep(2000);
	        log.ClickOnLoginBtn();
	        String expectedMsg="YOUR PROFILE IS:";
	        AssertJUnit.assertEquals(log.ProfileShown(), expectedMsg);
	    }
  @Test
  public void ForgotPasstab() throws IOException, InterruptedException {
	  head.LoginBtnClick();
      Thread.sleep(2000);     
	  log.ForgotPasswordBtn();
	  AssertJUnit.assertTrue(log.RecetPasswordBtn());
  }
  
  @Test
  public void UsernamefieldVisibility() throws InterruptedException, IOException {
	  head.LoginBtnClick();
      Thread.sleep(2000);     
	  AssertJUnit.assertTrue(log.UserNameFieldVisibility());
  }
  @Test
  public void PasswordfieldVisibility() throws InterruptedException, IOException {
	  head.LoginBtnClick();
      Thread.sleep(2000);     
	  AssertJUnit.assertTrue(log.PasswordFieldVisibility());
  }
  @Test
  public void LoginBtndVisibility() throws InterruptedException, IOException {
	  head.LoginBtnClick();
      Thread.sleep(2000);     
	  AssertJUnit.assertTrue(log.LoginBtndVisibility());
  }
 
@AfterMethod
  public void tearDown() {
	  driver.close();
	  
  }
  
}