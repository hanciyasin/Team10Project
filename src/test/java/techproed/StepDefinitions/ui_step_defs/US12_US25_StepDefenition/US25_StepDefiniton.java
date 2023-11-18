package techproed.StepDefinitions.ui_step_defs.US12_US25_StepDefenition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.openqa.selenium.interactions.Actions;
import techproed.pages.US12_25.US12_25;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.security.SecureRandom;
import java.util.Random;

import static techproed.utilities.ReusableMethods.generateUserName;
import static techproed.utilities.ReusableMethods.generatebirthPlace;

public class US25_StepDefiniton {
    Faker faker = new Faker();
    public static String fakeName;
    public static String fakeSurname;
    public static String fakePlace;
    public static String fakePhoneNumber;
    public static String fakeSsn;
    public static String fakeUserName;
    public static String fakeFatherName;
    public static String fakeMotherName;
    public static String birthdate;
    public static String fakeEmailStudent;
    public static Response response;
    public static Object userId;
    public static Object studentId;
    Actions actions = new Actions(Driver.getDriver());

    @When("Admin hesabıyla login olur")
    public void adminHesabıylaLoginOlur() {
        US12_25.loginAnaSayfa.click();
        ReusableMethods.bekle(2);
        US12_25.userName.sendKeys("AdminBatch171");
        US12_25.password.sendKeys("Batch171+");
        US12_25.loginButton.click();
        ReusableMethods.bekle(1);
    }

    @And("Sağ üst köşedeki Menu elementine tıkla")
    public void sagUstKosedekiMenuElementineTıkla() {
        US12_25.loginSonrasıMenuButton.click();
        ReusableMethods.bekle(1);
    }

    @And("Student management yazısına tıkla")
    public void studentManagementYazısınaTıkla() {
        US12_25.studentManegementButtonMenüdeki.click();
        ReusableMethods.bekle(1);
    }

    @And("Öğrencinin danışman öğretmenini seç")
    public void ogrencininDanısmanOgretmeniniSec() {

    }

    @And("Name alanına Öğrenci Adı gir")
    public void nameAlanınaOgrenciAdıGir() {
        fakeName = faker.name().firstName();
        US12_25.studentName.sendKeys(fakeName);
        ReusableMethods.bekle(1);
    }

    @And("Surname alanına Öğrenci Soyadı gir")
    public void surnameAlanınaOgrenciSoyadıGir() {
        fakeSurname = faker.name().lastName();
        US12_25.studentSurname.sendKeys(fakeSurname);
        ReusableMethods.bekle(1);
    }

    @And("Birth Place alanına Doğum Yeri gir")
    public void birthPlaceAlanınaDogumYeriGir() {
        fakePlace = generatebirthPlace(2, 16);
        US12_25.studentBirthPlace.sendKeys(fakePlace);
        ReusableMethods.bekle(1);
    }

    @And("E-mail alanına email gir")
    public void eMailAlanınaEmailGir() {
        fakeEmailStudent = faker.internet().emailAddress();
        US12_25.studentEmail.sendKeys(fakeEmailStudent);
        ReusableMethods.bekle(1);
    }

    public static String randomPhone() {
        Random random = new Random();
        String sayi1 = Integer.toString(random.nextInt(899) + 100);
        String sayi2 = Integer.toString(random.nextInt(899) + 100);
        String sayi3 = Integer.toString(random.nextInt(8999) + 1000);
        String phone = sayi1 + "-" + sayi2 + "-" + sayi3;
        return phone;

    }

    @And("Telefon Numarası alanına numara gir")
    public void telefonNumarasıAlanınaNumaraGir() {
        fakePhoneNumber = randomPhone();
        ReusableMethods.bekle(1);
        US12_25.studentPhoneNumber.sendKeys(fakePhoneNumber);
        ReusableMethods.bekle(1);
    }

    @And("Cinsiyet seç")
    public void cinsiyetSec() {
        US12_25.studentGenderButton.click();
        ReusableMethods.bekle(1);
    }

    @And("Doğum Tarihi alanına tarih gir")
    public void dogumTarihiAlanınaTarihGir() {
        birthdate = "01-01-1881";
        US12_25.studentDateOfBirth.sendKeys(birthdate);
        ReusableMethods.bekle(1);
    }

    public static String randomSsn() {
        Random random = new Random();
        String sayi1 = Integer.toString(random.nextInt(899) + 100);
        String sayi2 = Integer.toString(random.nextInt(89) + 10);
        String sayi3 = Integer.toString(random.nextInt(8999) + 1000);
        String ssn = sayi1 + "-" + sayi2 + "-" + sayi3;
        return ssn;

    }

    @And("SSN alanına ssn gir")
    public void ssnAlanınaSsnGir() {
        fakeSsn = randomSsn();
        US12_25.studentSSN.sendKeys(fakeSsn);
        ReusableMethods.bekle(1);
    }

    @And("User Name alanına username gir")
    public void userNameAlanınaUsernameGir() {
        fakeUserName = generateUserName(4, 50);
        US12_25.studentUserName.sendKeys(fakeUserName);
        ReusableMethods.bekle(1);
    }

    @And("Father Name alanına Baba Adı gir")
    public void fatherNameAlanınaBabaAdıGir() {
        fakeFatherName = faker.name().firstName();
        US12_25.studentFatherName.sendKeys(fakeFatherName);
        ReusableMethods.bekle(1);
    }

    @And("Mother Name alanına Anne Adı gir")
    public void motherNameAlanınaAnneAdıGir() {
        fakeFatherName = faker.name().firstName();
        US12_25.studentMotherName.sendKeys(fakeFatherName);
        ReusableMethods.bekle(1);
    }

    public static String randomPassword(int lower, int upper, int numeric) {
        String lowercharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String uppercharacters = "abcdefghijklmnopqrstuvwxyz";
        String numericcharacters = "0123456789";

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < lower; i++) {
            int randomIndex1 = random.nextInt(lowercharacters.length());
            char randomLowerChar = lowercharacters.charAt(randomIndex1);
            password.append(randomLowerChar);
        }
        for (int i = 0; i < upper; i++) {
            int randomIndex2 = random.nextInt(uppercharacters.length());
            char randomUpperChar = uppercharacters.charAt(randomIndex2);
            password.append(randomUpperChar);
        }
        for (int i = 0; i < numeric; i++) {
            int randomIndex3 = random.nextInt(numericcharacters.length());
            char randomNumericChar = numericcharacters.charAt(randomIndex3);
            password.append(randomNumericChar);

        }
        return password.toString();
    }

    @And("Password alanına parola gir")
    public void passwordAlanınaParolaGir() {
        ReusableMethods.clearJS(US12_25.studentPassword);
        US12_25.studentPassword.sendKeys(randomPassword(2, 2, 4));
        ReusableMethods.bekle(1);
    }

    @Then("Öğrencinin oluştuğunu doğrula")
    public void ogrencininOlustugunuDogrula() {
        US12_25.studentCreateSubmitButton.click();
        US12_25.studentSavedSuccessfullyUyarısı.isDisplayed();
        ReusableMethods.bekle(1);
    }
}
