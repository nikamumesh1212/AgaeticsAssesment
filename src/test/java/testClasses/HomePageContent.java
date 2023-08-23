package testClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseClass.Base;
import pomClasses.HomePage;

public class HomePageContent extends Base{
HomePage head= new HomePage(driver);
	
	@BeforeClass
	public void Launch() throws IOException, InterruptedException {
		Thread.sleep(5000);
		 
		LaunchUrl();
		head= new HomePage(driver);
		Thread.sleep(3000);
	}

@Test
  public void BrowserTablefield()  {
	  AssertJUnit.assertTrue(head.BrowserTable());
 }
  @Test
  public void ShowMoreLinkedTxt()  {
	  AssertJUnit.assertTrue(head.ShowMoreLinkedTxt());
 }
  @Test
  public void We_Rise_By_Lifting_Others_Field_Display()  {
	  AssertJUnit.assertTrue(head.We_Rise_By_Lifting_Others_Field());
 }
  @Test
  public void IntroTxtfield()  {
	  AssertJUnit.assertTrue(head.IntroTxt());
 }
  @Test
  public void MakeAnImpact_Txtfield()  {
	  AssertJUnit.assertTrue(head.MakeAnImpact());
 }
  @Test
  public void WaterMark_Txtfield()  {
	  AssertJUnit.assertTrue(head.WaterMark());
 }
  @Test
  public void ImapctHeading_Txtfield()  {
	  AssertJUnit.assertTrue(head.ImapctHeading());
 }
  @Test
  public void SimpleTxtfield()  {
	  AssertJUnit.assertTrue(head.SimpleTxt());
 }
  @Test
  public void signoutBtn2field()  {
	  AssertJUnit.assertTrue(head.signoutBtn2());
 } 
 @AfterClass
 public void TearDown() {
	 driver.quit();
 }

}
