package testcases;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import pages.LinkBankMerchantsPage;
import pages.LoginLogoutPage;
import pages.ModulesHomePage;
import wrapperMethods.ProjectMethods;

public class LinkBankMerchants extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName = "List of Banks / Merchants";
		testDescription = "login into OpenBanking Web Portal";
		testNodes = "List of Banks / Merchants";
		category = "UI Automation";
		executedBy = "Manoj";
		dataSheetName = "ListOfBanks";
	}

	@Test(dataProvider="fetchData")
	public void ListOfBanks(String browser,String url,String uname,String pwd,
			String Monthcal,String Yearcal,String Startdate,String EndDate,String ExpiryDate,
			String LoginName,String Password,String Select,String Role 
			) throws InterruptedException{
		String UpdateConsentStatus="UpdateConsentStatus",RevokeConsentStatus="RevokeConsentStatus";
		
		
		
		
		/*
		 * new LoginLogoutPage()
		 * 
		 * .Browserdata(browser,url)
		 * 
		 * .clickProceed()
		 * 
		 * .clickLogin() .enterUserName(uname) .clickLogin() .enterPassword(pwd)
		 * .SelectRole(Select) .clickLogin() .ClickWindowPopUpOK() .SelectRole(Role)
		 * .clickLogin();
		 */
		 
		
		new ModulesHomePage()
		.clickSettings()
		.clickLinkBankMerchants()
		
		// AIB Sandbox
		
		.clickAIB_Sandbox()
		.clickAIBSelectAll()
		.clickAIBSelectAll()
		.clickAIBinput1()
		.ClickAIBGrantUpdateButton() // Click Grant / Update Button
		//.ClickRefresh()
		.VerifyMessage(UpdateConsentStatus);
		// Modelo Sandox bank Account
		
		new ModulesHomePage()
		.clickSettings()
		.clickLinkBankMerchants()
		.clickModelo_Sandbox()
		.clickModeloSelectAll()
		.clickModeloSelectAll()
		.clickModeloinput1()
		.ClickModeloGrantUpdateButton()
		
		
		// Ozone Open Banking Portal with Login and Password (Update Consent)
		
		.EnterLoginName(LoginName)
		.EnterPassword(Password)
		.ClickLogin()
		//.ClickWindowPopUpOK()
		.ClickSelectAll()
		.ClickPermissions()
		.ClickConfirm()
		.VerifyMessage(UpdateConsentStatus);
		// Braclays Sandbox Bank
		
		//new ModulesHomePage()
		/*.clickSettings()
		.clickLinkBankMerchants()
		
		// AIB Sandbox
		
		.clickBarclays_Sandbox()
		.clickBarclaysSelectAll()
		.clickBarclaysSelectAll()
		.clickBarclaysinput1()
		
		
		.ClickBarclaysGrantUpdateButton() // Click Grant / Update Button
		.ClickRefresh()
		.clickBarclays_Sandbox()
		//.clickAIBSelectAll()
		//.clickAIBSelectAll()
		//.clickAIBinput1()
		.ClickBarclaysGrantUpdateButton()
		.ClickRefresh(); */// Update consent Button
		
		
		
				
		
		
		
		
		
	}
}
