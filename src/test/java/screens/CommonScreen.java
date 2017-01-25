package screens;

import io.appium.java_client.AppiumDriver;
import utils.DriverFactory;

import java.net.MalformedURLException;

public class CommonScreen {
    public AppiumDriver driver;
    public DriverFactory driverFactory = new DriverFactory();

    public CommonScreen() throws MalformedURLException {
        this.driver = driverFactory.GetDriver();
    }

    public void hideKeyboard() {
        if (driver.getCapabilities().getCapability("platformName").equals("iOS")) {
            driver.hideKeyboard();
        } else {
            //android version here, at the moment you don't need to hide the keyboard
        }
    }
}
