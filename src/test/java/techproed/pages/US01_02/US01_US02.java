package techproed.pages.US01_02;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class US01_US02 {


        public US01_US02  () {
            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath = "//a[@class='header_link me-2']")
        public WebElement registerAnaSayfa;

        @FindBy(xpath = "//input[@id='name']")
        public WebElement name;

        @FindBy(xpath = "//input[@id='surname']")
        public WebElement surname;
        @FindBy(xpath = "//input[@id='birthPlace']")
        public WebElement birthPlace;
        @FindBy(xpath = "//input[@value='FEMALE']")
        public WebElement female;
        @FindBy(xpath = "//input[@value='MALE']")
        public WebElement male;
        @FindBy(xpath = "//input[@id='birthDay']")
        public WebElement dateOfBirth;
        @FindBy(xpath = "//input[@id='phoneNumber']")
        public WebElement phoneNumber;

        @FindBy(xpath = "//input[@id='ssn']")
        public WebElement ssn;

        @FindBy(xpath = "//input[@id='username']")
        public WebElement username;

        @FindBy(xpath = "//input[@id='password']")
        public WebElement password;

        @FindBy(css = "*[placeholder='username']")
        public WebElement usernamep;
        @FindBy(css = "*[placeholder='Password']")
        public WebElement passwordp;


        @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--error Toastify__toast--close-on-click']")
        public WebElement atleast2char;

        @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-center']")
        public WebElement exact12char;

        @FindBy(xpath = "//*[contains(text(),'Minimum 12 character')]")
        public WebElement min12char;

        @FindBy(xpath = "//*[contains(text(),'Please enter valid phone number')]")
        public WebElement enterValidPhone;

        @FindBy(xpath = "//*[contains(text(),'geçmiş bir tarih olmalı')]")
        public WebElement gecmisBirTarihOlmali;

        @FindBy(xpath = "//*[contains(text(),'Please enter valid SSN number')]")
        public WebElement pleaseEnterValidSsnNumber;

        @FindBy(xpath = "//*[contains(text(),'Minimum 11 character')]")
        public WebElement min11char;

        @FindBy(xpath = "//*[contains(text(),'Your username should be at least 4 characters')]")
        public WebElement atleast4char;

        //@FindBy(xpath = "//*[@ class='card-img-top p-4 pb-6']")
        @FindBy(xpath = "//*[contains(text(),'Guest User registered.')]")
        public WebElement guestUserRegistered;
        @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary']")
        public WebElement register;

        @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
        public WebElement requiredMessageName;
        @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
        public WebElement requiredMessageSurname;
        @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
        public WebElement requiredMessageBirthPlace;
        @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
        public WebElement requiredMessageDateOfBirth;
        @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
        public WebElement requiredMessagePhone;
        @FindBy(xpath = "(//div[@class='invalid-feedback'])[6]")
        public WebElement requiredMessageSsn;

        @FindBy(xpath = "(//div[@class='invalid-feedback'])[7]")
        public WebElement requiredMessageUserName;
        @FindBy(xpath = "(//div[@class='invalid-feedback'])[8]")
        public WebElement EnterYourPasswordMessage;
        @FindBy(xpath = "(//div[@class='Toastify__toast-body'])[1]")
        public WebElement alertMessage;

        @FindBy(xpath = "//*[text()='At least 8 characters']")
        public WebElement minimum8;

        @FindBy(xpath = "//*[@href='/login']")
        public WebElement anasayfaLogin;

        @FindBy(xpath= "//*[@*='fw-semibold btn btn-primary']")
        public WebElement loginButton;

        @FindBy(xpath= "//*[@*='offcanvasNavbar-expand-false']")
        public WebElement menuButon;

        @FindBy(xpath= "//*[text()='Guest User']")
        public WebElement guestUserButon;

        @FindBy(xpath = "//a[text()='Guest User']")
        public WebElement guestUser;

        @FindBy(xpath = "//a[text()='Logout']")
        public WebElement logoutButton;

        @FindBy(xpath = "(//button[@class='btn-close'])[2]")
        public WebElement mainMenuClose;

        @FindBy(xpath = "//button[@class='btn btn-warning']")
        public WebElement logoutButtonKapat;


        @FindBy(xpath = "//*[text()='Guest User List']")
        public WebElement guestUserListText;

        @FindBy(xpath = "//*[text()='Name']")
        public WebElement guestUserNameText;

        @FindBy(xpath = "//*[text()='Phone Number']")
        public WebElement guestUserPhoneNumberText;

        @FindBy(xpath = "//*[text()='Ssn']")
        public WebElement guestUserSsnText;

        @FindBy(xpath = "//*[text()='User Name']")
        public WebElement guestUserUserNameText;

        @FindBy(xpath = "(//*[@class='btn btn-danger'])[1]")
        public WebElement guestUserDeleteButonu;

        @FindBy(xpath = "//div[@class='Toastify']")
        public WebElement guestUserDeletedUyariMesaji;

        @FindBy(xpath = "(//*[text()='Required'])[1]")
        public WebElement NameRequired;

        @FindBy(xpath = "(//*[text()='Required'])[2]")
        public WebElement SurNameRequired;
        @FindBy(xpath = "(//*[text()='Required'])[3]")
        public WebElement BirthPlaceRequired;
        @FindBy(xpath = "(//*[text()='Required'])[4]")
        public WebElement phonereguired;

        @FindBy(xpath = "(//*[text()='Required'])[5]")
        public WebElement DateOfBirthreguared;

        @FindBy(xpath = "(//*[text()='Required'])[6]")
        public WebElement ssnreguared;

        @FindBy(xpath = "//*[@id='username']")
        public WebElement buttonusername;

        @FindBy(xpath = "(//*[text()='Name'])")
        public WebElement GUESTUSER_NAME_LİNKİ;

        @FindBy(xpath = "(//*[text()='Phone Number'])")
        public WebElement GUESTUSER_PhoneNumberLİNKİ;
        @FindBy(xpath = "(//*[text()='Ssn'])")
        public WebElement GUESTUSER_ssnLİNKİ;
        @FindBy(xpath = "(//*[text()='Name'])")
        public WebElement GUESTUSER_userNAMELİNKİ;

        @FindBy(xpath = "//a[@class='nav-link'][6]")
        public WebElement contacttuşu;
        @FindBy(xpath = "(//*[text()='Blog'])")
        public WebElement Blogtuşu;
      @FindBy(xpath = "(//*[text()='Events'])")
        public WebElement EVENTTUŞU;
        @FindBy(xpath = "(//*[text()='Courses'])")
        public WebElement coursesTUŞU;
        @FindBy(xpath = "(//*[text()='Home'])")
        public WebElement homeTUŞU;

        @FindBy(xpath = "//*[@class='page-item'][3]")
        public WebElement pages;

        @FindBy(xpath = "(//*[text()='suat'])[2]")
        public WebElement usernamesuatsatırı;
        @FindBy(xpath = "//li[@class='page-item'][4]")
        public WebElement PAGESSONSAYFAM_OKTUŞU;

        @FindBy(xpath = "//li[@class='page-item'][2]")
        public WebElement SONDANGERİYEBİRERATLAMATUŞU;

        @FindBy(xpath = "(//*[@class='btn btn-danger'])[2]")
        public WebElement SİLMEKUTUCUGU;







}




