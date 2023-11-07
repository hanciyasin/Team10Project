package techproed.StepDefinitions.ui_step_defs.US17_US18_US19_US20_StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import techproed.pages.US17_US18_US19_US20;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class US20StepDef {

    US17_US18_US19_US20 glcnPage = new US17_US18_US19_US20();
    Actions actions = new Actions(Driver.getDriver());
    @Then("Teacher olusturulan toplanti listesini gorur")
    public void teacherOlusturulanToplantiListesiniGorur() {

        Assert.assertTrue(glcnPage.glcnMeetSatir.getText().contains("Can Canan"));

    }

    @And("Teacher Students ddm menuden yeni bir ogrenci secer")
    public void teacherStudentsDdmMenudenYeniBirOgrenciSecer() {
        glcnPage.glcnMeetCarpi.click();
        ReusableMethods.bekle(2);
        //ReusableMethods.ddmIndex(glcnPage.glcnEditMeetStd,1);
        ////glcnPage.glcnEditMeetStd.sendKeys("Alo Han", Keys.ENTER);
        //ReusableMethods.bekle(2);


        glcnPage.editChooseStudents.click();
        glcnPage.editChooseStudents.sendKeys("Ali Veli",Keys.ENTER);
        ReusableMethods.bekle(2);


    }

    @And("Teacher meet edit submit butonuna tiklar")
    public void teacherMeetEditSubmitButonunaTiklar() {
        glcnPage.glcnEditMeetSubmit.click();
    }

    @And("Teacher Date of Meet alanina yeni bir {string} tarih girer")
    public void teacherDateOfMeetAlaninaYeniBirTarihGirer(String yeniMeetTarih) {
        glcnPage.glcnEditMeetDate.sendKeys(yeniMeetTarih);

    }

    @And("Teacher meet edit submit butonuna tiklar yeni")
    public void teacherMeetEditSubmitButonunaTiklarYeni() {
        glcnPage.glcnEditMeetSubmit.click();

    }

    @And("Teacher Description kısmına yeni bir metin olarak {string} girer")
    public void teacherDescriptionKısmınaYeniBirMetinOlarakGirer(String yeniDescription) {
        glcnPage.glcnEditMeetDescription.sendKeys(yeniDescription);
    }

    @Then("Teacher listedeki ilk satir sonundaki kirmizi cop kutusu ikonuna basar")
    public void teacherListedekiIlkSatirSonundakiKirmiziCopKutusuIkonunaBasar() {
        glcnPage.glcnMeetDelete.click();
    }

    @And("Teacher meet in silindigini gorur")
    public void teacherMeetInSilindiginiGorur() {
        Assert.assertFalse(glcnPage.glcnSatir.getText().contains("Can Canan"));
    }

    @And("Teacher kayit yapilmadigini gorur")
    public void teacherKayitYapilmadiginiGorur() {
        Assert.assertFalse(glcnPage.glcnMeetCard.getText().contains("Randevu"));
    }
}
