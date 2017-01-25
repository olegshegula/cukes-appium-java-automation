package screens;

import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class GettingStartedScreen extends CommonScreen {

    public GettingStartedScreen() throws MalformedURLException {
        super();
    }

    public void logIntoTheApp(String username, String password) {
        driver.findElement(By.id("sign_in_button")).click();
        driver.findElement(By.id("email_text_field")).sendKeys(username);
        driver.findElement(By.id("password_text_field")).sendKeys(password);
        super.hideKeyboard();
        driver.findElement(By.id("sign_in_button")).click();
    }

    public void checkYouAreOnTheLobbyScreen() {
        assert(driver.findElement(By.id("lobby_screen")).isDisplayed());
    }
}
