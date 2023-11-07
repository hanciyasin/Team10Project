package techproed.pages.US04_05_16;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;


public class SchoolHomePage {

    public SchoolHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@class='header_link ms-2']")
    public WebElement loginButtonDd;

    @FindBy (xpath = "(//input)[1]")
    public WebElement userNameDd;

    @FindBy (xpath = "(//input)[2]")
    public WebElement userPasswordDd;

    @FindBy (xpath = "(//button)[3]")
    public WebElement userLoginButtonDd;

}
