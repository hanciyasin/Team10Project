package techproed.StepDefinitions.ui_step_defs.US_03_10_11_StepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.US_03_10_11.US_03_10_11;
import techproed.utilities.ConfigReader;

public class US_10_11_StepDefs {
    US_03_10_11 lessonPage = new US_03_10_11();
    Faker faker = new Faker();


    @Then("Kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        lessonPage.loginButton.click();
    }

    @Then("Kullanici propertiesten username olarak {string} bilgisini girer")
    public void kullaniciPropertiestenUsernameOlarakBilgisiniGirer(String username) {
        lessonPage.usernameBox.sendKeys(ConfigReader.getProperty(username));
    }

    @Then("Kullanici propertiesten password olarak {string} bilgisini girer")
    public void kullaniciPropertiestenPasswordOlarakBilgisiniGirer(String password) {
        lessonPage.passwordBox.sendKeys(ConfigReader.getProperty(password));
    }

    @Then("Kullanici inLogin butonuna tiklar")
    public void kullaniciInLoginButonunaTiklar() {
        lessonPage.inLoginButton.click();
    }

    @Then("Kullanici Menu butonuna tiklar")
    public void kullaniciMenuButonunaTiklar() {
        lessonPage.menuButton.click();
    }

    @Then("Kullanici acilan Main Menu'den Lesson Managament butonuna tiklar")
    public void kullaniciAcilanMainMenuDenLessonManagamentButonunaTiklar() {
        lessonPage.lessonManagementButton.click();
    }

    @Then("Kullanici acilan sayfada Lesson Program sekmesine tiklar")
    public void kullaniciAcilanSayfadaLessonProgramSekmesineTiklar() {
        lessonPage.lessonProgramTab.click();
    }

    @Then("Kullanici Choose Lesson kismindan ders secer")
    public void kullaniciChooseLessonKismindanDersSecer() {
        lessonPage.chooseLesson.sendKeys("Aşk ile Java",Keys.ENTER);
    }

    @Then("Kullanici Choose Day kismindan gun secer")
    public void kullaniciChooseDayKismindanGunSecer() {
        lessonPage.chooseDay.sendKeys("MONDAY", Keys.ENTER);
    }

    @Then("Kullanici Choose Education Term kismindan donem secer")
    public void kullaniciChooseEducationTermKismindanDonemSecer() {
        lessonPage.chooseEducationTerm.sendKeys("FALL_SEMESTER", Keys.ENTER);
    }

    @Then("Kullanici Start Time kismindan baslangic zamanini secer")
    public void kullaniciStartTimeKismindanBaslangicZamaniniSecer() {
        lessonPage.chooseStartTime.sendKeys("1515");
    }

    @Then("Kullanici Stop Time kismindan bitis zamanini secer")
    public void kullaniciStopTimeKismindanBitisZamaniniSecer() {
        lessonPage.chooseStopTime.sendKeys("1615");
    }

    @Then("Kullanici Submit butonuna tiklar")
    public void kullaniciSubmitButonunaTiklar() {
        lessonPage.submitButton.click();
    }

    @And("Kullanici 'Created Lesson Program' mesajini alir")
    public void kullaniciCreatedLessonProgramSuccessfulMesajiniAlir() {
        Assert.assertTrue(lessonPage.lessonProgramSuccessful.isDisplayed());
    }

    @Then("Kullanicinin ders secebildigi kontrol edilir")
    public void kullanicininDersSecebildigiKontrolEdilir() {
        Assert.assertTrue(lessonPage.chooseLesson.isEnabled());
    }

    @Then("Kullanicinin donem secebildigi kontrol edilir")
    public void kullanicininDonemSecebildigiKontrolEdilir() {
        Assert.assertTrue(lessonPage.chooseEducationTerm.isEnabled());
    }

    @Then("Kullanicinin gun secebildigi kontrol edilir")
    public void kullanicininGunSecebildigiKontrolEdilir() {
        Assert.assertTrue(lessonPage.chooseDay.isEnabled());
    }

    @Then("Kullanicinin baslangic zamanini secebildigi kontrol edilir")
    public void kullanicininBaslangicZamaniniSecebildigiKontrolEdilir() {
        Assert.assertTrue(lessonPage.chooseStartTime.isEnabled());
    }

    @Then("Kullanicinin bitis zamanini secebildigi kontrol edilir")
    public void kullanicininBitisZamaniniSecebildigiKontrolEdilir() {
        Assert.assertTrue(lessonPage.chooseStopTime.isEnabled());
    }


    @And("Kullanici Logout yapar")
    public void kullaniciLogoutYapar() {
        lessonPage.menuButton.click();
        lessonPage.logoutButton.click();
        lessonPage.logoutYesButton.click();
    }

    //US-11

    @Given("Kullanicinin Lesson Program List gorebildigi kontrol edilir")
    public void kullanicininLessonProgramListGorebildigiKontrolEdilir() {
        Assert.assertTrue(lessonPage.lessonProgramList.isDisplayed());
    }

    @Given("Kullanicinin Lesson Program Listte Lesson bilgisini gorebildigi dogrulanir")
    public void kullanicininLessonProgramListteLessonBilgisiniGorebildigiDogrulanir() {
        Assert.assertTrue(lessonPage.lessonList.isDisplayed());
    }

    @Given("Kullanicinin Lesson Program Listte Day bilgisini gorebildigi dogrulanir")
    public void kullanicininLessonProgramListteDayBilgisiniGorebildigiDogrulanir() {
        Assert.assertTrue(lessonPage.dayList.isDisplayed());
    }

    @Given("Kullanicinin Lesson Program Listte Start Time bilgisini gorebildigi dogrulanir")
    public void kullanicininLessonProgramListteStartTimeBilgisiniGorebildigiDogrulanir() {
        Assert.assertTrue(lessonPage.startTimeList.isDisplayed());

    }

    @And("Kullanicinin Lesson Program Listte Stop Time bilgisini gorebildigi dogrulanir")
    public void kullanicininLessonProgramListteStopTimeBilgisiniGorebildigiDogrulanir() {
        Assert.assertTrue(lessonPage.stopTimeList.isDisplayed());
    }

}
