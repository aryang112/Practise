import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalendarMakemyTrip {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//14432//Downloads//SeleniumTesting//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
		//a.moveToElement(driver.findElement(By.cssSelector("span[id='nav-link-accountList-nav-line-1']"))).build().perform();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector("input[id='departure']"))).click().build().perform();
		
		//driver.findElement(By.cssSelector("input[id='departure']")).click();
		while (!driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[1]/div"))
				.getText().contains("November 2021")) {
			
			driver.findElement(By.cssSelector("div[class='DayPicker-NavBar'] [class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		}
	
		
		List<WebElement> dates = driver.findElements(By.className("dateInnerCell"));
		int dateCount = driver.findElements(By.className("dateInnerCell")).size();
		
		for (int i=0; i<dateCount; i++) {
			
			String actualDate = driver.findElements(By.className("dateInnerCell")).get(i).getText();
			
			if (actualDate.equalsIgnoreCase("24")) {
				driver.findElements(By.className("dateInnerCell")).get(i).click();
				break;

	}
		
}
	}
}
