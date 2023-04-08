package Tests;

import org.testng.annotations.Test;
import Pages.WafiLifeAuthors;
import Pages.WafiLifeCheckOut;
import Pages.WafiLifeHomePage;
import Pages.WafiLifeOrderBook;
import Utilities.BaseDriver;

public class WafiLifeTest extends BaseDriver {
	WafiLifeHomePage visitHomePage = new WafiLifeHomePage();
	WafiLifeAuthors authors = new WafiLifeAuthors();
	WafiLifeOrderBook orderBook = new WafiLifeOrderBook();
	WafiLifeCheckOut placeOrder = new WafiLifeCheckOut();

	@Test
	public void visitWafilife() throws InterruptedException {
		//Visit this site
		getDriver().get(visitHomePage.WL_HOMEPAGE_URL);
		Thread.sleep(3000);
		
		//Click  লেখক from the menu
		authors.click(authors.AUTHOR_BUTTON);
		Thread.sleep(3000);
		
		
		//Scroll Down and go to the Next Page
		authors.movetoElement(authors.NEXT_BUTTON);
		Thread.sleep(3000);
		authors.click(authors.NEXT_BUTTON);
		Thread.sleep(3000);
		getDriver().navigate().back();
		Thread.sleep(2000);
		
		//Select any Author
		authors.movetoElement(authors.MONIUZZAMAN);
		Thread.sleep(2000);
		authors.click(authors.MONIUZZAMAN);
		Thread.sleep(3000);
		
		//View any Book Details
		authors.click(authors.SELECTED_BOOK);
		Thread.sleep(3000);
		
		//Click অর্ডার করুন
		orderBook.click(orderBook.ORDER_BUTTON);
		Thread.sleep(4000);
		orderBook.takeSS("orderbook");
		
		//Click অর্ডার সম্পন্ন করুন
		orderBook.click(orderBook.CONFIRM_ORDER_BUTTON);
		Thread.sleep(3000);
		
		//Provide all Information of  আপনার বিলিং এবং শিপিং তথ্য
		billinginfo();
	}
	
	public void billinginfo() throws InterruptedException {
		
		placeOrder.writeText(placeOrder.NAME_INPUT_FIELD, "Peter Perker");
		Thread.sleep(2000);
		
		placeOrder.writeText(placeOrder.PHONE_NUMBER_INPUT_FIELD, "3210987654");
		Thread.sleep(2000);
		
		placeOrder.writeText(placeOrder.EMERGENCY_PHONENO_INPUT_FIELD, "1237894560");
		Thread.sleep(1000);
		
		placeOrder.writeText(placeOrder.EMAIL_INPUT_FIELD, "spiderman23@starkmail.com");
		Thread.sleep(2000);
		
		placeOrder.click(placeOrder.DISTRICT_INPUT_FIELD);
		Thread.sleep(2000);
		placeOrder.searchbyText(placeOrder.DISTRICT_SEARCH_INPUT, "Ki");
		Thread.sleep(2000);
		
		placeOrder.dropdownSelection(placeOrder.SUBDISTRICT_INPUT_FIELD, "কিশোরগঞ্জ সদর");
		Thread.sleep(3000);
		
		placeOrder.writeText(placeOrder.FULL_ADDRESS_INPUT_FIELD, "Batrish,Animal Hospital Road");
		Thread.sleep(3000);
		
	}
}
