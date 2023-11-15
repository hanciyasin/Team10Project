package techproed.StepDefinitions.databaseStep_Def.US_03;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import techproed.pojos.US03_10_11.US03Pojo.ContactPostPojo;

import java.sql.*;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;


public class US_03_DB {
    Connection connection;
    Statement statement;
    ContactPostPojo expectedData;
    Response response;
    ResultSet resultSet;

    @Given("Database baglantisi olusturulur")
    public void databaseBaglantiOlusturma() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
    }

    @Then("Database'e gondermek icin payload olusturulur")
    public void databaseEGondermekIcinPayloadOlusturulur() {
        spec.pathParams("first","contactMessages","second","save");
        expectedData = new ContactPostPojo("contact@gmail.com","My_Message@1", "Fahri","Dersler");
        response = given(spec).body(expectedData).when().post("{first}/{second}");
        response.prettyPrint();
    }

    @Then("Gonderilen mesaji almak icin query olusturulur")
    public void gonderilenMesajiAlmakIcinQueryOlusturulur() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from contact_message where email='contact@gmail.com'");
        resultSet.next();
    }

    @And("Gonderilen ile Database'deki mesajin dogrulamasi yapilir")
    public void gonderilenIleDatabaseDekiMesajinDogrulamasiYapilir() throws SQLException {
        assertEquals(resultSet.getString("email"),expectedData.getEmail());
        assertEquals(resultSet.getString("message"),expectedData.getMessage());
        assertEquals(resultSet.getString("name"),expectedData.getName());
        assertEquals(resultSet.getString("subject"),expectedData.getSubject());
    }
}

