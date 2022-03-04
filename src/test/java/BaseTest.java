import base.Setup;
import org.junit.Before;
import org.junit.Test;
import pageobjects.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;


public class BaseTest extends Setup {
	SearchResultScreen searchResultScreen;
	SplashScreen splashscreen;

	public BaseTest() throws FileNotFoundException, IOException {
		super();
	}

	@Before
	public void istallToPO() throws MalformedURLException, IOException{
		intallApp();
		splashscreen = new SplashScreen();
		searchResultScreen = new SearchResultScreen();
	}



	}