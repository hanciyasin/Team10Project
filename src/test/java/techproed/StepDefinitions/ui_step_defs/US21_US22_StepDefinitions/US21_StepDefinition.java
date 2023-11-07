package techproed.StepDefinitions.ui_step_defs.US21_US22_StepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import techproed.pages.US21_US22.US21;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class US21_StepDefinition {

    US21 locatePage = new US21();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    SoftAssert softAssert = new SoftAssert();

    @And("User name kismina kayitli ogrenci kullanici adini girer")
    public void userNameKisminaKayitliOgrenciKullaniciAdiniGirer() {
        locatePage.loginUserName.sendKeys(ConfigReader.getProperty("ogrenciAccountKM"));
    }

    @And("Password kismina kayitli ogrenci passwordunu girer")
    public void passwordKisminaKayitliOgrenciPasswordunuGirer() {

        locatePage.loginPassword.sendKeys(ConfigReader.getProperty("ogrenciPasswordKM"));
    }

    @And("kullanici acilan Main Menu altindaki Choose Lessona tiklar")
    public void kullaniciAcilanMainMenuAltindakiChooseLessonaTiklar() {
        locatePage.menuInsideChooseLesson.click();
        ReusableMethods.bekle(2);
    }

    @And("kullanici Choose Lesson listesinde bulunan Teacher, Day, Start Time ve Stop Time bilgilerinin gorunurlugunu dogrular")
    public void kullaniciChooseLessonListesindeBulunanTeacherDayStartTimeVeStopTimeBilgilerininGorunurlugunuDogrular() {
        softAssert.assertTrue(locatePage.teacherVisible.isDisplayed());
        softAssert.assertTrue(locatePage.dayVisible.isDisplayed());
        softAssert.assertTrue(locatePage.startTimeVisible.isDisplayed());
        softAssert.assertTrue(locatePage.stopTimeVisible.isDisplayed());
        softAssert.assertAll();
    }

    @And("kullanici Choose Lesson listesinden kutucuga tiklayarak ders secer")
    public void kullaniciChooseLessonListesindenKutucugaTiklayarakDersSecer() {
        locatePage.lesson2TC02.click();
    }

    @And("kullanici sayfayi submit butonuna kadar kaydirir")
    public void kullaniciSayfayiSubmitButonunaKadarKaydirir() {
        ReusableMethods.scroll(locatePage.chooseLessonSubmitButton);
        ReusableMethods.bekle(1);
    }

    @And("kullanici Submit buttonuna tiklar")
    public void kullaniciSubmitButtonunaTiklar() {
        ReusableMethods.click(locatePage.chooseLessonSubmitButton);
    }


    @And("kullanici Lesson added to Student bildiriminin gozuktugunu dogrular")
    public void kullaniciLessonAddedToStudentBildirimininGozuktugunuDogrular() {
        ReusableMethods.bekle(1);
        softAssert.assertTrue(locatePage.lessonAddedToStudentNotification.isDisplayed());
        softAssert.assertAll();
        ReusableMethods.bekle(1);
    }

    @And("kullanici Choose Lesson listesinde; Choose Lesson kısmından kutucuklara tıklayarak aynı gün ve aynı saatte olan derslerden {int} ders seçimi yapar")
    public void kullaniciChooseLessonListesindeChooseLessonKısmındanKutucuklaraTıklayarakAynıGünVeAynıSaatteOlanDerslerdenDersSeçimiYapar(int arg0) {
        ReusableMethods.scroll(locatePage.sameCoding1);
        ReusableMethods.click(locatePage.sameCoding1);
        ReusableMethods.click(locatePage.sameCoding2);
        ReusableMethods.bekle(2);

    }

    @And("kullanici Error: Course schedule cannot be selected for the same hour and day bildiriminin gozuktugunu dogrular")
    public void kullaniciErrorCourseScheduleCannotBeSelectedForTheSameHourAndDayBildirimininGozuktugunuDogrular() {
        ReusableMethods.bekle(1);
        softAssert.assertTrue(locatePage.cannotsameHourDayNotification.isDisplayed());
    }

    @And("kullanici sayfayi onceden sectigi derse kaydirir")
    public void kullaniciSayfayiOncedenSectigiDerseKaydirir() {
        ReusableMethods.scroll(locatePage.sayfayiSectigiDerseKaydir);
        ReusableMethods.bekle(2);
    }

    @And("kullanici onceden sectigi {string} dersin gozuktugunu dogrular")
    public void kullaniciOncedenSectigiDersinGozuktugunuDogrular(String arg0) {
        softAssert.assertTrue(locatePage.secilenDersiGorebilmeli.isDisplayed());
        softAssert.assertAll();
        ReusableMethods.bekle(2);
    }

    @And("kullanici acilan Main Menu altindaki Grades and Announcements tiklar")
    public void kullaniciAcilanMainMenuAltindakiGradesAndAnnouncementsTiklar() {
        locatePage.gradesAndAnnouncements.click();
        ReusableMethods.bekle(1);
    }

    @And("kullanici {string} dersinin sınav notlarinin gozuktugunu dogrular")
    public void kullaniciDersininSınavNotlarininGozuktugunuDogrular(String arg0) {
        softAssert.assertTrue(locatePage.coding1DersiNotSayfasi.isDisplayed());
        softAssert.assertTrue(locatePage.coding1DersiNotu.isDisplayed());
        softAssert.assertAll();
        ReusableMethods.bekle(2);
    }

    @And("kullanici onceden olusturulan toplanti bilgilerinin gozuktugunu dogrular")
    public void kullaniciOncedenOlusturulanToplantiBilgilerininGozuktugunuDogrular() {
        softAssert.assertTrue(locatePage.meetInformation.isDisplayed());
        softAssert.assertAll();
        ReusableMethods.bekle(2);
    }
}
