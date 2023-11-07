package techproed.StepDefinitions.ui_step_defs.US04_05_16_StepDefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import techproed.pages.US04_05_16.AdminManagementPage;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;
import static techproed.utilities.ReusableMethods.*;

public class DeanBilgileriStepDef {

    AdminManagementPage adminManagementPage = new AdminManagementPage();
    Faker faker = new Faker();

    @And("sayfada scrol yapilir")
    public void sayfadaScrolYapilir() {
        ReusableMethods.scrollDownJs();
    }

    @Then("name bilgisi gorunur")
    public void nameBilgisiGorunur() {
        assertTrue(adminManagementPage.deanListNameDd.isDisplayed());
    }

    @Then("gender bilgisi gorunur")
    public void genderBilgisiGorunur() {
        assertTrue(adminManagementPage.deanListGenderDd.isDisplayed());
    }

    @Then("phone bilgisi gorunur")
    public void phoneBilgisiGorunur() {
        assertTrue(adminManagementPage.deanListPhoneNumberDd.isDisplayed());
    }

    @Then("ssn bilgisi gorunur")
    public void ssnBilgisiGorunur() {
        assertTrue(adminManagementPage.deanListSSNDd.isDisplayed());
    }

    @Then("username bilgisi gorunur")
    public void usernameBilgisiGorunur() {
        assertTrue(adminManagementPage.deanListUsernameDd.isDisplayed());
    }

    @Then("Add Dean edit butonuna tiklar")
    public void addDeanEditButonunaTiklar() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        adminManagementPage.deanListEditButtonDd.click();
    }

    @And("name bilgisini gunceller")
    public void nameBilgisiniGunceller() {
        ReusableMethods.bekle(2);
        ReusableMethods.click(adminManagementPage.deanListNameEditButtonDd);
        ReusableMethods.clearJS(adminManagementPage.deanListNameEditButtonDd);
        adminManagementPage.deanListNameEditButtonDd.sendKeys(faker.lorem().word());
    }

    @And("surname bilgisini gunceller")
    public void surnameBilgisiniGunceller() {
        ReusableMethods.bekle(2);
        ReusableMethods.click(adminManagementPage.deanListSurnameEditButtonDd);
        ReusableMethods.clearJS(adminManagementPage.deanListSurnameEditButtonDd);
        adminManagementPage.deanListSurnameEditButtonDd.sendKeys(faker.lorem().word());
    }

    @And("birthplace bilgisini gunceller")
    public void birthplaceBilgisiniGunceller() {
        ReusableMethods.bekle(2);
        ReusableMethods.click(adminManagementPage.deanListBirthPlaceEditButtonDd);
        ReusableMethods.clearJS(adminManagementPage.deanListBirthPlaceEditButtonDd);
        adminManagementPage.deanListBirthPlaceEditButtonDd.sendKeys(faker.lorem().word());
    }

    @And("gender bilgisini gunceller")
    public void genderBilgisiniGunceller() {
        ReusableMethods.bekle(2);
        adminManagementPage.deanListGenderEditButtonDd.click();
    }

    @And("dateOfBirth bilgisini gunceller")
    public void dateofbirthBilgisiniGunceller() {
        ReusableMethods.bekle(2);
        ReusableMethods.click(adminManagementPage.deanListDateOfBirthEditButtonDd);
        ReusableMethods.clearJS(adminManagementPage.deanListDateOfBirthEditButtonDd);
        adminManagementPage.deanListDateOfBirthEditButtonDd.sendKeys("0" + oneDigitNumber() + "0" + oneDigitNumber() + "1999");
    }

    @And("phone bilgisini gunceller")
    public void phoneBilgisiniGunceller() {
        ReusableMethods.bekle(2);
        ReusableMethods.click(adminManagementPage.deanListPhoneEditButtonDd);
        ReusableMethods.clearJS(adminManagementPage.deanListPhoneEditButtonDd);
        adminManagementPage.deanListPhoneEditButtonDd.sendKeys(threeDigitNumber() + "-" + threeDigitNumber() + "-" + fourDigitNumber());
    }

    @And("ssn bilgisini gunceller")
    public void ssnBilgisiniGunceller() {
        ReusableMethods.bekle(2);
        ReusableMethods.click(adminManagementPage.deanListSSNEditButtonDd);
        ReusableMethods.clearJS(adminManagementPage.deanListSSNEditButtonDd);
        adminManagementPage.deanListSSNEditButtonDd.sendKeys(threeDigitNumber() + "-" + twoDigitNumber() + "-" + fourDigitNumber());
    }

    @And("username bilgisini gunceller")
    public void usernameBilgisiniGunceller() {
        ReusableMethods.bekle(2);
        ReusableMethods.click(adminManagementPage.deanListUserNameEditButtonDd);
        ReusableMethods.clearJS(adminManagementPage.deanListUserNameEditButtonDd);
        adminManagementPage.deanListUserNameEditButtonDd.sendKeys(generateUserName(4, 17));
    }

    @And("password bilgisini gunceller")
    public void passwordBilgisiniGunceller() {
        ReusableMethods.bekle(2);
        ReusableMethods.click(adminManagementPage.deanListPassEditButtonDd);
        adminManagementPage.deanListPassEditButtonDd.sendKeys("Semih143");
    }

    @And("Edit submit butonuna tiklar")
    public void editSubmitButonunaTiklar() {
        adminManagementPage.deanListEditSubmitButtonDd.click();
    }

    @And("son sayfaya gider")
    public void sonSayfayaGider() {
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(2);
        ReusableMethods.scrollUpJs();
        ReusableMethods.bekle(2);
        adminManagementPage.sonSayfOkTusuDd.click();
        ReusableMethods.bekle(2);
        ReusableMethods.scrollUpJs();



    }
}
