package techproed.pojos.us01_us02;

import java.io.Serializable;

public class RegisterPojo implements Serializable {
	private static String birthDay;
	private static String birthPlace;
	private String gender;
	private static String name;
	private String password;
	private static String phoneNumber;
	private static String ssn;
	private static String surname;
	private static String username;

	public RegisterPojo() {
	}

	public RegisterPojo(String birthDay, String birthPlace, String gender, String name, String password, String phoneNumber, String ssn, String surname, String username) {
		this.birthDay = birthDay;
		this.birthPlace = birthPlace;
		this.gender = gender;
		this.name = name;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.ssn = ssn;
		this.surname = surname;
		this.username = username;
	}

	public void setBirthDay(String birthDay){
		this.birthDay = birthDay;
	}

	public static String getBirthDay(){
		return birthDay;
	}

	public void setBirthPlace(String birthPlace){
		this.birthPlace = birthPlace;
	}

	public static String getBirthPlace(){
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

	public static String getName(){
		return name;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public static String getPhoneNumber(){
		return phoneNumber;
	}

	public void setSsn(String ssn){
		this.ssn = ssn;
	}

	public static String getSsn(){
		return ssn;
	}

	public void setSurname(String surname){
		this.surname = surname;
	}

	public static String getSurname(){
		return surname;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public static String getUsername(){
		return username;
	}

	@Override
 	public String toString(){
		return 
			"RegisterPojo{" + 
			"birthDay = '" + birthDay + '\'' + 
			",birthPlace = '" + birthPlace + '\'' + 
			",gender = '" + gender + '\'' + 
			",name = '" + name + '\'' + 
			",password = '" + password + '\'' + 
			",phoneNumber = '" + phoneNumber + '\'' + 
			",ssn = '" + ssn + '\'' + 
			",surname = '" + surname + '\'' + 
			",username = '" + username + '\'' + 
			"}";
		}
}