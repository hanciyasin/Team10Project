package techproed.StepDefinitions.ui_step_defs.US17_US18_US19_US20_StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import techproed.pages.US17_US18_US19_US20;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class US18StepDef {

    US17_US18_US19_US20 glcnPage = new US17_US18_US19_US20();
    Actions actions = new Actions(Driver.getDriver());
    @And("Teacher Student Info List kısmına scroll yapar")
    public void teacherStudentInfoListKısmınaScrollYapar() {
        ReusableMethods.scroll(glcnPage.glcnSatir);
    }

    @Then("Teacher eklenen ogrencinin midterm exam notunu gorur")
    public void teacherEklenenOgrencininMidtermExamNotunuGorur() {
        Assert.assertTrue(glcnPage.glcnSatir.getText().contains("72"));

    }

    @And("Teacher eklenen ogrencinin final exam notunu gorur")
    public void teacherEklenenOgrencininFinalExamNotunuGorur() {
        Assert.assertTrue(glcnPage.glcnSatir.getText().contains("Final Exam"));

        ReusableMethods.clickElementByJS(glcnPage.glcnDeleteButton);
        ReusableMethods.bekle(3);


    }

    @Then("Teacher listedeki ilk satir sonundaki edit butonuna basar")
    public void teacherListedekiIlkSatirSonundakiEditButonunaBasar() {

        ReusableMethods.clickElementByJS(glcnPage.glcnEdit);
        ReusableMethods.bekle(3);

    }

    @And("Teacher Absentee' değerini {int} ile değiştir")
    public void teacherAbsenteeDeğeriniIleDeğiştir(int yeniAbsentee) {

        String yeniDevamsizlik = String.valueOf(yeniAbsentee);
        glcnPage.glcnEditAbsentee.click();
        ReusableMethods.bekle(1);
        glcnPage.glcnEditAbsentee.sendKeys(Keys.BACK_SPACE,yeniDevamsizlik);
    }

    @And("Teacher Midterm Exam değerini {int} ile değiştir")
    public void teacherMidtermExamDeğeriniIleDeğiştir(int yeniMidtermExam) {

        String yeniVizeNotu = String.valueOf(yeniMidtermExam);
        glcnPage.glcnEditMidtermExam.click();
        ReusableMethods.bekle(1);
        glcnPage.glcnEditMidtermExam.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,yeniVizeNotu);
    }

    @And("Teacher Final Exam değerini {int} ile değiştirir")
    public void teacherFinalExamDeğeriniIleDeğiştirir(int yeniFinalExam) {

        String yeniFinalNotu = String.valueOf(yeniFinalExam);
        glcnPage.glcnEditFinalExam.click();
        ReusableMethods.bekle(1);
        glcnPage.glcnEditFinalExam.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,yeniFinalNotu);
    }

    @And("Teacher Info Note kısmını {string} olarak değiştir")
    public void teacherInfoNoteKısmınıNotGüncellendiOlarakDeğiştir(String yeniInfoNote) {

        glcnPage.glcnEditInfoNote.clear();
        glcnPage.glcnEditInfoNote.sendKeys(yeniInfoNote);

    }

    @And("Teacher edit submit butonuna tiklar")
    public void teacherEditSubmitButonunaTiklar() {
        glcnPage.glcnEditSubmit.click();
    }

   @Then("Teacher listedeki ilk satir sonundaki kırmızı cop kutusu ikonuna tiklar")
   public void teacherListedekiIlkSatirSonundakiKırmızıCopKutusuIkonunaTiklar() {
       ReusableMethods.clickElementByJS(glcnPage.glcnDeleteButton);
       ReusableMethods.bekle(1);
   }


    @And("Teacher ogrenciye verdiği notu silebilmeli")
    public void teacherOgrenciyeVerdiğiNotuSilebilmeli() {
        Assert.assertFalse(glcnPage.glcnSatir.getText().contains("72"));
    }
}
