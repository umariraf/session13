package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddDeposit extends BasePage {

	WebDriver driver; // Global

	// Every Page must have a constructor to invite the driver
	public AddDeposit(WebDriver driver) {
		this.driver = driver;
	}

}
