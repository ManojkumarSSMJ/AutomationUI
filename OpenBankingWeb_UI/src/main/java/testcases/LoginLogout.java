package testcases;

import org.testng.annotations.BeforeTest;



import org.testng.annotations.Test;

import pages.LoginLogoutPage;
import wrapperMethods.ProjectMethods;

public class LoginLogout extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		 testCaseName="Login Logout";
		 testDescription="login into OpenBanking Web Portal";
		 testNodes="Login Logout";
		 category="UI Automation";
		 executedBy="Manoj";
		 dataSheetName="LoginLogout";
	}
	
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String browser,String url,String uname,String pwd,String Select,String Role
			) throws InterruptedException{
		new LoginLogoutPage()
		.Browserdata(browser,url)
		
		.clickProceed()		
		
		.clickLogin()
		.enterUserName(uname)
		.clickLogin()
		.enterPassword(pwd)
		.SelectRole(Select)
		.clickLogin()
		.ClickWindowPopUpOK()
		.SelectRole(Role)
		.clickLogin();
		
	}
}
