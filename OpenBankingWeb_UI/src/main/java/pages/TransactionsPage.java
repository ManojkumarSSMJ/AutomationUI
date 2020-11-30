package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wrapperMethods.ProjectMethods;

public class TransactionsPage extends ProjectMethods {

	public TransactionsPage() {
		PageFactory.initElements(driver,this);
	}

	public TransactionsPage Browserdata(String browser,String url) {
		launchBrowser(browser,url);
		return new TransactionsPage();
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.TransactionsElements.ShowDropdown)
	private WebElement ShowDropdown;

	public TransactionsPage clickShowDropdown(){
		click(ShowDropdown);
		return this;
	}
	@FindBy(how=How.XPATH,using=uiobjects.TransactionsElements.Search)
	private WebElement eleSearch;

	public TransactionsPage enterSearch(String data) {
		inputData(eleSearch, data);
		return this;
	}
	
	@FindBy(how=How.ID,using=uiobjects.TransactionsElements.FirstButton)
	private WebElement eleFirstButton;

	public TransactionsPage ClickFirstButton() {
		click(eleFirstButton);
		return this;
	}

	@FindBy(how=How.ID,using=uiobjects.TransactionsElements.PreviousButton)
	private WebElement elePreviousButton;

	public TransactionsPage ClickPreviousButton() {
		click(elePreviousButton);
		return this;
	}
	
	@FindBy(how=How.ID,using=uiobjects.TransactionsElements.LastButton)
	private WebElement eleLastButton;

	public TransactionsPage ClickLastButton() {
		click(eleLastButton);
		return this;
	}
	
	@FindBy(how=How.ID,using=uiobjects.TransactionsElements.NextButton)
	private WebElement eleNextButton;

	public TransactionsPage ClickNextButton() {
		click(eleNextButton);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.TransactionsElements.ClickHereButton)
	private WebElement eleClickHereButton;

	public TransactionsPage ClickClickHereButton() {
		click(eleClickHereButton);
		return this;
	}
	
}



