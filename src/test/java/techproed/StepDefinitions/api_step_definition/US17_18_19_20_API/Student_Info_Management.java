package techproed.StepDefinitions.api_step_definition.US17_18_19_20_API;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.US17_18_19_20.*;
import techproed.utilities.ConfigReader;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static techproed.base_url.ManagementonSchoolsBaseUrl.setUp;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;

public class Student_Info_Management {

    SaveStudentInfoSavePojo payload;

    public static Response response;
    SaveResponsePojo actualData;
    static int userId;
    GetStudentResponsePojo g1;
    GetResponsePojo g2;
    GetResponsePojo actualData2;
    PutBodyResponsePojo payload2;
    DeleteResponsePojo delete;
    DeleteResponsePojo actualData3;


        //------------------MEET-----------------//

    MeetSaveBodyResponsePojo meetPayload;
    MeetSaveBodyResponsePojo actualDataMeetBody;

    MeetSaveObjectPojo meetIdG;

    public static int meetId;

    public static List<String> stdid;

    MeetSaveResponsePojo act;
    MeetGetResponsePojo h1;

    MeetGetStudentsPojo h2;
    MeetGetObjectPojo h3;
    MeetUpdateBodyResponsePojo payloadMeetUpdate;
    DeleteMeetResponsePojo actualDeleteMeetData;
    DeleteMeetResponsePojo deleteMeet;

    MeetGetObjectPojo getObject;
    MeetUpdateResponsePojo actualData5;


        //-------------------NOT VERME SAVE---------------------//

    @Given("Not verme icin URL duzenlenir")
    public void notVermeIcinURLDuzenlenir() {

        setUp(ConfigReader.getProperty("glcnTeacherName"),ConfigReader.getProperty("glcnTeacherSifre"));
        //https://managementonschools.com/app/studentInfo/save
        spec.pathParams("first","studentInfo","second","save");
    }
    @And("Not verme icin payload duzenlenir")
    public void notVermeIcinPayloadDuzenlenir() {

        payload = new SaveStudentInfoSavePojo(5,15,85.0,"Basarilidir",1863,75.0,2046);
    }
    @When("Not verme icin POST Request gonderilir ve Reponse alinir")
    public void notVermeIcinPOSTRequestGonderilirVeReponseAlinir() {

        response = given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
        actualData = response.as(SaveResponsePojo.class);

        userId = actualData.getObject().getId();
        System.out.println(userId);

        System.out.println(response.statusCode());

    }
    @And("Not verme icin gelen Response body dogrulanir")
    public void notVermeIcinGelenResponseBodyDogrulanir() {

        assertEquals(payload.getAbsentee(),actualData.getObject().getAbsentee());
        assertEquals(payload.getEducationTermId(),actualData.getObject().getEducationTermId());
        assertEquals(payload.getFinalExam(),actualData.getObject().getFinalExam());
        assertEquals(payload.getInfoNote(),actualData.getObject().getInfoNote());
        assertEquals(payload.getLessonId(),actualData.getObject().getLessonId());
        assertEquals(payload.getMidtermExam(),actualData.getObject().getMidtermExam());
        assertEquals(payload.getStudentId(),actualData.getObject().getStudentResponse().getUserId());

    }

    //------------------NOT GET--------------------//

    @Given("StudentInfoGetID icin URL duzenlenir")
    public void verilenNotlariGetirmekIcinURLDuzenlenir() {

        setUp(ConfigReader.getProperty("glcnTeacherName"),ConfigReader.getProperty("glcnTeacherSifre"));
        //https://managementonschools.com/app/studentInfo/get/1
        spec.pathParams("first","studentInfo","second","get","third",userId);
    }
    @And("StudentInfoGetID icin beklenen veriler olusturulur")
    public void studentınfogetıdIcinBeklenenVerilerOlusturulur() {

        g1 = new GetStudentResponsePojo(2046,"harryPotter","Harry","Potter","1991-03-07","New York","333-665-9854",
                "MALE",1216,"Lilly", "James","harry.potter@hogwarts.edu.usa",true);

        g2 = new GetResponsePojo(userId,75.0,85.0,5,"Basarilidir","Criminology",1864,6,15,81.0,g1,true,"BA");
    }
    @When("StudentInfoGetID icin POST Request gonderilir ve Reponse alinir")
    public void studentınfogetıdIcinPOSTRequestGonderilirVeReponseAlinir() {

        response = given(spec).when().get("{first}/{second}/{third}");
        response.prettyPrint();
        actualData2 = response.as(GetResponsePojo.class);
    }
    @And("Verilen notlarin goruldugu dogrulanir")
    public void verilenNotlarinGorulduguDogrulanir() {

        assertEquals(g2.getFinalExam(),actualData2.getFinalExam());
        assertEquals(g2.getMidtermExam(),actualData2.getMidtermExam());
    }


