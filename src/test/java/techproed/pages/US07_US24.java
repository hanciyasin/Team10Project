package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class US07_US24 {
    public US07_US24() {
        PageFactory.initElements(Driver.getDriver(),this);}

    //US24.feature'S LOCATES

    @FindBy(xpath= "//*[@class='header_link ms-2']")
    public WebElement iremLoginElement;

    @FindBy(xpath= "//*[@id='username']")
    public WebElement iremUsername;

    @FindBy(xpath= "//*[@id='password']")
    public WebElement iremPassword;

    @FindBy (xpath = "//*[@class='fw-semibold btn btn-primary']")
    public WebElement iremLoginButton;

    @FindBy (xpath = "//*[@class = 'fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement iremDeanMenuElement;

    @FindBy (css = "#root > div > header > div.header-auth > div > div > div > nav > button")
    public WebElement iremAdminMenuElement ;

    @FindBy (xpath = "//*[@class ='nav-link']")
    public WebElement iremContactGetAllElement;

    @FindBy(css= "#offcanvasNavbar-expand-lg > div.offcanvas-body > div > a:nth-child(2)")
    public WebElement iremContactGetAllElementCss;


    //US24.feature'S LOCATES

   //#offcanvasNavbar-expand-lg > div.offcanvas-body > div > a:nth-child(2)
    //#offcanvasNavbar-expand-lg > div.offcanvas-body > div > a:nth-child(2)


    @FindBy (css = "#offcanvasNavbar-expand-lg > div.offcanvas-body > div > a:nth-child(5)")
    public WebElement iremTeacherManagement;

    @FindBy(css= "[class=' css-1xc3v61-indicatorContainer']")
    public WebElement iremAddTeacherChooseLesson;

    @FindBy (css = "#name")
    public WebElement iremAddTeacherName ;

    @FindBy (css = "#surname")
    public WebElement iremAddTeacherSurname;

    @FindBy (css = "#birthPlace")
    public WebElement iremAddTeacherBirthPlace;

    @FindBy (css = "#email")
    public WebElement iremAddTeacherEmail;

    @FindBy (css = "#phoneNumber")
    public WebElement iremAddTeacherPhoneNumber;

    @FindBy (css = "#isAdvisorTeacher")
    public WebElement iremAddTeacherIsAdvisor;

    @FindBy (css = "#controlled-tab-example-tabpane-teachersList > div:nth-child(2) > div > div > form > div:nth-child(2) > div.text-center.pt-4.col-md-auto > div > div:nth-child(1) > div > input")
    public WebElement iremAddTeacherFemale;

    @FindBy (css = "#controlled-tab-example-tabpane-teachersList > div:nth-child(2) > div > div > form > div:nth-child(2) > div.text-center.pt-4.col-md-auto > div > div:nth-child(2) > div > input")
    public WebElement iremAddTeacherMale;

    @FindBy (css = "#birthDay")
    public WebElement iremAddTeacherDateOfBirth;

    @FindBy (css = "#ssn")
    public WebElement iremAddTeacherSsn;

    @FindBy (css = "#username")
    public WebElement iremAddTeacherUserName;

    @FindBy (css = "#password")
    public WebElement iremAddTeacherPassword;

    @FindBy (css = "#controlled-tab-example-tabpane-teachersList > div:nth-child(2) > div > div > form > div:nth-child(3) > div.mx-auto.ps-3.pt-3.col > div > button")
    public WebElement iremAddTeacherSubmitButton;

    @FindBy(xpath= "//div[@class='Toastify']")
    public WebElement iremTeacherSavedSuccessfulElement;


    @FindBy (css = "#root > div > main > div > div > div > div > div > div.table-responsive > table > thead > tr > th:nth-child(5)")
    public WebElement deanMessageBilgisi;

    @FindBy (css = "#root > div > main > div > div > div > div > div > div.table-responsive > table > thead > tr > th:nth-child(1)")
    public WebElement deanNameBilgisi;

    @FindBy (css = "#root > div > main > div > div > div > div > div > div.table-responsive > table > thead > tr > th:nth-child(2)")
    public WebElement deanEmailBilgisi;

    @FindBy (css = "#root > div > main > div > div > div > div > div > div.table-responsive > table > thead > tr > th:nth-child(3)")
    public WebElement deanDateBilgisi;


    @FindBy (css = "#root > div > main > div > div > div > div > div > div.table-responsive > table > thead > tr > th:nth-child(4)")
    public WebElement deanSubjectBilgisi;

}
