package techproed.pojos.US08_09_15.US15Pojo.negatif;

import techproed.pojos.US08_09_15.US15Pojo.pozitif.US15_PozitifPojo;

import java.io.Serializable;

public class NegatifPojoUS15 implements Serializable {
	private String path;
	private String error;
	private String message;
	private int status;
	private long timeStamp;
	private US15_PozitifPojo validations;

	public NegatifPojoUS15() {
	}

	public NegatifPojoUS15(String path, String error, String message, int status, long timeStamp, US15_PozitifPojo validations) {
		this.path = path;
		this.error = error;
		this.message = message;
		this.status = status;
		this.timeStamp = timeStamp;
		this.validations = validations;
	}

	public void setPath(String path){
		this.path = path;
	}

	public String getPath(){
		return path;
	}

	public void setError(String error){
		this.error = error;
	}

	public String getError(){
		return error;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setStatus(int status){
		this.status = status;
	}

	public int getStatus(){
		return status;
	}

	public US15_PozitifPojo getValidations(){
		return validations;
	}
	@Override
 	public String toString(){
		return 
			"NegatifPojoUS15{" + 
			"path = '" + path + '\'' + 
			",error = '" + error + '\'' + 
			",message = '" + message + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}