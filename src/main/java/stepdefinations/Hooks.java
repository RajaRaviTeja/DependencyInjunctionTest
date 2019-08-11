package stepdefinations;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import util.BaseUtil;
public class Hooks extends BaseUtil{
	private BaseUtil base;
	private WebDriver driver;
	
	public Hooks(BaseUtil base){
		this.base=base;
		base.browser="chromeBrowserObject";
		base.driver=driver;
	}
	 
	
	@Before
	public void browserCreation(){
		System.out.println("Browser created");
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		base.driver=new ChromeDriver();
		base.browser="browserNameIsChrome";
	}
	
	@After
	public void quitBrowser(Scenario sc){
		captureScreenShot(sc.getName());
		base.driver.quit();
		System.out.println("Browser closed");
    }
	
	
	
	public void  captureScreenShot(String scenarioName){
		TakesScreenshot screenShot= (TakesScreenshot)base.driver;
		
		
		try {
			FileUtils.copyFile(screenShot.getScreenshotAs(OutputType.FILE), new File("./screenshots/"+scenarioName+".png"));
			System.out.println(scenarioName);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
