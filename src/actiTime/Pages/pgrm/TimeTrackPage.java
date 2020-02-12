package actiTime.Pages.pgrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeTrackPage {
	
	@FindBy(xpath="//div[@class='popup_menu_icon warning_icon']")
	private WebElement setting;
	
	@FindBy(xpath="//a[contains(text(),'Licenses')]")
	private WebElement licenses;
	
	
	
	public TimeTrackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnSetting() {
		setting.click();
	}

	public void clickOnLicenses() {
		licenses.click();
	}
}
