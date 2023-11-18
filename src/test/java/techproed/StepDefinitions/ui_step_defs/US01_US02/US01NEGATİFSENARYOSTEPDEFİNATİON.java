package techproed.StepDefinitions.ui_step_defs.US01_US02;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import techproed.pages.US01_02.US01_US02;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US01NEGATİFSENARYOSTEPDEFİNATİON {




    public static class RegisterNegatifstep {

        US01_US02 US01_US02 = new US01_US02();
        Faker faker = new Faker();


        @Given("admin siteye gider")
        public void adminSiteyeGider() {
            Driver.getDriver().get(ConfigReader.getProperty("manSchoolUrl"));
        }



        @Then("register ikonuna tiklar")
        public void registerIkonunaTiklar() {
            ReusableMethods.bekle(3);
            US01_US02.registerAnaSayfa.click();

            ReusableMethods.bekle(3);
           US01_US02.name.click();
           US01_US02.name.sendKeys(Keys.TAB);
            ReusableMethods.bekle(3);

        }

        @Then("Zorunlu alan girilmedigi icin Name Required mesajini alir")
        public void zorunluAlanGirilmedigiIcinNameRequiredMesajiniAlir() {
            assertTrue(US01_US02.NameRequired.isDisplayed());
            ReusableMethods.bekle(1);

        }

        @Then("Zorunlu alan girilmedigi icin surname Required mesajini alir")
        public void zorunluAlanGirilmedigiIcinSurnameRequiredMesajiniAlir() {
            assertTrue(US01_US02.SurNameRequired.isDisplayed());
            ReusableMethods.bekle(2);
        }

        @Then("Zorunlu alan girilmedigi icin birthplace Required mesajini alir")
        public void zorunluAlanGirilmedigiIcinBirthplaceRequiredMesajiniAlir() {
            assertTrue(US01_US02.BirthPlaceRequired.isDisplayed());
            ReusableMethods.bekle(2);

        }

        @Then("Zorunlu alan girilmedigi icin dateofbirth Required mesajini alir")
        public void zorunluAlanGirilmedigiIcinDateofbirthRequiredMesajiniAlir() {
            assertTrue(US01_US02.DateOfBirthreguared.isDisplayed());
            ReusableMethods.bekle(1);

        }

        @Then("Zorunlu alan girilmedigi icin phone Required mesajini alir")
        public void zorunluAlanGirilmedigiIcinPhoneRequiredMesajiniAlir() {
            assertTrue(US01_US02.phonereguired.isDisplayed());
            ReusableMethods.bekle(2);

        }

        @Then("Zorunlu alan girilmedigi icin ssn Required mesajini alir")
        public void zorunluAlanGirilmedigiIcinSsnRequiredMesajiniAlir() {
            assertTrue(US01_US02.ssnreguared.isDisplayed());
            ReusableMethods.bekle(1);
        }

        @Then("Zorunlu alan girilmedigi icin USERNAME Required mesajini alir")
        public void zorunluAlanGirilmedigiIcinUSERNAMERequiredMesajiniAlir() {
            US01_US02.username.click();
            US01_US02.name.sendKeys (ConfigReader.getProperty("USERNAME"), Keys.TAB.ENTER);


        }

        @Then("Zorunlu alan girilmedigi icin PASSWORD Required mesajini alir")
        public void zorunluAlanGirilmedigiIcinPASSWORDRequiredMesajiniAlir() {
            US01_US02.password.click();
            US01_US02.password.sendKeys (ConfigReader.getProperty("USERNAME"), Keys.TAB.ENTER);

        }



    }

}
