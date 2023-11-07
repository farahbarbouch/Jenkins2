package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class AddProductPage {
	WebDriver driver ;
	By addIcon = By.xpath("//button[@class='add-to-cart btn shadow-none p-0 add-to-cart-fix']");
	By orderBtn = By.xpath("//span[@class='btn btn-primary btn-block']");
	By productName = By.xpath("//h3[@class='product-title h5 text-center overflow-hidden mt-2']");
	By cart = By.xpath("//h1[@class='h1 text-left']");
	By productInCart = By.xpath("//a[@class='label h4 mb-0']");
	
	public AddProductPage(WebDriver driver) {
		this.driver = driver ;
	}
	public void clickAdd() {
		driver.findElement(addIcon).click();
	}
	public void clickOrder() {
		driver.findElement(orderBtn).click();
	}
	public void checkPage() {
		String expected = "Panier" ;
		String txt = driver.findElement(cart).getText();
		Assert.assertEquals(expected, txt);
	}
	public void checkProduct() {
		String name = driver.findElement(productName).getText(); 
		String nameInCart = driver.findElement(productInCart).getText();
		Assert.assertEquals(name, nameInCart);
	}
	

}
