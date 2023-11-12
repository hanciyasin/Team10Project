package techproed.pojos.US03_10_11.US03Pojo;

public class ResponsePojo_US_03 {
    // 1. Private variable'lar olusturulur
    private String httpStatus;
    private String message;
    private ObjectPojo_US_03 object;

    //2. Parametreli ve parametresiz constructor'lari olustur
    public ResponsePojo_US_03() {
    }
    public ResponsePojo_US_03(String httpStatus, String message, ObjectPojo_US_03 object) {
        this.httpStatus = httpStatus;
        this.message = message;
        this.object = object;
    }

    // 3. Public getter ve setter methodlarini olustur

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ObjectPojo_US_03 getObject() {
        return object;
    }

    public void setObject(ObjectPojo_US_03 object) {
        this.object = object;
    }


    // 4. toString methodunu olustur


    @Override
    public String toString() {
        return "ResponsePojo_US_03{" +
                "httpStatus='" + httpStatus + '\'' +
                ", message='" + message + '\'' +
                ", object=" + object +
                '}';
    }
}