        //----------------NOT GUNCELLEME-------------------//

    @Given("Not guncelleme icin URL düzenlenir")
    public void notGuncellemeIcinURLDüzenlenir() {
        setUp(ConfigReader.getProperty("glcnTeacherName"),ConfigReader.getProperty("glcnTeacherSifre"));
        //https://managementonschools.com/app/studentInfo/update/1
        spec.pathParams("first","studentInfo","second","update","third",userId);
    }
    @And("Not guncelleme icin payload duzenlenir")
    public void notGuncellemeIcinPayloadDuzenlenir() {

        payload2 = new PutBodyResponsePojo("3","16","15","Guncellendi","1863","25");
    }
    @When("Not guncelleme icin POST Request gonderilir ve Reponse alinir")
    public void notGuncellemeIcinPOSTRequestGonderilirVeReponseAlinir() {
        response = given(spec).body(payload2).when().put("{first}/{second}/{third}");
        response.prettyPrint();
        actualData = response.as(SaveResponsePojo.class);
    }
    @And("Not guncelleme icin gelen Response body dogrulanir")
    public void notGuncellemeIcinGelenResponseBodyDogrulanir() {
        assertTrue(actualData.getMessage().contains("Student Info updated Successfully"));
    }


        //----------------------NOT SILME------------------------------//

    @Given("Not silme icin URL düzenlenir")
    public void notSilmeIcinURLDüzenlenir() {
        setUp(ConfigReader.getProperty("glcnTeacherName"),ConfigReader.getProperty("glcnTeacherSifre"));
        //https://managementonschools.com/app/studentInfo/delete/1
        spec.pathParams("first","studentInfo","second","delete","third",userId);
    }
    @And("Not silme icin beklenen veriler olusturulur")
    public void notSilmeIcinBeklenenVerilerOlusturulur() {
        delete = new DeleteResponsePojo("Student Info deleted Successfully","OK");
    }
    @When("Not silme icin POST Request gonderilir ve Reponse alinir")
    public void notSilmeIcinPOSTRequestGonderilirVeReponseAlinir() {
        response = given(spec).when().delete("{first}/{second}/{third}");
        response.prettyPrint();
        actualData3 = response.as(DeleteResponsePojo.class);

        System.out.println("---------------------");
        System.out.println(actualData3);
    }

    @And("Not silme icin gelen Response body dogrulanir")
    public void notSilmeIcinGelenResponseBodyDogrulanir() {

        assertEquals(delete.getMessage(),actualData3.getMessage());

    }


    //--------------------------STATUSCODE DOGRULAMA---------------------------//
    @Then("Gelen Status kodun {int} oldugu dogrulanir")
    public void gelenStatusKodunOlduguDogrulanir(int statuscode) {
        assertEquals(response.getStatusCode(),statuscode);
    }



        //------------------MEET-----------------//


        //----------------MEET SAVE--------------------//

    @Given("Meet olusturma icin URL duzenlenir")
    public void meetOlusturmaIcinURLDuzenlenir() {

        setUp(ConfigReader.getProperty("glcnTeacherName"),ConfigReader.getProperty("glcnTeacherSifre"));
        //https://managementonschools.com/app/meet/save
        spec.pathParams("first","meet","second","save");
    }
    @And("Meet olusturma icin payload duzenlenir")
    public void meetOlusturmaIcinPayloadDuzenlenir() {

        stdid = new ArrayList<>();
        stdid.add(0,"2046");
        stdid.add(1,"2046");
        meetPayload = new MeetSaveBodyResponsePojo("2023-11-30","Randevu Verildi","11:30","12:30",stdid);
    }
    @When("Meet olusturma icin POST Request gonderilir ve Reponse alinir")
    public void meetOlusturmaIcinPOSTRequestGonderilirVeReponseAlinir() {
        response = given(spec).body(meetPayload).when().post("{first}/{second}");
        response.prettyPrint();
        act = response.as(MeetSaveResponsePojo.class);

        meetId = act.getObject().getId();
        System.out.println(meetId);
    }
    @And("Meet olusturma icin gelen Response body dogrulanir")
    public void meetOlusturmaIcinGelenResponseBodyDogrulanir() {
        assertEquals(act.getObject().getDate(),meetPayload.getDate());
        // assertEquals(act.getObject().getStartTime(),meetPayload.getStartTime());
        // assertEquals(act.getObject().getStopTime(),meetPayload.getStopTime());
        assertEquals(act.getObject().getDescription(),meetPayload.getDescription());
        assertEquals(act.getMessage(),"Meet Saved Successfully");
    }

        //------------------------MEETGET-------------------------//

