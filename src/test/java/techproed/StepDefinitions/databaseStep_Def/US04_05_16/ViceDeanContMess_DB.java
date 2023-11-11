package techproed.StepDefinitions.databaseStep_Def.US04_05_16;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.US04_05_16.ViceDean.ContactGetAllPostPojo;
import techproed.utilities.ConfigReader;
import java.sql.*;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static techproed.base_url.ManagementonSchoolsBaseUrl.setUp;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;

public class ViceDeanContMess_DB {

    Connection connection;
    Statement statement;
    ResultSet resultSet1;
    ContactGetAllPostPojo payloadVDB;
    Response response2;


 @And("Beklenen veriler duzenlenir")
    public void beklenenVerilerDuzenlenir() throws SQLException {
     connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");

     setUp(ConfigReader.getProperty("manSchoolAdmin"),ConfigReader.getProperty("manSchoolAdminPass"));
        //https://managementonschools.com/app/contactMessages/save
        spec.pathParams("first", "contactMessages", "second", "save");
        payloadVDB=new ContactGetAllPostPojo("asdh@gmail.com", "nice","harry", "summer");
        response2 = given(spec).body(payloadVDB).when().post("{first}/{second}");
        response2.prettyPrint();
    }



    @When("Kayitli Vice Dean hesap bilgisini almak icin Query gonderilir")
    public void kayitliViceDeanHesapBilgisiniAlmakIcinQueryGonderilir() throws SQLException {
        statement = connection.createStatement();
        resultSet1 = statement.executeQuery("SELECT * FROM contact_message WHERE email = 'asdh@gmail.com'");
    }

    @Then("Gonderilen mesaj bilgileri dogrulanir")
    public void gonderilenMesajBilgileriDogrulanir() throws SQLException {
        resultSet1.next();
        assertEquals(payloadVDB.getEmail(), resultSet1.getString("email"));
        assertEquals(payloadVDB.getMessage(), resultSet1.getString("message"));
        assertEquals(payloadVDB.getName(), resultSet1.getString("name"));
        assertEquals(payloadVDB.getSubject(), resultSet1.getString("subject"));

    }
}
