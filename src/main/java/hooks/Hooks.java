//package hooks;
//import java.io.File;
//import java.io.IOException;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriverException;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.Scenario;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import util.BaseUtil;
//public class Hooks extends BaseUtil{
//	private BaseUtil base;
//	private WebDriver driver;
//	
//	public Hooks(BaseUtil base){
//		this.base=base;
//		base.browser="chromeBrowserObject";
//		base.driver=driver;
//	}
//	 
//	
//	@Before
//	public void browserCreation(){
//		System.out.println("Browser created");
//	}
//	
//	@After
//	public void quitBrowser(Scenario sc){
//		System.out.println("isFailed::  "+sc.isFailed());
//		System.out.println("getName::  "+sc.getName());
//		System.out.println("getStatus::  "+sc.getStatus());
//		captureScreenShot();
//		
//		System.out.println("Browser closed");
//    }
//	
//	
//	
//	public void  captureScreenShot(){
//		
//		driver = new ChromeDriver();
//		
//		TakesScreenshot screenShot= (TakesScreenshot)driver;
//		
//		try {
//			FileUtils.copyFile(screenShot.getScreenshotAs(OutputType.FILE), new File("screenshots"));
//		} catch (WebDriverException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	
//}
