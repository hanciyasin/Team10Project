package techproed.pojos.US07_24.US07.PostMessage;

import java.io.Serializable;

public class PostMesssagePojo implements Serializable {
	private String email;
	private String message;
	private String name;
	private String subject;

	//public PostMesssagePojo() {
	//}

	public PostMesssagePojo(String email, String message, String name, String subject) {
		this.email = email;
		this.message = message;
		this.name = name;
		this.subject = subject;
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
			"PostMesssagePojo{" + 
			"email = '" + email + '\'' + 
			",message = '" + message + '\'' + 
			",name = '" + name + '\'' + 
			",subject = '" + subject + '\'' + 
			"}";
		}
}