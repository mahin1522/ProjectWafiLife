package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.qameta.allure.Allure;

import static Utilities.BaseDriver.getDriver;

import java.io.ByteArrayInputStream;

public class BaseMethods {
	public WebElement getElement(By locator) {
		return getDriver().findElement(locator);
	}
	
	public void writeText(By locator, String text) {
		getElement(locator).sendKeys(text);
	}
	
	public void click(By locator) {
		getElement(locator).click();
	}
	
	public void hover(By locator) {
		Actions hover = new Actions(getDriver());
		hover.moveToElement(getElement(locator)).perform();
	}
	
	public void movetoElement(By locator) {
		Actions move = new Actions(getDriver());
		move.moveToElement(getElement(locator)).perform();
	}
	
	public void searchbyText(By locator, String text) {
		writeText(locator, text);
		getElement(locator).sendKeys(Keys.ARROW_DOWN);
		getElement(locator).sendKeys(Keys.ENTER);
	}
	
	public void dropdownSelection(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
		
	}
	
	public void takeSS(String name) {
		Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
	}
}
