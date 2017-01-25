package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {


    public static AppiumDriver driver;
    public static String osVersion = System.getProperty("osVersion");

    public AppiumDriver GetDriver() throws MalformedURLException {

        if (osVersion.toUpperCase().equals("IOS")) {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", "iOS");
            caps.setCapability("platformVersion", "10.2");
            caps.setCapability("deviceName", "iPhone 7 Plus");
            caps.setCapability("deviceReadyTimeout", "240");
            caps.setCapability("noReset", true);
            // caps.setCapability("bundleid", "com.example.apple-samplecode.UICatalog");
            caps.setCapability("app", "/Users/ssmart/Projects/My.app");
            driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        } else {
            System.out.println("######## Andriod driver");
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName","Android Emulator");
            caps.setCapability("platformName","Android");
            caps.setCapability("platformVersion", "6.0");
            caps.setCapability("app", "/Users/ssmart/Projects/My.apk");
            caps.setCapability("unicodekeyboard", true);
            caps.setCapability("resetkeyboard", true);
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        }

        return driver;
    }


}
