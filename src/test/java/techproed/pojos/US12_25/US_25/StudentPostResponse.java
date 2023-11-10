package techproed.pojos.US12_25.US_25;

public class StudentPostResponse {
    private String httpStatus;
    private String message;
    private ObjectPostResponse object;

    public StudentPostResponse(String httpStatus, String message, ObjectPostResponse object) {
        this.httpStatus = httpStatus;
        this.message = message;
        this.object = object;
    }

    public StudentPostResponse() {
    }

    public void setHttpStatus(String httpStatus){
        this.httpStatus = httpStatus;
    }

    public String getHttpStatus(){
        return httpStatus;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public void setObject(ObjectPostResponse object){
        this.object = object;
    }

    public ObjectPostResponse getObject(){
        return object;
    }

    @Override
    public String toString(){
        return
                "StudentPostResponse{" +
                        "httpStatus = '" + httpStatus + '\'' +
                        ",message = '" + message + '\'' +
                        ",object = '" + object + '\'' +
                        "}";
    }
}
