package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wrapperMethods.ProjectMethods;

public class SingleImmediatePaymentPage extends ProjectMethods {

	String successMessage;

	public SingleImmediatePaymentPage() {
		PageFactory.initElements(driver, this);
	}

	public SingleImmediatePaymentPage Browserdata(String browser, String url) {
		launchBrowser(browser, url);
		return new SingleImmediatePaymentPage();
	}

	@FindBy(how = How.ID, using = uiobjects.SingleImmediatePaymentElements.accountNumberlabel)
	private WebElement eleaccountNumberlabel;
	@FindBy(how = How.ID, using = uiobjects.SingleImmediatePaymentElements.accountNumber)
	private WebElement eleaccountNumber;

	public SingleImmediatePaymentPage SelectaccountNumber(String data) {
		selectDropDownUsingText(eleaccountNumber, data);
		String accountNumberlabel = eleaccountNumberlabel.getText();
		if (accountNumberlabel.length() == 0) {

			reportStep("Valid Input", "PASS");
		} else {
			reportStep("Invalid input: " + accountNumberlabel, "PASS");
		}

		return this;
	}

	@FindBy(how = How.ID, using = uiobjects.SingleImmediatePaymentElements.providerlabel)
	private WebElement eleproviderlabel;
	@FindBy(how = How.ID, using = uiobjects.SingleImmediatePaymentElements.provider)
	private WebElement eleprovider;

	public SingleImmediatePaymentPage Selectprovider(String data) {
		selectDropDownUsingText(eleprovider, data);
		String providerlabel = eleproviderlabel.getText();
		if (providerlabel.length() == 0) {

			reportStep("Valid Input", "PASS");
		} else {
			reportStep("Invalid input: " + providerlabel, "PASS");
		}

		return this;
	}

	@FindBy(how = How.ID, using = uiobjects.SingleImmediatePaymentElements.mobileNumberlabel)
	private WebElement elemobileNumberlabel;
	@FindBy(how = How.ID, using = uiobjects.SingleImmediatePaymentElements.mobileNumber)
	private WebElement elemobileNumber;

	public SingleImmediatePaymentPage EntermobileNumber(String data) {
		inputData(elemobileNumber, data);
		String mobileNumberlabel = elemobileNumberlabel.getText();
		if (mobileNumberlabel.length() == 0) {

			reportStep("Valid Input", "PASS");
		} else {
			reportStep("Invalid input: " + mobileNumberlabel, "PASS");
		}

		return this;
	}

	@FindBy(how = How.ID, using = uiobjects.SingleImmediatePaymentElements.amountlabel)
	private WebElement eleamountlabel;
	@FindBy(how = How.ID, using = uiobjects.SingleImmediatePaymentElements.amount)
	private WebElement eleamount;

	public SingleImmediatePaymentPage Enteramount(String data) {
		inputData(eleamount, data);
		String amountlabel = eleamountlabel.getText();
		if (amountlabel.length() == 0) {

			reportStep("Valid Input", "PASS");
		} else {
			reportStep("Invalid input: " + amountlabel, "PASS");
		}

		return this;
	}

	@FindBy(how = How.ID, using = uiobjects.SingleImmediatePaymentElements.recharge)
	private WebElement elerecharge;

	public SingleImmediatePaymentPage Clickrecharge() throws InterruptedException {
		click(elerecharge);
		Thread.sleep(5000);

		return this;
	}

	@FindBy(how = How.ID, using = uiobjects.SingleImmediatePaymentElements.cancel)
	private WebElement elecancel;

	public SingleImmediatePaymentPage Clickcancel() {
		click(elecancel);

		return this;
	}

	public SingleImmediatePaymentPage ClickRefresh() throws InterruptedException {
		Thread.sleep(10000);
		Refresh();
		Thread.sleep(6000);

		return this;
	}

	@FindBy(how = How.XPATH, using = uiobjects.SingleImmediatePaymentElements.allow)
	private WebElement eleallow;
	@FindBy(how = How.XPATH, using = uiobjects.SingleImmediatePaymentElements.otp)
	private WebElement eleotp;
	@FindBy(how = How.XPATH, using = uiobjects.SingleImmediatePaymentElements.Authorize)
	private WebElement eleAuthorize;

	public SingleImmediatePaymentPage Clickallow(String data) throws InterruptedException {

		try {

			click(eleallow);
			Thread.sleep(5000);
			inputData(eleotp, data);
			Thread.sleep(5000);
			click(eleAuthorize);
			Thread.sleep(9000);
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		}

		return this;
	}

	@FindBy(how = How.XPATH, using = uiobjects.SingleImmediatePaymentElements.deny)
	private WebElement eledeny;

	public SingleImmediatePaymentPage Clickdeny() {
		click(eledeny);

		return this;
	}

	@FindBy(how = How.XPATH, using = uiobjects.SingleImmediatePaymentElements.SucessStatus)
	private WebElement elestatus;

	public SingleImmediatePaymentPage VerifyMessage(String data) {
		successMessage = elestatus.getText();
		AssertionMethod(successMessage, data);
		return this;
	}

}
