package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class US12_25 {
    public US12_25(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Choose Education Term select tag
    @FindBy(xpath = "//*[@class='mt-5 form-select']") public static WebElement educationTermId;
    @FindBy(xpath = "//*[@class=' css-hlgwow']") public static WebElement selectLesson;
    @FindBy(xpath = "(//*[@type='button'])[7]") public static WebElement lessonProgram;
    @FindBy(css = "#username") public static WebElement userName;
    @FindBy(css = "#password") public static WebElement password;
    @FindBy(xpath = "(//button)[3]") public static WebElement loginButton;
    @FindBy(xpath = "//a[@class='header_link ms-2']") public static WebElement loginAnaSayfa;
    @FindBy(xpath = "//*[@class='header_link ms-2']") public static WebElement anaSayfaÜsttekiLoginButon;
    @FindBy(xpath = "//*[@placeholder='username']") public static WebElement loginUsername;
    @FindBy(xpath = "//*[@placeholder='Password']") public static WebElement loginPassword;
    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary']") public static WebElement ilkGirişLoginbuton;
    @FindBy(xpath = "//*[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']") public static WebElement loginSonrasıMenuButton;
    @FindBy(xpath = "//a[@class='nav-link'and text()='Lesson Management']") public static WebElement lessonManagementButton;
    @FindBy(xpath = "//*[@id='controlled-tab-example-tab-lessonProgram']") public static WebElement lessonPrgoramMenüsüYazısı;
    @FindBy(xpath = "//h5[text()='Add Lesson Program']") public static WebElement addLessonProgramKontrolYazısı ;
    @FindBy(xpath = "//*[@class=' css-19bb58m']") public static WebElement chooseLessonsDDM;
    @FindBy(xpath = "//*[@class='mt-5 form-select']") public static WebElement chooseEducationTermDDM;
    @FindBy(xpath = "//*[@id='day']") public static WebElement chooseDay;
    @FindBy(xpath = "//*[@id='startTime']") public static WebElement startTime;
    @FindBy(xpath="//*[@id='stopTime']") public static WebElement stopTime;
    @FindBy(xpath = "//*[@id=\"controlled-tab-example-tabpane-lessonProgram\"]/div[2]/div[1]/div/form/div/div[2]/div[3]/div/button") public static WebElement addLessonProgramSubmitButonu;
    @FindBy(xpath = "//*[div/text()='Created Lesson Program']") public static WebElement oluşturulanDersUyarısı;
    @FindBy(xpath = "//*[@class='form-check-input'and @value='1789']") public static WebElement oluşturulanDersinKutucuğu;
    @FindBy(xpath = "//*[@id='teacherId']") public  static WebElement chooseTeacherDDM;
    @FindBy(xpath = "(//*[@class='fw-semibold btn btn-primary btn-lg'])[4]") public static WebElement lessonProgramListSubmitButton;
    @FindBy(xpath = "//*[div/text()='Lesson added to Teacher']") public static WebElement lessonAddedToTeacherUyarısı;

    @FindBy(xpath = "//*[div/text()='Lesson added to Teacher']") public static WebElement alert;
    @FindBy(xpath = "//*[@id='advisorTeacherId']") public static WebElement chooseTeacher;
    @FindBy(xpath = "(//*[@class='nav-link'])[11]") public static WebElement studentManegementButtonMenüdeki;
    @FindBy(xpath = "//*[@id='advisorTeacherId']") public static WebElement chooseAdivasorTeacherDDM;
    @FindBy(xpath = "//*[@id='name']") public static WebElement studentName;
    @FindBy(xpath = "//*[@id='surname']") public static WebElement studentSurname;
    @FindBy(xpath = "//*[@id='birthPlace']") public static WebElement studentBirthPlace;
    @FindBy(xpath = "//*[@id='email']") public static WebElement studentEmail;
    @FindBy(xpath = "//*[@id='phoneNumber']") public static WebElement studentPhoneNumber;
    @FindBy(xpath = "(//*[@class='form-check-input'])[2]") public static WebElement studentGenderButton;
    @FindBy(xpath = "//*[@id='birthDay']") public static WebElement studentDateOfBirth;
    @FindBy(xpath = "//*[@id='ssn']") public static WebElement studentSSN;
    @FindBy(xpath = "//*[@id='username']") public static WebElement studentUserName;
    @FindBy(xpath = "//*[@id='fatherName']") public static WebElement studentFatherName;
    @FindBy(xpath = "//*[@id='motherName']") public static WebElement studentMotherName;
    @FindBy(xpath = "//*[@id='password']") public static WebElement studentPassword;
    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']") public static WebElement studentCreateSubmitButton;
    @FindBy(xpath = "//*[div/text()='Student saved Successfully']") public static WebElement studentSavedSuccessfullyUyarısı;




















}
