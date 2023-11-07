package techproed.pages.US21_US22;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class US22 {

    public US22(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //ORTAK
    @FindBy(xpath = "//*[@type='text']")
    public WebElement loginUserName;

    @FindBy(xpath = "//*[@type='password']")
    public WebElement loginPassword;

    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public WebElement loginButtonMainPage;

    @FindBy(xpath = "//*[text()='Menu']")
    public WebElement menuButton;

    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary']")
    public WebElement loginButtonLoginPage;



    @FindBy(xpath = "//a[text()='Admin Management']")
    public WebElement menuInsideAdminManagement;

    @FindBy(xpath = "//*[@placeholder='Name']")
    public WebElement nameBox;

    @FindBy(xpath = "//*[@placeholder='Surname']")
    public WebElement surnameBox;

    @FindBy(xpath = "//*[@placeholder='Birth Place']")
    public WebElement birthPlaceBox;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement maleRadioButton;

    @FindBy(xpath = "//input[@type='date']")
    public WebElement dateOfBirth;

    @FindBy(xpath = "//*[@placeholder='Phone Number']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//*[@placeholder='ssn']")
    public WebElement ssnAdmin;

    @FindBy(xpath = "//*[@placeholder='username']")
    public WebElement usernameAdmin;

    @FindBy(xpath = "//*[@placeholder='Password']")
    public WebElement passwordAdmin;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitButtonAdmin;

    @FindBy(xpath = "//div[@class='Toastify__toast-icon Toastify--animate-icon Toastify__zoom-enter']")
    public WebElement adminSavedNotification;

    @FindBy(xpath = "//*[text()='Required']")
    public WebElement requiredNotification;

    @FindBy(xpath = "//div[text()='Minimum 11 character (XXX-XX-XXXX)']")
    public WebElement minimum11CharacterNotification;

    @FindBy(xpath = "//div[text()='Enter your password']")
    public WebElement enterYourPasswordNotification;

    @FindBy(xpath = "//div[text()='At least 8 characters']")
    public WebElement atLeast8CharactersNotification;



}
