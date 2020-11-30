package testcases;

import org.testng.annotations.BeforeTest;




import org.testng.annotations.Test;

import pages.LoginLogoutPage;
import pages.ModulesHomePage;
import wrapperMethods.ProjectMethods;

public class StandingOrder extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		 testCaseName="Standing Order";
		 testDescription="login into OpenBanking Web Portal";
		 testNodes="Standing Order Module";
		 category="UI Automation";
		 executedBy="Manoj";
		 dataSheetName="StandingOrder";
	}
	
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String browser,String url,String uname,String pwd,String SearchTxnstatus,String SearchBankName,String Currency,String InvalidSearch
			) throws InterruptedException{
		//new LoginLogoutPage()
		//.Browserdata(browser,url)
		
		/*
		 * .clickProceed() .enterUserName(uname) .enterPassword(pwd) .clickLogin();
		 */
		
		// Account Access Main Module - Transaction Sub Module
		
		new ModulesHomePage()
		.clickAccountAccess()
		.clickStandingOrders()
		.clickShowDropdown() // Show Drop down list of values
		.enterSearch(SearchTxnstatus) // Search values from the Search grid 
		.enterSearch(SearchBankName)
		.enterSearch(Currency)
		.enterSearch(InvalidSearch)
		.ClickFirstButton() // page Navigation Button Verification (First,Last,Next and Previous Button)
		.ClickLastButton()
		.ClickNextButton()
		.ClickPreviousButton()
		.ClickClickHereButton(); // Click here Hyper link to Link Bank / Merchants
		
		
	}
}
