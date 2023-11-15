package techproed.pojos.US04_05_16.Put_Dean;

import java.io.Serializable;

public class ObjectPojo implements Serializable {
	private String birthDay;
	private String birthPlace;
	private String gender;
	private String name;
	private String phoneNumber;
	private String ssn;
	private String surname;
	private int userId;
	private String username;

	public ObjectPojo() {
	}

	public void setBirthDay(String birthDay){
		this.birthDay = birthDay;
	}

	public String getBirthDay(){
		return birthDay;
	}

	public void setBirthPlace(String birthPlace){
		this.birthPlace = birthPlace;
	}

	public String getBirthPlace(){
		return birthPlace;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public String getGender(){
		return gender;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public void setSsn(String ssn){
		this.ssn = ssn;
	}

	public String getSsn(){
		return ssn;
	}

	public void setSurname(String surname){
		this.surname = surname;
	}

	public String getSurname(){
		return surname;
	}

	public void setUserId(int userId){
		this.userId = userId;
	}

	public int getUserId(){
		return userId;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	@Override
 	public String toString(){
		return 
			"ObjectPojo_US_03{" +
			"birthDay = '" + birthDay + '\'' + 
			",birthPlace = '" + birthPlace + '\'' + 
			",gender = '" + gender + '\'' + 
			",name = '" + name + '\'' + 
			",phoneNumber = '" + phoneNumber + '\'' + 
			",ssn = '" + ssn + '\'' + 
			",surname = '" + surname + '\'' + 
			",userId = '" + userId + '\'' + 
			",username = '" + username + '\'' + 
			"}";
		}
}