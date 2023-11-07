package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

import java.util.List;

public class Us8_9_15 {

    public Us8_9_15() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='lessonName']")
    public WebElement lessonName;
    @FindBy(css= "#creditScore")
    public WebElement creditScore;
    @FindBy(css= "#compulsory")
    public WebElement Compulsory;
    @FindBy(xpath= "//div[@class='mx-auto mt-1 ms-4 mb-1 col']//child::button")
    public WebElement lessonSubmit;
    @FindBy(xpath = "//*[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement deanMenu;
    @FindBy(xpath = "//*[@id='controlled-tab-example-tab-lessonsList']")
    public WebElement lessonsButton;
    @FindBy(xpath = "//div[@id='13']")
    public WebElement lessonSave;
    @FindBy(xpath = "//div[@class='mt-5 ms-3 me-3 text-center border border-3 shadow-sm bg-body rounded card border-warning']//child::h5[1]")
    public WebElement lessonList;
    @FindBy(xpath= "//button[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement MenuButton;
    @FindBy(xpath = "//div[@role='dialog']//self::a[3]")
    public WebElement sManagement;
    @FindBy(xpath = "//h3[@bg='primary']")
    public WebElement addStudent;
    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement sName;
    @FindBy(xpath = "//input[@placeholder='Surname']")
    public WebElement sSurname;
    @FindBy(xpath = "//input[@placeholder='Birth Place']")
    public WebElement sBirthPlace;
    @FindBy(xpath = "//input[@placeholder='Phone Number']")
    public WebElement sPhone;
    @FindBy(xpath = "//input[@placeholder='Email Address']")
    public WebElement eMail;
    @FindBy(xpath = "//input[@type='date']")
    public WebElement dTarihi;
    @FindBy(xpath = "//input[@placeholder='ssn']")
    public WebElement SSNumber;
    @FindBy(xpath = "//*[text()='Required']")
    public List<WebElement> studentRequiredYazilari;
    @FindBy(xpath = "//*[text()='Enter your password']")
    public WebElement studentPasswordSonucYazisi;
    @FindBy(xpath="//*[text()='Student Management']")
    public WebElement studentManagement;
    @FindBy(xpath = "//*[@class='form-select']")
    public WebElement chooseTeacherDdm;
    @FindBy(xpath="//*[@type='radio']")
    public List<WebElement> genderRadioButtons;
    @FindBy(xpath = "//*[@id='birthDay']")
    public WebElement studentBirthday;
    @FindBy(xpath = "//*[@id='ssn']")
    public WebElement studentSsn;
    @FindBy(xpath = "//*[@id='username']")
    public WebElement studentUsername;
    @FindBy(xpath = "//*[@id='fatherName']")
    public WebElement studentFathername;
    @FindBy(xpath = "//*[@id='motherName']")
    public WebElement studentMothername;
    @FindBy(xpath="//*[@id='password']")
    public WebElement studentPassword;
    @FindBy(xpath = "//*[@role='alert']")
    public WebElement studentAlert;
    @FindBy(xpath = "//*[text()='Minimum 12 character (XXX-XXX-XXXX)']")
    public WebElement studentMinimum12Karakter;
    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement studentSubmit;
    @FindBy(xpath = "//*[text()='Minimum 11 character (XXX-XX-XXXX)']")
    public WebElement studentMinimum11Karakter;
    @FindBy(xpath = "(//*[@type='button'])[21]")
    public WebElement studentPageyazisi;
    @FindBy(xpath = "(//*[@role='button'])[14]")
    public WebElement studentPageLink;
    @FindBy(xpath = "(//*[@type='button'])[6]")
    public WebElement studentPageyazisi2;
    @FindBy(xpath = "//tbody//td")
    public List<WebElement> studentTableSonSayfa;


}
