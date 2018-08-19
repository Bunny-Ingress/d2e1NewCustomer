package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class customerformdata {

	WebDriver driver;
	
     /*All WebElements are identified by @FindBy annotation */

	@FindBy(xpath="//div/ul/li/a[@href='addcustomerpage.php']")
	WebElement newcustomerpage;
	
	@FindBy(name="name")
	WebElement CustomerName;
	
	@FindBy(xpath="//table/tbody/tr/td/input[@value='f']")
	WebElement Gender;
	
	@FindBy(name="dob")
	WebElement DateofBirth;
	
	@FindBy(name="addr")
	WebElement Address;
	
	@FindBy(name="city")
	WebElement City;
	
	@FindBy(name="state")
	WebElement State;
	
	@FindBy(name="pinno")
	WebElement PIN;
	
	@FindBy(name="telephoneno")
	WebElement MobileNumber;
	
	@FindBy(name="emailid")
	WebElement Email;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="sub")
	WebElement Submit;
	
	
	 public customerformdata(WebDriver driver){

	        this.driver = driver;
	      //This initElements method will create all WebElements
	        PageFactory.initElements(driver, this);
	 }
	 
	 public void ClickNewCustomerPage() {
		 newcustomerpage.click();
	 }
	 
	 public void setCustomerName(String name) {
		 CustomerName.sendKeys(name);
	 }
	 
	 public void setGender() {
		 Gender.click();
	 }
	 
	 public void setDateofBirth(String dob) {
		 DateofBirth.sendKeys(dob);
	 }
	 
	 public void setAddress(String addr) {
		 Address.sendKeys(addr);
	 }
	 
	 public void setCity(String city) {
		 City.sendKeys(city);
	 }
	 
	 public void setState(String state) {
		 State.sendKeys(state);
	 }
	 
	 public void setPIN(String pinno) {
		 PIN.sendKeys(pinno);
	 }
	 
	 public void setMobileNumber(String telephoneno) {
		 MobileNumber.sendKeys(telephoneno);
	 }
	 
	 public void setEmail(String emailid) {
		 Email.sendKeys(emailid);
	 }
	 
	 public void setPassword(String password) {
		 Password.sendKeys(password);
	 }
	 
	 public void Submit() {
		 Submit.click();
	 }
}
