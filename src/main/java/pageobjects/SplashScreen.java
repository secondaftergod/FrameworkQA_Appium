package pageobjects;

import base.Setup;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.io.FileNotFoundException;
import java.io.IOException;


public class SplashScreen extends Setup{
	public SplashScreen() throws FileNotFoundException, IOException {
		super();
	}


//	private MobileElement skipSignInButton() {
//		return (MobileElement)
//				driver.findElement(By.id("com.amazon.mShop.android.shopping:id/skip_sign_in_button"));
//	}
//	public void assertSplashScreen() throws InterruptedException {
//
//		Thread.sleep(5000);
//		try {
//			System.out.println("ON Splash screen");
//			Assert.assertTrue("Issue accessing splash screen", skipSignInButton().isDisplayed());
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	public void skipSignin() {
//		try {
//			skipSignInButton().click();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}



}
