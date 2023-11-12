package techproed.pojos.US04_05_16.ViceDean;

import java.io.Serializable;

public class ObjectPojo implements Serializable {
	private String date;
	private String email;
	private String message;
	private String name;
	private String subject;

	public ObjectPojo() {
	}

	public ObjectPojo(String date, String email, String message, String name, String subject) {
		this.date = date;
		this.email = email;
		this.message = message;
		this.name = name;
		this.subject = subject;
	}

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setSubject(String subject){
		this.subject = subject;
	}

	public String getSubject(){
		return subject;
	}

	@Override
 	public String toString(){
		return 
			"ObjectPojo_US_03{" +
			"date = '" + date + '\'' + 
			",email = '" + email + '\'' + 
			",message = '" + message + '\'' + 
			",name = '" + name + '\'' + 
			",subject = '" + subject + '\'' + 
			"}";
		}
}