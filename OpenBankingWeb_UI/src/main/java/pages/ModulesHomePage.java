package pages;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import wrapperMethods.ProjectMethods;

public class ModulesHomePage extends ProjectMethods {

	public ModulesHomePage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.PARTIAL_LINK_TEXT,using=uiobjects.ModuleElements.Settings)
	private WebElement eleSettings;

	public ModulesHomePage clickSettings() {
		clickusingtext(eleSettings);
		return this;
	}
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using=uiobjects.ModuleElements.LinkBankMerchants)
	private WebElement eleLinkBankMerchants;

	public LinkBankMerchantsPage clickLinkBankMerchants() {
		clickusingtext(eleLinkBankMerchants);
		return new LinkBankMerchantsPage();
	}
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using=uiobjects.ModuleElements.Activity)
	private WebElement eleActivity;

	public ActivityPage clickActivity() {
		clickusingtext(eleActivity);
		return new ActivityPage();
	}
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using=uiobjects.ModuleElements.OpenData)
	private WebElement eleOpenData;

	public ModulesHomePage clickOpen_data() {
		clickusingtext(eleOpenData);
		return this;
	}
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using=uiobjects.ModuleElements.ATM)
	private WebElement eleATM;

	public OpenDataPage clickATM() throws InterruptedException {
		clickusingtext(eleATM);
		Thread.sleep(2000);
		return new OpenDataPage();
	}
	@FindBy(how=How.PARTIAL_LINK_TEXT,using=uiobjects.ModuleElements.Branches)
	private WebElement eleBranches;

	public OpenDataPage clickBranches() throws InterruptedException {
		clickusingtext(eleBranches);
		Thread.sleep(2000);
		return new OpenDataPage();
	}
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using=uiobjects.ModuleElements.AccountAccess)
	private WebElement eleAccountAccess;

	public ModulesHomePage clickAccountAccess() throws InterruptedException {
		Thread.sleep(3000);
		clickusingtext(eleAccountAccess);
		return this;
	}
	
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using=uiobjects.ModuleElements.Accounts)
	private WebElement eleAccounts;

	public AccountsPage clickAccounts() {
		clickusingtext(eleAccounts);
		return new AccountsPage();
	}
	@FindBy(how=How.PARTIAL_LINK_TEXT,using=uiobjects.ModuleElements.Transactions)
	private WebElement eleTransactions;

	public TransactionsPage clickTransactions() {
		clickusingtext(eleTransactions);
		return new TransactionsPage();
	}
	@FindBy(how=How.PARTIAL_LINK_TEXT,using=uiobjects.ModuleElements.DirectDebits)
	private WebElement eleDirectDebits;

	public ModulesHomePage clickDirectDebits() {
		clickusingtext(eleDirectDebits);
		return this;
	}
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using=uiobjects.ModuleElements.StandingOrders)
	private WebElement eleStandingOrders;

	public StandingOrderPage clickStandingOrders() {
		clickusingtext(eleStandingOrders);
		return new StandingOrderPage();
	}
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using=uiobjects.ModuleElements.PaymentInitiation)
	private WebElement elePaymentInitiation;

	public ModulesHomePage clickPaymentInitiation() {
		clickusingtext(elePaymentInitiation);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.CreateAccountElements.CreateAccount)
	private WebElement CreateAccount;

	public CreateAccountPage clickCreateAccount(){
		click(CreateAccount);
		return new CreateAccountPage();
	}
	@FindBy(how=How.PARTIAL_LINK_TEXT,using=uiobjects.ModuleElements.SingleImmediatePayment)
	private WebElement eleSingleImmediatePayment;

	public SingleImmediatePaymentPage clickSingleImmediatePayment() {
		clickusingtext(eleSingleImmediatePayment);
		return new SingleImmediatePaymentPage();
	}
}
