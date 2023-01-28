package pagePacakge;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage {
	@FindBy(xpath="//div[@class='label'and(.='Users')")private WebElement userTab;
	
	@FindBy(name ="username")private WebElement usnTestBox;
	@FindBy(name="passwordText")private WebElement passTextBox;
	@FindBy(name="passwordTextRetype")private WebElement retypePassTextBox;
	@FindBy(name="firstName")private WebElement firstNameTextBox;
	@FindBy(name="lastName")private WebElement lastNameTextBox;
	@FindBy(xpath="")private WebElement createUserButton;
	@FindBy(name="")private WebElement cancelButton;
	
	
	
	
	
	
	
	public WebElement getUserTab() {
		return userTab;
	}
	public WebElement getUsnTestBox() {
		return usnTestBox;
	} 
	
	public WebElement getPassTextBox() {
		return passTextBox;
	}
	public WebElement getRetypePassTextBox() {
		return retypePassTextBox;
	}
	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}
	public WebElement getLastNameTextBox() {
		return lastNameTextBox;
	}
	public WebElement getCreateUserButton() {
		return createUserButton;
	}
	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	

	
	

}
