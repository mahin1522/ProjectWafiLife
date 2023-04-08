package Pages;

import org.openqa.selenium.By;

public class WafiLifeOrderBook extends BaseMethods{
	
	public By ORDER_BUTTON = By.xpath("//button[@class = 'single_add_to_cart_button button alt ']");
	public By CONFIRM_ORDER_BUTTON = By.xpath("//span[contains(text(),'অর্ডার সম্পন্ন করুন')]");
	
}
