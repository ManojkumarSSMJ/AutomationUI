package testcases;

import org.testng.annotations.BeforeTest;




import org.testng.annotations.Test;

import pages.LoginLogoutPage;
import pages.ModulesHomePage;
import wrapperMethods.ProjectMethods;

public class Accounts extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		 testCaseName="Accounts";
		 testDescription="login into OpenBanking Web Portal";
		 testNodes="Acounts Module";
		 category="UI Automation";
		 executedBy="Manoj";
		 dataSheetName="LoginLogout";
	}
	
	@Test(dataProvider="fetchData")
	public void Accounts(String browser,String url,String uname,String pwd,String Select,String role
			) throws InterruptedException, RuntimeException{
		
		
		
		
		
		
		/*
		 * new LoginLogoutPage() .Browserdata(browser,url)
		 * 
		 * .clickProceed() .enterUserName(uname) .enterPassword(pwd).SelectRole(role)
		 * .clickLogin();
		 */
		 
		 
		 
		 
		
		// Account Access Main Module - Transaction Sub Module
		
		new ModulesHomePage()
		.clickAccountAccess()
		.clickAccounts()
		.ClickAccordion1()
		.ClickviewBalance(); // To View Account Balance
		
		new ModulesHomePage()
		.clickAccountAccess()
		.clickAccounts()
		.ClickAccordion1()
		.ClickviewTransactions(); // Application will navigates to Transaction module screen.
		
		new ModulesHomePage()
		.clickAccountAccess()
		.clickAccounts()
		.ClickAccordion1()
		.ClickviewStandingOrder(); // To view the Standing Orders will navigates to Standing Order module screen.
		
		new ModulesHomePage()
		.clickAccountAccess()
		.clickAccounts()
		.ClickAccordion1()
		.ClickviewDirectDebit(); // To view the Direct Debit will navigates to Direct Debit module screen.
		

		// Account Access Main Module - Transaction Sub Module
		
		/*
		 * new ModulesHomePage() .clickAccountAccess() .clickAccounts()
		 * .ClickAccordion2() .ClickModeloviewBalance(); // To View Account Balance
		 * 
		 * new ModulesHomePage() .clickAccountAccess() .clickAccounts()
		 * .ClickAccordion2() .ClickModeloviewTransactions(); // Application will
		 * navigates to Transaction module screen.
		 * 
		 * new ModulesHomePage() .clickAccountAccess() .clickAccounts()
		 * .ClickAccordion2() .ClickModeloviewStandingOrder(); // To view the Standing
		 * Orders will navigates to Standing Order module screen.
		 * 
		 * new ModulesHomePage() .clickAccountAccess() .clickAccounts()
		 * .ClickAccordion2() .ClickModeloviewDirectDebit(); // To view the Direct Debit
		 * will navigates to Direct Debit module screen.
		 */		
		
	}
}
