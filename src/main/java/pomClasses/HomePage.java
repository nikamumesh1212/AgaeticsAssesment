package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage{
    
	@FindBy(xpath=("//img[@class='img-fluid logo-img']"))
	private WebElement Logo;
	
	@FindBy(xpath=("//a[text()='How it works']"))
	private WebElement How_it_Work;
	
	@FindBy(xpath=("//a[text()='Impact']"))
	private WebElement Impact;
	
	@FindBy(xpath=("//a[text()='About Us']")) 
	private WebElement About_Us;
	
	@FindBy(xpath=("//a[text()='Login/Sign up']")) 
	private WebElement LoginBtn;
	
	@FindBy(xpath=("(//p[@class='text-muted my-4'])[1]")) 
	private WebElement LoginMsg;
	
	@FindBy(xpath=("(//p[@class='text-muted my-4'])[2]")) 
	private WebElement SignUpMsg;
	
	@FindBy(xpath=("//h1[@class='main-heading']")) 
	private WebElement We_Rise_By_Lifting_Others;
	
	@FindBy(xpath=("(//p[@class='text-intro'])[1]")) 
	private WebElement Intro_Text;
	
	@FindBy(linkText = "Make an impact") 
	private WebElement Make_An_Impact;
	
	@FindBy(xpath=("//div[@class='text-watermark left bottom']")) 
	private WebElement WaterMark;
	

	@FindBy(xpath=("(//h2[@class='main-heading'])[1]")) 
	private WebElement How_It_Works_txt;
	
	@FindBy(xpath=("(//h2[@class='main-heading'])[4]")) 
	private WebElement ImpactHeading_txt;
	
	
	@FindBy(xpath=("//p[@class='text-intro my-2']")) 
	private WebElement Simple_Step_txt;
	
	@FindBy(xpath=("(//a[@class='btn btn-grad my-2'])")) 
	private WebElement SignUpBtn2;
	
	@FindBy(xpath=("(//div[@class='pl-md-3'])[1]")) 
	private WebElement Peek_Txt;
	
	@FindBy(xpath=("(//div[@class='pl-md-3'])[2]")) 
	private WebElement Play_Txt;
	
	@FindBy(xpath=("(//div[@class='pl-md-3'])[3]")) 
	private WebElement Pay_Txt;
	
	@FindBy(xpath=("(//div[@class='pl-md-3'])[4]")) 
	private WebElement Define_Txt;
	
	@FindBy(xpath=("(//div[@class='pl-md-3'])[5]")) 
	private WebElement Refine_Txt;
	
	@FindBy(xpath=("(//h4[text()='Receive']")) 
	private WebElement Receive_Txt;
	
	@FindBy(xpath=("//section[@id='browse-topics']/div/div//table")) 
	private WebElement Browse_Charities_Table;
	
	@FindBy(xpath=("//a[text()='Show more']")) 
	private WebElement Show_More_Linked_Txt;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public  boolean LogoVisibility(){
	   return  Logo.isDisplayed();
	   }
	
	 public  boolean HowItWorkNaviganation(){
		   return  How_it_Work.isDisplayed();
	 }
	 
	 public  boolean ImpactNaviganation(){
		   return  Impact.isDisplayed();
	 }
	 
	 public  boolean AboutUsNav(){
		   return  About_Us.isDisplayed();
	 }
	 
	 public  boolean LoginBtnNav(){
		   return  LoginBtn.isDisplayed();
	 }
	 
    public String LoginPagemsg() throws InterruptedException {
		LoginBtn.click();
		   Thread.sleep(2000);
		  return LoginMsg.getText();
	}
    public void LoginBtnClick(){
		LoginBtn.click();
		  
	}
    public String SignupPagemsg() throws InterruptedException {
		LoginBtn.click();
		   Thread.sleep(2000);
		  return SignUpMsg.getText();
	}
    public String HowItWorkNavigationClick() throws InterruptedException {
		How_it_Work.click();
		   Thread.sleep(2000);
		  return How_It_Works_txt.getText();
	}
	 
    public String ImpactNavigationClick() throws InterruptedException {
		Impact.click();
		   Thread.sleep(2000);
		  return ImpactHeading_txt.getText();
	}
    
    public  boolean We_Rise_By_Lifting_Others_Field(){
		   return  We_Rise_By_Lifting_Others.isDisplayed();
	 }
    public  boolean IntroTxt(){
		   return  Intro_Text.isDisplayed();
	 }
    public  boolean MakeAnImpact(){
		   return  Make_An_Impact.isDisplayed();
	 }
    public  boolean WaterMark(){
		   return  WaterMark.isDisplayed();
	 }
    public  boolean ImapctHeading(){
		   return  ImpactHeading_txt.isDisplayed();
	 }
    public  boolean SimpleTxt(){
		   return  Simple_Step_txt.isDisplayed();
	 }
    public  boolean signoutBtn2(){
		   return  SignUpBtn2.isDisplayed();
	 }
    public  boolean peekTxt(){
		   return  Peek_Txt.isDisplayed();
	 }
    public  boolean PlayTxt(){
		   return  Play_Txt.isDisplayed();
	 }
    public  boolean PayTxt(){
		   return  Pay_Txt.isDisplayed();
		   }
    public  boolean defineTxt(){
		   return  Define_Txt.isDisplayed();
	 }
    public  boolean RefineTxt(){
		   return  Refine_Txt.isDisplayed();
	 }
    public  boolean ReceiveTxt(){
		   return  Receive_Txt.isDisplayed();
	 }
    public  boolean BrowserTable(){
		   return  Browse_Charities_Table.isDisplayed();
		 }
    public  boolean ShowMoreLinkedTxt(){
		   return  Show_More_Linked_Txt.isDisplayed();
	 }
}

















