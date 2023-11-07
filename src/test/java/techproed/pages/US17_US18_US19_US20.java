package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

import java.util.List;

public class US17_US18_US19_US20 {
    public US17_US18_US19_US20(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='header_link ms-2']" ) public WebElement glcnLoginButton;

    @FindBy(xpath = "//*[@placeholder='username']") public WebElement glcnUserName;

    @FindBy(xpath = "//*[@placeholder='Password']") public WebElement glcnPassword;

    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary']") public WebElement glcnLogin;

    @FindBy(xpath = "//*[@id='lessonId']") public WebElement glcnChooseLesson;

    @FindBy(xpath = "(//*[@class='form-select'])[2]") public WebElement glcnChooseStudent;
    @FindBy(xpath = "(//*[@class='form-select'])[2]") public List<WebElement> glcnChooseStudents;

    @FindBy(xpath = "(//*[@class='form-select'])[3]") public WebElement glcnChooseEducationTerm;

    @FindBy(xpath = "//*[@id='absentee']") public WebElement glcnAbsentee;
    @FindBy(xpath = "//*[@id='midtermExam']") public WebElement glcnMidExam;
    @FindBy(xpath = "//*[@id='finalExam']") public WebElement glcnFinalExam;
    @FindBy(xpath = "//*[@id='infoNote']") public WebElement glcnInfoNote;
    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']") public WebElement glcnSubmit;
    @FindBy(xpath = "//*[@class='table-responsive']") public WebElement glcnSatir;

    @FindBy(xpath = "//*[@class='text-dark btn btn-outline-info']") public WebElement glcnEdit;
    @FindBy(xpath = "(//*[@id='absentee'])[2]") public WebElement glcnEditAbsentee;
    @FindBy(xpath = "(//*[@id='midtermExam'])[2]") public WebElement glcnEditMidtermExam;
    @FindBy(xpath = "(//*[@id='finalExam'])[2]") public WebElement glcnEditFinalExam;
    @FindBy(xpath = "(//*[@id='infoNote'])[2]") public WebElement glcnEditInfoNote;
    @FindBy(xpath = "(//*[@class='fw-semibold btn btn-primary btn-lg'])[2]") public WebElement glcnEditSubmit;
    @FindBy(xpath = "(//*[@class='fa-solid fa-trash'])[1]") public WebElement glcnDeleteButton;


    @FindBy(xpath = "(//*[@class=' css-1jqq78o-placeholder']") public WebElement glcnMeetChooseStd;
    @FindBy(xpath = "//*[@class=' css-19bb58m']") public WebElement glcnMeetChooseStd2;
    @FindBy(xpath = "//*[@id='react-select-3-input']") public WebElement glcnMeetChooseStd3;
    @FindBy(xpath = "//*[@id='react-select-2-input']") public WebElement glcnMeetChooseStd4;


    @FindBy(xpath = "//*[@id='date']") public WebElement glcnDateOfMeet;
    @FindBy(xpath = "//*[@id='startTime']") public WebElement glcnStartTime;
    @FindBy(xpath = "//*[@id='stopTime']") public WebElement glcnStopTime;
    @FindBy(xpath = "//*[@id='description']") public WebElement glcnMeetDescription;
    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']") public WebElement glcnMeetSubmit;
    @FindBy(xpath = "//*[@class='btn btn-danger']") public WebElement glcnMeetDelete;
    @FindBy(xpath = "(//*[@class='card-body'])[2]") public WebElement glcnMeetSatir;
    @FindBy(xpath = "(//*[@class=' css-v7duua'])[2]") public WebElement glcnMeetCarpi;
    @FindBy(xpath = "//*[@id='react-select-3-placeholder']") public WebElement glcnEditMeetStd;


    @FindBy(xpath = "(//*[@aria-hidden='true'])[21]") public WebElement editChooseStudentSilme;
    @FindBy(xpath = "//*[@id='react-select-3-input']") public WebElement editChooseStudents;
    @FindBy(xpath = "(//*[@class='fw-semibold btn btn-primary btn-lg'])[2]") public WebElement glcnEditMeetSubmit;
    @FindBy(xpath = "(//*[@id='date'])[2]") public WebElement glcnEditMeetDate;
    @FindBy(xpath = "(//*[@class='fw-semibold btn btn-primary btn-lg'])[2]") public WebElement glcnEditMeetSubmit2;
    @FindBy(xpath = "(//*[@id='description'])[2]") public WebElement glcnEditMeetDescription;
    @FindBy(xpath = "(//*[@id='startTime'])[2]") public WebElement glcnEditMeetStartTime;
    @FindBy(xpath = "(//*[@id='stopTime'])[2]") public WebElement glcnEditMeetStopTime;
    @FindBy(xpath = "(//*[@class='card-body'])[2]") public WebElement glcnMeetListe;
    @FindBy(xpath = "//*[@class='mb-5 ms-5 me-5 text-center border border-3 shadow-sm bg-body rounded card border-warning']")
    public WebElement glcnMeetCard;






    @FindBy(xpath = "//*[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']") public WebElement glcnMenu;

    @FindBy(xpath = "(//*[@class='nav-link'])[7]") public WebElement glcnMeetManagement;

    @FindBy(xpath = "//*[@id='react-select-2-placeholder']") public WebElement glcnSelectStudentAddMeet;










    @FindBy(xpath = "(//*[@class='Toastify__toast-body'])[1]")
    public WebElement glcnSavedAlert;







}
