package actiTime.generic.pgrm;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class FWUtils extends BaseTest implements IAutoConstant{
	
	/**
	 * This Method is use to Read data from Excel
	 * @param path
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 */
	
	public static String Read_XL_Data(String path, String sheet, int row, int cell) {
		String data="";
		try {
			
			Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		    data=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		  }
		catch(Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	/**
	 * This method is use to Count row from excel sheet
	 * @param path
	 * @param sheet
	 * @return
	 */
	
	public static int Count_XL_row(String path,String sheet) {
		int Count=0;
		try {
			
			Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		    Count=wb.getSheet(sheet).getLastRowNum();
		  }
		catch(Exception e) {
			e.printStackTrace();
		}
		return Count;
	}
	
	/**
	 * This method is use to verify ActiTime LoginPage
	 * @param driver
	 * @param expectedTitle
	 */
	
  public static void verifyLGP(WebDriver driver,String expectedTitle) {
	
	     String actualTitle=driver.getTitle();
	   if(actualTitle.equals(expectedTitle)) {
		    System.out.println("The Home page is Displayed-->"+expectedTitle);
	       }
	     else {
		     System.out.println("The Home page is not Displayed-->"+actualTitle);
	       }
  }

  /**
   * This method is use to verify actiTime Licenses page
   * @param driver
   * @param expecetedLCP
   */
  
  public static void verifyLCP(WebDriver driver,String expecetedLCP) {
	  
	  String actualLCP=driver.getTitle();
	  if(actualLCP.equals(expecetedLCP)) {
		  System.out.println("The Licenses page is Dispalyed-->"+expecetedLCP);
	  }
	  else {
		  System.out.println("The Licenses page is not Dispalyed-->"+actualLCP);
	  }
  }

  
  /**
   * This method is use to close a browser
   * @param driver
   */
  
 public void closeApplication(WebDriver driver) {
	driver.close();
 }
}
