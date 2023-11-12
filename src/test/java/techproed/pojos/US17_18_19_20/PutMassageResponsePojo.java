package techproed.pojos.US17_18_19_20;

import java.io.Serializable;

public class PutMassageResponsePojo implements Serializable {
	private PutObjectPojo object;
	private String message;
	private String httpStatus;

	public PutMassageResponsePojo() {
	}

	public PutMassageResponsePojo(PutObjectPojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(PutObjectPojo object){
		this.object = object;
	}

	public PutObjectPojo getObject(){
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