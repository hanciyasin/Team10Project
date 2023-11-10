package techproed.pojos.US04_05_16.Put_Dean;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties (ignoreUnknown = true)
public class PutResponsePojo implements Serializable {
	private String httpStatus;
	private String message;
	private ObjectPojo object;

	public PutResponsePojo() {
	}

	public PutResponsePojo(String httpStatus, String message, ObjectPojo object) {
		this.httpStatus = httpStatus;
		this.message = message;
		this.object = object;
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

	public void setObject(ObjectPojo object){
		this.object = object;
	}

	public ObjectPojo getObject(){
		return object;
	}

	@Override
 	public String toString(){
		return 
			"PutResponsePojo{" + 
			"httpStatus = '" + httpStatus + '\'' + 
			",message = '" + message + '\'' + 
			",object = '" + object + '\'' + 
			"}";
		}
}