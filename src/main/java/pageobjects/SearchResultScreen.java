package pageobjects;

import base.Setup;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SearchResultScreen extends Setup {

	public SearchResultScreen() throws FileNotFoundException, IOException {
		super();

	}

//	-----------------------------
	public MobileElement searchField(){
		return (MobileElement) driver.findElementById("com.amazon.mShop.android.shopping:id/chrome_search_hint_view");
	}
	public MobileElement searchFieldAfterClick(){
		return (MobileElement) driver.findElementById("com.amazon.mShop.android.shopping:id/rs_search_src_text");
	}
	private MobileElement resultsCount() {
		return (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'RESULTS')]"));
	}
//	------------------------------

	public void assertResultCount() {

		Assert.assertTrue("Search Result Count not displayed", resultsCount().isDisplayed());
	}

	public void enterValuesForHomeSearch(String searchData) {

		Assert.assertTrue("Home search element not displayed", searchField().isDisplayed());
		searchField().click();
		searchFieldAfterClick().clear();
		searchFieldAfterClick().sendKeys(searchData);
		searchFieldAfterClick().sendKeys(Keys.ENTER);
	}



}
