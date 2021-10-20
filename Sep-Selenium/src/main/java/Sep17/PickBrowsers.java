package Sep17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PickBrowsers {

public static void main(String[] args) {
	
	String Browser ="firefox";
	WebDriver driver = null ;
	if(Browser.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\FireFox\\geckodriver.exe");
		
		driver = new FirefoxDriver();
	}
	if(Browser.equals("chrome")) {
     System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
     driver = new ChromeDriver();
	}
	if(Browser.equals("edge")) {
		System.setProperty("webdriver.edge.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\edge\\msedgedriver.exe");
		driver = new EdgeDriver();
	}else {
		System.out.println("provided browser doesn't exist");
	}

	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.findElement(By.linkText("Sign in")).click();
	

}

}
