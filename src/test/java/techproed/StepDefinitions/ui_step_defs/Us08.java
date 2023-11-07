package techproed.StepDefinitions.ui_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import techproed.pages.US04_05_16.SchoolHomePage;
import techproed.pages.Us8_9_15;
import techproed.pages.US04_05_16.ViceDeanManagementPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Us08 {

    Faker faker = new Faker();
    ViceDeanManagementPage viceDean = new ViceDeanManagementPage();
    SchoolHomePage schoolHomePage = new SchoolHomePage();
    ViceDeanManagementPage vDMPage = new ViceDeanManagementPage();

    public static String username;
    SoftAssert softAssert = new SoftAssert();
    Us8_9_15 myPage =new Us8_9_15();
    String phoneNumber;
    public static String ssnNo;
    Random rnd = new Random();
    public int max=99;
    public int min=10;
    public int sayi = rnd.nextInt(max+1-min)+min;//10-99 arasinda sayi veriyor.

    @Given("Kullanici management school sayfasina gider")
    public void kullaniciManagementSchoolSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("manSchoolUrl"));
    }

    @Then("Kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) {
        ReusableMethods.bekle(saniye);
    }


    @Then("Kullanici Login yazisina tiklar")
    public void kullaniciLoginYazisinaTiklar() {
        schoolHomePage.loginButtonDd.click();
    }

    @Then("Kullanici User Name alanina {string} password alanina {string} degerini girip giris yapar")
    public void kullaniciUserNameAlaninaPasswordAlaninaDegeriniGiripGirisYapar(String VDUserName, String VDPassword) {
        schoolHomePage.userNameDd.sendKeys (ConfigReader.getProperty(VDUserName),
                Keys.TAB,ConfigReader.getProperty(VDPassword),Keys.TAB,Keys.ENTER);
    }


    @Given("kullanici lessons a tiklar")
    public void kullaniciLessonsATiklar() {
        myPage.lessonsButton.click();
    }

    @And("kullanici Submit butonuna tiklar")
    public void kullaniciSubmitButonunaTiklar() {
        myPage.lessonSubmit.click();
    }

    @And("Lesson name ve Credit Score altinda Required yazdigini dogrular")
    public void lessonNameVeCreditScoreAltindaRequiredYazdiginiDogrular() {

        //ReusableMethods.
        ReusableMethods.tumSayfaResmi("ders ismi ve kredi zorunlu");

    }

    @Given("lesson name i yaz")
    public void lessonNameIYaz() {
        myPage.lessonName.sendKeys(faker.name().lastName()+"Ee",Keys.TAB,Keys.TAB,faker.number().digits(1));

    }

    @And("Compulsory kismini seç")
    public void compulsoryKisminiSeç() {
        myPage.Compulsory.click();
    }

    @And("Dersin Eklendigini doğrula")
    public void dersinEklendiginiDoğrula() {
        ReusableMethods.tumSayfaResmi("ders eklendi");
        assertTrue(myPage.lessonSave.isDisplayed());
    }

    @Then("kullanıcı ders listesine scroll yapar")
    public void kullanıcıDersListesineScrollYapar() {
        ReusableMethods.scroll(myPage.lessonSubmit);
    }

    @And("kullanıcı lesson  list'i görür")
    public void kullanıcıLessonListIGörür() {
        ReusableMethods.tumSayfaResmi("ders listesi");

    }

    @Then("kullanici menu'ye tiklar")
    public void kullaniciMenuYeTiklar() {
        myPage.MenuButton.click();
    }

    @Then("kullanici student management'a tiklar")
    public void kullaniciStudentManagementATiklar() {
        myPage.studentManagement.sendKeys(Keys.ENTER);
    }

    @Then("zorunlu alanlarda Required yazdigini dogrular")
    public void zorunluAlanlardaRequiredYazdiginiDogrular() {
        ReusableMethods.scroll(myPage.addStudent);
        List<WebElement> requiredYazilari = myPage.studentRequiredYazilari;
        for (WebElement w:requiredYazilari) {
            assertTrue(w.isDisplayed());
        }
        assertTrue(myPage.studentPasswordSonucYazisi.isDisplayed());
        ReusableMethods.tumSayfaResmi("Student Required yazilari");
    }

    @Given("Choose Advisor Teacher bölümünden ögretmen secer")
    public void chooseAdvisorTeacherBölümündenÖgretmenSecer() {
        ReusableMethods.bekle(2);
        myPage.chooseTeacherDdm.sendKeys(Keys.ENTER);
        ReusableMethods.bekle(2);
        Select select = new Select(myPage.chooseTeacherDdm);
        select.selectByVisibleText(ConfigReader.getProperty("Chose_teacher"));

    }
    @And("Name alanina name girer")
    public void nameAlaninaNameGirer() {
        myPage.sName.sendKeys(ConfigReader.getProperty("StudentName1"));
    }
    @And("Surname alanina surname girer")
    public void surnameAlaninaSurnameGirer() {
        myPage.sSurname.sendKeys(ConfigReader.getProperty("StudentSurname1")+sayi);
    }

    @And("Birthplace alanina yer girer")
    public void birthplaceAlaninaYerGirer() {
        myPage.sBirthPlace.sendKeys(faker.address().city());
    }

    @And("Email alanina email girer")
    public void emailAlaninaEmailGirer() {
        myPage.eMail.sendKeys(faker.internet().emailAddress());
    }

    @And("{string} alanina gecersiz numara girer\\(cizgisiz,on iki karakterden fazla veya on ikiden az)")
    public void alaninaGecersizNumaraGirerCizgisizOnIkiKarakterdenFazlaVeyaOnIkidenAz(String str) {
        ReusableMethods.bekle(2);
        myPage.sPhone.sendKeys(str);
        phoneNumber=str;
        System.out.println("phoneNumber = " + phoneNumber);

    }

    @And("Gender bölümünden cinsiyet secer")
    public void genderBölümündenCinsiyetSecer() {
        myPage.genderRadioButtons.get(0).click();
        ReusableMethods.bekle(2);
        //Digerinin secili olmadigini dogrulama
        assertFalse(myPage.genderRadioButtons.get(1).isSelected());
    }

    @And("Date Of Birth alanina tarih girer")
    public void dateOfBirthAlaninaTarihGirer() {
        myPage.studentBirthday.sendKeys(ConfigReader.getProperty("student_Date_Of_Birth"));
        ReusableMethods.bekle(1);
    }

    @And("Ssn alanina ssn numarasini girer")
    public void ssnAlaninaSsnNumarasiniGirer() {
        ssnNo=ConfigReader.getProperty("student_ssn")+sayi;
        myPage.studentSsn.sendKeys(ssnNo);
        ReusableMethods.bekle(1);
    }


    @And("Username alanina username girer")
    public void usernameAlaninaUsernameGirer() {
        username =ConfigReader.getProperty("student_username")+ sayi;
        myPage.studentUsername.sendKeys(username);
    }

    @And("Fathername alanina fathername girer")
    public void fathernameAlaninaFathernameGirer() {
        myPage.studentFathername.sendKeys(ConfigReader.getProperty("student_father"));
    }


    @And("Mothername alanina mothername girer")
    public void mothernameAlaninaMothernameGirer() {
        myPage.studentMothername.sendKeys(ConfigReader.getProperty("student_mother"));
    }

    @And("Password alanina password girer")
    public void passwordAlaninaPasswordGirer() {
        myPage.studentPassword.sendKeys(ConfigReader.getProperty("student_password"),Keys.TAB);
    }

    @And("Phone number should be exact 12 characters,Please Enter Valid Phone number yazisini veya Minimum oniki karakter yazisini görür")
    public void phoneNumberShouldBeExactCharactersPleaseEnterValidPhoneNumberYazisiniVeyaMinimumOnikiKarakterYazisiniGörür() {

        if (phoneNumber.length()==12){
            ReusableMethods.visibleWait(myPage.studentAlert, 3);
            assertTrue(myPage.studentAlert.getText().contains("Please enter valid phone number"));
        }if(phoneNumber.length()>12){
            ReusableMethods.visibleWait(myPage.studentAlert, 3);
            assertTrue(myPage.studentAlert.getText().contains("Phone number should be exact 12 characters"));
        }if(phoneNumber.length()<12){

            assertTrue(myPage.studentMinimum12Karakter.getText().contains("Minimum 12 character (XXX-XXX-XXXX)"));
        }
        ReusableMethods.bekle(1);
    }

    @And("Student Submit butonuna tiklar")
    public void studentSubmitButonunaTiklar() {
        myPage.studentSubmit.sendKeys(Keys.ENTER);
        ReusableMethods.bekle(1);
    }

    @And("Phone alanina phone girer")
    public void phoneAlaninaPhoneGirer() {
        myPage.sPhone.sendKeys(ConfigReader.getProperty("phone2")+sayi);
    }
    String Ssn;
    @And("{string} alanina gecersiz numara girer\\(cizgisiz,on bir karakterden fazla veya on birden az)")
    public void alaninaGecersizNumaraGirerCizgisizOnBirKarakterdenFazlaVeyaOnBirdenAz(String str1) {
        ReusableMethods.bekle(2);
        myPage.studentSsn.sendKeys(str1);
        Ssn=str1;

    }

    @And("Please Enter Valid Ssn number yazisini veya Minimum on bir character \\(XXX-XXX-XXXX) yazisini görür.")
    public void pleaseEnterValidSsnNumberYazisiniVeyaMinimumOnBirCharacterXXXXXXXXXXYazisiniGörür() {
        if (Ssn.length()==11){
            ReusableMethods.visibleWait(myPage.studentAlert, 3);
            assertTrue(myPage.studentAlert.getText().contains("Please enter valid SSN number"));
        }if(Ssn.length()>11){
            ReusableMethods.visibleWait(myPage.studentAlert, 3);
            assertTrue(myPage.studentAlert.getText().contains("Please enter valid SSN number"));
        }if(Ssn.length()<11){

            assertTrue(myPage.studentMinimum11Karakter.getText().contains("Minimum 11 character (XXX-XX-XXXX)"));
        }
    }

    @And("Username alanina {string} girer")
    public void usernameAlaninaGirer(String str2) {
        myPage.studentUsername.sendKeys(str2);
    }

    @And("Error: User with username Iskaya33 already register yazisini görür")
    public void errorUserWithUsernameIskayaAlreadyRegisterYazisiniGörür() {
        ReusableMethods.visibleWait(myPage.studentAlert, 3);
        assertTrue(myPage.studentAlert.getText().
                contains("Error: User with username Iskaya33 already register"));
        ReusableMethods.bekle(1);
    }

    @And("Page yazisini görene kadar scroll yapar")
    public void pageYazisiniGöreneKadarScrollYapar() {
        ReusableMethods.scroll(myPage.studentPageyazisi);
        ReusableMethods.bekle(2);
    }

    @And("Sayfanin sag alt kösesindeki cift tirnaga tiklar")
    public void sayfaninSagAltKösesindekiCiftTirnagaTiklar() {
        myPage.studentPageLink.click();
        ReusableMethods.bekle(2);
    }

    @And("Page yazisini görene kadar tekrar scroll yapar")
    public void pageYazisiniGöreneKadarTekrarScrollYapar() {
        ReusableMethods.scroll(myPage.studentPageyazisi2);
        ReusableMethods.bekle(2);
    }

    public String ögrenci_numarasi;
    @And("Ögrenci listesinin en sonunda olusturulan ögrencinin numarasinin otomatik geldigini dogrular.")
    public void ögrenciListesininEnSonundaOlusturulanÖgrencininNumarasininOtomatikGeldiginiDogrular() {
        List<WebElement> elementler =myPage.studentTableSonSayfa;
        ReusableMethods.bekle(2);
        if(elementler.get((elementler.size()-1)-4).getText().startsWith("TeamOn")){
            assertTrue(elementler.get((elementler.size()-1)-5).isDisplayed());
            ögrenci_numarasi=elementler.get((elementler.size()-1)-5).getText();
            System.out.println("ögrenci_numarasi = " + ögrenci_numarasi);
        }else{
            Assert.fail();
        }
    }


    @And("kayit Dogrulanir")
    public void kayitDogrulanir() {
        assertTrue(myPage.studentAlert.getText().
                contains("Student saved Successfully"));

    }
}
