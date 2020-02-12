package actiTime.Pages.pgrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LicensessPage {
	
	@FindBy(xpath="//nobr[contains(text(),'Product Edition:')]/../..//td[2]")
	private WebElement ProductEdition;
	
	@FindBy(xpath="//nobr[contains(text(),'Issue Date:')]/../..//td[2]")
	private WebElement issuedate;
	
	
	
	public LicensessPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	  }
		
	public void VerifyID(WebDriver driver,String ExptdIssuedate) {
			
		String actualIssueDate=issuedate.getText();
			if(ExptdIssuedate.equals(actualIssueDate)) {
				System.out.println("The Issue date is properly displayed-->"+ExptdIssuedate);
			}
			else {
				System.out.println("The Issue date is not Properly displayed-->"+actualIssueDate);
			}
		}
	
	public void VerifyPE(WebDriver driver,String ExptedPE) {
		
		String actualPE=ProductEdition.getText();
			if(actualPE.equals(ExptedPE)) {
				System.out.println("The ProductEdition is properly displayed-->"+ExptedPE);
			}
			else {
				System.out.println("The ProductEdition is not Properly displayed-->"+actualPE);
			}
		}
	}


