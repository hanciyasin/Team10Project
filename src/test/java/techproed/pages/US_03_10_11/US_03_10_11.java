package techproed.pages.US_03_10_11;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class US_03_10_11 {
    public US_03_10_11(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //US-03 locates
    @FindBy(xpath = "//*[.='Contact']")
    public WebElement contactButton;
    @FindBy(xpath = "//*[@id='name']")
    public WebElement yourNameBox;
    @FindBy(xpath = "//*[@id='email']")
    public WebElement emailBox;
    @FindBy(xpath = "//*[@id='subject']")
    public WebElement subjectBox;
    @FindBy(xpath = "//*[@id='message']")
    public WebElement messageBox;
    @FindBy(xpath = "//button[.='Send Message']")
    public WebElement sendMessageButton;
    @FindBy(xpath = "//*[.='Required']")
    public WebElement requiredText;
    @FindBy(xpath = "//div[.='Please enter valid email']")
    public WebElement emailAlert;
    @FindBy(xpath = "//div[.='Contact Message Created Successfully']")
    public WebElement successfulMessageAlert;

    //US-10 locates
    @FindBy(xpath = "//*[@href='/login']")
    public WebElement loginButton;
    @FindBy(xpath = "//*[@id='username']")
    public WebElement usernameBox;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordBox;
    @FindBy(xpath = "//button[.='Login']")
    public WebElement inLoginButton;
    @FindBy(xpath = "//*[.='Menu']")
    public WebElement menuButton;
    @FindBy(xpath = "//a[.='Lesson Management']")
    public WebElement lessonManagementButton;
    @FindBy(xpath = "//*[@id='controlled-tab-example-tab-lessonProgram']")
    public WebElement lessonProgramTab;
    @FindBy(xpath = "//*[@id='react-select-2-input']")
    public WebElement chooseLesson;
    @FindBy(xpath = "//*[@id='day']")
    public WebElement chooseDay;
    @FindBy(xpath = "//*[@id='educationTermId']")
    public WebElement chooseEducationTerm;
    @FindBy(xpath = "//*[@id='startTime']")
    public WebElement chooseStartTime;
    @FindBy(xpath = "//*[@id='stopTime']")
    public WebElement chooseStopTime;
    @FindBy(xpath = "(//button[.='Submit'])[3]")
    public WebElement submitButton;
    @FindBy(xpath = "//*[.='Created Lesson Program']")
    public WebElement lessonProgramSuccessful;
    @FindBy(xpath = "//*[.='Logout']")
    public WebElement logoutButton;
    @FindBy(xpath = "//button[.='Yes']")
    public WebElement logoutYesButton;


    //US-11 locates
    @FindBy(xpath = "//*[.='Lesson Program List']")
    public WebElement lessonProgramList;
    @FindBy(xpath = "(//th[.='Lesson'])[1]")
    public WebElement lessonList;
    @FindBy(xpath = "(//th[.='Day'])[1]")
    public WebElement dayList;
    @FindBy(xpath = "(//th[.='Start Time'])[1]")
    public WebElement startTimeList;
    @FindBy(xpath = "(//th[.='Stop Time'])[1]")
    public WebElement stopTimeList;





}
