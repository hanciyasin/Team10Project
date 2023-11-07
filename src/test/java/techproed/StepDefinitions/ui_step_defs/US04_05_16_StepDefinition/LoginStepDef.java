package techproed.StepDefinitions.ui_step_defs.US04_05_16_StepDefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import techproed.pages.US04_05_16.AdminManagementPage;
import techproed.pages.US04_05_16.SchoolHomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;
import static org.junit.Assert.assertTrue;
import static techproed.utilities.ReusableMethods.*;


public class LoginStepDef {

    AdminManagementPage adminManagementPage = new AdminManagementPage();
    SchoolHomePage schoolHomePage = new SchoolHomePage();
    Faker faker = new Faker();

    @Given("admin management school sayfasina gider")
    public void adminManagementSchoolSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("manSchoolUrl"));
    }

    @Then("Homepage login butonuna tiklar")
    public void homepageLoginButonunaTiklar() {
        schoolHomePage.loginButtonDd.click();
    }

    @And("Admin scenarioOutline ile propertiesden {string} ve {string} bilgilerini girer")
    public void adminScenarioOutlineIlePropertiesdenVeBilgileriniGirer(String username, String password) {
        schoolHomePage.userNameDd.sendKeys (ConfigReader.getProperty(username),Keys.TAB,ConfigReader.getProperty(password),Keys.TAB,Keys.ENTER);
    }

    @But("Admin {int} saniye bekler")
    public void adminSaniyeBekler(int saniye) {
        ReusableMethods.bekle(saniye);
    }

    @And("Menu elementine tiklanir")
    public void menuElementineTiklanir() {
        adminManagementPage.adminMenuButtonDd.click();
    }

    @And("Main menuden Dean Manegement secilir")
    public void mainMenudenDeanManegementSecilir() {
        adminManagementPage.mainMenuDeanManagementDd.click();
    }

    @And("Add Dean bolumunden Name bilgisi girer")
    public void addDeanBolumundenNameBilgisiGirer() {
        adminManagementPage.addDeanNameDd.sendKeys(faker.lorem().word());
    }

    @And("Add Dean bolumunden Surname bilgisi girer")
    public void addDeanBolumundenSurnameBilgisiGirer() {
        adminManagementPage.addDeanSurnameDd.sendKeys(faker.lorem().word());
    }

    @And("Add Dean bolumunden Birthplace bilgisi girer")
    public void addDeanBolumundenBirthplaceBilgisiGirer() {
        adminManagementPage.addDeanBirthPlaceDd.sendKeys(faker.lorem().word());
    }

    @And("Add Dean bolumunden Gender secer")
    public void addDeanBolumundenGenderSecer() {
        adminManagementPage.addDeanFemaleGenderDd.click();
    }

    @And("Add Dean bolumunden DateOfBirth bilgisi girer")
    public void addDeanBolumundenDateOfBirthBilgisiGirer() {
        adminManagementPage.addDeanDateOfBirthDd.sendKeys("0"+oneDigitNumber()+"0"+oneDigitNumber()+"1999");
    }

    @And("Add Dean bolumunden Phone bilgisi girer")
    public void addDeanBolumundenPhoneBilgisiGirer() {
      adminManagementPage.addDeanPhoneDd.sendKeys(threeDigitNumber() + "-" + threeDigitNumber() + "-" + fourDigitNumber());
    }

    @And("Add Dean bolumunden SSN bilgisi girer")
    public void addDeanBolumundenSSNBilgisiGirer() {
        adminManagementPage.addDeanSSNDd.sendKeys(threeDigitNumber() + "-" + twoDigitNumber() + "-" + fourDigitNumber());
    }

    @And("Add Dean bolumunden userName bilgisi girer")
    public void addDeanBolumundenUserNameBilgisiGirer() {
        adminManagementPage.addDeanUserNameDd.sendKeys(faker.lorem().word()+"dilek");
    }

    @And("Add Dean bolumunden deanPassword bilgisi girer")
    public void addDeanBolumundenDeanPasswordBilgisiGirer() {
        adminManagementPage.addDeanUserPasswordDd.sendKeys("Dilek143");
    }

    @And("Submit butonuna tiklar")
    public void submitButonunaTiklar() {
      adminManagementPage.addDeanSubmitButtonDd.click();
    }

    @And("sonuc mesaji gorunur")
    public void sonucMesajiGorunur() {
        ReusableMethods.bekle(2);
        assertTrue(adminManagementPage.alertMessageDd.isDisplayed());
    }

    @And("sayfa kapatilir")
    public void sayfaKapatilir() {
        Driver.closeDriver();
    }


       /*
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(2);
        ReusableMethods.scrollUpJs();
        ReusableMethods.bekle(2);
        adminManagementPage.sonSayfOkTusuDd.click();
        ReusableMethods.bekle(2);
        ReusableMethods.scrollUpJs();

        (//tbody/tr/td)[31]  -> sonSayfOkTusuDd
        (//*[@class='page-item'])[4] -> listSonSatirDd
        assertTrue(adminManagementPage.listSonSatirDd.getText().contains("imagine dragons"));
        */



}

