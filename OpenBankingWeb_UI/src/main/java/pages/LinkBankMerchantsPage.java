package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wrapperMethods.ProjectMethods;

public class LinkBankMerchantsPage extends ProjectMethods {
	String successMessage;
	public LinkBankMerchantsPage() {
		PageFactory.initElements(driver,this);
	}

	public LinkBankMerchantsPage Browserdata(String browser,String url) {
		launchBrowser(browser,url);
		return new LinkBankMerchantsPage();
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.LinkBankMerchantsElements.AIB_Sandbox)
	private WebElement eleAIB_Sandbox;

	public LinkBankMerchantsPage clickAIB_Sandbox() throws InterruptedException {
		Thread.sleep(3000);
		click(eleAIB_Sandbox);
		return this;
	}
	@FindBy(how=How.XPATH,using=uiobjects.LinkBankMerchantsElements.Modelo_Sandbox)
	private WebElement eleModelo_Sandbox;

	public LinkBankMerchantsPage clickModelo_Sandbox() throws RuntimeException, InterruptedException{
		Thread.sleep(3000);
		click(eleModelo_Sandbox);
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.LinkBankMerchantsElements.Barclays_Sandbox)
	private WebElement eleBarclays_Sandbox;

	public LinkBankMerchantsPage clickBarclays_Sandbox() throws RuntimeException, InterruptedException{
		click(eleBarclays_Sandbox);
		return this;
	}

	@FindBy(how=How.XPATH,using=uiobjects.LinkBankMerchantsElements.AIB_Sandbox_SelectAll)
	private WebElement eleAIB_Sandbox_SelectAll;

	public LinkBankMerchantsPage clickAIBSelectAll() {
		
		click(eleAIB_Sandbox_SelectAll);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.LinkBankMerchantsElements.AIB_Sandbox_input1)
	private WebElement eleAIB_Sandbox_input1;

	public LinkBankMerchantsPage clickAIBinput1() {
		click(eleAIB_Sandbox_input1);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.LinkBankMerchantsElements.Modelo_Sandbox_SelectAll)
	private WebElement eleModelo_Sandbox_SelectAll;

	public LinkBankMerchantsPage clickModeloSelectAll() {
		click(eleModelo_Sandbox_SelectAll);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.LinkBankMerchantsElements.Modelo_Sandbox_input1)
	private WebElement eleModelo_Sandbox_input1;

	public LinkBankMerchantsPage clickModeloinput1() {
		click(eleModelo_Sandbox_input1);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.LinkBankMerchantsElements.Barclays_Sandbox_SelectAll)
	private WebElement eleBarclays_Sandbox_SelectAll;

	public LinkBankMerchantsPage clickBarclaysSelectAll() {
		click(eleBarclays_Sandbox_SelectAll);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.LinkBankMerchantsElements.Barclays_Sandbox_input1)
	private WebElement eleBarclays_Sandbox_input1;

	public LinkBankMerchantsPage clickBarclaysinput1() {
		click(eleBarclays_Sandbox_input1);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.LinkBankMerchantsElements.AIB_ReadTxnStartDateCalendar)
	private WebElement eleAIB_ReadTxnStartDateCalendar;

	public LinkBankMerchantsPage clickAIBStartDateCal() {
		click(eleAIB_ReadTxnStartDateCalendar);
	
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.LinkBankMerchantsElements.AIB_ReadTxnEndDateCalendar)
	private WebElement eleAIB_ReadTxnEndDateCalendar;

	public LinkBankMerchantsPage clickAIBEndDateCal() {
		click(eleAIB_ReadTxnEndDateCalendar);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.LinkBankMerchantsElements.AIB_ReadTxnExpiryDateCalendar)
	private WebElement eleAIB_ReadTxnExpiryDateCalendar;

	public LinkBankMerchantsPage clickAIBExpiryDateCal() {
		click(eleAIB_ReadTxnExpiryDateCalendar);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.LinkBankMerchantsElements.Modelo_ReadTxnStartDateCalendar)
	private WebElement eleModelo_ReadTxnStartDateCalendar;

	public LinkBankMerchantsPage clickModeloStartDateCal() {
		click(eleModelo_ReadTxnStartDateCalendar);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.LinkBankMerchantsElements.Modelo_ReadTxnEndDateCalendar)
	private WebElement eleModelo_ReadTxnEndDateCalendar;

	public LinkBankMerchantsPage clickModeloEndDateCal() {
		click(eleModelo_ReadTxnEndDateCalendar);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.LinkBankMerchantsElements.Modelo_ReadTxnExpiryDateCalendar)
	private WebElement eleModelo_ReadTxnExpiryDateCalendar;

	public LinkBankMerchantsPage clickModeloExpiryDateCal() {
		click(eleModelo_ReadTxnExpiryDateCalendar);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.LinkBankMerchantsElements.Barclays_ReadTxnStartDateCalendar)
	private WebElement eleBarclays_ReadTxnStartDateCalendar;

	public LinkBankMerchantsPage clickBarclaysStartDateCal() {
		click(eleBarclays_ReadTxnStartDateCalendar);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.LinkBankMerchantsElements.Barclays_ReadTxnEndDateCalendar)
	private WebElement eleBarclays_ReadTxnEndDateCalendar;

	public LinkBankMerchantsPage clickBarclaysEndDateCal() {
		click(eleBarclays_ReadTxnEndDateCalendar);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.LinkBankMerchantsElements.Barclays_ReadTxnExpiryDateCalendar)
	private WebElement eleBarclays_ReadTxnExpiryDateCalendar;

	public LinkBankMerchantsPage clickBarclaysExpiryDateCal() {
		click(eleBarclays_ReadTxnExpiryDateCalendar);
		return this;
	}
	
