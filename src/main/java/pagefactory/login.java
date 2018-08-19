package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class login {
	
	WebDriver driver;
	
	@FindBy(name="uid")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy (name="btnLogin")
	WebElement login;
	
	public login(WebDriver driver) {
		
	this.driver = driver;
	PageFactory.initElements(driver,this);
	
	}	
	
	public void setUserName(String setusername) {
		username.sendKeys(setusername);
		
	}
	
	public void setPassword(String setpassword) {
		password.sendKeys(setpassword);
		
	}
	
	public void clicklogin() {
		login.click();
	}
	
	public void loginNC(String setusername, String setpassword) {
		this.setUserName(setusername);
		this.setPassword(setpassword);
		this.clicklogin();
		
	}

}
