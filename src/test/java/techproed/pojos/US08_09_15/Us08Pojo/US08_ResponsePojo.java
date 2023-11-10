package techproed.pojos.US08_09_15.Us08Pojo;

import java.io.Serializable;

public class US08_ResponsePojo implements Serializable {
	private US08_ObjectPojo object;
	private String message;
	private String httpStatus;

	public US08_ResponsePojo() {
	}

	public US08_ResponsePojo(US08_ObjectPojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(US08_ObjectPojo object){
		this.object = object;
	}

	public US08_ObjectPojo getObject(){
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