import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;


public class SearchTest extends BaseTest {


	public SearchTest() throws FileNotFoundException, IOException {
		super();
	}

	@Test
	public void searchTest() {
		searchResultScreen.enterValuesForHomeSearch("java");
	}

	}