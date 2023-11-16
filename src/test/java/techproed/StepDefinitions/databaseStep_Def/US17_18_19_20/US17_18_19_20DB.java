package techproed.StepDefinitions.databaseStep_Def.US17_18_19_20;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.US17_18_19_20.*;
import techproed.utilities.ConfigReader;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static techproed.base_url.ManagementonSchoolsBaseUrl.setUp;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;

public class US17_18_19_20DB {

    Connection connection;
    Statement statement;
    ResultSet resultset;
    SaveStudentInfoSavePojo payload;
    Response response;
    static int userId;
    SaveResponsePojo actualData;
    DeleteResponsePojo delete;
    DeleteMeetResponsePojo actualDeleteMeetData;

    DeleteResponsePojo actualData3;

    MeetSaveBodyResponsePojo meetPayload;
    public static int meetId;

    static List<String> stdid;

    MeetSaveResponsePojo act;
    DeleteMeetResponsePojo deleteMeet;
    @Given("StudentInfo Database baglantisi kurulur")
    public void studentınfoDatabaseBaglantisiKurulur() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
    }

    @And("StudentInfo icin beklenen veriler duzenlenir")
    public void studentınfoIcinBeklenenVerilerDuzenlenir() {
        setUp(ConfigReader.getProperty("glcnTeacherName"),ConfigReader.getProperty("glcnTeacherSifre"));
        spec.pathParams("first","studentInfo","second","save");
        payload = new SaveStudentInfoSavePojo(5,15,85,"Basarilidir",1863,75,2046);
        response = given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
        actualData = response.as(SaveResponsePojo.class);

        userId = actualData.getObject().getId();
    }

    @When("Kayitli StudentInfo bilgisini almak icin Query gonderilir")
    public void kayitliStudentInfoBilgisiniAlmakIcinQueryGonderilir() throws SQLException {
        statement = connection.createStatement();
        resultset = statement.executeQuery("select * from student_info where info_note='Basarilidir';");
    }

    @Then("Kayitli StudentInfo bilgisi dogrulanir")
    public void kayitliStudentInfoBilgisiDogrulanir() throws SQLException {
        resultset.next();
        assertEquals(payload.getStudentId(),resultset.getInt("student_id"));
        assertEquals(payload.getInfoNote(),resultset.getString("info_note"));
        assertEquals(payload.getAbsentee(),resultset.getInt("absentee"));
        assertEquals(payload.getLessonId(),resultset.getInt("lesson_lesson_id"));
        // assertEquals(payload.getFinalExam(),resultset.getInt("final_exam"));
        // assertEquals(payload.getMidtermExam(),resultset.getString("midterm_exam"));
        assertEquals(payload.getEducationTermId(),resultset.getInt("education_term_id"));

    }

    @And("StudentInfo Database baglantisi kesilir")
    public void studentınfoDatabaseBaglantisiKesilir() throws SQLException {
        setUp(ConfigReader.getProperty("glcnTeacherName"),ConfigReader.getProperty("glcnTeacherSifre"));
        //https://managementonschools.com/app/studentInfo/delete/1
        spec.pathParams("first","studentInfo","second","delete","third",userId);
        delete = new DeleteResponsePojo("Student Info deleted Successfully","OK");
        response = given(spec).when().delete("{first}/{second}/{third}");
        response.prettyPrint();

        statement.close();
        connection.close();
    }

    @Given("Meet Database baglantisi kurulur")
    public void meetDatabaseBaglantisiKurulur() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
    }

    @And("Meet icin beklenen veriler duzenlenir")
    public void meetIcinBeklenenVerilerDuzenlenir() {
        setUp(ConfigReader.getProperty("glcnTeacherName"),ConfigReader.getProperty("glcnTeacherSifre"));
        spec.pathParams("first","meet","second","save");
        stdid = new ArrayList<>();
        stdid.add(0,"2046");
        stdid.add(1,"2046");
        meetPayload = new MeetSaveBodyResponsePojo("2023-11-30","Randevu Verildi","11:30","12:30",stdid);
        response = given(spec).body(meetPayload).when().post("{first}/{second}");
        response.prettyPrint();
        act = response.as(MeetSaveResponsePojo.class);

        meetId = act.getObject().getId();
    }

    @When("Kayitli Meet bilgisini almak icin Query gonderilir")
    public void kayitliMeetBilgisiniAlmakIcinQueryGonderilir() throws SQLException {
        statement = connection.createStatement();
        resultset = statement.executeQuery("select * from meet where advisor_teacher_id=1261;");
    }

    @Then("Kayitli Meet bilgisi dogrulanir")
    public void kayitliMeetBilgisiDogrulanir() throws SQLException {
        resultset.next();
        assertEquals(meetPayload.getDate(),resultset.getString("date"));
        assertEquals(meetPayload.getDescription(),resultset.getString("description"));
    }

    @And("Meet Database baglantisi kesilir")
    public void meetDatabaseBaglantisiKesilir() throws SQLException {
        setUp(ConfigReader.getProperty("glcnTeacherName"),ConfigReader.getProperty("glcnTeacherSifre"));
        //https://managementonschools.com/app/meet/delete/1
        spec.pathParams("first","meet","second","delete","third",meetId);
        deleteMeet = new DeleteMeetResponsePojo("Meet deleted successfully","OK");
        response = given(spec).when().delete("{first}/{second}/{third}");
        response.prettyPrint();
        actualDeleteMeetData = response.as(DeleteMeetResponsePojo.class);
        statement.close();
        connection.close();
    }
}
