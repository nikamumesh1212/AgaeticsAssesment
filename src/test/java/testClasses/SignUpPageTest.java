package testClasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.Random;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseClass.Base;
import pomClasses.HomePage;
import pomClasses.SignUpPage;

public class SignUpPageTest extends Base{
	
SignUpPage sign = new SignUpPage(driver);
HomePage head= new HomePage(driver);

	
	@BeforeMethod
	public void Launch() throws IOException, InterruptedException {
		Thread.sleep(5000);
		 
		LaunchUrl();
		sign = new SignUpPage(driver);
		head= new HomePage(driver);
		
		Thread.sleep(3000);
	}
  @Test
  public void UserRegister() throws IOException, InterruptedException {
	        head.LoginBtnClick();
	        Thread.sleep(2000);
	        sign.EnterNameField();
	        Thread.sleep(2000);
	        String emailAddress = "test" + new Random().nextInt(1000) + "@example.com";
	        sign.EnterEmailField(emailAddress);
	        Thread.sleep(2000);
	        sign.EnterPassworddField();
	        Thread.sleep(2000);
	        sign.EnterConfirmPasswordField();
	        sign.ClickRegisterBtn();
	        
	        String expectedMsg="YOUR PROFILE IS:";
	        AssertJUnit.assertEquals(sign.ProfileShown(), expectedMsg);
	        }
  
  @Test
  public void UserLogout() throws IOException, InterruptedException {
	        head.LoginBtnClick();
	        Thread.sleep(2000);
	        sign.EnterNameField();
	        Thread.sleep(2000);
	        String emailAddress = "test" + new Random().nextInt(1000) + "@example.com";
	        sign.EnterEmailField(emailAddress);
	        Thread.sleep(2000);
	        sign.EnterPassworddField();
	        Thread.sleep(2000);
	        sign.EnterConfirmPasswordField();
	        sign.ClickRegisterBtn();
	        Thread.sleep(2000);
	        sign.ClickdropdownMenuLink();
	        Thread.sleep(2000);
	        //sign.ClicklogoutBtn();
	        String expectedMsg="Logout";
	        AssertJUnit.assertEquals(sign.logoutBtnTxt(), expectedMsg);
	        }
  @Test(priority = 1)
  public void NameFieldVisibility() throws InterruptedException, IOException {
	  head.LoginBtnClick();
      Thread.sleep(2000);     
	  AssertJUnit.assertTrue(sign.NameFieldVisibility());
  }
  @Test(priority = 2)
  public void EmailFieldVisibility() throws InterruptedException, IOException {
	  head.LoginBtnClick();
      Thread.sleep(2000);     
	  AssertJUnit.assertTrue(sign.EmailFieldVisibility());
  }
  @Test(priority = 3)
  public void PasswordFieldVisibility() throws InterruptedException, IOException {
	  head.LoginBtnClick();
      Thread.sleep(2000);     
	  AssertJUnit.assertTrue(sign.PassFieldVisibility());
  }
  @Test(priority = 4)
  public void CofirmPassfieldVisibility() throws InterruptedException, IOException {
	  head.LoginBtnClick();
      Thread.sleep(2000);     
	  AssertJUnit.assertTrue(sign.ConfirmPassFieldVisibility());
  }
  @Test(priority = 5)
  public void RegisterBtnVisibility() throws InterruptedException, IOException {
	  head.LoginBtnClick();
      Thread.sleep(2000);     
	  AssertJUnit.assertTrue(sign.RegisterBtnVisibility());
  }

 
@AfterMethod
  public void tearDown() {
	  driver.quit();
  }

}
