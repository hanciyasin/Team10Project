package techproed.pojos.US07_24;

import java.io.Serializable;

public class US24_ResponsePojo implements Serializable {
    private US24_ObjectPojo object;
    private String message;
    private String httpStatus;

    public US24_ResponsePojo(US24_ObjectPojo object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public US24_ObjectPojo getObject() {
        return object;
    }

    public void setObject(US24_ObjectPojo object) {
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    @Override
    public String toString() {
        return "US24_ResponsePojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}
