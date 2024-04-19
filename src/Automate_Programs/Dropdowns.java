package Automate_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/insurance/v1/register.php");
		Select Dropdown = new Select(driver.findElement(By.name("title")));
		//Dropdown.selectByIndex(4);
		//Dropdown.selectByValue("Duke");
		Dropdown.selectByVisibleText("Lady");

	}

}
