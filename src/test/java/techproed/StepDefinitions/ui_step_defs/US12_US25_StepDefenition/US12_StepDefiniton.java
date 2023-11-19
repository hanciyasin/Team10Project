package techproed.StepDefinitions.ui_step_defs.US12_US25_StepDefenition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import techproed.pages.US12_25.US12_25;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class US12_StepDefiniton {
    @Given("Kullanici {string} gider")
    public void kullaniciGider(String url) {
        Driver.getDriver().get(url);
    }

    @When("Vice Dean hesabıyla login olur")
    public void viceDeanHesabıylaLoginOlur() {
        US12_25.loginAnaSayfa.click();
        ReusableMethods.bekle(2);
        US12_25.userName.sendKeys("Iskaya33");
        US12_25.password.sendKeys("Akaya0133");
        US12_25.loginButton.click();
        ReusableMethods.bekle(1);
    }

    @When("Kullanici Lesson Program secenegini  tiklar")
    public void kullaniciLessonProgramSeceneginiTiklar() {
        US12_25.lessonProgram.click();
        ReusableMethods.bekle(1);
    }

    @Then("Kullanici Choose Education Term menusunu tiklar ve donem  secer")
    public void kullaniciChooseEducationTermMenusunuTiklarVeDonemSecer() {
        US12_25.educationTermId.sendKeys("c", Keys.ENTER);
    ReusableMethods.bekle(1);
    }

    @Then("Kullanici Choose Day menusunu tiklar ve gun secer")
    public void kullaniciChooseDayMenusunuTiklarVeGunSecer() {
        US12_25.chooseDay.sendKeys("m", Keys.ENTER);
        ReusableMethods.bekle(1);
    }

    @Then("Kullanici Start Time menusunu tiklar ve gecerli bir saat girer")
    public void kullaniciStartTimeMenusunuTiklarVeGecerliBirSaatGirer() {
        US12_25.startTime.sendKeys("0090");
        ReusableMethods.bekle(1);
    }

    @Then("Kullanici Stop Time menusunu tiklar ve gecerli bir saat girer ve submit eder")
    public void kullaniciStopTimeMenusunuTiklarVeGecerliBirSaatGirerVeSubmitEder() {
        US12_25.stopTime.sendKeys("0013");
        ReusableMethods.bekle(1);
    }

    @And("Kullanici Choose Lessons bölümüne oluşturulan dersin geldiği dogrular")
    public void kullaniciChooseLessonsBolumuneOlusturulanDersinGeldigiDogrular() {

    }

    @When("Kullanici Choose Lessons bölümünden oluşturdugu dersi tiklar")
    public void kullaniciChooseLessonsBolumundenOlusturduguDersiTiklar() {
        US12_25.oluşturulanDersinKutucuğu.click();
        ReusableMethods.bekle(1);
    }

    @Then("Kullanici Choose Teacher menusunu tiklar")
    public void kullaniciChooseTeacherMenusunuTiklar() {
        US12_25.chooseTeacherDDM.sendKeys("s",Keys.ENTER);
        ReusableMethods.bekle(1);
    }

    @And("Kullanici ders için öğretmen seçilebilirligini dogrular")
    public void kullaniciDersIcinOgretmenSecilebilirliginiDogrular() {

    }

    @Then("Kullanici acilan menuden ogretmen secer ve submit eder")
    public void kullaniciAcilanMenudenOgretmenSecerVeSubmitEder() {
        US12_25.lessonProgramListSubmitButton.click();
    }

    @And("Kullanici Lessons Added to Teacher uyari yazisinin gorundugunu dogrular")
    public void kullaniciLessonsAddedToTeacherUyariYazisininGorundugunuDogrular() {
US12_25.lessonAddedToTeacherUyarısı.isDisplayed();
    }


}
