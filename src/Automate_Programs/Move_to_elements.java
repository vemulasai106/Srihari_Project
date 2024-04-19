package Automate_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_to_elements {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Actions act = new Actions(driver);
		WebElement Widgets = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/a"));
		WebElement Autocomplete = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/ul/li[2]/a"));
		act.moveToElement(Widgets).moveToElement(Autocomplete).click().perform();

	}

}
