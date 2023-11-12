package techproed.pojos.US17_18_19_20;

import java.io.Serializable;

public class MeetGetResponsePojo implements Serializable {
	private MeetGetObjectPojo object;
	private String message;
	private String httpStatus;

	public MeetGetResponsePojo() {
	}

	public MeetGetResponsePojo(MeetGetObjectPojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(MeetGetObjectPojo object){
		this.object = object;
	}

	public MeetGetObjectPojo getObject(){
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
			"MeetGetResponsePojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}