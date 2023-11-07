package techproed.StepDefinitions.ui_step_defs.US13_US14_StepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import techproed.pages.US04_05_16.ViceDeanManagementPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;


public class US13ViceDeanEnterStepDefs {
    ViceDeanManagementPage viceDeanManagementPage = new ViceDeanManagementPage();
     Actions actions=new Actions(Driver.getDriver());
    Faker faker = new Faker();
    String NameBox;
    String SurnameBox;
    Select select;
    @Given("Kullanici anasayfaya girer")
    public void kullaniciAnasayfayaGirer() {
        Driver.getDriver().get(ConfigReader.getProperty("manSchoolUrl"));

    }

    @When("Kullanici Login  tiklar")
    public void kullaniciLoginTiklar() {
        viceDeanManagementPage.Login01.click();

    }

    @And("Kullanici User Name girer")
    public void kullaniciUserNameGirer() {
        viceDeanManagementPage.UserNameBox.sendKeys(ConfigReader.getProperty("VDUserName"));
    }

    @And("Kullanici Password girer")
    public void kullaniciPasswordGirer() {

        viceDeanManagementPage.PasswordBox.sendKeys(ConfigReader.getProperty("VDPassword"));
    }

    @And("Kullanici Login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        ReusableMethods.click(viceDeanManagementPage.Login02);

    }

    @Given("vice dean clicks on Teacher Management Option")
    public void viceDeanClicksOnTeacherManagementOption() {
        viceDeanManagementPage.MenuButton.click();
        ReusableMethods.bekle(2);
        viceDeanManagementPage.TeacherManagementButton.click();
        ReusableMethods.bekle(1);

    }

    @When("vice dean enter {string}")
    public void viceDeanEnter(String lesson) {
         // JSUtils.setValueByJS(viceDeanMngPage.addTeacherSelectLesson,lesson);

                // JSUtils.clickWithTimeoutByJS(viceDeanMngPage.addTeacherSelectLesson);
                // ReusableMethods.click(viceDeanManagementPage.ChooseLessonsElement);
                 // ReusableMethods.bekle(1);
                 // ReusableMethods.click(viceDeanManagementPage.LessonsBox);
                 // ReusableMethods.sendKeysJS(viceDeanManagementPage.LessonsBox,lesson);
                 //ReusableMethods.sendKeysJS(viceDeanManagementPage.LessonsBox,lesson);
                 // viceDeanManagementPage.LessonsBox.sendKeys(lesson,Keys.ENTER);
                 //ReusableMethods.sendKeysJS(viceDeanManagementPage.LessonsBox,lesson);

                   ReusableMethods.click(viceDeanManagementPage.ChooseLessonsElement);
                   actions.sendKeys(Keys.ARROW_DOWN,Keys.PAGE_DOWN,Keys.ENTER).perform();

                 //ReusableMethods.sendKeysJS(viceDeanManagementPage.LessonsBox,lesson);


        ReusableMethods.bekle(1);

    }

    @And("vice dean enter1 {string},{string}")
    public void viceDeanEnter1(String name, String surname) {
        viceDeanManagementPage.NameBox.sendKeys(name);
        ReusableMethods.bekle(1);
        viceDeanManagementPage.SurnameBox.sendKeys(surname);
        ReusableMethods.bekle(1);


    }

    @And("vice dean enter2 {string} , {string} , {string}")
    public void viceDeanEnter2(String birthplace, String email, String phonenumber) {
        viceDeanManagementPage.BirthPlaceBox.sendKeys(birthplace);
        ReusableMethods.bekle(1);
        viceDeanManagementPage.EmailBox.sendKeys(email);
        ReusableMethods.bekle(1);
        viceDeanManagementPage.PhoneNumberBox.sendKeys(phonenumber);
        ReusableMethods.bekle(1);

    }

    @And("vice dean choose gender")
    public void viceDeanChooseGender() {
        viceDeanManagementPage.FemaleGenderBox.click();
        ReusableMethods.bekle(1);
    }

    @And("vice dean enter {string}, {string}, {string} and {string}")
    public void viceDeanEnterAnd(String dateofbirth, String ssn, String username, String password) {
        viceDeanManagementPage.BirthDayBox.sendKeys(dateofbirth);
        ReusableMethods.bekle(1);
        viceDeanManagementPage.SsnBox.sendKeys(ssn);
        ReusableMethods.bekle(1);
        viceDeanManagementPage.TeacherUserNameBox.sendKeys(username);
        ReusableMethods.bekle(1);
        viceDeanManagementPage.TeacherPasswordBox.sendKeys(password);
        ReusableMethods.bekle(1);
    }

    @And("vice dean click on the submitt button")
    public void viceDeanClickOnTheSubmittButton() {
        viceDeanManagementPage.TeacherListSubmitButton.click();
        ReusableMethods.bekle(1);
    }

    @Then("verify teacher saved successfully")
    public void verifyTeacherSavedSuccessfully() {

        viceDeanManagementPage.TeacherSavedSuccessfulElement.isDisplayed();
    }

    @Then("Menu'ye tikla")
    public void menuYeTikla() {
        viceDeanManagementPage.MenuButton.click();
        ReusableMethods.bekle(1);
    }