	@FindBy(how=How.NAME,using=uiobjects.LinkBankMerchantsElements.MonthSelector)
	private WebElement eleMonthCalender;

	public LinkBankMerchantsPage enterMonthCalender(String data) {
		selectDropDownUsingText(eleMonthCalender, data);
		return this;
	}
	
	@FindBy(how=How.NAME,using=uiobjects.LinkBankMerchantsElements.YearSelector)
	private WebElement eleYearSelector;

	public LinkBankMerchantsPage enterYearSelector(String data) {
		selectDropDownUsingText(eleYearSelector, data);
		return this;
	}
	
	public LinkBankMerchantsPage clickDay(String date){
		calender(date);
		return this;
	}
	
	@FindBy(how=How.ID,using=uiobjects.LinkBankMerchantsElements.AIBGrant_UpdateButton)
	private WebElement eleAIBGrant_UpdateButton;

	public LinkBankMerchantsPage ClickAIBGrantUpdateButton() throws InterruptedException {
		Thread.sleep(7000);
		click(eleAIBGrant_UpdateButton);
		Thread.sleep(3000);
		
		return this;
	}
	public LinkBankMerchantsPage ClickRefresh() throws InterruptedException {
		Thread.sleep(10000);
		Refresh();
		Thread.sleep(6000);
		
		return this;
	}
	@FindBy(how=How.XPATH,using=uiobjects.LinkBankMerchantsElements.SucessStatus)
	private WebElement elestatus;
	
	public LinkBankMerchantsPage VerifyMessage(String data)  {
		successMessage=elestatus.getText();
		AssertionMethod(successMessage,data);
		return this;
	}
	
	public LinkBankMerchantsPage ClickWindowPopUpOK() throws InterruptedException {
		
		WindowPopUpOK();
		Thread.sleep(3000);
		
		return this;
	}
	@FindBy(how=How.ID,using=uiobjects.LinkBankMerchantsElements.ModeloGrant_UpdateButton)
	private WebElement eleModeloGrant_UpdateButton;

	public LinkBankMerchantsPage ClickModeloGrantUpdateButton() throws InterruptedException {
		Thread.sleep(7000);
		click(eleModeloGrant_UpdateButton);
		Thread.sleep(3000);
		
		return this;
	}
	
	@FindBy(how=How.ID,using=uiobjects.LinkBankMerchantsElements.BarclaysGrant_UpdateButton)
	private WebElement eleBarclaysGrant_UpdateButton;

	public LinkBankMerchantsPage ClickBarclaysGrantUpdateButton() throws InterruptedException {
		Thread.sleep(7000);
		click(eleBarclaysGrant_UpdateButton);
		Thread.sleep(3000);
		return this;
	}
	
	@FindBy(how=How.ID,using=uiobjects.LinkBankMerchantsElements.AIBRevokeButton)
	private WebElement eleAIBRevokeButton;

	public LinkBankMerchantsPage ClickAIBRevokeButton() throws InterruptedException {
		click(eleAIBRevokeButton);
		
		return this;
	}
	
	@FindBy(how=How.ID,using=uiobjects.LinkBankMerchantsElements.ModeloRevokeButton)
	private WebElement eleModeloRevokeButton;

	public LinkBankMerchantsPage ClickModeloRevokeButton() throws InterruptedException {
		click(eleModeloRevokeButton);
		
		return this;
	}
	
	@FindBy(how=How.ID,using=uiobjects.LinkBankMerchantsElements.BarclaysRevokeButton)
	private WebElement eleBarclaysRevokeButton;

	public LinkBankMerchantsPage ClickBarclaysRevokeButton() throws InterruptedException {
		click(eleBarclaysRevokeButton);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.LinkBankMerchantsElements.SelectAll)
	private WebElement eleSelectAll;

	public LinkBankMerchantsPage ClickSelectAll() throws RuntimeException, InterruptedException {
		
		click(eleSelectAll);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.LinkBankMerchantsElements.Login)
	private WebElement eleLogin;

	public LinkBankMerchantsPage ClickLogin() throws InterruptedException {
		click(eleLogin);
		
		return this;
	}
	@FindBy(how=How.ID,using=uiobjects.LinkBankMerchantsElements.LoginName)
	private WebElement eleLoginName;

	public LinkBankMerchantsPage EnterLoginName(String Data) throws InterruptedException {
		inputData(eleLoginName,Data);
		
		return this;
	}
	
	@FindBy(how=How.ID,using=uiobjects.LinkBankMerchantsElements.Password)
	private WebElement elePassword;

	public LinkBankMerchantsPage EnterPassword(String Data) throws InterruptedException {
		inputData(elePassword,Data);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.LinkBankMerchantsElements.Cancel)
	private WebElement eleCancel;

	public LinkBankMerchantsPage ClickCancel() throws InterruptedException {
		click(eleCancel);
		
		return this;
	}
	@FindBy(how=How.ID,using=uiobjects.LinkBankMerchantsElements.Permissions)
	private WebElement elePermissions;

	public LinkBankMerchantsPage ClickPermissions() throws InterruptedException {
		click(elePermissions);
		
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using=uiobjects.LinkBankMerchantsElements.Confirm)
	private WebElement eleConfirm;

	public LinkBankMerchantsPage ClickConfirm() throws InterruptedException {
		click(eleConfirm);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.LinkBankMerchantsElements.OpenBankPermCancel)
	private WebElement eleOpenBankPermCancel;

	public LinkBankMerchantsPage ClickOpenBankPermCancel() throws InterruptedException {
		click(eleOpenBankPermCancel);
		
		return this;
	}
}



