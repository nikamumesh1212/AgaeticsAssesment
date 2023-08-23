package pomClasses;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityClasses.Utility;

public class LoginPage {
	@FindBy(id =("email"))
	private WebElement Username;
	
	@FindBy(id =("password"))
	private WebElement password;
	
	@FindBy(xpath =("//button[@class='btn col-6 btn-outline-secondary']"))
	private WebElement LoginBtnClick1;
	
	@FindBy(xpath =("//span[text()='Your Profile is:']"))
	private WebElement ProfileMSg;
	
	@FindBy(xpath =("//a[@class='mb-4 d-inline-block text-muted']"))
	private WebElement ForgotPass;
	
	@FindBy(xpath =("//button[@class='btn btn-grad']"))
	private WebElement RecetPassword;

	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public  void EnterUserNameField() throws IOException{
	   Username.sendKeys(Utility.readPropertyFile("Email"));
	   }
	public  boolean UserNameFieldVisibility() throws IOException{
		  return Username.isDisplayed();
		   }
	
	public  boolean PasswordFieldVisibility() throws IOException{
		  return password.isDisplayed();
		   }
	
	public  boolean LoginBtndVisibility() throws IOException{
		  return LoginBtnClick1.isDisplayed();
		   }
	public  void EnterPasswordField() throws IOException{
		   password.sendKeys(Utility.readPropertyFile("Password"));
		  }
	public  void ClickOnLoginBtn() throws IOException{
		   LoginBtnClick1.click();
		   }
	
	public String ProfileShown() {
		return ProfileMSg.getText();
	 }
	public void ForgotPasswordBtn() {
		 ForgotPass.click();
	 }
	public boolean RecetPasswordBtn() {
		return RecetPassword.isDisplayed();
	 }

}
