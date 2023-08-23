package pomClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityClasses.Utility;

public class SignUpPage {
	@FindBy(id=("name"))
	private WebElement NameField;
	
	@FindBy(id=("reg-email"))
	private WebElement EmailField;
	
	@FindBy(id=("reg-password"))
	private WebElement PassField;
	
	@FindBy(id=("password-confirm"))
	private WebElement CPassField;
	
	@FindBy(xpath =("//button[@class='btn btn-grad col-6 mt-2']"))
	private WebElement RegisterBtn;
	
	@FindBy(xpath =("//span[text()='Your Profile is:']"))
	private WebElement ProfileMSg;
	
	@FindBy(id=("dropdownMenuLink"))
	private WebElement dropdownMenuLink;
	
	@FindBy(xpath =("//a[@class='d-none d-md-inline-block px-3 py-1']"))
	private WebElement logoutBtn;

	
	public SignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public  boolean NameFieldVisibility() throws IOException{
		  return NameField.isDisplayed();
	 }
	public  boolean EmailFieldVisibility() throws IOException{
		  return EmailField.isDisplayed();
	 }
	public  boolean PassFieldVisibility() throws IOException{
		  return PassField.isDisplayed();
	 }
	public  boolean ConfirmPassFieldVisibility() throws IOException{
		  return CPassField.isDisplayed();
	 }
	public  boolean RegisterBtnVisibility() throws IOException{
		  return RegisterBtn.isDisplayed();
	 }
		public  void EnterNameField() throws IOException{
	   NameField.sendKeys(Utility.readPropertyFile("Name"));
	   }
	
	public void EnterEmailField(String emailAddress) {
		EmailField.sendKeys(emailAddress);
    }
	
	public  void EnterPassworddField() throws IOException{
		PassField.sendKeys(Utility.readPropertyFile("Password"));
	 }
	public  void EnterConfirmPasswordField() throws IOException{
		CPassField.sendKeys(Utility.readPropertyFile("Confirm_Password"));
	 }
	
	public  void ClickRegisterBtn() throws IOException{
		  RegisterBtn.click();
	 }
	public  String ProfileShown() throws IOException{
		 return ProfileMSg.getText();
	 }
	public  void ClickdropdownMenuLink() throws IOException{
		  dropdownMenuLink.click();
	 }
	public  void ClicklogoutBtn() throws IOException{
		logoutBtn.click();
	 }

	public  String logoutBtnTxt() {
		return logoutBtn.getText();
	 }
}
