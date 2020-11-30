package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wrapperMethods.ProjectMethods;

public class CreateAccountPage extends ProjectMethods {

	public CreateAccountPage() {
		PageFactory.initElements(driver,this);
	}

	public CreateAccountPage Browserdata(String browser,String url) {
		launchBrowser(browser,url);
		return new CreateAccountPage();
	}
	@FindBy(how=How.XPATH,using=uiobjects.LoginLogoutElements.Proceedbutton)
	private WebElement Proceedbutton;

	public CreateAccountPage clickProceed(){
		click(Proceedbutton);
		return this;
	}
	@FindBy(how=How.XPATH,using=uiobjects.CreateAccountElements.CreateAccount)
	private WebElement CreateAccount;

	public CreateAccountPage clickCreateAccount(){
		click(CreateAccount);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.CreateAccountElements.Customername)
	private WebElement eleCustomername;

	public CreateAccountPage enterCustomername(String data){
		inputData(eleCustomername, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.CreateAccountElements.MobileNumber)
	private WebElement eleMobileNumber;

	public CreateAccountPage enterMobileNumber(String data){
		inputData(eleMobileNumber, data);
		return this;
	}
	@FindBy(how=How.XPATH,using=uiobjects.CreateAccountElements.userId)
	private WebElement eleuserId;

	public CreateAccountPage enteruserId(String data){
		inputData(eleuserId, data);
		return this;
	}
	@FindBy(how=How.XPATH,using=uiobjects.CreateAccountElements.password)
	private WebElement elepassword;

	public CreateAccountPage enterpassword(String data){
		inputData(elepassword, data);
		return this;
	}
	@FindBy(how=How.XPATH,using=uiobjects.CreateAccountElements.confirmPassword)
	private WebElement eleconfirmPassword;

	public CreateAccountPage enterconfirmPassword(String data){
		inputData(eleconfirmPassword, data);
		return this;
	}
	@FindBy(how=How.XPATH,using=uiobjects.CreateAccountElements.signup)
	private WebElement elesignup;

	public CreateAccountPage clicksignup(){
		click(elesignup);
		return this;
	}
	
	
	
	
}



