package techproed.StepDefinitions.api_step_definition.US12_25;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.US12_25.US_12.LessonProgramPojo;
import techproed.pojos.US12_25.US_12.LessonProgramResponse;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static techproed.base_url.ManagementonSchoolsBaseUrl.setUp;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;

public class US_12 {
    public static List<Integer> lessonIdList;
    public static LessonProgramPojo expectedDataPost;
    Response response;
    public static int lessonProgramId;
    LessonProgramResponse actualDataLessonProgram;

    @Given("Lesson Program list eklemek icin Post request hazirligi yapilir")
    public void lesson_program_list_eklemek_icin_post_request_hazirligi_yapilir() {
        setUp("Iskaya33", "Akaya0133");
        spec.pathParams("first", "lessonPrograms", "second", "save");
    }

    @Given("Gonderilecek Lesson Program bilgileri hazirlar")
    public void gonderilecek_lesson_program_bilgileri_hazirlar() {
        lessonIdList = new ArrayList<>();
        lessonIdList.add(1186);
        expectedDataPost = new LessonProgramPojo("THURSDAY", 1, lessonIdList, "00:00", "01:00");
    }
    @When("Lesson Program eklemek icin Post request gonderir")
    public void lesson_program_eklemek_icin_post_request_gonderir() {
        response = given(spec).body(expectedDataPost).when().post("{first}/{second}");
        response.prettyPrint();

        lessonProgramId = response.jsonPath().getInt("object.lessonProgramId");

        actualDataLessonProgram = response.as(LessonProgramResponse.class);
    }
    @Then("Lesson Program List  bilgileri dogrular")
    public void lesson_program_list_bilgileri_dogrular() {

        assertEquals(200, response.statusCode());
        assertTrue(actualDataLessonProgram.getObject().getStartTime().contains(expectedDataPost.getStartTime()));
        assertTrue(actualDataLessonProgram.getObject().getStopTime().contains(expectedDataPost.getStopTime()));
        assertEquals(expectedDataPost.getDay(), actualDataLessonProgram.getObject().getDay());
        assertEquals("Created Lesson Program", actualDataLessonProgram.getMessage());


    }

    /*--------------------------------------------------------*/

    @Given("Kayitli lesson Program  verisinin delete request hazirligi yapilir")
    public void kayitli_lesson_program_verisinin_get_request_hazirligi_yapilir() {
        setUp("ViceDeanTeam15", "ViceDeanTeam15");
        spec.pathParams("first", "lessonPrograms", "second", "delete", "third", lessonProgramId);

    }
    @When("Kayitli lesson Program Id ile silinir")
    public void kayitli_lesson_program_ıd_ile_cagirilir() {
        response = given(spec).when().delete("{first}/{second}/{third}");


    }
    @Then("Lesson Programin silindigini dogrular\\(delete)")
    public void lesson_program_bilgileri_dogrular_delete() {
        assertEquals(200, response.statusCode());
        assertEquals("Lesson Program Deleted", response.jsonPath().getString("message"));
    }


}
