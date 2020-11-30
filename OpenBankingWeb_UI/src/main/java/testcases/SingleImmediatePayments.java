package testcases;

import org.testng.annotations.BeforeTest;




import org.testng.annotations.Test;

import pages.LoginLogoutPage;
import pages.ModulesHomePage;
import wrapperMethods.ProjectMethods;

public class SingleImmediatePayments extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		 testCaseName="Single Immediate Payment";
		 testDescription="login into OpenBanking Web Portal";
		 testNodes="Single Immediate Payment Module";
		 category="UI Automation";
		 executedBy="Manoj";
		 dataSheetName="SingleImmediatePayment";
	}
	
	@Test(dataProvider="fetchData")
	public void SingleImmediatePayment(String browser,String url,String uname,String pwd,String Accountnumber,String provider,String mobnum,String amount
			,String defaultselect,String splchar,String alphabets,String Empty,String OTP,String MobileNumvalid,String role
			) throws InterruptedException{
		String  RechargeStatus="RechargeStatus";
		
		/*
		 * new LoginLogoutPage() .Browserdata(browser,url) .clickProceed()
		 * .enterUserName(uname) .enterPassword(pwd) .SelectRole(role).clickLogin();
		 */
		 
		 
		
		// Payment Initiation Main Module - Single Immediate Payment Sub Module
		
		new ModulesHomePage()
		.clickPaymentInitiation()
		.clickSingleImmediatePayment()
		.SelectaccountNumber(defaultselect) // Default Select validation for Account number field
		.Clickrecharge()
		.SelectaccountNumber(Accountnumber)
		.Selectprovider(defaultselect) // Default Select validation for provider field
		.Clickrecharge()
		.Selectprovider(provider)
		
		// Mobile Number field Validation
		
		.EntermobileNumber(Empty) // Empty Validation for Mobile Number field in Single Immediate Payment Module
		.Clickrecharge()
		.EntermobileNumber(splchar)
		.Clickrecharge()
		.EntermobileNumber(alphabets)
		.Clickrecharge()
		.EntermobileNumber(mobnum)
		.Clickrecharge()
		.EntermobileNumber(MobileNumvalid)
		// Amount Field Validation
		
		.Enteramount(Empty) // Empty Validation for Amount field in Single Immediate Payment Module
		.Clickrecharge()
		.Enteramount(splchar)
		.Clickrecharge()
		.Enteramount(alphabets)
		.Clickrecharge()
		.Enteramount(amount)
		
		.Clickrecharge() // Valid Input 
		
		.Clickallow(OTP); // To proceed Further for Recharge 
		
		// Enter OTP to Authorize the Txn
		// Along with the assertion method Recharge Successful
		
		//.VerifyMessage(RechargeStatus); // Success message for Recharge (Single Immediate Payment)
		
		
		
		
	}
}
