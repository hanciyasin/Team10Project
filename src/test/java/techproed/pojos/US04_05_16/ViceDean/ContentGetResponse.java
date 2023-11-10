package techproed.pojos.US04_05_16.ViceDean;

import java.io.Serializable;

public class ContentGetResponse implements Serializable {
	private String name;
	private String email;
	private String subject;
	private String message;
	private String date;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setSubject(String subject){
		this.subject = subject;
	}

	public String getSubject(){
		return subject;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	@Override
 	public String toString(){
		return 
			"ContentGetResponse{" + 
			"name = '" + name + '\'' + 
			",email = '" + email + '\'' + 
			",subject = '" + subject + '\'' + 
			",message = '" + message + '\'' + 
			",date = '" + date + '\'' + 
			"}";
		}
}