package techproed.StepDefinitions.ui_step_defs.US17_US18_US19_US20_StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import techproed.pages.US17_US18_US19_US20;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class US19StepDef {

    US17_US18_US19_US20 glcnPage = new US17_US18_US19_US20();
    Actions actions = new Actions(Driver.getDriver());
    @And("Teacher sol ust kosedeki Menu butonuna tiklar")
    public void teacherSolUstKosedekiMenuButonunaTiklar() {
        glcnPage.glcnMenu.click();
    }

    @And("Teacher acilan main menu listesinden Meet Management secenegine tiklar")
    public void teacherAcilanMainMenuListesindenMeetManagementSecenegineTiklar() {
        glcnPage.glcnMeetManagement.click();
    }



    @And("Teacher Choose Student ddm den bir ogrenci secer")
 public void teacherChooseStudentDdmDenBirOgrenciSecer() {
     glcnPage.glcnMeetChooseStd4.sendKeys("Can Canan",Keys.ENTER);
     ReusableMethods.bekle(2);
    }


    @Then("Teacher Date Of Meet alanina {string} tarihini girer")
    public void teacherDateOfMeetAlaninaTarihiniGirer(String tarih) {
        glcnPage.glcnDateOfMeet.sendKeys(tarih);
    }

    @And("Teacher Start Time alanina {string} saatini girer")
    public void teacherStartTimeAlaninaSaatiniGirer(String startTime) {
        glcnPage.glcnStartTime.sendKeys(startTime);

    }

    @And("Teacher Stop Time alanina {string} saatini girer")
    public void teacherStopTimeAlaninaSaatiniGirer(String stopTime) {
        glcnPage.glcnStopTime.sendKeys(stopTime);
    }

    @And("Teacher description alanına {string} aciklamasini girer")
    public void teacherDescriptionAlanınaAciklamasiniGirer(String description) {
        glcnPage.glcnMeetDescription.sendKeys(description);
    }

    @And("Teacher meet submit butonuna tiklar")
    public void teacherMeetSubmitButonunaTiklar() {
        glcnPage.glcnMeetSubmit.click();

        ReusableMethods.bekle(3);

        //ReusableMethods.clickElementByJS(glcnPage.glcnMeetDelete);



    }


    @And("Teacher meet submit butonuna tiklar yeni")
    public void teacherMeetSubmitButonunaTiklarYeni() {
        glcnPage.glcnMeetSubmit.click();
    }

    @And("Teacher kayit yapildigini gorur")
    public void teacherKayitYapildiginiGorur() {
        Assert.assertTrue(glcnPage.glcnMeetCard.getText().contains("Randevu"));

        ReusableMethods.clickElementByJS(glcnPage.glcnMeetDelete);


    }
}
