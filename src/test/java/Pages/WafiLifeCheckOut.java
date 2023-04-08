package Pages;

import org.openqa.selenium.By;

public class WafiLifeCheckOut extends BaseMethods{
	
	public By NAME_INPUT_FIELD = By.xpath("//input[@id='billing_first_name']");
	public By PHONE_NUMBER_INPUT_FIELD = By.xpath("//input[@id='billing_phone']");
	public By EMERGENCY_PHONENO_INPUT_FIELD = By.xpath("//input[@id='billing_alternative_phone']");
	public By EMAIL_INPUT_FIELD = By.xpath("//input[@id='billing_email']");
	public By DISTRICT_INPUT_FIELD = By.xpath("(//b[@role='presentation'])[1]");
	public By DISTRICT_SEARCH_INPUT = By.xpath("//input[@class = 'select2-search__field']");
	public By SUBDISTRICT_INPUT_FIELD = By.xpath("//select[@id='billing_area']");
	public By FULL_ADDRESS_INPUT_FIELD = By.xpath("//textarea[@name='billing_address_1']");
}
