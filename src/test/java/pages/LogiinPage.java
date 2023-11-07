package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogiinPage {
	WebDriver driver;
	 By connexion = By.xpath("//span[@class='h3 d-block mb-0']");
	 By compte = By.xpath("//span[@class='py-2']");
	 By user = By.id("email");
	 By password = By.name("password");
	 By submit = By.xpath("//button[@id='submit-login']"); 
	 By info = By.xpath("//a[@id='identity-link']");
	 By errorMsg = By.xpath("//ul[@class='list-unstyled']");
	 
	public LogiinPage(WebDriver driver) {
		 this.driver = driver ;
	 }
	 
	 public void clickConnexion() {
		 driver.findElement(connexion).click();
	 }
	 public void clickCompte() {
		 driver.findElement(compte).click();
	 }
	 public void credentials(String email, String pass) {
		 driver.findElement(user).sendKeys(email);
		 driver.findElement(password).sendKeys(pass);
	 }
	
	 public void clickSubmit() {
		 driver.findElement(submit).click();
	 }
	 public void checkInfoDisplayed() {
		 driver.findElement(info).isDisplayed();
	 }
	 public void checkErrorDisplayed() {
		 driver.findElement(errorMsg).isDisplayed();
	 }

}
