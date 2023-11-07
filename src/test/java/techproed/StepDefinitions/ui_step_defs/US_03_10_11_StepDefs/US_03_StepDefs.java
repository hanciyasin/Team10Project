package techproed.StepDefinitions.ui_step_defs.US_03_10_11_StepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.US_03_10_11.US_03_10_11;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class US_03_StepDefs {
    US_03_10_11 yasinPage = new US_03_10_11();
    Faker faker = new Faker();

    @Given("Kullanici Managementon Schools sayfasina gider")
    public void kullaniciManagementonSchoolsSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("manSchoolUrl"));
    }

    @Then("Kullanici contact butonuna tiklar")
    public void kullaniciContactButonunaTiklar() {
        yasinPage.contactButton.click();
    }

    @Then("Kullanici name bilgisi girer")
    public void kullaniciNameBilgisiGirer() {
        yasinPage.yourNameBox.sendKeys(faker.name().name());
    }

    @Then("Kullanici email bilgisi girer")
    public void kullaniciEmailBilgisiGirer() {
        yasinPage.emailBox.sendKeys(faker.internet().emailAddress());
    }

    @Then("Kullanici subject bilgisi girer")
    public void kullaniciSubjectBilgisiGirer() {
        yasinPage.subjectBox.sendKeys("Subject");
    }

    @Then("Kullanici message kutusuna mesajini girer")
    public void kullaniciKutusunaMesajiniGirer() {
        yasinPage.messageBox.sendKeys("My Message");
    }

    @Then("Kullanici send message butonuna tiklar")
    public void kullaniciSendMessageButonunaTiklar() {

        yasinPage.sendMessageButton.sendKeys(Keys.ENTER);
    }

    @Then("Kullanici name bilgisini bos birakir")
    public void kullaniciNameBilgisiniBosBirakir() {
    }

    @Then("Kullanici email bilgisini '@' karakteri eksik girer")
    public void kullaniciEmailBilgisiniEksikGirer() {
        yasinPage.emailBox.sendKeys("mailgmail.com");
    }

    @Then("Kullanici email bilgisini '.' karakteri eksik girer")
    public void kullaniciEmailBilgisiniKarakterEksikGirer() {
        yasinPage.emailBox.sendKeys("mail@gmailcom");
    }

    @Then("Kullanici subject bilgisini bos birakir")
    public void kullaniciSubjectBilgisiniBosBirakir() {

    }

    @Then("Kullanici message kutusunu bos birakir")
    public void kullaniciMessageKutusunuBosBirakir() {
    }

    @And("Required uyarisi alir")
    public void requiredUyarisiAlir() {
        Assert.assertTrue(yasinPage.requiredText.isDisplayed());
    }

    @And("'Please enter valid email' uyarisi alir")
    public void pleaseEnterValidEmailUyarisiAlir() {
        Assert.assertTrue(yasinPage.emailAlert.isDisplayed());
    }

    @And("'Contact Message Created Sucessfully' mesaji alir")
    public void contactMessageCreatedSucessfullyMesajiAlir() {
        Assert.assertTrue(yasinPage.successfulMessageAlert.isDisplayed());
    }

    @Then("Kullanici harf,rakam ve ozel karakter iciren bir mesaj birakir")
    public void kullaniciHarfRakamVeOzelKarakterIcirenBirMesajBirakir() {
        yasinPage.messageBox.sendKeys("My/Message@01");
    }
}