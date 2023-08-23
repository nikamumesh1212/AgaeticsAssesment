package testClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseClass.Base;
import pomClasses.HomePage;

public class HomePageHeader extends Base{
	HomePage head= new HomePage(driver);
	
	@BeforeClass
	public void Launch() throws IOException, InterruptedException {
		Thread.sleep(5000);
		 
		LaunchUrl();
		head= new HomePage(driver);
		Thread.sleep(3000);
	}
  @Test
  public void Logo() throws IOException, InterruptedException {
	  AssertJUnit.assertTrue(head.LogoVisibility());
	  }
  @Test
  public void HowItWorks() throws IOException, InterruptedException {
	  AssertJUnit.assertTrue(head.HowItWorkNaviganation());
	  }
  @Test
  public void Impact() throws IOException, InterruptedException {
	  AssertJUnit.assertTrue(head.ImpactNaviganation());
	  }
  @Test
  public void Aboutus() throws IOException, InterruptedException {
	  AssertJUnit.assertTrue(head.AboutUsNav());
	  }
  @Test
  public void Loginvisibility() throws IOException, InterruptedException {
	  AssertJUnit.assertTrue(head.LoginBtnNav());
	  }
  @Test
  public void LoginBtnClick() throws IOException, InterruptedException {
	  String expectedMsg="Login to check the latest activities on your profile.";
	  AssertJUnit.assertEquals(head.LoginPagemsg(), expectedMsg);
	  }
  @Test
  public void signupClick() throws IOException, InterruptedException {
	  String expectedMsg="Create a new account and start tracking the impact you create in the world.";
	  AssertJUnit.assertEquals(head.SignupPagemsg(), expectedMsg);
	  }
  @Test
  public void HowItWorksNavClick() throws IOException, InterruptedException {
	  String expectedMsg="How it works";
	  AssertJUnit.assertEquals(head.HowItWorkNavigationClick(), expectedMsg);
	  }
  
  @Test
  public void ImpactNavClick() throws IOException, InterruptedException {
	  String expectedMsg="Impact we have created";
	  AssertJUnit.assertEquals(head.ImpactNavigationClick(), expectedMsg);
	  }
  
  @Test
  public void AboutUsNavClick() throws IOException, InterruptedException {
	  String expectedMsg="How it works";
	  AssertJUnit.assertEquals(head.HowItWorkNavigationClick(), expectedMsg);
	  }
  
  @AfterClass
  public void teardown() {
	  driver.close();
  }
}


