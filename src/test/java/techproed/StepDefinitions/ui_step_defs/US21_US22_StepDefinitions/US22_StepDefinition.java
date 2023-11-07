package techproed.StepDefinitions.ui_step_defs.US21_US22_StepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import techproed.pages.US21_US22.US22;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class US22_StepDefinition {

    US22 locatePage = new US22();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    SoftAssert softAssert = new SoftAssert();


    @Given("Kullanici Management ON Schools sayfasina gider")
    public void kullaniciManagementONSchoolsSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("managementSchoolURLKM"));
    }

    @And("Login buttonuna tiklar")
    public void loginButtonunaTiklar() {
        locatePage.loginButtonMainPage.click();
    }

    @And("User name kismina admin kayitli kullanici adini girer")
    public void userNameKisminaAdminKayitliKullaniciAdiniGirer() {
        locatePage.loginUserName.sendKeys(ConfigReader.getProperty("adminAccountKM"));
    }

    @And("Password kismina admin kayitli passwordunu girer")
    public void passwordKisminaAdminKayitliPasswordunuGirer() {
        locatePage.loginPassword.sendKeys(ConfigReader.getProperty("adminPasswordKM"));
    }

    @And("kullanici Login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        locatePage.loginButtonLoginPage.click();
        ReusableMethods.bekle(1);
    }

    @And("kullanici Menu butonuna tiklar")
    public void kullaniciMenuButonunaTiklar() {
        locatePage.menuButton.click();
        ReusableMethods.bekle(3);
    }

    @And("kullanici acilan Main Menu altindaki Admin Managementa tiklar")
    public void kullaniciAcilanMainMenuAltindakiAdminManagementaTiklar() {
        locatePage.menuInsideAdminManagement.click();
    }


    @Given("kullanici Name kutucugunu doldurur")
    public void kullaniciNameKutucugunuDoldurur() {
        String name = faker.name().firstName();
        locatePage.nameBox.sendKeys(name);
        ReusableMethods.bekle(1);
    }

    @And("kullanici Surname kutucugunu doldurur")
    public void kullaniciSurnameKutucugunuDoldurur() {
        String surname = faker.name().lastName();
        locatePage.surnameBox.sendKeys(surname);
        ReusableMethods.bekle(1);
    }

    @And("kullanici Birth Place kutucugunu doldurur")
    public void kullaniciBirthPlaceKutucugunuDoldurur() {
        String birthPlace = faker.country().name();
        locatePage.birthPlaceBox.sendKeys(birthPlace);
        ReusableMethods.bekle(1);
    }

    @And("kullanici Gender secimini yapar")
    public void kullaniciGenderSeciminiYapar() {
        locatePage.maleRadioButton.click();
        ReusableMethods.bekle(1);
    }

    @And("kullanici Date Of Birth girer")
    public void kullaniciDateOfBirthGirer() {
        String pattern = "dd-MM-yyyy";
        locatePage.dateOfBirth.sendKeys(ReusableMethods.fakeBirthDate(pattern));
        ReusableMethods.bekle(1);
    }

    @And("kullanici Phone kutucugunu doldurur")
    public void kullaniciPhoneKutucugunuDoldurur() {
        String pilkUc = faker.number().digits(3);
        String portaUc = faker.number().digits(3);
        String psonDort = faker.number().digits(4);
        String phoneNumber = pilkUc+'-'+portaUc+'-'+psonDort;

        locatePage.phoneNumber.sendKeys(phoneNumber);
        ReusableMethods.bekle(1);
    }

    @And("kullanici Ssn kutucugunu doldurur")
    public void kullaniciSsnKutucugunuDoldurur() {
        String ilkUc = faker.number().digits(3);
        String ortaIki = faker.number().digits(2);
        String sonDort = faker.number().digits(4);
        String ssn = ilkUc+'-'+ortaIki+'-'+sonDort;

        locatePage.ssnAdmin.sendKeys(ssn);
    }

    @And("kullanici User Name kutucugunu doldurur")
    public void kullaniciUserNameKutucugunuDoldurur() {
        String username = faker.name().username();
        locatePage.usernameAdmin.sendKeys(username);
    }

    @And("kullanici Password kutucugunu doldurur")
    public void kullaniciPasswordKutucugunuDoldurur() {
        String password1 = faker.number().digits(6);
        String password2 = password1+'a'+'A';
        locatePage.passwordAdmin.sendKeys(password2);
    }

    @And("kullanici Admin kaydini tamamlamak icin Submit butonuna tiklar")
    public void kullaniciAdminKaydiniTamamlamakIcinSubmitButonunaTiklar() {
        locatePage.submitButtonAdmin.click();
    }

    @And("kullanici Admin Saved mesajini dogrular")
    public void kullaniciAdminSavedMesajiniDogrular() {
        ReusableMethods.bekle(2);
        softAssert.assertTrue(locatePage.adminSavedNotification.isDisplayed());
        ReusableMethods.bekle(2);
        softAssert.assertAll();
    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

    @Given("kullanici {string} kutucugunu bos birakir")
    public void kullaniciKutucugunuBosBirakir(String bos) {
        ReusableMethods.bekle(2);
    }

    @And("kullanici Required mesajinin gozuktugunu dogrular")
    public void kullaniciRequiredMesajininGozuktugunuDogrular() {
        softAssert.assertTrue(locatePage.requiredNotification.isDisplayed());
        ReusableMethods.bekle(2);
        softAssert.assertAll();

    }


    @And("kullanici {string} kutucugunu {string} olmadan girer")
    public void kullaniciKutucugunuOlmadanGirer(String arg0, String arg1) {
        String ilkUc = faker.number().digits(3);
        String ortaIki = faker.number().digits(2);
        String sonDort = faker.number().digits(4);
        String ssn = ilkUc+ortaIki+sonDort;

        locatePage.ssnAdmin.sendKeys(ssn);
    }

    @And("kullanici Minimum 11 character bildiriminin gorundugunu dogrular")
    public void kullaniciFullAuthenticationIsRequiredToAccessThisResourceBildirimininGorundugunuDogrular() {
        softAssert.assertTrue(locatePage.minimum11CharacterNotification.isDisplayed());
        ReusableMethods.bekle(2);
        softAssert.assertAll();
    }

    @And("kullanici Enter your password mesajinin gozuktugunu dogrular")
    public void kullaniciEnterYourPasswordMesajininGozuktugunuDogrular() {
        softAssert.assertTrue(locatePage.enterYourPasswordNotification.isDisplayed());
        ReusableMethods.bekle(2);
        softAssert.assertAll();
    }

    @And("kullanici {string} kutucugunu eksik girer")
    public void kullaniciKutucugunuEksikGirer(String arg0) {
        String password1 = faker.number().digits(6);
        locatePage.passwordAdmin.sendKeys(password1);

    }

    @And("kullanici At least {int} characters mesajinin gozuktugunu dogrular")
    public void kullaniciAtLeastCharactersMesajininGozuktugunuDogrular(int arg0) {
        softAssert.assertTrue(locatePage.atLeast8CharactersNotification.isDisplayed());
        ReusableMethods.bekle(2);
        softAssert.assertAll();
    }

    @And("kullanici Admin Saved mesajinin gozukmedigini dogrular")
    public void kullaniciAdminSavedMesajininGozukmediginiDogrular() {
        softAssert.assertFalse(locatePage.adminSavedNotification.isDisplayed());
        softAssert.assertAll();
    }
}
