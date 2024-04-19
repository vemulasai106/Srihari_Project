package Automate_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover_actions {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act = new Actions(driver);
		//Context click
		WebElement Right = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act.contextClick(Right).perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[3]/span")).click();
		driver.switchTo().alert().accept();
		
		//Double click
		WebElement Double = driver.findElement(By.xpath(""));
		act.doubleClick(Double).perform();
		driver.switchTo().alert().accept();

	}

}
