package Automate_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Actions act = new Actions(driver);
		WebElement From = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement to = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		act.dragAndDrop(From, to).perform();

	}
	
}
