package techproed.StepDefinitions.ui_step_defs.US04_05_16_StepDefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import techproed.pages.US04_05_16.AdminManagementPage;
import techproed.pages.US04_05_16.SchoolHomePage;
import techproed.utilities.ConfigReader;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static techproed.utilities.ReusableMethods.oneDigitNumber;


public class NegatifSenStepDep {

    AdminManagementPage adminManagementPage = new AdminManagementPage();
    SchoolHomePage schoolHomePage = new SchoolHomePage();
    Faker faker;

    @And("Admin propertiesten {string} ve {string} bilgilerini girer")
    public void adminPropertiestenVeBilgileriniGirer(String name, String pass) {
        schoolHomePage.userNameDd.sendKeys (ConfigReader.getProperty(name), Keys.TAB
                ,ConfigReader.getProperty(pass),Keys.TAB,Keys.ENTER);
    }

    @And("zorunlu alan girilmedigi icin name Required mesajini alir")
    public void zorunluAlanGirilmedigiIcinNameRequiredMesajiniAlir() {
        assertTrue(adminManagementPage.deanNameRequiredDD.getText().contains("Required"));
    }

    @And("zorunlu alan girilmedigi icin surname Required mesajini alir")
    public void zorunluAlanGirilmedigiIcinSurnameRequiredMesajiniAlir() {
        assertTrue(adminManagementPage.deanSurNameRequiredDD.getText().contains("Required"));
    }

    @And("zorunlu alan girilmedigi icin birthplace Required mesajini alir")
    public void zorunluAlanGirilmedigiIcinBirthplaceRequiredMesajiniAlir() {
        assertTrue(adminManagementPage.deanSurNameRequiredDD.getText().contains("Required"));
    }

    @And("zorunlu alan girilmedigi icin dateofbirth Required mesajini alir")
    public void zorunluAlanGirilmedigiIcinDateofbirthRequiredMesajiniAlir() {
        assertTrue(adminManagementPage.deanDateOfBirthRequiredDD.getText().contains("Required"));
    }

    @And("zorunlu alan girilmedigi icin phone Required mesajini alir")
    public void zorunluAlanGirilmedigiIcinPhoneRequiredMesajiniAlir() {
        assertTrue(adminManagementPage.deanPhoneRequiredDD.getText().contains("Required"));
    }

    @And("zorunlu alan girilmedigi icin ssn Required mesajini alir")
    public void zorunluAlanGirilmedigiIcinSsnRequiredMesajiniAlir() {
        assertTrue(adminManagementPage.deanSSNRequiredDD.getText().contains("Required"));
    }

    @And("Admin propertiesten name icin {string} ve bilgilerini girer")
    public void adminPropertiestenNameIcinVeBilgileriniGirer(String name) {
    schoolHomePage.userNameDd.sendKeys(ConfigReader.getProperty(name));
    }
    @And("Admin propertiesten password icin {string} ve bilgilerini girer")
    public void adminPropertiestenPasswordIcinVeBilgileriniGirer(String pass) {
    schoolHomePage.userPasswordDd.sendKeys(ConfigReader.getProperty(pass),Keys.TAB,Keys.ENTER);
    }


    @And("Add Dean bolumunden gelecekte bir DateOfBirth bilgisi girer")
    public void addDeanBolumundenGelecekteBirDateOfBirthBilgisiGirer() {
        adminManagementPage.addDeanDateOfBirthDd.sendKeys("0"+oneDigitNumber()+"0"+oneDigitNumber()+"2030");
    }

    @And("Add Dean bolumunden SSN bolumune sadece harf girer")
    public void addDeanBolumundenSSNBolumuneSadeceHarfGirer() {
        adminManagementPage.addDeanSSNDd.sendKeys("aaa-aa-aaaa");
    }

    @And("gelecek tarih hata mesaji alinir")
    public void gelecekTarihHataMesajiAlinir() {
    assertFalse(adminManagementPage.addDeanDateOfBirthDd.getText().contains("geçmiş bir tarih olmalı"));
    }


    @And("hata mesaji alir")
    public void hataMesajiAlir() {
        assertFalse(adminManagementPage.alertMessagexpathDd.getText().contains("Please enter valid SSN number"));

    }

    @And("Add Dean bolumunden SSN bolumune - kullanmadan giris yapar")
    public void addDeanBolumundenSSNBolumuneKullanmadanGirisYapar() {
        adminManagementPage.addDeanSSNDd.sendKeys("23456789786");
    }

    @And("zorunlu alan girilmedigi icin ssn karakter hatasi mesajini alir")
    public void zorunluAlanGirilmedigiIcinSsnKarakterHatasiMesajiniAlir() {
        assertTrue(adminManagementPage.deanSSN11CharDD.getText().contains("Minimum 11 character (XXX-XX-XXXX)"));
    }


    @And("Add Dean bolumunden SSN bolumune dokuz karakterden az giris yapar")
    public void addDeanBolumundenSSNBolumuneDokuzKarakterdenAzGirisYapar() {
        adminManagementPage.addDeanSSNDd.sendKeys("343243");

    }

    @And("Add Dean bolumunden SSN bolumune dokuz karakterden fazla giris yapar")
    public void addDeanBolumundenSSNBolumuneDokuzKarakterdenFazlaGirisYapar() {
        adminManagementPage.addDeanSSNDd.sendKeys("3434324343234");
    }

    @And("Add Dean bolumunden Password kismina sekiz den az karakter girer")
    public void addDeanBolumundenPasswordKisminaSekizDenAzKarakterGirer() {
        adminManagementPage.addDeanUserPasswordDd.sendKeys("263847");
    }


    @And("zorunlu alan girilmedigi icin password karakter hatasi mesajini alir")
    public void zorunluAlanGirilmedigiIcinPasswordKarakterHatasiMesajiniAlir() {
        assertTrue(adminManagementPage.deanPassCharDD.isDisplayed());
    }

    @And("Add Dean bolumunden Password kismina buyuk harf girmez")
    public void addDeanBolumundenPasswordKisminaBuyukHarfGirmez() {
        adminManagementPage.addDeanUserPasswordDd.sendKeys("dilek143");
    }

    @And("Add Dean bolumunden Password kismina kucuk harf girmez")
    public void addDeanBolumundenPasswordKisminaKucukHarfGirmez() {
        adminManagementPage.addDeanUserPasswordDd.sendKeys("DILEK143");
    }

    @And("Add Dean bolumunden Password rakam yerine sadece harf girer")
    public void addDeanBolumundenPasswordRakamYerineSadeceHarfGirer() {
        adminManagementPage.addDeanUserPasswordDd.sendKeys("dilekdil");
    }


}
