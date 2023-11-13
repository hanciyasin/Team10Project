package techproed.pojos.US03_10_11.US10Pojo;

public class LessonProgramResponsePojo {
    /*
    {
    "object": { . . . },
    "message": "Created Lesson Program",
    "httpStatus": "CREATED"
     */

    // 1. Private variable'lar olusturulur
    private LessonProgramObjectPojo object;
    private String message;
    private String httpStatus;

    //2. Parametreli ve parametresiz constructor'lari olustur
    public LessonProgramResponsePojo() {
    }
    public LessonProgramResponsePojo(LessonProgramObjectPojo object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    // 3. Public getter ve setter methodlarini olustur
    public LessonProgramObjectPojo getObject() {return object;}
    public void setObject(LessonProgramObjectPojo object) {this.object = object;}
    public String getMessage() {return message;}
    public void setMessage(String message) {this.message = message;}
    public String getHttpStatus() {return httpStatus;}
    public void setHttpStatus(String httpStatus) {this.httpStatus = httpStatus;}

    // 4. toString methodunu olustur
    @Override
    public String toString() {
        return "LessonProgramResponsePojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}
