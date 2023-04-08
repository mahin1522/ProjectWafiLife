package Tests;

import org.testng.annotations.Test;

import Pages.WafiLifeAuthors;
import Pages.WafiLifeHomePage;
import Pages.WafiLifeOrderBook;
import Utilities.BaseDriver;

public class WafiLifeAuthorsTest extends BaseDriver {
	
	WafiLifeHomePage visitHomePage = new WafiLifeHomePage();
	WafiLifeAuthors authors = new WafiLifeAuthors();
	WafiLifeOrderBook orderBook = new WafiLifeOrderBook();
	
	@Test
	public void gotoAuthor() throws InterruptedException {
		getDriver().get(visitHomePage.WL_HOMEPAGE_URL);
		Thread.sleep(3000);
		authors.click(authors.AUTHOR_BUTTON);
		Thread.sleep(3000);
//		authors.click(authors.NEXT_BUTTON);
//		Thread.sleep(3000);
		authors.click(authors.MONIUZZAMAN);
		Thread.sleep(3000);
		authors.click(authors.SELECTED_BOOK);
		Thread.sleep(3000);
		authors.click(orderBook.ORDER_BUTTON);
		Thread.sleep(4000);
	}
}
