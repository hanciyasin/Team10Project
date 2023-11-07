package techproed.StepDefinitions.ui_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.FindBy;
import techproed.pages.US01_US02;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import static org.junit.Assert.assertTrue;

public class us02_TC06görüpsilebilmstepdefination {

    US01_US02 SUAT = new US01_US02();
    Faker faker = new Faker();
    @Given("kullanıcı Web sitesine gider")
    public void kullanıcıWebSitesineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("manSchoolUrl"));
    }


    @When("login ELEMENTİNE tiklar")
    public void loginELEMENTİNETiklar() {
        SUAT.anasayfaLogin.click();

        
    }

    @And("KAYITLI USERNAME GİRER")
    public void kayıtlıUSERNAMEGİRER() {
        SUAT.username.sendKeys(" AdminBatch171");
        SUAT.password.sendKeys("Batch171+");
        SUAT.loginButton.click();
        
    }

    @And("Kayıtlı password girer")
    public void kayıtlıPasswordGirer() {
        SUAT.password.sendKeys("Batch171+");

        
    }

    @And("login Butonuna tiklar")
    public void loginButonunaTiklar() {
        SUAT.loginButton.click();
        
    }

    @And("SAĞ ÜST KÖŞEDE MENÜ IKONUNA TIKLA")
    public void sağÜSTKÖŞEDEMENÜIKONUNATIKLA() {
        SUAT.menuButon.click();
        
    }

    @And("Açılan menüden guestuser butonuna tıkla")
    public void açılanMenüdenGuestuserButonunaTıkla() {
        SUAT.guestUserButon.click();
        
    }

    @And("LİSTEDE PAGE {int} e git")
    public void listedePAGEEGit(int arg0) {
        SUAT.PAGESSONSAYFAM_OKTUŞU.click();
        SUAT.SONDANGERİYEBİRERATLAMATUŞU.click();
        SUAT.SONDANGERİYEBİRERATLAMATUŞU.click();


    }

    @And("SUAT username e sahip kaydın oluştuğunu gör")
    public void maliUsernameESahipKaydınOluştuğunuGör() {
        assertTrue(SUAT.usernamesuatsatırı.isDisplayed());
    }


    @And("SUAT username sahip silme kutucuguna tıkla")
    public void maliUsernameSahipSilmeKutucugunaTıkla() {
        SUAT.SİLMEKUTUCUGU.click();

        
    }

    @And("Mali username ine sahip öğrenci kaydının silindiğini doğrula")
    public void maliUsernameIneSahipÖğrenciKaydınınSilindiğiniDoğrula() {
        SUAT.SİLMEKUTUCUGU.click();
        
    }

    @And("delete succesfull yazısının göründüğünü doğrula")
    public void deleteSuccesfullYazısınınGöründüğünüDoğrula() {
        
    }

    @And("SAYFAYI KAPAT")
    public void sayfayıKAPAT() {
    Driver.closeDriver();

    }
}
