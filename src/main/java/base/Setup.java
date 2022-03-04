package base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Setup {
	public static AndroidDriver<MobileElement> driver;

	public AndroidDriver<MobileElement> intallApp() throws MalformedURLException {
		if (driver == null) {
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
			dc.setCapability("platformName", "android");
			dc.setCapability("appPackage", "com.amazon.mShop.android.shopping");
			dc.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");
			dc.setCapability("noReset", true);
			try {
				URL url = new URL("http://localhost:4723/wd/hub");
				driver = new AndroidDriver<MobileElement>(url, dc);
				driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
				System.out.println("Mobile application launched." + driver);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
		return driver;
	}
}