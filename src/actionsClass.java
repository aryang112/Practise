import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//14432//Downloads//SeleniumTesting//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
//		driver.get("https://www.amazon.com/");
//		Actions a = new Actions(driver);1
//		
//		a.moveToElement(driver.findElement(By.cssSelector("span[id='nav-link-accountList-nav-line-1']"))).build().perform();
//		
//		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
//		a.moveToElement(driver.findElement(By.cssSelector("span[id='nav-link-accountList-nav-line-1']"))).contextClick().build().perform();
		
//		driver.get("https://jqueryui.com/droppable/");
//		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
//		
//		driver.findElement(By.id("draggable")).click();
//		
//		Actions action = new Actions(driver);
//		WebElement source = driver.findElement(By.id("draggable"));
//		WebElement target = driver.findElement(By.id("droppable"));
//		action.dragAndDrop(source, target).build().perform();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		WebElement columnDriver = driver.findElement(By.tagName("ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		//opens all the tab links 
		for (int i=1; i<columnDriver.findElements(By.tagName("a")).size(); i++) {
			
			String clickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
			Thread.sleep(5000);
		}
			Set<String> tabCount = driver.getWindowHandles(); //Gathers the count of tabs
			Iterator<String> iterator = tabCount.iterator(); //Adds it to the iterator
		
		while (iterator.hasNext()) { //If Iterator has a tab
				
			driver.switchTo().window(iterator.next()); //Switch to the next Tab
			System.out.println(driver.getTitle()); //Print the Title of that tab
		
		}
		
		
			
		}

	}

