package techproed.StepDefinitions.ui_step_defs.US07_US24_StepDefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import techproed.pages.US07_US24;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class US07_StepDefinition {
    US07_US24 irem = new US07_US24();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    String NameBox;
    String SurnameBox;
    Select select;

    @Given("kullanici management sayfasine gider")
    public void kullaniciManagementSayfasineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("manSchoolUrl"));
        throw new io.cucumber.java.PendingException();
    }

    @Then("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int arg0) {
        ReusableMethods.bekle(3);
    }

    @Then("kullanici login elementine tiklar")
    public void kullaniciLoginElementineTiklar() {
        irem.iremLoginElement.click();
        ReusableMethods.bekle(2);
    }

    @Then("kullanici User Name alanina {string} password alanina {string}")
    public void kullaniciUserNameAlaninaPasswordAlanina(String arg0, String arg1) {
        irem.iremUsername.sendKeys("dean");
        ReusableMethods.bekle(2);
        irem.iremPassword.sendKeys("123456Aa");
        ReusableMethods.bekle(2);
    }


    @Then("login butonuna tiklar")
    public void loginButonunaTiklar() {
        irem.iremLoginButton.click();
    }

    @Given("dean {string} elementine tiklar.")
    public void deanElementineTiklar(String arg0) {
        irem.iremDeanMenuElement.click();
        ReusableMethods.bekle(2);
        irem.iremContactGetAllElementCss.click();
        ReusableMethods.bekle(2);

    }

    @Then("Message bilgisi gorunur")
    public void messageBilgisiGorunur() {
        Assert.assertTrue(irem.deanMessageBilgisi.isDisplayed());
    }

    @Then("Name bilgisi gorunur")
    public void nameBilgisiGorunur() {
        Assert.assertTrue(irem.deanNameBilgisi.isDisplayed());
    }

    @Then("e-mail bilgisi gorunur")
    public void eMailBilgisiGorunur() {
        Assert.assertTrue(irem.deanEmailBilgisi.isDisplayed());
    }

    @Then("Date bilgisi gorunur")
    public void dateBilgisiGorunur() {
        Assert.assertTrue(irem.deanDateBilgisi.isDisplayed());
    }

    @Then("Subject bilgisi gorunur")
    public void subjectBilgisiGorunur() {
        Assert.assertTrue(irem.deanSubjectBilgisi.isDisplayed());
    }



}
