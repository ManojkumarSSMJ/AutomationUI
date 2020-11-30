package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wrapperMethods.ProjectMethods;

public class LoginLogoutPage extends ProjectMethods {

	public LoginLogoutPage() {
		PageFactory.initElements(driver,this);
	}

	public LoginLogoutPage Browserdata(String browser,String url) {
		launchBrowser(browser,url);
		return new LoginLogoutPage();
	}
	
    public LoginLogoutPage ClickWindowPopUpOK() throws InterruptedException {
		
		WindowPopUpOK();
		Thread.sleep(3000);
		
		return this;
	}
	@FindBy(how=How.XPATH,using=uiobjects.LoginLogoutElements.Proceedbutton)
	private WebElement Proceedbutton;

	public LoginLogoutPage clickProceed(){
		click(Proceedbutton);
		return this;
	}
	@FindBy(how=How.ID,using=uiobjects.LoginLogoutElements.role)
	private WebElement elerole;

	public LoginLogoutPage SelectRole(String data){
		selectDropDownUsingText(elerole, data);
		return this;
	}
	@FindBy(how=How.XPATH,using=uiobjects.LoginLogoutElements.lp_username)
	private WebElement eleUserName;

	public LoginLogoutPage enterUserName(String data) {
		inputData(eleUserName, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.LoginLogoutElements.lp_password)
	private WebElement elePassword;

	public LoginLogoutPage enterPassword(String data) {
		inputData(elePassword, data);
		return this;
	}

	@FindBy(how=How.XPATH,using=uiobjects.LoginLogoutElements.lp_login)
	private WebElement eleLoginBtn;

	public LoginLogoutPage clickLogin() {
		click(eleLoginBtn);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.LoginLogoutElements.Logout)
	private WebElement eleLogout;

	public LoginLogoutPage clickLogout() {
		click(eleLogout);
		return this;
	}
	
}



