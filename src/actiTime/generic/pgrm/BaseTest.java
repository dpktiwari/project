package actiTime.generic.pgrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class BaseTest implements IAutoConstant{
static {
	System.setProperty(CHROME_KEY, CHROME_VALUE);
	System.setProperty(GECKO_KEY, GECKO_VALUE);
}
public static WebDriver driver;
public static void oppApplication(String Browser) {
	if(Browser.equals("chrome")) {
		driver=new ChromeDriver();
	}
	else {
		driver=new FirefoxDriver();
	}
	driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(ITO, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get(ActiTimeURL);
   }


	public static void closeApplication() {
		driver.close();
	}
}

