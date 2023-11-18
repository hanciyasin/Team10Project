package techproed.StepDefinitions.ui_step_defs.US07_US24_StepDefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import techproed.pages.US07_US24.US07_US24;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US24_StepDefinition {
    US07_US24 irem = new US07_US24();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    String NameBox;
    String SurnameBox;
    Select select;

    @Given("Kullanici anasayfaya gider")
    public void kullaniciAnasayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("manSchoolUrl"));
    }

    @When("Kullanici Login tiklar")
    public void kullaniciLoginTiklar() {
        irem.iremLoginElement.click();
    }

    @And("Kullanici User Name bilgisi girer")
    public void kullaniciUserNameBilgisiGirer() {
        irem.iremUsername.sendKeys("irem");
    }

    @And("Kullanici Passsword bilgisi girer")
    public void kullaniciPassswordBilgisiGirer() {
        irem.iremPassword.sendKeys("564Irem.");
    }

    @And("Kullanici Login buttonuna tiklar")
    public void kullaniciLoginButtonunaTiklar() {
        irem.iremLoginButton.click();
    }


    @Given("admin clicks on Teacher Management Option")
    public void adminClicksOnTeacherManagementOption() {
        irem.iremAdminMenuElement.click();
        ReusableMethods.bekle(2);
        irem.iremTeacherManagement.click();
        ReusableMethods.bekle(1);

    }


    @When("admin enter {string}")
    public void adminEnter() {
        ReusableMethods.click(irem.iremAddTeacherChooseLesson);
        actions.sendKeys(Keys.ARROW_DOWN,Keys.PAGE_DOWN,Keys.ENTER).perform();
    }

    @And("admin enter {string},{string}")
    public void adminEnter( String name,String surname) {
        irem.iremAddTeacherName.sendKeys(name);
        ReusableMethods.waitFor(3);
        irem.iremAddTeacherSurname.sendKeys(surname);
        ReusableMethods.waitFor(3);
    }

    @And("admin enter {string} , {string} , {string}")
    public void adminEnter(String birthplace, String email, String phonenumber) {
    irem.iremAddTeacherBirthPlace.sendKeys(birthplace);
    ReusableMethods.waitFor(3);
    irem.iremAddTeacherEmail.sendKeys(email);
    ReusableMethods.waitFor(3);
    irem.iremAddTeacherPhoneNumber.sendKeys(phonenumber);
    ReusableMethods.waitFor(3);
    }

    @And("admin choose gender")
    public void adminChooseGender() {
        irem.iremAddTeacherMale.click();
        ReusableMethods.waitFor(3);
    }

    @And("admin enter {string}, {string}, {string} and {string}")
    public void adminEnterAnd(String dateofbirth, String ssn, String username, String password) {
        irem.iremAddTeacherDateOfBirth.sendKeys(dateofbirth);
        ReusableMethods.waitFor(3);
        irem.iremAddTeacherSsn.sendKeys(ssn);
        ReusableMethods.waitFor(3);
        irem.iremAddTeacherUserName.sendKeys(username);
        ReusableMethods.waitFor(3);
        irem.iremAddTeacherPassword.sendKeys(password);
        ReusableMethods.waitFor(3);

    }

    @And("admin click on the submitt button")
    public void adminClickOnTheSubmittButton() {
        irem.iremAddTeacherSubmitButton.click();
        ReusableMethods.waitFor(3);
    }

    @Then("verify Teacher saved successfully")
    public void verifyTeacherSavedSuccessfully() {
        irem.iremTeacherSavedSuccessfulElement.isDisplayed();
        ReusableMethods.waitFor(3);
    }




    @Then("Login butonuna tiklar.")
    public void loginButonunaTiklar() {
        irem.iremLoginButton.click();
    }

    @Given("Kullanici {string} sayfasina gider.")
    public void kullaniciSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("manSchoolUrl"));
        ReusableMethods.waitFor(3);
        irem.iremLoginElement.click();
        ReusableMethods.waitFor(3);
    }

    @Then("teacher icin olusturulan {string} bilgisi girer.")
    public void teacherIcinOlusturulanBilgisiGirer() {
        irem.iremUsername.sendKeys("Samwise");
        ReusableMethods.waitFor(3);
        irem.iremPassword.sendKeys("123456Sg");
        ReusableMethods.waitFor(3);
    }





}



