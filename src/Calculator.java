

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

//import com.sun.tools.javac.code.Attribute.Array;

public class Calculator {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//14432//Downloads//SeleniumTesting//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String[] productArray = {"Cucumber", "Brocolli"};
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("button[text()='ADD TO CART']")));
		
		
		
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		
		
		for (int i=0; i<products.size(); i++) {
			String[] productText = products.get(i).getText().split("-");
			String formattedName = productText[0].trim();
			List nameArrayList = Arrays.asList(productArray);
	
			if (nameArrayList.contains(formattedName)) {
				driver.findElements(By.xpath("button[text()='ADD TO CART']")).get(i).click();
				
			}
		}
		
		
	
	
		
	
	}
}
