import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;



public class Tables {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//14432//Downloads//SeleniumTesting//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
//		WebElement dropdownElements = driver.findElement(By.id("dropdown-class-example"));
//		
//		ISelect dropDown = new Select(dropdownElements);
//		dropDown.selectByIndex(2);
//		System.out.println(dropDown.getFirstSelectedOption().getText());
		
//		driver.findElement(By.cssSelector("#autocomplete")).sendKeys("Ind");
//		Thread.sleep(2000);
//		List<WebElement> dropdown = driver.findElements(By.cssSelector("div[class='ui-menu-item-wrapper']"));
//		
//		for (WebElement selection: dropdown) {
//			
//			if(selection.getText().equalsIgnoreCase("India") ) {
//				selection.click();
//				break;
//			}
//		}
		
//		driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).click();
//		driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected();
//		assertTrue(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());
		Thread.sleep(3000);
		
		String[] productNeeded = {"Brocolli - 1 Kg", "Cauliflower - 1 Kg"};
		
		List<WebElement> productList = driver.findElements(By.cssSelector("h4.product-name"));
		
		
		for (int i=0; i<productList.size(); i++) {
			
			String nameOfProduct = productList.get(i).getText();
			List productNeededList = Arrays.asList(productNeeded);
			
			if (productNeededList.contains(productList)) {
				
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				break;
			}
			
			
		}
		
		
		

	}

}