    @Given("GetMeetID icin URL duzenlenir")
    public void getmeetıdIcinURLDuzenlenir() {

        setUp(ConfigReader.getProperty("glcnTeacherName"),ConfigReader.getProperty("glcnTeacherSifre"));
        //https://managementonschools.com/app/meet/getMeetById/1
        spec.pathParams("first","meet","second","getMeetById","third",meetId);
    }
    @And("GetMeetID icin beklenen veriler olusturulur")
    public void getmeetıdIcinBeklenenVerilerOlusturulur() {
        getObject = new MeetGetObjectPojo();

        //  h2 = new MeetGetStudentsPojo(2046,"harryPotter","543-30-7643","Harry","Potter","1991-03-07","New York","333-665-9854","MALE","Lilly","James",1216,"harry.potter@hogwarts.edu.usa",true);
        //  h3 = new MeetGetObjectPojo(1461,"Randevu Verildi","2023-11-30","11:30:00","12:30:00",1261,"Gulcan","125-14-1256", (List<MeetGetStudentsPojo>) h2);
        //  h1 = new MeetGetResponsePojo(h3,"Meet successfully found","CREATED");
    }
    @When("GetMeetID icin POST Request gonderilir ve Reponse alinir")
    public void getmeetıdIcinPOSTRequestGonderilirVeReponseAlinir() {
        response = given(spec).when().get("{first}/{second}/{third}");
        response.prettyPrint();

        MeetUpdateResponsePojo act2 = response.as(MeetUpdateResponsePojo.class);

        System.out.println(act2.getMessage());

        System.out.println(h1.getMessage());
    }
    @And("Verilen randevunun goruldugu dogrulanir")
    public void verilenRandevununGorulduguDogrulanir() {
    }


        //----------------------MEET UPDATE----------------------//

    @Given("Meet guncelleme icin URL düzenlenir")
    public void meetGuncellemeIcinURLDüzenlenir() {

        setUp(ConfigReader.getProperty("glcnTeacherName"),ConfigReader.getProperty("glcnTeacherSifre"));
        //https://managementonschools.com/app/meet/update/1
        System.out.println(meetId);
        spec.pathParams("first","meet","second","update","third",meetId);

    }
    @And("Meet guncelleme icin payload duzenlenir")
    public void meetGuncellemeIcinPayloadDuzenlenir() {

        payloadMeetUpdate = new MeetUpdateBodyResponsePojo("2023-12-01","Guncellendi","10:00","10:30",stdid);
    }
    @When("Meet guncelleme icin POST Request gonderilir ve Reponse alinir")
    public void meetGuncellemeIcinPOSTRequestGonderilirVeReponseAlinir() {
        response = given(spec).body(payloadMeetUpdate).when().put("{first}/{second}/{third}");
        response.prettyPrint();

        //  MeetUpdateObjectPojo objectMeet = new MeetUpdateObjectPojo();
        //  MeetUpdateResponsePojo beklenenMeet = new MeetUpdateResponsePojo(objectMeet,"Meet Updated Successfully","OK");
        actualData5 = response.as(MeetUpdateResponsePojo.class);
    }
    @And("Meet guncelleme icin gelen Response body dogrulanir")
    public void meetGuncellemeIcinGelenResponseBodyDogrulanir() {
        assertEquals(actualData5.getObject().getDate(),payloadMeetUpdate.getDate());
        assertEquals(actualData5.getObject().getStartTime(),payloadMeetUpdate.getStartTime());
        assertEquals(actualData5.getObject().getStopTime(),payloadMeetUpdate.getStopTime());
        assertEquals(actualData5.getObject().getDescription(),payloadMeetUpdate.getDescription());

    }

        //-----------------------MEET DELETE---------------------//

    @Given("Meet silme icin URL düzenlenir")
    public void meetSilmeIcinURLDüzenlenir() {

        setUp(ConfigReader.getProperty("glcnTeacherName"),ConfigReader.getProperty("glcnTeacherSifre"));
        //https://managementonschools.com/app/meet/delete/1
        spec.pathParams("first","meet","second","delete","third",meetId);
    }
    @And("Meet silme icin beklenen veriler olusturulur")
    public void meetSilmeIcinBeklenenVerilerOlusturulur() {

        deleteMeet = new DeleteMeetResponsePojo("Meet deleted successfully","OK");
    }
    @When("Meet silme icin POST Request gonderilir ve Reponse alinir")
    public void meetSilmeIcinPOSTRequestGonderilirVeReponseAlinir() {

        response = given(spec).when().delete("{first}/{second}/{third}");
        response.prettyPrint();
        actualDeleteMeetData = response.as(DeleteMeetResponsePojo.class);
    }
    @And("Meet silme icin gelen Response body dogrulanir")
    public void meetSilmeIcinGelenResponseBodyDogrulanir() {
        assertEquals(deleteMeet.getMessage(),actualDeleteMeetData.getMessage());
        assertEquals(deleteMeet.getHttpStatus(),actualDeleteMeetData.getHttpStatus());

    }
}