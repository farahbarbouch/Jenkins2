package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SortPage {
	WebDriver driver ;
	By searchField = By.xpath("//input[@placeholder='Rechercher un produit...']");
	By okButton = By.xpath("//button[normalize-space()='OK']");
	By sort = By.xpath("//span[@aria-label='Trier par sélection']");
	By ascPrice = By.xpath("//span[normalize-space()='Prix, croissant']");
	
	
	public SortPage(WebDriver driver) {
		this.driver = driver ;
	}
	public void entertype(String type) {
		driver.findElement(searchField).sendKeys(type);
	}
	public void clickOk() {
		driver.findElement(okButton).click();
	}
	public void selectSort(String txtSort) {
		driver.findElement(sort).click();
		driver.findElement(ascPrice).click();
	}

}
