package techproed.StepDefinitions.ui_step_defs.US01_US02;

import com.github.javafaker.Faker;
import com.sun.source.tree.AssertTree;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import techproed.pages.US01_US02;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import static org.junit.Assert.assertTrue;

public class us02isdisplayedstepdefination {


    US01_US02 SUAT = new US01_US02();

    Faker faker = new Faker();
    @Given("Admin siteye gider")
    public void adminSiteyeGider() {

        {
            Driver.getDriver().get(ConfigReader.getProperty("Base_url"));
        }
    }
    @And("LOGİN BUTONUNA TIKLAR")
    public void loginBUTONUNATIKLAR() {
        SUAT.anasayfaLogin.click();
        
    }

    @And("PASSWORD VE  USERNAME GİRER ve login butonuna tıklar")
    public void passwordVEUSERNAMEGİRERveloginbutonunatıklar() {
        SUAT.username.sendKeys(" AdminBatch171");
        SUAT.password.sendKeys("Batch171+");
        SUAT.loginButton.click();
    }
    @And("SAĞ ÜST KÖŞEDE MENÜ İKONUNA TIKLA")
    public void sağÜSTKÖŞEDEMENÜİKONUNATIKLA() {
        SUAT.menuButon.click();
    }

    @And("SOL TARAFTA  ACILAN YERDE USER GUEST BUTONUNA TIKLA")
    public void solTARAFTAACILANYERDEUSERGUESTBUTONUNATIKLA() {
        SUAT.guestUser.click();
        
    }

    @And("USER GUEST SAYFASINDA  OLDUGUBU DOĞRULA")
    public void userGUESTSAYFASINDAOLDUGUBUDOĞRULA() {
        assertTrue(SUAT.guestUser.isDisplayed());
    }


    @And("GUEST USER YAZISININ GÖRÜRNÜRLÜĞÜNÜ DOĞRULA")
    public void guestUSERYAZISININGÖRÜRNÜRLÜĞÜNÜDOĞRULA() {

        assertTrue(SUAT.guestUser.isDisplayed());
    }
        


    @And("GUEST USER SAYFASINDA NAME BAŞLIKLARININOLDUĞUNU DOĞRULA")
    public void guestUSERSAYFASINDANAMEBAŞLIKLARININOLDUĞUNUDOĞRULA() {
        assertTrue(SUAT.GUESTUSER_NAME_LİNKİ.isDisplayed());

        
    }

    @And("GUEST USER SAYFASINDA PHONE BAŞLIKLARININ OLDUĞUNU DOĞRULA")
    public void guestUSERSAYFASINDAPHONEBAŞLIKLARININOLDUĞUNUDOĞRULA() {
        assertTrue(SUAT.GUESTUSER_PhoneNumberLİNKİ.isDisplayed());
        
    }

    @And("GUEST USER SAYFASINDA SSN BAŞLIKLARININ OLDUĞUNU DOĞRULA")
    public void guestUSERSAYFASINDASSNBAŞLIKLARININOLDUĞUNUDOĞRULA() {

        assertTrue(SUAT.GUESTUSER_ssnLİNKİ.isDisplayed());
        
    }

    @And("GUEST USER SAYFASINDA USERNAME BAŞLIKLARININ OLDUĞUNU DOĞRULA")
    public void guestUSERSAYFASINDAUSERNAMEBAŞLIKLARININOLDUĞUNUDOĞRULA() {
        assertTrue(SUAT.GUESTUSER_userNAMELİNKİ.isDisplayed());
        
    }

    @And("GUEST USER SAYFASINDA home link nin  OLDUĞUNU DOĞRULA")
    public void guestUSERSAYFASINDAHomeLinkNinOLDUĞUNUDOĞRULA() {
        assertTrue(SUAT.homeTUŞU.isDisplayed());
        
    }

    @And("GUEST USER SAYFASINDA courses link nin  OLDUĞUNU DOĞRULA")
    public void guestUSERSAYFASINDACoursesLinkNinOLDUĞUNUDOĞRULA() {
        assertTrue(SUAT.coursesTUŞU.isDisplayed());
        
    }

    @And("GUEST USER SAYFASINDA event link nin  OLDUĞUNU DOĞRULA")
    public void guestUSERSAYFASINDAEventLinkNinOLDUĞUNUDOĞRULA() {
        assertTrue(SUAT.EVENTTUŞU.isDisplayed());
        
    }

    @And("GUEST USER SAYFASINDA blog link nin  OLDUĞUNU DOĞRULA")
    public void guestUSERSAYFASINDABlogLinkNinOLDUĞUNUDOĞRULA() {
        assertTrue(SUAT.Blogtuşu.isDisplayed());
        
    }

    @And("GUEST USER SAYFASINDA contact link nin  OLDUĞUNU DOĞRULA")
    public void guestUSERSAYFASINDAContactLinkNinOLDUĞUNUDOĞRULA() {
        assertTrue(SUAT.contacttuşu.isDisplayed());
        
    }

    @And("SAYFAYI KAPATIR")
    public void sayfayıKAPATIR() {
        Driver.closeDriver();
    }
}
