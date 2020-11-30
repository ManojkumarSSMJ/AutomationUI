package wrapperMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Reporter;

public class ImplementationMethods extends Reporter implements WrapperMethods{

	public static RemoteWebDriver driver;
	public String sUrl,sHubUrl,sHubPort,expectedResult;
	public Properties prop;
	public static String DBCount;
	public ImplementationMethods() {
		prop = new Properties();
		try {
			prop.load(new FileInputStream(new File("./src/main/resources/config.properties")));
			sHubUrl = prop.getProperty("HUB");
			sHubPort = prop.getProperty("PORT");
			sUrl = prop.getProperty("URL");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void startApp(String browser, boolean bRemote) {
		try {
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setBrowserName(browser);
			dc.setPlatform(Platform.WINDOWS);
			// this is for grid run
			if(bRemote)
				try {
					driver = new RemoteWebDriver(new URL("http://"+sHubUrl+":"+sHubPort+"/wd/hub"), dc);
				} catch (MalformedURLException e) {
				}
			else{ // this is for local run
				if(browser.equalsIgnoreCase("chrome")){
					System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
					driver = new ChromeDriver();
				}else {
					System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
					driver = new FirefoxDriver();
				}
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(sUrl);
			reportStep("The browser: "+browser+" launched successfully", "PASS");
		} catch (WebDriverException e) {			
			reportStep("The browser: "+browser+" could not be launched", "FAIL");
		}
	}

	public void startApp(String browser) {
		startApp(browser, false);
	}


	public void launchBrowser(String browser, String url) {
		try {
			if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}else {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(url);
			reportStep("The browser launched successfully", "PASS");
			reportStep("The browser: "+browser+" launched successfully", "PASS");
		} 
		catch (WebDriverException e) {			
			reportStep("The browser: "+browser+" could not be launched", "FAIL");
		}

	}

	public void enterURL(String url){
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		reportStep("The browser launched successfully", "PASS");
	}

	public WebElement locateElement(String locator, String locValue) {
		try {
			switch(locator) {
			case("id"): return driver.findElementById(locValue);
			case("link"): return driver.findElementByLinkText(locValue);
			case("xpath"):return driver.findElementByXPath(locValue);
			case("name"): return driver.findElementByName(locValue);
			case("class"): return driver.findElementByClassName(locValue);
			case("tag"):return driver.findElementByTagName(locValue);
			}
		} catch (NoSuchElementException e) {
			reportStep("The element with locator "+locator+" not found.","FAIL");
		} catch (WebDriverException e) {
			reportStep("Unknown exception occured while finding "+locator+" with the value "+locValue, "FAIL");
		}
		return null;
	}

	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);
	}

	public void inputData(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			String x = ""+ele;
			reportStep("The data: "+data+" entered successfully in the field :"+ele, "PASS");
		} catch (InvalidElementStateException e) {
			reportStep("The data: "+data+" could not be entered in the field :"+ele,"FAIL");
		} catch (WebDriverException e) {
			reportStep("Unknown exception occured while entering "+data+" in the field :"+ele, "FAIL");
		}
	}
	
