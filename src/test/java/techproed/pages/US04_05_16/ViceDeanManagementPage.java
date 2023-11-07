package techproed.pages.US04_05_16;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;


public class ViceDeanManagementPage {

    public ViceDeanManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Contact Get All']")
    public WebElement viceDeanContactDd;

    @FindBy(xpath = "(//td)[1]")
    public WebElement viceDeanContactMessNameDd;

    @FindBy(xpath = "(//td)[2]")
    public WebElement viceDeanContactMessEmailDd;

    @FindBy(xpath = "(//td)[3]")
    public WebElement viceDeanContactMessDateDd;

    @FindBy(xpath = "(//td)[4]")
    public WebElement viceDeanContactMessSubjectDd;

    @FindBy(xpath = "(//td)[5]")
    public WebElement viceDeanContactMessMessageDd;

    // US13 Ismail
    @FindBy(xpath= "//*[@class='header_link ms-2']")
    public WebElement Login01;

    @FindBy(xpath= "//input[@placeholder='username']")
    public WebElement UserNameBox;
    @FindBy(xpath= "//input[@placeholder='Password']")
    public WebElement PasswordBox;

    @FindBy(xpath= "//button[text()='Login']")
    public WebElement Login02;

    @FindBy(xpath= "//button[@aria-controls='offcanvasNavbar-expand-false']")
    public WebElement MenuButton;
    @FindBy(xpath= "(//*[text()='Teacher Management'])[1]")
    public WebElement TeacherManagementButton;
    @FindBy(xpath= "//input[@placeholder='Password']")
    public WebElement AddTeacherTable;
    @FindBy(css= "[class=' css-1xc3v61-indicatorContainer']")
    public WebElement ChooseLessonsElement;
     //[id='react-select-3-placeholder']
    //[id='root']
    //[class=' css-1jqq78o-placeholder']
     //div[text()='Select lesson']
    //[class=' css-hlgwow']
   // @FindBy(css="[class=' css-hlgwow']")
    @FindBy(xpath = "(//*[contains(.,'Select lesson')])[19]")
    public WebElement LessonsBox;

    @FindBy(xpath= "//input[@placeholder='Name']")
    public WebElement NameBox;

    @FindBy(xpath= "//input[@placeholder='Surname']")
    public WebElement SurnameBox;

    @FindBy(xpath= "//input[@placeholder='Birth Place']")
    public WebElement BirthPlaceBox;

    @FindBy(xpath= "//input[@placeholder='Email Address']")
    public WebElement EmailBox;
    @FindBy(xpath= "//input[@placeholder='Phone Number']")
    public WebElement PhoneNumberBox;

    @FindBy(xpath= "//input[@name='gender'][2]")
    public WebElement MaleGenderBox;

    @FindBy(xpath= "//input[@name='gender'][1]")
    public WebElement FemaleGenderBox;

    @FindBy(xpath= "//input[@id='birthDay']")
    public WebElement BirthDayBox;

    @FindBy(xpath= "//input[@placeholder='ssn']")
    public WebElement SsnBox;

    @FindBy(xpath= "//input[@placeholder='username']")
    public WebElement TeacherUserNameBox;

    @FindBy(xpath= "//input[@placeholder='Password']")
    public WebElement TeacherPasswordBox;

    @FindBy(xpath= "//button[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement TeacherListSubmitButton;

    @FindBy(xpath= "//div[@class='Toastify']")
    public WebElement TeacherSavedSuccessfulElement;

    @FindBy(xpath= "//input[@id='isAdvisorTeacher']")
    public WebElement isAdvisorTeacher;

    @FindBy(xpath= "(//div[@class='card-body'])[1]")
    public WebElement AddTeacherPage;
    @FindBy(xpath= "//div[text()='You have entered an invalid value. Valid values are: MALE, FEMALE']")
    public WebElement InValidFemaleMale;
    @FindBy(xpath= "//div[text()='Please enter valid SSN number']")
    public WebElement EnterValidSSN;

}
