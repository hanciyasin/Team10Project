package techproed.StepDefinitions.ui_step_defs.US17_US18_US19_US20_StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import techproed.pages.US17_US18_US19_US20;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class US17StepDef {

    US17_US18_US19_US20 glcnPage = new US17_US18_US19_US20();
    Actions actions = new Actions(Driver.getDriver());



    @Given("Teacher managementonschool sayfasina gider")
    public void teacherManagementonschoolSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("manSchoolUrl"));
    }

    @Then("Login butonuna tiklar")
    public void loginButonunaTiklar() {
        glcnPage.glcnLoginButton.click();

    }

    @And("Teacher olarak kayitli kullanici adini girer")
    public void teacherOlarakKayitliKullaniciAdiniGirer() {
        glcnPage.glcnUserName.sendKeys(ConfigReader.getProperty("glcnTeacherName"));
    }

    @And("Teacher kullanicisi adina kayitli sifreyi girer")
    public void teacherKullanicisiAdinaKayitliSifreyiGirer() {
        glcnPage.glcnPassword.sendKeys(ConfigReader.getProperty("glcnTeacherSifre"));
    }

    @And("Password altindaki Login butonuna tiklar")
    public void passwordAltindakiLoginButonunaTiklar() {
        glcnPage.glcnLogin.click();
    }

    @And("Teacher {int} saniye bekler")
    public void teacherSaniyeBekler(int saniye) {

        ReusableMethods.bekle(saniye);
    }

    @And("Choose Lesson ddm den bir ders secer")
    public void chooseLessonDdmDenBirDersSecer() {
        actions.sendKeys(Keys.TAB);
        ReusableMethods.ddmIndex(glcnPage.glcnChooseLesson,1);

    }

    @And("Choose Student ddm den bir ögrenci secer")
    public void chooseStudentDdmDenBirÖgrenciSecer() {
        actions.sendKeys(Keys.TAB);
        ReusableMethods.ddmIndex(glcnPage.glcnChooseStudent,1);

    }

    @And("Choose Education ddm den bir dönem secer")
    public void chooseEducationDdmDenBirDönemSecer() {
        actions.sendKeys(Keys.TAB);
        ReusableMethods.ddmIndex(glcnPage.glcnChooseEducationTerm,1);
    }

    @And("Sayfa kapatilir")
    public void sayfaKapatilir() {
        Driver.closeDriver();
    }


    @Then("Teacher absentee alanina {int} sayini girer")
    public void teacherAbsenteeAlaninaSayiniGirer(Integer absentee) {
        String devamsızlık = String.valueOf(absentee);
        glcnPage.glcnAbsentee.click();
        ReusableMethods.bekle(1);
        glcnPage.glcnAbsentee.sendKeys(devamsızlık);
    }

    @And("Teacher Midterm Exam alanina {int} sayisini girer")
    public void teacherMidtermExamAlaninaSayisiniGirer(int midExam) {
        String vizeNotu = String.valueOf(midExam);
        glcnPage.glcnMidExam.click();
        ReusableMethods.bekle(1);
        glcnPage.glcnMidExam.sendKeys(vizeNotu);

    }

    @And("Teacher Final Exam alanina {int} sayisini girer")
    public void teacherFinalExamAlaninaSayisiniGirer(int fnlExam) {
        String finalNotu = String.valueOf(fnlExam);
        glcnPage.glcnFinalExam.click();
        ReusableMethods.bekle(1);
        glcnPage.glcnFinalExam.sendKeys(finalNotu);
    }


    @And("Teacher Info Note alanina {string} notunu yazar")
    public void teacherInfoNoteAlaninaNotunuYazar(String infoNote) {
        glcnPage.glcnInfoNote.click();
        glcnPage.glcnInfoNote.sendKeys(infoNote);
    }


    @And("Teacher submit butonuna tiklar")
    public void teacherSubmitButonunaTiklar() {
        glcnPage.glcnSubmit.click();
    }

    @And("Teacher notları kaydettiğini görür")
    public void teacherStudentInfoSavedSuccessfullyMesajiniAlir() {





    }

    @And("Teacher {string} mesajini gorur")
    public void teacherGörür(String savedMesaji) {
        Assert.assertTrue(glcnPage.glcnSavedAlert.getText().contains(savedMesaji));
        ReusableMethods.bekle(3);

        ReusableMethods.scrollDownJs();
        ReusableMethods.bekle(3);

        ReusableMethods.clickElementByJS(glcnPage.glcnDeleteButton);
        ReusableMethods.bekle(3);

    }

   @And("Teacher {string} mesajini alir")
   public void teacherMesajiniAlir(String buyukOlmaliMesaji) {
       Assert.assertTrue(glcnPage.glcnSavedAlert.getText().contains(buyukOlmaliMesaji));
       ReusableMethods.bekle(3);
   }

}
