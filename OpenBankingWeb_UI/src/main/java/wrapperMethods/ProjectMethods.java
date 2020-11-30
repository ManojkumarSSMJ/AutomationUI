package wrapperMethods;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import utils.DataInputProvider;

public class ProjectMethods extends ImplementationMethods{

	@BeforeSuite
	public void beforeSuite(){
		startResult();
	}

	@BeforeClass
	public void beforeClass(){		
		startTestModule(testCaseName, testDescription);	
	}


 
	@BeforeMethod
	public void beforeMethod(){
		test = startTestCase(testNodes);
		test.assignCategory(category);
		test.assignAuthor(executedBy);
			
	}

	@AfterSuite
	public void afterSuite(){
		endResult();
	}


	@AfterTest
	public void afterTest(){
	}
	
	@DataProvider(name="fetchData")
	public  Object[][] getData(){
		return DataInputProvider.getSheet(dataSheetName);		
	}	
}
