package testcases;

import org.testng.annotations.BeforeTest;



import org.testng.annotations.Test;

import pages.CreateAccountPage;
import pages.LoginLogoutPage;
import wrapperMethods.ProjectMethods;

public class CreateAccount extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		 testCaseName="Create Account";
		 testDescription="login into OpenBanking Web Portal";
		 testNodes="Create Account";
		 category="UI Automation";
		 executedBy="Manoj";
		 dataSheetName="Create Account";
	}
	
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String browser,String url,String uname,String pwd,String Customername,String Mobilenum,String Userid,String Password
			,String ConfirmPassword,String Invalidvalues
			){
		new CreateAccountPage()
		.Browserdata(browser,url)
		.clickProceed()
		.clickCreateAccount() // To create an Account redirects to Create Account (Sign Up Page)
		
		.enterCustomername(Customername)
		.enterMobileNumber(Mobilenum)
		.enteruserId(Userid)
		.enterpassword(Password)
		.enterconfirmPassword(ConfirmPassword)
		.clicksignup();
		
		
		
		
	}
}
