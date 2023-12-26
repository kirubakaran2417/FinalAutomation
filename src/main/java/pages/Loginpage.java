package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
    public WebDriver driver;
    public Loginpage(WebDriver driver) {
        this.driver =driver;
    }
    @FindBy(id = "user-name")
    private WebElement username;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(id = "login-button")
    private WebElement login;

    public Loginpage setUsername(final String usernamevalue){
        username.sendKeys(usernamevalue);
        return this;
    }
    public Loginpage setPassword(final String passwordvalue){
        password.sendKeys(passwordvalue);
        return this;
    }
    public InventoryPage clickLogin(){
        login.click();
        return PageFactory.initElements(driver,InventoryPage.class);
    }
    public InventoryPage login(String username, String password){
        return this
                .setUsername(username)
                .setPassword(password)
                .clickLogin();
    }
}
