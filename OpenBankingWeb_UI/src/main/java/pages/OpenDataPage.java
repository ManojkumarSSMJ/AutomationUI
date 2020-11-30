package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wrapperMethods.ProjectMethods;

public class OpenDataPage extends ProjectMethods {

	public OpenDataPage() {
		PageFactory.initElements(driver,this);
	}

	public OpenDataPage Browserdata(String browser,String url) {
		launchBrowser(browser,url);
		return new OpenDataPage();
	}
	
	
	
	@FindBy(how=How.XPATH,using=uiobjects.OpenDataElements.Map)
	private WebElement eleMap;

	public OpenDataPage clickMap() throws InterruptedException {
		click(eleMap);
		Thread.sleep(2000);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.OpenDataElements.Satellite)
	private WebElement eleSatellite;

	public OpenDataPage clickSatellite() throws InterruptedException {
		click(eleSatellite);
		Thread.sleep(2000);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.OpenDataElements.Fullscreenview)
	private WebElement eleFullscreenview;

	public OpenDataPage clickFullscreenview() {
		click(eleFullscreenview);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=uiobjects.OpenDataElements.Zoomin)
	private WebElement eleZoomin;

	public OpenDataPage clickZoomin() {
		click(eleZoomin);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using=uiobjects.OpenDataElements.Zoomout)
	private WebElement eleZoomout;

	public OpenDataPage clickZoomout() {
		click(eleZoomout);
		return this;
	}
	
}



