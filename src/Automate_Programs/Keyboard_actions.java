package Automate_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_actions {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://text-compare.com/");
		Actions act = new Actions(driver);
		driver.findElement(By.name("text1")).sendKeys("Selenium is open source tool");
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.TAB).keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
        driver.findElement(By.xpath("//*[@id=\"compareButton\"]/div[1]")).click();
	}

}
