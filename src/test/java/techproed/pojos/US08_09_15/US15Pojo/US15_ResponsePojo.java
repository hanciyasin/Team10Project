package techproed.pojos.US08_09_15.US15Pojo;

import java.io.Serializable;

public class US15_ResponsePojo implements Serializable {
	private US15_ObjectPojo object;
	private String message;
	private US15_PozitifPojo validations;

	public US15_ResponsePojo() {
	}

	public US15_ResponsePojo(US15_ObjectPojo object, String message, US15_PozitifPojo validations) {
		this.object = object;
		this.message = message;
		this.validations = validations;
	}

	public void setObject(US15_ObjectPojo object){
		this.object = object;
	}

	public US15_ObjectPojo getObject(){
		return object;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}
	public US15_PozitifPojo getValidations(){
		return validations;
	}

	@Override
 	public String toString(){
		return 
			"ResponsePojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			"}";

	}


}