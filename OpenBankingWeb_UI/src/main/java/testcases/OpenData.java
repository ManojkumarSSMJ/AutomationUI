package testcases;

import org.testng.annotations.BeforeTest;



import org.testng.annotations.Test;

import pages.LoginLogoutPage;
import pages.ModulesHomePage;
import wrapperMethods.ProjectMethods;

public class OpenData extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		 testCaseName="Open Data";
		 testDescription="login into OpenBanking Web Portal";
		 testNodes="Open Data";
		 category="UI Automation";
		 executedBy="Manoj";
		 dataSheetName="OpenData";
	}
	
	@Test(dataProvider="fetchData")
	public void OpenData(String browser,String url,String uname,String pwd,String role
			) throws InterruptedException{
		/*
		 * new LoginLogoutPage() .Browserdata(browser,url) .clickProceed()
		 * .enterUserName(uname) .enterPassword(pwd) .SelectRole(role) .clickLogin();
		 */
		new ModulesHomePage()
		.clickOpen_data()
		.clickATM()
		.clickMap()
		.clickFullscreenview()
		.clickFullscreenview()
		.clickZoomin()
		.clickZoomout()
		.clickSatellite()
		.clickFullscreenview()
		.clickFullscreenview()
		.clickZoomin()
		.clickZoomout();
		new ModulesHomePage()
		.clickOpen_data()
		.clickBranches()
		.clickMap()
		.clickFullscreenview()
		.clickFullscreenview()
		.clickZoomin()
		.clickZoomout()
		.clickSatellite()
		.clickFullscreenview()
		.clickFullscreenview()
		.clickZoomin()
		.clickZoomout();
		
	}
}
