package goalLogin;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomateGPS {

	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new FirefoxDriver();
		driver.get("http://ourgoalplan.com/Login.aspx");
		
		//Login to the GPS
		driver.findElement(By.xpath(".//*[@id='txtName']")).sendKeys("subhasish.pattanaik");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("jhunu@JHUNU1");
		driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
		
		//Check the Date
		String gDate = driver.findElement(By.xpath(".//*[@id='lblGoalDate']")).getText();
		if(gDate.equals("Tuesday, May 05, 2015"))
		{
			System.out.println("Today's date is 5th May, 2015");
		}
		
		driver.navigate().refresh();
		
		//Search for a particular Text in the goal sheet and return respective text
		if (driver.getPageSource().contains("abcrakadabrakadabra"));
		{
			System.out.println("The text is present");
		} 
			System.out.println("The text is not present");
		
		//Check if the lead names are blank or not and return the names
		String lead = driver.findElement(By.xpath(".//*[@id='lblWorksWithLead']")).getText();
		if (lead.equals(""))
		{
			System.out.println("The Lead name is blank");
		}
		
		System.out.println("The lead Names are" +lead);
		
		
		driver.quit();
	}

}
