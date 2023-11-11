package techproed.pojos.US08_09_15.US15Pojo;

import java.io.Serializable;

public class US15_ResponsePojo implements Serializable {
	private US15_ObjectPojo object;
	private String message;


	public US15_ResponsePojo() {
	}

	public US15_ResponsePojo(US15_ObjectPojo object, String message) {
		this.object = object;
		this.message = message;
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


	@Override
 	public String toString(){
		return 
			"ResponsePojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			"}";

	}


}