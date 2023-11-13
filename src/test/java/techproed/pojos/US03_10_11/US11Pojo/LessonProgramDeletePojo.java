package techproed.pojos.US03_10_11.US11Pojo;

public class LessonProgramDeletePojo {

    // 1. Private variable'lar olusturulur
    private String message;
    private String httpStatus;

    //2. Parametreli ve parametresiz constructor'lari olustur
    public LessonProgramDeletePojo() {}
    public LessonProgramDeletePojo(String message, String httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }

    // 3. Public getter ve setter methodlarini olustur
    public String getMessage() {return message;}
    public void setMessage(String message) {this.message = message;}
    public String getHttpStatus() {return httpStatus;}
    public void setHttpStatus(String httpStatus) {this.httpStatus = httpStatus;}

    // 4. toString methodunu olustur

    @Override
    public String toString() {
        return "LessonProgramDeletePojo{" +
                "message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}
