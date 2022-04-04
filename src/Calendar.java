import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//14432//Downloads//SeleniumTesting//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.name("travel_date")).clear();
		driver.findElement(By.name("travel_date")).click();
		
		//Grab common Attribute of the date
		List<WebElement> dates = driver.findElements(By.className("day"));
		int dateCount = driver.findElements(By.className("day")).size();
		
		for (int i=0; i<dateCount; i++) {
			
			String actualDate = driver.findElements(By.className("day")).get(i).getText();
			
			if (actualDate.equalsIgnoreCase("31")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
			
		}
		
		

	}

}
