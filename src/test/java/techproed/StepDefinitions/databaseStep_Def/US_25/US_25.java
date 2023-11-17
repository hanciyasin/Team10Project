package techproed.StepDefinitions.databaseStep_Def.US_25;

import io.cucumber.java.en.Given;

import java.sql.*;

import io.cucumber.java.en.*;

import static org.junit.Assert.assertEquals;
import static techproed.utilities.JDBC_utils.closeConnection;

public class US_25 {
    //deneme
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("{string} ile student al")
    public void ile_student_al(String id) throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from student where id="+id+";");
        resultSet.next();
    }

    @Then("resultSet bodyi dogrula: id={string},birthDay={string},birthPlace={string},gender={string}, name={string}, phoneNumber={string},  ssn={string}, surname={string}, username={string},email {string},fatherName {string},motherName  {string},advisorTeacherId {string}")
    public void resultsetBodyiDogrulaIdBirthDayBirthPlaceGenderNamePhoneNumberSsnSurnameUsernameEmailFatherNameMotherNameAdvisorTeacherId(String id, String birthDay, String birthPlace, String gender, String name, String phoneNumber, String ssn, String surname, String username, String email, String fatherName, String motherName, String advisorTeacherId) throws SQLException {
        String actId = resultSet.getString("id");
        String actBirthDay = resultSet.getString("birth_day");
        String actBirthPlace = resultSet.getString("birth_place");
        String actGender = resultSet.getString("gender");
        String actName = resultSet.getString("name");
        String actPhoneNumber = resultSet.getString("phone_number");
        String actSsn = resultSet.getString("ssn");
        String actSurname = resultSet.getString("surname");
        String actUsername = resultSet.getString("username");
        String actEmail = resultSet.getString("email");
        String actFatherName= resultSet.getString("father_name");
        String actmMotherName = resultSet.getString("mother_name");
        String actmAdvisorTeacherId = resultSet.getString("advisor_teacher_id");

        assertEquals(actId,id);
        assertEquals(actBirthDay,birthDay);
        assertEquals(actBirthPlace,birthPlace);
        assertEquals(actGender,gender);
        assertEquals(actName,name);
        assertEquals(actPhoneNumber,phoneNumber);
        assertEquals(actSsn,ssn);
        assertEquals(actSurname,surname);
        assertEquals(actUsername,username);
        assertEquals(actEmail,email);
        assertEquals(actFatherName,fatherName);
        assertEquals(actmMotherName,motherName);
        assertEquals(actmAdvisorTeacherId,advisorTeacherId);

        closeConnection();

    }
}
