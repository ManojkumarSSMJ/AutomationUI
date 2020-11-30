package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wrapperMethods.ProjectMethods;

public class StandingOrderPage extends ProjectMethods {

	public StandingOrderPage() {
		PageFactory.initElements(driver,this);
	}

	public StandingOrderPage Browserdata(String browser,String url) {
		launchBrowser(browser,url);
		return new StandingOrderPage();
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.StandingOrderElements.ShowDropdown)
	private WebElement ShowDropdown;

	public StandingOrderPage clickShowDropdown(){
		click(ShowDropdown);
		return this;
	}
	@FindBy(how=How.XPATH,using=uiobjects.StandingOrderElements.Search)
	private WebElement eleSearch;

	public StandingOrderPage enterSearch(String data) {
		inputData(eleSearch, data);
		return this;
	}
	
	@FindBy(how=How.ID,using=uiobjects.StandingOrderElements.FirstButton)
	private WebElement eleFirstButton;

	public StandingOrderPage ClickFirstButton() {
		click(eleFirstButton);
		return this;
	}

	@FindBy(how=How.ID,using=uiobjects.StandingOrderElements.PreviousButton)
	private WebElement elePreviousButton;

	public StandingOrderPage ClickPreviousButton() {
		click(elePreviousButton);
		return this;
	}
	
	@FindBy(how=How.ID,using=uiobjects.StandingOrderElements.LastButton)
	private WebElement eleLastButton;

	public StandingOrderPage ClickLastButton() {
		click(eleLastButton);
		return this;
	}
	
	@FindBy(how=How.ID,using=uiobjects.StandingOrderElements.NextButton)
	private WebElement eleNextButton;

	public StandingOrderPage ClickNextButton() {
		click(eleNextButton);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.StandingOrderElements.ClickHereButton)
	private WebElement eleClickHereButton;

	public StandingOrderPage ClickClickHereButton() {
		click(eleClickHereButton);
		return this;
	}
	
}



