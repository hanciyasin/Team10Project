package techproed.pojos.US17_18_19_20;

import java.io.Serializable;

public class MeetUpdateResponsePojo implements Serializable {
	private MeetUpdateObjectPojo object;
	private String message;
	private String httpStatus;

	public MeetUpdateResponsePojo() {
	}

	public MeetUpdateResponsePojo(MeetUpdateObjectPojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(MeetUpdateObjectPojo object){
		this.object = object;
	}

	public MeetUpdateObjectPojo getObject(){
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
			"MeetUpdateResponsePojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}