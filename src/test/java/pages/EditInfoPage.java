package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.After;
import junit.framework.Assert;

public class EditInfoPage {
	WebDriver driver ;
	By informations = By.xpath("//a[@id='identity-link']");
	By userName = By.xpath("//input[@id='firstname']");
	By lastName = By.xpath("//input[@id='lastname']");
	By email = By.xpath("//input[@id='email']");
	By pass = By.xpath("//input[@id='field-password']");
	By newPass = By.xpath("//input[@id='field-new_password']");
	By save = By.xpath("//button[normalize-space()='Enregistrer']");
	By txtMsg = By.xpath("//article[@role='alert']");
	
	public EditInfoPage(WebDriver driver) {
		this.driver = driver ;
	}
	
	public void clickInfo() {
		driver.findElement(informations).click();
	}

	public void editInfo(String name, String lastname, String mail, String newPassword) {
		driver.findElement(userName).clear();
		driver.findElement(userName).sendKeys(name);
		driver.findElement(lastName).clear();
		driver.findElement(lastName).sendKeys(lastname);
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys(mail);
		driver.findElement(newPass).sendKeys(newPassword);
	}
	public void enterPass(String password) {
		driver.findElement(pass).sendKeys(password);
	}
	public void clickSave() {
		driver.findElement(save).click();
	}
	public void assertMsg(String expected) {
		String txt = driver.findElement(txtMsg).getText();
		Assert.assertEquals(expected, txt);
	}
	

}
