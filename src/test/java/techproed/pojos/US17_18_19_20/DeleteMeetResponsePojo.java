package techproed.pojos.US17_18_19_20;

import java.io.Serializable;

public class DeleteMeetResponsePojo implements Serializable {
	private String message;
	private String httpStatus;

	public DeleteMeetResponsePojo() {
	}

	public DeleteMeetResponsePojo(String message, String httpStatus) {
		this.message = message;
		this.httpStatus = httpStatus;
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
			"DeleteMeetResponsePojo{" + 
			"message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}