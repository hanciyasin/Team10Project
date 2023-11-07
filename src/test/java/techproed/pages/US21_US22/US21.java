package techproed.pages.US21_US22;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class US21 {
    public US21(){
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

    @FindBy(xpath = "//a[text()='Choose Lesson']")
    public WebElement menuInsideChooseLesson;

    @FindBy(xpath = "//th[text()='Teacher']")
    public WebElement teacherVisible;

    @FindBy(xpath = "//th[text()='Day']")
    public WebElement dayVisible;

    @FindBy(xpath = "//th[text()='Start Time']")
    public WebElement startTimeVisible;

    @FindBy(xpath = "//th[text()='Stop Time']")
    public WebElement stopTimeVisible;

    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement chooseLessonSubmitButton;

    @FindBy(xpath = "//*[@class='Toastify__toast-icon Toastify--animate-icon Toastify__zoom-enter']")
    public WebElement lessonAddedToStudentNotification;

    @FindBy(xpath = "//*[@class='Toastify__toast-icon Toastify--animate-icon Toastify__zoom-enter']")
    public WebElement cannotsameHourDayNotification;

    @FindBy(xpath = "(//span[text()='Coding2'])[2]")
    public WebElement secilenDersiGorebilmeli;

    @FindBy(xpath = "(//h5)[2]")
    public WebElement sayfayiSectigiDerseKaydir;

    @FindBy(xpath = "//a[text()='Grades and Announcements']")
    public WebElement gradesAndAnnouncements;

    @FindBy(xpath = "//*[text()='Coding1']")
    public WebElement coding1DersiNotSayfasi;

    @FindBy(xpath = "//*[text()='AA']")
    public WebElement coding1DersiNotu;

    @FindBy(xpath = "//*[text()='2023-12-21']")
    public WebElement meetInformation;













    //Lesson Locate'leri

    @FindBy(xpath = "//*[@value='1348']")
    public WebElement lesson1TC02;

    @FindBy(xpath = "//*[@value='1341']")
    public WebElement lesson2TC02;

    @FindBy(xpath = "//*[@value='1342']")
    public WebElement lesson3;

    @FindBy(xpath = "//*[@value='1343']")
    public WebElement lesson4;

    @FindBy(xpath = "//*[@value='1344']")
    public WebElement lesson5;

    @FindBy(xpath = "//*[@value='1345']")
    public WebElement lesson6;

    @FindBy(xpath = "//*[@value='1346']")
    public WebElement lesson7;

    @FindBy(xpath = "//*[@value='1347']")
    public WebElement lesson8;

    @FindBy(xpath = "//*[@value='1919']")
    public WebElement sameCoding1;

    @FindBy(xpath = "//*[@value='1920']")
    public WebElement sameCoding2;
}
