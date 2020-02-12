package actiTime.Pages.pgrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//a[@id='loginButton']//div[contains(text(),'Login')]")
	private WebElement loginBTN;
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	

 public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	
	//Action 

	public void setUserName(String user) {
		unTB.sendKeys(user);
	}
	
	public void setPassword(String pwd) {
		pwTB.sendKeys(pwd);
	}
	
	public void clickonLoginbtn() {
		loginBTN.click();
		}
	
	public void clickonLogout() {
		logout.click();
	}

}
