package techproed.pojos.US17_18_19_20;

import java.io.Serializable;

public class SaveResponsePojo implements Serializable {
    private SaveObjectPojo object;
    private String message;
    private String httpStatus;

    public SaveResponsePojo() {
    }

    public SaveResponsePojo(SaveObjectPojo object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public void setObject(SaveObjectPojo object){
        this.object = object;
    }

    public SaveObjectPojo getObject(){
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
                "ResponsePojo{" +
                        "object = '" + object + '\'' +
                        ",message = '" + message + '\'' +
                        ",httpStatus = '" + httpStatus + '\'' +
                        "}";
    }
}

