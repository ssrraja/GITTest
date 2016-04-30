package week3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPrac_Confirm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		//System.out.println(driver.findElementByXPath("//div[@id='tryitLeaderboard']/following::button").getText());
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("/html/body/button").click();
		Alert a = driver.switchTo().alert();
		System.out.println("Alert Text=" + a.getText());
		a.sendKeys("try1");
		a.accept();

	}

}
