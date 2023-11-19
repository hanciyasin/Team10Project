package techproed.StepDefinitions.ui_step_defs.US01_US02;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import techproed.pages.US01_02.US01_US02;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class us01tc01Pozitifstepdefination {

    US01_US02 SUAT = new US01_US02();
    @When("Siteye git")
    public void siteyeGit() {
        Driver.getDriver().get(ConfigReader.getProperty("manSchoolUrl"));
    }
    @And("REGİSTER İKONUNA TIKLA")
    public void registerİKONUNATIKLA() {
        SUAT.registerAnaSayfa.click();

    }
    @And("Name kısmına bie isim gir")
    public void nameKısmınaBieIsimGir() {
        SUAT.name.click();
        SUAT.name.sendKeys ("SUAT");
        ReusableMethods.bekle(2);

        
    }

    @And("Surname kısmını doldur")
    public void surnameKısmınıDoldur() {
        SUAT.surname.click();
        SUAT.surname.sendKeys ("ÖZGÜLTEKİN");
        ReusableMethods.bekle(2);
        
    }

    @And("Birth place kısmını doldur")
    public void birthPlaceKısmınıDoldur() {
        SUAT.birthPlace.click();
        SUAT.birthPlace.sendKeys ("KONYA");
        ReusableMethods.bekle(2);
        
    }

    @And("Phone kısmını doldur")
    public void phoneKısmınıDoldur() {
        SUAT.phoneNumber.click();
        SUAT.phoneNumber.sendKeys ("111-123-1234");
        ReusableMethods.bekle(2);

        
    }

    @And("Gender kısmından seçim yap")
    public void genderKısmındanSeçimYap() {
        SUAT.male.click();
        SUAT.male.sendKeys ("Male");

        ReusableMethods.bekle(2);
        
    }
    @And("Date of birt kısmını doldur")
    public void dateOfBirtKısmınıDoldur() {
        SUAT.dateOfBirth.click();
        SUAT.dateOfBirth.sendKeys ("01.01.1999");
        
    }

    @And("Ssn kısmını doldur")
    public void ssnKısmınıDoldur() {

        SUAT.ssn.click();
        SUAT.ssn.sendKeys("122-34-1234");
        ReusableMethods.bekle(1);

    }

    @And("Username kısmına tıkla ve doldur")
    public void usernameKısmınaTıklaVeDoldur() {
        SUAT.username.sendKeys(" AdminBatch171");
    }

    @And("Password kısmına tıkla ve doldur")
    public void passwordKısmınaTıklaVeDoldur() {
        SUAT.password.sendKeys("Batch171+");
        
    }

    @And("Register Butonuna  tıkla")
    public void registerButonunaTıkla() {
        SUAT.register.click();
        ReusableMethods.bekle(2);
        
    }

    @And("Çıkan ekranda succesful yazısının göründüğünü doğrula")
    public void çıkanEkrandaSuccesfulYazısınınGöründüğünüDoğrula() {

        
    }

    @And("Sayfayı kapat")
    public void sayfayıKapat() { {
        Driver.closeDriver();
    }


    }


}
