package techproed.pages.US04_05_16;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;


public class AdminManagementPage {

    public AdminManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//button)[1]")
    public WebElement adminMenuButtonDd;

    @FindBy(xpath = "(//a)[32]")
    public WebElement mainMenuDeanManagementDd;

    @FindBy(xpath = "//*[@id='name']")
    public WebElement addDeanNameDd;

    @FindBy(xpath = "(//input)[2]")
    public WebElement addDeanSurnameDd;

    @FindBy(xpath = "(//input)[3]")
    public WebElement addDeanBirthPlaceDd;

    @FindBy(xpath = "(//input)[4]")
    public WebElement addDeanFemaleGenderDd;

    @FindBy(xpath = "(//input)[5]")
    public WebElement addDeanMaleGenderDd;

    @FindBy(xpath = "(//input)[6]")
    public WebElement addDeanDateOfBirthDd;

    @FindBy(xpath = "(//input)[7]")
    public WebElement addDeanPhoneDd;

    @FindBy(xpath = "(//input)[8]")
    public WebElement addDeanSSNDd;

    @FindBy(xpath = "(//input)[9]")
    public WebElement addDeanUserNameDd;

    @FindBy(xpath = "(//input)[10]")
    public WebElement addDeanUserPasswordDd;

    @FindBy(xpath = "(//button)[5]")
    public WebElement addDeanSubmitButtonDd;

    @FindBy(xpath = "(//td)[7]")
    public WebElement deanListNameDd;

    @FindBy(xpath = "(//td)[8]")
    public WebElement deanListGenderDd;

    @FindBy(xpath = "(//td)[9]")
    public WebElement deanListPhoneNumberDd;

    @FindBy(xpath = "(//td)[10]")
    public WebElement deanListSSNDd;

    @FindBy(xpath = "(//td)[11]")
    public WebElement deanListUsernameDd;

    @FindBy(xpath = "(//*[@class='text-dark btn btn-outline-info'])[9]")
    public WebElement deanListEditButtonDd;

    @FindBy(xpath="(//input[@name='gender'])[3]")
    public WebElement deanListGenderEditButtonDd;

    @FindBy(xpath="(//*[@id='surname'])[2]")
    public WebElement deanListSurnameEditButtonDd;

    @FindBy(xpath="(//*[@id='birthDay'])[2]")
    public WebElement deanListDateOfBirthEditButtonDd;

    @FindBy(xpath="(//*[@id='birthPlace'])[2]")
    public WebElement deanListBirthPlaceEditButtonDd;

    @FindBy(xpath="(//input[@type='password'])[2]")
    public WebElement deanListPassEditButtonDd;

    @FindBy(xpath="(//input[@id='phoneNumber'])[2]")
    public WebElement deanListPhoneEditButtonDd;

    @FindBy(xpath="(//input[@id='ssn'])[2]")
    public WebElement deanListSSNEditButtonDd;

    @FindBy(xpath="(//*[@id='username'])[2]")
    public WebElement deanListUserNameEditButtonDd;

    @FindBy(xpath="(//input[@id='name'])[2]")
    public WebElement deanListNameEditButtonDd;

    @FindBy(xpath="(//button[text()='Submit'])[2]")
    public WebElement deanListEditSubmitButtonDd;

    @FindBy(css = ".Toastify__toast-container.Toastify__toast-container--top-center")
    public WebElement alertMessageDd;

    @FindBy(xpath = "//*[@class='Toastify__toast-container Toastify__toast-container--top-center']")
    public WebElement alertMessagexpathDd;

    @FindBy(xpath = "(//*[text()='Required'])[1]")
    public WebElement deanNameRequiredDD;

    @FindBy(xpath = "(//*[text()='Required'])[2]")
    public WebElement deanSurNameRequiredDD;

    @FindBy(xpath = "//*[text()='Minimum 11 character (XXX-XX-XXXX)']")
    public WebElement deanSSN11CharDD;

    @FindBy(xpath = "(//div)[56]")
    public WebElement deanPassCharDD;

    @FindBy(xpath = "(//*[text()='Required'])[3]")
    public WebElement deanBirthPlaceRequiredDD;

    @FindBy(xpath = "(//*[text()='Required'])[4]")
    public WebElement deanDateOfBirthRequiredDD;

    @FindBy(xpath = "(//*[text()='Required'])[5]")
    public WebElement deanPhoneRequiredDD;

    @FindBy(xpath = "(//*[text()='Required'])[6]")
    public WebElement deanSSNRequiredDD;

    @FindBy(xpath = "(//*[@class='page-item'])[4]")
    public WebElement sonSayfOkTusuDd;

    @FindBy(xpath = "(//*[@class='text-dark btn btn-outline-info'])[15]")
    public WebElement deanEditScrollDd;
}
