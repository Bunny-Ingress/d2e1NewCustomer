package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import pagefactory.customerformdata;
import pagefactory.homepage;
import pagefactory.login;
import readexcel.readexcelmethod;

public class callingmethod {

	WebDriver driver;
	login objlogin;
	homepage objHomePage;
	customerformdata objcustomerform;
	
	readexcelmethod excel = new readexcelmethod();
	
	@BeforeTest
	public void setup() throws IOException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhani\\Downloads\\Selinium\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(excel.readExcel(1,0, ".\\Data\\Book1.xlsx","Sheet1"));
	}
	
	@org.testng.annotations.Test(priority=0)
	public void homeApper() throws IOException {
		 //Create Login Page object
		objlogin = new login(driver);
		
		//Verify login page title
	   // String loginPageTitle = objLogin.getLoginTitle();
	    //Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
		
		//login to application
			objlogin.loginNC(excel.readExcel(1, 1, ".\\Data\\Book1.xlsx", "Sheet1"),excel.readExcel(1, 2, ".\\Data\\Book1.xlsx", "Sheet1"));
	
			 objHomePage = new homepage(driver);
			//  Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
			 // driver.manage().window().maximize();
	}
	
	
	@org.testng.annotations.Test(priority=1)
	public void customerdata() throws IOException{
		
		//objHomePage = new homepage(driver);
		objcustomerform = new customerformdata(driver);
		objcustomerform.ClickNewCustomerPage();
		objcustomerform.setCustomerName(excel.readExcel(5, 0, ".\\Data\\Book1.xlsx", "Sheet1"));
		objcustomerform.setGender();
		objcustomerform.setDateofBirth(excel.readExcel(5, 2, ".\\Data\\Book1.xlsx", "Sheet1"));
		objcustomerform.setAddress(excel.readExcel(5, 3, ".\\Data\\Book1.xlsx", "Sheet1"));
		objcustomerform.setCity(excel.readExcel(5, 4, ".\\Data\\Book1.xlsx", "Sheet1"));
		objcustomerform.setState(excel.readExcel(5, 5, ".\\Data\\Book1.xlsx", "Sheet1"));
		objcustomerform.setPIN(excel.readExcel(5, 6, ".\\Data\\Book1.xlsx", "Sheet1"));
		objcustomerform.setMobileNumber(excel.readExcel(5, 7, ".\\Data\\Book1.xlsx", "Sheet1"));
		objcustomerform.setEmail(excel.readExcel(5, 8, ".\\Data\\Book1.xlsx", "Sheet1"));
		objcustomerform.setPassword(excel.readExcel(5, 9, ".\\Data\\Book1.xlsx", "Sheet1"));
		
		objcustomerform.Submit();
		
	}
    	
    	/*objNewCust =new NewCustomer(driver);

    	objNewCust.clickNewCustLink();
    	
    	objNewCust.setUserName(excel.readExcel(1,0, "/home/shavantha/eclipse-workspace/exercise1/data/users.xlsx","Sheet2"));
    	objNewCust.setGender();
    	objNewCust.setDateOfBirth(excel.readExcel(1,1, "/home/shavantha/eclipse-workspace/exercise1/data/users.xlsx","Sheet2"));
    	objNewCust.setAddress(excel.readExcel(1,2, "/home/shavantha/eclipse-workspace/exercise1/data/users.xlsx","Sheet2"));
    	objNewCust.setCity(excel.readExcel(1,3, "/home/shavantha/eclipse-workspace/exercise1/data/users.xlsx","Sheet2"));
    	objNewCust.setState(excel.readExcel(1,4, "/home/shavantha/eclipse-workspace/exercise1/data/users.xlsx","Sheet2"));
    	objNewCust.setPinNo(excel.readExcel(1,5, "/home/shavantha/eclipse-workspace/exercise1/data/users.xlsx","Sheet2"));
    	objNewCust.setPhone(excel.readExcel(1,6, "/home/shavantha/eclipse-workspace/exercise1/data/users.xlsx","Sheet2"));
    	objNewCust.setEmailID(excel.readExcel(1,7, "/home/shavantha/eclipse-workspace/exercise1/data/users.xlsx","Sheet2"));
    	objNewCust.setPassWord(excel.readExcel(1,8, "/home/shavantha/eclipse-workspace/exercise1/data/users.xlsx","Sheet2"));
    	
    	objNewCust.submitData();*/
    	
		
}
















