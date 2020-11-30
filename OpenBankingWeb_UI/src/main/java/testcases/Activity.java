package testcases;

import org.testng.annotations.BeforeTest;




import org.testng.annotations.Test;

import pages.LoginLogoutPage;
import pages.ModulesHomePage;
import wrapperMethods.ProjectMethods;

public class Activity extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		 testCaseName="Activity";
		 testDescription="login into OpenBanking Web Portal";
		 testNodes="Activity Module";
		 category="UI Automation";
		 executedBy="Manoj";
		 dataSheetName="Activity";
	}
	
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String browser,String url,String uname,String pwd,String BankName ,String InvalidSearch,String role
			) throws InterruptedException{
		
		
		
		/*
		 * new LoginLogoutPage() .Browserdata(browser,url) .clickProceed()
		 * .enterUserName(uname) .enterPassword(pwd) .SelectRole(role).clickLogin();
		 */
		 
		// Settings Main Module - Activity Sub Module
		
		new ModulesHomePage()
		.clickSettings()
		.clickActivity()
		.clickAIB_Sandbox()
		.clickShowDropdown() // Show Drop down list of values
		.enterSearch(BankName) // Search values from the Search grid 
		.enterSearch(InvalidSearch)
		.ClickFirstButton() // page Navigation Button Verification (First,Last,Next and Previous Button)
		.ClickLastButton()
		.ClickNextButton()
		.ClickPreviousButton()
		.ClickClickHereButton(); // Click here Hyper link to Link Bank / Merchants
		
		/*
		 * new LoginLogoutPage() .clickLogout();
		 */
		
		
	}
}
