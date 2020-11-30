package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wrapperMethods.ProjectMethods;

public class ActivityPage extends ProjectMethods {

	public ActivityPage() {
		PageFactory.initElements(driver,this);
	}

	public ActivityPage Browserdata(String browser,String url) {
		launchBrowser(browser,url);
		return new ActivityPage();
	}
	
	
	@FindBy(how=How.XPATH,using=uiobjects.ActivityElements.AIB_Sandbox)
	private WebElement eleAIB_Sandbox;

	public ActivityPage clickAIB_Sandbox() throws InterruptedException {
		Thread.sleep(3000);
		click(eleAIB_Sandbox);
		return this;
	}
	@FindBy(how=How.XPATH,using=uiobjects.ActivityElements.Modelo_Sandbox)
	private WebElement eleModelo_Sandbox;

	public ActivityPage clickModelo_Sandbox() throws RuntimeException, InterruptedException{
		Thread.sleep(3000);
		click(eleModelo_Sandbox);
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.ActivityElements.Barclays_Sandbox)
	private WebElement eleBarclays_Sandbox;

	public ActivityPage clickBarclays_Sandbox() throws RuntimeException, InterruptedException{
		click(eleBarclays_Sandbox);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.ActivityElements.ShowDropdown)
	private WebElement ShowDropdown;

	public ActivityPage clickShowDropdown(){
		click(ShowDropdown);
		return this;
	}
	@FindBy(how=How.XPATH,using=uiobjects.ActivityElements.Search)
	private WebElement eleSearch;

	public ActivityPage enterSearch(String data) {
		inputData(eleSearch, data);
		return this;
	}
	
	@FindBy(how=How.ID,using=uiobjects.ActivityElements.FirstButton)
	private WebElement eleFirstButton;

	public ActivityPage ClickFirstButton() {
		click(eleFirstButton);
		return this;
	}

	@FindBy(how=How.ID,using=uiobjects.ActivityElements.PreviousButton)
	private WebElement elePreviousButton;

	public ActivityPage ClickPreviousButton() {
		click(elePreviousButton);
		return this;
	}
	
	@FindBy(how=How.ID,using=uiobjects.ActivityElements.LastButton)
	private WebElement eleLastButton;

	public ActivityPage ClickLastButton() {
		click(eleLastButton);
		return this;
	}
	
	@FindBy(how=How.ID,using=uiobjects.ActivityElements.NextButton)
	private WebElement eleNextButton;

	public ActivityPage ClickNextButton() {
		click(eleNextButton);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.ActivityElements.ClickHereButton)
	private WebElement eleClickHereButton;

	public ActivityPage ClickClickHereButton() {
		click(eleClickHereButton);
		return this;
	}
	
}



