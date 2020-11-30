package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wrapperMethods.ProjectMethods;

public class AccountsPage extends ProjectMethods {

	public AccountsPage() {
		PageFactory.initElements(driver,this);
	}

	public AccountsPage Browserdata(String browser,String url) {
		launchBrowser(browser,url);
		return new AccountsPage();
	}

	
	@FindBy(how=How.ID,using=uiobjects.AccountsElements.viewBalance)
	private WebElement eleviewBalance;

	public AccountsPage ClickviewBalance() throws InterruptedException {
		Thread.sleep(3000);
		click(eleviewBalance);
		return this;
	}
	@FindBy(how=How.XPATH,using=uiobjects.AccountsElements.ModeloviewBalance)
	private WebElement eleModeloviewBalance;

	public AccountsPage ClickModeloviewBalance() throws InterruptedException {
		Thread.sleep(3000);
		click(eleModeloviewBalance);
		return this;
	}

	@FindBy(how=How.ID,using=uiobjects.AccountsElements.viewTransactions)
	private WebElement eleviewTransactions;

	public AccountsPage ClickviewTransactions() {
		click(eleviewTransactions);
		return this;
	}
	
	@FindBy(how=How.ID,using=uiobjects.AccountsElements.viewDirectDebit)
	private WebElement eleviewDirectDebit;

	public AccountsPage ClickviewDirectDebit() {
		click(eleviewDirectDebit);
		return this;
	}
	
	@FindBy(how=How.ID,using=uiobjects.AccountsElements.viewStandingOrder)
	private WebElement eleviewStandingOrder;

	public AccountsPage ClickviewStandingOrder() {
		click(eleviewStandingOrder);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.AccountsElements.ModeloviewTransactions)
	private WebElement eleModeloviewTransactions;

	public AccountsPage ClickModeloviewTransactions() {
		click(eleModeloviewTransactions);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.AccountsElements.ModeloviewDirectDebit)
	private WebElement eleModeloviewDirectDebit;

	public AccountsPage ClickModeloviewDirectDebit() {
		click(eleModeloviewDirectDebit);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.AccountsElements.ModeloviewStandingOrder)
	private WebElement eleModeloviewStandingOrder;

	public AccountsPage ClickModeloviewStandingOrder() {
		click(eleModeloviewStandingOrder);
		return this;
	}
	
	
	
	
	@FindBy(how=How.ID,using=uiobjects.AccountsElements.AlertOk)
	private WebElement eleAlertOk;

	public AccountsPage ClickAlertOk() {
		click(eleAlertOk);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.AccountsElements.Accordion1)
	private WebElement eleAccordion1;

	public AccountsPage ClickAccordion1() throws InterruptedException , RuntimeException{
		try {
			Thread.sleep(2000);
			click(eleAccordion1);
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			
			e.printStackTrace();
		}
		return this;
	}
	@FindBy(how=How.XPATH,using=uiobjects.AccountsElements.Accordion2)
	private WebElement eleAccordion2;

	public AccountsPage ClickAccordion2() throws InterruptedException {
		try {
			Thread.sleep(2000);
			click(eleAccordion2);
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			
			e.printStackTrace();
		}
		return this;
	}
	
}



