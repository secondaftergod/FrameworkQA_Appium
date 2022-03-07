import org.junit.Assert;
import org.junit.Test;
import pageobjects.SearchResultScreen;

import java.io.FileNotFoundException;
import java.io.IOException;


public class SearchTest extends BaseTest {


	public SearchTest() throws FileNotFoundException, IOException {
		super();
	}

	@Test
	public void searchTest() {
		searchResultScreen.enterValuesForHomeSearch("Java");
		searchResultScreen.assertResultCount();

	}

	}