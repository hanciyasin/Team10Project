package techproed.StepDefinitions.databaseStep_Def.US04_05_16;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.US04_05_16.DeanPostPojo;
import techproed.pojos.US04_05_16.ObjectPojo;
import techproed.utilities.ConfigReader;

import java.sql.*;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static techproed.StepDefinitions.api_step_definition.US04_05_16.DeanManagementAPI.*;
import static techproed.base_url.ManagementonSchoolsBaseUrl.setUp;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;


public class DeanManagementDB {
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    DeanPostPojo payloadDb;
    Response response1;

    @Given("Database baglantisi kurulur")
    public void databaseBaglantisiKurulur() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
    }

    @And("Dean icin beklenen veriler duzenlenir")
    public void deanIcinBeklenenVerilerDuzenlenir() {
        setUp(ConfigReader.getProperty("manSchoolAdmin"),ConfigReader.getProperty("manSchoolAdminPass"));
        spec.pathParams("first","dean","second","save");
        payloadDb = new DeanPostPojo("1989-08-08","eskişehir","MALE"
                ,"semih","Dilek143","237-592-9558","312-41-5518","semih","adminadsemih");
        response1 = given(spec).body(payloadDb).when().post("{first}/{second}");
        response1.prettyPrint();

    }
    @When("Kayitli Dean hesab bilgisini almak icin Query gonderilir")
    public void kayitliDeanHesabBilgisiniAlmakIcinQueryGonderilir() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from dean where username= 'adminadsemih'");
    }

    @Then("Kayitli Dean bilgisi dogrulanir")
    public void kayitliDeanBilgisiDogrulanir() throws SQLException {
        resultSet.next();
        assertEquals(payloadDb.getBirthDay(), resultSet.getString("birth_day"));
        assertEquals(payloadDb.getBirthPlace(), resultSet.getString("birth_place"));
        assertEquals(0, resultSet.getInt("gender"));
        assertEquals(payloadDb.getName(), resultSet.getString("name"));
        assertEquals(payloadDb.getSsn(), resultSet.getString("ssn"));
        assertEquals(payloadDb.getPhoneNumber(), resultSet.getString("phone_number"));
        assertEquals(payloadDb.getSurname(), resultSet.getString("surname"));
        assertEquals(payloadDb.getUsername(), resultSet.getString("username"));

    }

    @And("Database baglantisi kesilir")
    public void databaseBaglantisiKesilir() throws SQLException {
        statement.close();
        connection.close();
    }

}