	public void calender(String date){
		String text = null;
		try{		
			WebElement ele = driver.findElementByXPath("//td[text()="+date+"]");
			ele.click();
			reportStep("The element "+text+" is clicked", "PASS");
		} catch (InvalidElementStateException e) {
			reportStep("The element: "+text+" could not be clicked", "FAIL");
		} catch (WebDriverException e) {
			reportStep("Unknown exception occured while clicking in the field :", "FAIL");
		} 
	}
	
	
	 public void status(WebElement ele){
	 	String actual = null;
	 		actual=ele.getText();
	 		System.out.println(actual);
			String expected="Successfully";
			if(actual.contains(expected)){
			System.out.println("Result matched");
			}
			else{
			System.out.println("Result mismatch");
			}
	 }
	
	
	public void click(WebElement ele) {
		String text = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(ele));			
			//text = ele.getText();
			text=ele.getAttribute("value");
			ele.click();
			reportStep("The element "+text+" is clicked", "PASS");
		} catch (InvalidElementStateException e) {
			reportStep("The element: "+text+" could not be clicked", "FAIL");
		} catch (WebDriverException e) {
			reportStep("Unknown exception occured while clicking in the field :", "FAIL");
		} catch (NullPointerException e) {
			reportStep("Null Pointer exception occured while clicking in the field :", "FAIL");
		} 
	}
	
	
	
	public void clickusingtext(WebElement ele) {
		String text = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(ele));			
			text = ele.getText();
			//text=ele.getAttribute("value");
			ele.click();
			reportStep("The element "+text+" is clicked", "PASS");
		} catch (InvalidElementStateException e) {
			reportStep("The element: "+text+" could not be clicked", "FAIL");
		} catch (WebDriverException e) {
			reportStep("Unknown exception occured while clicking in the field :", "FAIL");
		} 
	}
	
	public void clickWithNoSnap(WebElement ele) {
		String text = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(ele));	
			text = ele.getText();
			ele.click();			
			reportStep("The element :"+text+"  is clicked.", "PASS",false);
		} catch (InvalidElementStateException e) {
			reportStep("The element: "+text+" could not be clicked", "FAIL",false);
		} catch (WebDriverException e) {
			reportStep("Unknown exception occured while clicking in the field :","FAIL",false);
		} 
	}

	public String getText(WebElement ele) {	
		String bReturn = null;
		try {
			bReturn = ele.getText();
		} catch (WebDriverException e) {
			reportStep("The element: "+ele+" could not be found.", "FAIL");
		}
		return bReturn;
	}

	public String getTitle() {		
		String bReturn = null;
		try {
			bReturn =  driver.getTitle();
		} catch (WebDriverException e) {
			reportStep("Unknown Exception Occured While fetching Title", "FAIL");
		} 
		return bReturn;
	}

	public String getAttribute(WebElement ele, String attribute) {		
		String bReturn = null;
		try {
			bReturn=  ele.getAttribute(attribute);
		} catch (WebDriverException e) {
			reportStep("The element: "+ele+" could not be found.", "FAIL");
		} 
		return bReturn;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		try {
			new Select(ele).selectByVisibleText(value);
			reportStep("The dropdown is selected with text "+value,"PASS");
		} catch (WebDriverException e) {
			reportStep("The element: "+ele+" could not be found.", "FAIL");
		}

	}
	
	public void selectDropDownUsingIndex(WebElement ele, String index) {
		try {
			int i =Integer.parseInt(index);
			new Select(ele).selectByIndex(i);
			reportStep("The dropdown is selected with index "+index,"PASS");
		} catch (WebDriverException e) {
			reportStep("The element: "+ele+" could not be found.", "FAIL");
		} 

	}

	public boolean verifyTitle(String title) {
		boolean bReturn =false;
		try {
			if(getTitle().equals(title)) {
				reportStep("The title of the page matches with the value :"+title,"PASS");
				bReturn= true;
			}else {
				reportStep("The title of the page:"+driver.getTitle()+" did not match with the value :"+title, "FAIL");
			}
		} catch (WebDriverException e) {
			reportStep("Unknown exception occured while verifying the title", "FAIL");
		} 
		return bReturn;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		try {
			if(getText(ele).equals(expectedText)) {
				reportStep("The text: "+getText(ele)+" matches with the value :"+expectedText,"PASS");
			}else {
				reportStep("The text "+getText(ele)+" doesn't matches the actual "+expectedText,"FAIL");
			}
		} catch (WebDriverException e) {
			reportStep("Unknown exception occured while verifying the Text", "FAIL");
		} 

	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		try {
			if(getText(ele).contains(expectedText)) {
				reportStep("The expected text contains the actual "+expectedText,"PASS");
			}else {
				reportStep("The expected text doesn't contain the actual "+expectedText,"FAIL");
			}
		} catch (WebDriverException e) {
			reportStep("Unknown exception occured while verifying the Text", "FAIL");
		} 
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		try {
			if(getAttribute(ele, attribute).equals(value)) {
				reportStep("The expected attribute :"+attribute+" value matches the actual "+value,"PASS");
			}else {
				reportStep("The expected attribute :"+attribute+" value does not matches the actual "+value,"FAIL");
			}
		} catch (WebDriverException e) {
			reportStep("Unknown exception occured while verifying the Attribute Text", "FAIL");
		} 

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		try {
			if(getAttribute(ele, attribute).contains(value)) {
				reportStep("The expected attribute :"+attribute+" value contains the actual "+value,"PASS");
			}else {
				reportStep("The expected attribute :"+attribute+" value does not contains the actual "+value,"FAIL");
			}
		} catch (WebDriverException e) {
			reportStep("Unknown exception occured while verifying the Attribute Text", "FAIL");
		}
	}

	public void verifySelected(WebElement ele) {
		try {
			if(ele.isSelected()) {
				reportStep("The element "+ele+" is selected","PASS");
			} else {
				reportStep("The element "+ele+" is not selected","FAIL");
			}
		} catch (WebDriverException e) {
			reportStep("WebDriverException : "+e.getMessage(), "FAIL");
		} catch (RuntimeException e) {
			reportStep("WebDriverException : "+e.getMessage(), "FAIL");
		}
	}
	
	public void verifySelect(WebElement ele) {
		try {
			if(ele.isSelected()) {
				reportStep("The element "+ele+" is already selected","PASS");
			} else {
				ele.click();
				reportStep("The element "+ele+" is selected","PASS");
			}
		} catch (WebDriverException e) {
			reportStep("WebDriverException : "+e.getMessage(), "FAIL");
		} catch (RuntimeException e) {
			reportStep("WebDriverException : "+e.getMessage(), "FAIL");
		}
	}
	
	public void isSelected(WebElement ele, WebElement elem) {
		try {
			if(ele.isSelected()==false) {
				elem.click();
				reportStep("The element "+ele+" is selected","PASS");
			} else {
				reportStep("The element "+ele+" is already selected","PASS");
				
			}
		} catch (WebDriverException e) {
			reportStep("WebDriverException : "+e.getMessage(), "FAIL");
		} catch (RuntimeException e) {
			reportStep("WebDriverException : "+e.getMessage(), "FAIL");
		}
	}
	
	public void verifyEnabled(WebElement ele) {
		try {
			if(ele.isEnabled()) {
				reportStep("The element "+ele+" is already selected","PASS");
			} else {
				ele.click();
				reportStep("The element "+ele+" is selected","PASS");
			}
		} catch (WebDriverException e) {
			reportStep("WebDriverException : "+e.getMessage(), "FAIL");
		} catch (RuntimeException e) {
			reportStep("WebDriverException : "+e.getMessage(), "FAIL");
		}
	}
	
	
	public void verifyDisplayed(WebElement ele) {
		try {
			if(ele.isDisplayed()) {
				reportStep("The element "+ele+" is visible","PASS");
			} else {
				reportStep("The element "+ele+" is not visible","FAIL");
			}
		} catch (WebDriverException e) {
			reportStep("WebDriverException : "+e.getMessage(), "FAIL");
		} 
	}

	public void switchToWindow(int index) {
		try {
			Set<String> allWindowHandles = driver.getWindowHandles();
			List<String> allHandles = new ArrayList<>();
			allHandles.addAll(allWindowHandles);
			driver.switchTo().window(allHandles.get(index));
		} catch (NoSuchWindowException e) {
			reportStep("The driver could not move to the given window by index "+index,"PASS");
		} catch (WebDriverException e) {
			reportStep("WebDriverException : "+e.getMessage(), "FAIL");
		}
	}

	public void switchToFrame(WebElement ele) {
		try {
			driver.switchTo().frame(ele);
			reportStep("switch In to the Frame "+ele,"PASS");
		} catch (NoSuchFrameException e) {
			reportStep("WebDriverException : "+e.getMessage(), "FAIL");
		} catch (WebDriverException e) {
			reportStep("WebDriverException : "+e.getMessage(), "FAIL");
		} 
	}

	public void acceptAlert() {
		String text = null;		
		try {
			Alert alert = driver.switchTo().alert();
			text = alert.getText();
			alert.accept();
			reportStep("The alert "+text+" is accepted.","PASS");
		} catch (NoAlertPresentException e) {
			reportStep("There is no alert present.","FAIL");
		} catch (WebDriverException e) {
			reportStep("WebDriverException : "+e.getMessage(), "FAIL");
		}  
	}

	public void dismissAlert() {
		String text = null;		
		try {
			Alert alert = driver.switchTo().alert();
			text = alert.getText();
			alert.dismiss();
			reportStep("The alert "+text+" is dismissed.","PASS");
		} catch (NoAlertPresentException e) {
			reportStep("There is no alert present.","FAIL");
		} catch (WebDriverException e) {
			reportStep("WebDriverException : "+e.getMessage(), "FAIL");
		} 

	}

	public String getAlertText() {
		String text = null;		
		try {
			Alert alert = driver.switchTo().alert();
			text = alert.getText();
		} catch (NoAlertPresentException e) {
			reportStep("There is no alert present.","FAIL");
		} catch (WebDriverException e) {
			reportStep("WebDriverException : "+e.getMessage(), "FAIL");
		} 
		return text;
	}

	public long takeSnap(){
		long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L; 
		try {
			FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE) , new File("./reports/images/"+number+".jpg"));
		} catch (WebDriverException e) {
			System.out.println("The browser has been closed.");
		} catch (IOException e) {
			System.out.println("The snapshot could not be taken");
		}
		return number;
	}

	public void closeBrowser() {
		try {
			driver.close();
			reportStep("The browser is closed","PASS", false);
		} catch (Exception e) {
			reportStep("The browser could not be closed","FAIL", false);
		}
	}

	public void closeAllBrowsers() {
		try {
			driver.quit();
			reportStep("The opened browsers are closed","PASS", false);
		} catch (Exception e) {
			reportStep("Unexpected error occured in Browser","FAIL", false);
		}
	}

	public void mouseover(WebElement ele){

		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			Actions act = new Actions(driver);
			act.moveToElement(ele).build().perform();
			ele.click();
			reportStep("Moved to Element","PASS");
		} catch (Exception e) {
			reportStep("Unable to Moved to Element","Fail");			
		}

	}
	


	
	
	  public void Refresh(){
	  
	  try { 
		//first: get the current URL in a String variable
		  String currentURL = driver.getCurrentUrl(); 
		  //second: call the current URL
		  driver.get(currentURL); } catch (Exception e) {
	  reportStep("Unable to refresh","Fail"); }
	  
	  }
	 
	  public void WindowPopUpOK(){
		  
		  try { 
			//first: get the current URL in a String variable
			  driver.switchTo().alert().accept();} catch (Exception e) {
		  reportStep("Unable to refresh","Fail"); }
		  
		  }
	  
       public void SelectAll(WebElement ele){
		  
		  try { 
			  String selectAll = Keys.chord(Keys.CONTROL, "a");
			  ele.sendKeys(selectAll);} catch (Exception e) {
		  reportStep("Unable to Select","Fail"); }
		  
		  }
	
	

	public void deSelectDropDownUsingText(WebElement ele, String value) {
		try {
			new Select(ele).deselectByVisibleText(value);
			reportStep("The dropdown is deselected with text "+value,"PASS");
		} catch (WebDriverException e) {
			reportStep("The element: "+ele+" could not be found.", "FAIL");
		}

	}

	public boolean pressEnter(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.sendKeys(Keys.ENTER);
		return true;
	}

	public boolean isEnabled(WebElement ele) {
		boolean result = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(ele));
			result = ele.isEnabled();
		} catch (Exception e) {
		}
		return result;
	}

	//jdbc:jtds:sqlserver://10.44.58.202:1433/SIT_DPH_BANKADMIN/sp=false","pos_user","posuser123#
	//jdbc:jtds:sqlserver://10.44.113.77:1433/DPH_BANK_ADMIN_SIT/sp=false","sit_user","sit1234#

	public void DbQuery(String Query)
	{
		Connection conn = null;
		ResultSet rs = null;
		Statement stmt = null;
	    String url = "jdbc:oracle://10.44.55.200:1526/SIT_IPSBANKADMIN";
	    String userName = "SIT_IPSBANKADMIN";
	    String password = "sitipsbankadmin123";
		try {
			Driver driver = (Driver) Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url, userName, password);
			/*con = DriverManager.getConnection
				("jdbc:jtds:sqlserver://10.44.113.77:1433/DPH_BANK_ADMIN_SIT/sp=false","sit_user","sit1234#");
			*/
			stmt = conn.createStatement();
			rs = null;

			rs = stmt.executeQuery(Query);
			rs.next();
			DBCount=rs.getString(1);
			System.out.println(DBCount);
			reportStep("The total no.of records :"+DBCount,"PASS");

			//    rs = stmt.executeQuery("select * from IPS_COUNTRY_MASTER");
			rs.next();
			//StringBuilder s1=new StringBuilder();
		
			while (rs.next()) {
				//        System.out.println(rs.getString(1)+ " " +rs.getString(2)+ " " +rs.getString(3)+ " " +rs.getString(4));
			}
			return;
			
		} catch (Exception e) {
			System.out.println(" got Exception: " + e);
			e.printStackTrace();
			
		} finally {
			try {
				//rs.close();
				stmt.close();
				conn.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return;
	}


	/*public static ResultSet DbQuery(String query) throws SQLException,ClassNotFoundException {

	    Connection conn = null;
	    Statement stmt = null;
	    ResultSet resultSet = null;
	    String driver = "net.sourceforge.jtds.jdbc.Driver";
	    String url = "jdbc:jtds:sqlserver://10.44.58.202:1433/SIT_DPH_BANKADMIN";
	    String userName = "pos_user";
	    String password = "posuser123#";
	    Class.forName(driver);
	    conn = DriverManager.getConnection(url, userName, password);
	    stmt = conn.createStatement();
	    resultSet = stmt.executeQuery(query);
	    while(resultSet.next()){
	    	System.out.println(resultSet.getString(1));
	    }

	         if (resultSet!=null)
	         try{
	        	 resultSet.close();
	         }catch(Exception e)
	         {

	         }

	         if (stmt!=null)
	             try{
	            	 stmt.close();
	             }catch(Exception e)
	             {

	             }
	         if (conn!=null)
	             try{
	            	 conn.close();
	             }catch(Exception e)
	             {

	             }
			return resultSet;
	    }
	 
*/
	public void clickAndDrag(WebElement source,WebElement des){
		Actions action= new Actions(driver);
		action.clickAndHold(source).moveToElement(des).release(des).build().perform();

	}
	
	public void moveByOffset(String source, String dest){
		Actions action= new Actions(driver);
		int src=Integer.parseInt(source);
		int des=Integer.parseInt(dest);
		action.moveByOffset(src, des).build().perform();
	}
	
	public static void uploadFile(String fileLocation) throws AWTException, InterruptedException {
		// Store the copied text in the clipboard
		
		StringSelection stringSelection = new StringSelection(fileLocation);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		Thread.sleep(5000);
		// Paste it using Robot class
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);	
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		// Click Enter to upload
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void passwordPDF(String fileLocation) throws AWTException, InterruptedException {
		// Store the copied text in the clipboard
		
		StringSelection stringSelection = new StringSelection(fileLocation);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		Thread.sleep(5000);
		// Paste it using Robot class
		Robot robot = new Robot();
		//robot.keyPress(KeyEvent.VK_CONTROL);	
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		// Click Enter to upload
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}
	
	
	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		
	}
	
	public void AssertionMethod(String actual,String expected) {
		prop = new Properties();
		try {
			prop.load(new FileInputStream(new File("./src/main/resources/status.properties")));
			expectedResult = prop.getProperty(expected);
			
			if(actual.contains(expectedResult))
			{
				reportStep(expectedResult+" : is matched with given text","PASS");
			}
			else
			{
				reportStep("Status is not matched with given text","Fail");
			}		
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
	
}
		
	
	










