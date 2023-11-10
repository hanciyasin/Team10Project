package techproed.pojos.US12_25.US_12;

import java.io.Serializable;

public class LessonProgramResponse implements Serializable {
    private ObjectResponse object;
    private String message;
    private String httpStatus;

    public LessonProgramResponse() {
    }

    public LessonProgramResponse(ObjectResponse object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public void setObject(ObjectResponse object){
        this.object = object;
    }

    public ObjectResponse getObject(){
        return object;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public void setHttpStatus(String httpStatus){
        this.httpStatus = httpStatus;
    }

    public String getHttpStatus(){
        return httpStatus;
    }

    @Override
    public String toString(){
        return
                "LessonProgramResponse{" +
                        "object = '" + object + '\'' +
                        ",message = '" + message + '\'' +
                        ",httpStatus = '" + httpStatus + '\'' +
                        "}";
    }
}
