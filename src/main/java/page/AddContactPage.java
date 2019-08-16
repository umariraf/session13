package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddContactPage {

	WebDriver driver;

	// Every Page must have a constructor to invite the driver
	public AddContactPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.ID, using = "username")
	WebElement UserName;
	
	// Methods to interact with the elements
	
}