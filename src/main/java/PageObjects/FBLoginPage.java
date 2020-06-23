package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import utils.DriverSetup;

public class FBLoginPage {

    public WebDriver driver;
    public FBLoginPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="email")
    WebElement username;

    @FindBy(id="pass")
    WebElement password;

    @FindBy(xpath="//*[@id=\"u_0_b\"]")
    WebElement loginBtn;

    public WebElement usernameFn() {
        return username;
    }
    public WebElement passwordFn() {
        return password;
    }
    public WebElement loginBtnFn() {
        return loginBtn;
    }


}