    @Then("Teacher liste tikla")
    public void teacherListeTikla() {
        viceDeanManagementPage.TeacherManagementButton.click();
        ReusableMethods.bekle(1);
    }
    @Then("{string},{string} bos birak")
    public void bosBirak(String name, String surname) {

        //viceDeanManagementPage.NameBox.click();
        ReusableMethods.click(viceDeanManagementPage.NameBox);
        ReusableMethods.bekle(1);
        //viceDeanManagementPage.SurnameBox.click();
        ReusableMethods.click(viceDeanManagementPage.SurnameBox);
        ReusableMethods.bekle(1);

    }

    @And("{string} , {string} , {string}, {string}, {string} and {string} bos birak")
    public void andBosBirak(String birthplace, String email, String phonenumber, String ssn, String username, String password) {

        viceDeanManagementPage.BirthPlaceBox.click();
        ReusableMethods.bekle(1);
        //viceDeanManagementPage.EmailBox.click();
        ReusableMethods.click(viceDeanManagementPage.EmailBox);
        ReusableMethods.bekle(1);
        viceDeanManagementPage.PhoneNumberBox.click();
        ReusableMethods.bekle(1);
        //viceDeanManagementPage.SsnBox.click();
        ReusableMethods.click(viceDeanManagementPage.SsnBox);
        ReusableMethods.bekle(1);
        viceDeanManagementPage.UserNameBox.click();
        ReusableMethods.bekle(1);
        viceDeanManagementPage.PasswordBox.click();
        ReusableMethods.bekle(1);

    }

    @And("vice dean click on the submitt button and scroll down the page")
    public void viceDeanClickOnTheSubmittButtonAndScrollDownThePage() {


        viceDeanManagementPage.TeacherListSubmitButton.click();
        ReusableMethods.bekle(1);
        actions.scrollByAmount(0,25).perform();
    }

    @Then("Required yazisinin ciktigini dogrula")
    public void requiredYazisininCiktiginiDogrula() {
        ReusableMethods.tumSayfaResmi("Add Teacher");





    }

    @Then("{string}, {string}, {string}, {string} , {string} , {string},{string}, {string}, {string} and {string} gir")
    public void andGir(String lesson, String name, String surname, String birthplace, String email, String phonenumber, String dateofbirth, String ssn, String username, String password) {
        ReusableMethods.click(viceDeanManagementPage.ChooseLessonsElement);
        actions.sendKeys(Keys.ARROW_DOWN, Keys.PAGE_DOWN, Keys.ENTER).perform();
        ReusableMethods.bekle(1);
        viceDeanManagementPage.NameBox.sendKeys(name);
        ReusableMethods.bekle(1);
        viceDeanManagementPage.SurnameBox.sendKeys(surname);
        ReusableMethods.bekle(1);
        viceDeanManagementPage.BirthPlaceBox.sendKeys(birthplace);
        ReusableMethods.bekle(1);
        viceDeanManagementPage.EmailBox.sendKeys(email);
        ReusableMethods.bekle(1);
        viceDeanManagementPage.PhoneNumberBox.sendKeys(phonenumber);
        ReusableMethods.bekle(1);
        viceDeanManagementPage.BirthDayBox.sendKeys(dateofbirth);
        ReusableMethods.bekle(1);
        viceDeanManagementPage.SsnBox.sendKeys(ssn);
        ReusableMethods.bekle(1);
        viceDeanManagementPage.TeacherUserNameBox.sendKeys(username);
        ReusableMethods.bekle(1);
        viceDeanManagementPage.TeacherPasswordBox.sendKeys(password);
        ReusableMethods.bekle(1);

    }
        @And("submit butonuna tikla")
        public void submitButonunaTikla() {

        viceDeanManagementPage.TeacherListSubmitButton.click();
        ReusableMethods.bekle(1);


    }

    @Then("Invalid Male Female yazisinin goruldugunu dogrula")
    public void invalidMaleFemaleYazisininGoruldugunuDogrula() {
        viceDeanManagementPage.InValidFemaleMale.isDisplayed();
    }

    @Then("EnterValidSSN yazisinin goruldugunu dgrula")
    public void entervalidssnYazisininGoruldugunuDgrula() {
        viceDeanManagementPage.InValidFemaleMale.isDisplayed();
    }

    @Then("EnterValidSSN yazisinin goruldugunu dogrula")
    public void entervalidssnYazisininGoruldugunuDogrula() {
        viceDeanManagementPage.EnterValidSSN.isDisplayed();
    }

    @Then("confirm cant be entered with seven character")
    public void confirmCantBeEnteredWithSevenCharacter() {
        actions.scrollByAmount(0,25).perform();
        ReusableMethods.bekle(1);
        ReusableMethods.tumSayfaResmi("Add Teacher List");

    }

    @Then("confirm cant be entered with password have no uppercase letter")
    public void confirmCantBeEnteredWithPasswordHaveNoUppercaseLetter() {
        actions.scrollByAmount(0,25).perform();
        ReusableMethods.bekle(1);
        ReusableMethods.tumSayfaResmi("Add Teacher List");
    }

    @Then("confirm cant be entered with password have no lowercase letter")
    public void confirmCantBeEnteredWithPasswordHaveNoLowercaseLetter() {
        actions.scrollByAmount(0,25).perform();
        ReusableMethods.bekle(1);
        ReusableMethods.tumSayfaResmi("Add Teacher List");

    }

    @Then("confirm cant be entered with password have no number")
    public void confirmCantBeEnteredWithPasswordHaveNoNumber() {
        actions.scrollByAmount(0,25).perform();
        ReusableMethods.bekle(1);
        ReusableMethods.tumSayfaResmi("Add Teacher List");


    }
}
