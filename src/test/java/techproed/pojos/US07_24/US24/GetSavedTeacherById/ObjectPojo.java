package techproed.pojos.US07_24.US24.GetSavedTeacherById;

import java.util.List;
import java.io.Serializable;

public class ObjectPojo implements Serializable {
	private String birthDay;
	private String birthPlace;
	private String email;
	private String gender;
	private int id;
	private boolean isAdvisor;
	private List<LessonsProgramListPojo> lessonsProgramList;
	private String name;
	private String phoneNumber;
	private String ssn;
	private String surname;
	private String username;

	public ObjectPojo() {
	}

	public ObjectPojo(String birthDay, String birthPlace, String email, String gender, int id, boolean isAdvisor, List<LessonsProgramListPojo> lessonsProgramList, String name, String phoneNumber, String ssn, String surname, String username) {
		this.birthDay = birthDay;
		this.birthPlace = birthPlace;
		this.email = email;
		this.gender = gender;
		this.id = id;
		this.isAdvisor = isAdvisor;
		this.lessonsProgramList = lessonsProgramList;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.ssn = ssn;
		this.surname = surname;
		this.username = username;
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

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public String getGender(){
		return gender;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setIsAdvisor(boolean isAdvisor){
		this.isAdvisor = isAdvisor;
	}

	public boolean isIsAdvisor(){
		return isAdvisor;
	}

	public void setLessonsProgramList(List<LessonsProgramListPojo> lessonsProgramList){
		this.lessonsProgramList = lessonsProgramList;
	}

	public List<LessonsProgramListPojo> getLessonsProgramList(){
		return lessonsProgramList;
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

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	@Override
 	public String toString(){
		return 
			"ObjectPojo{" + 
			"birthDay = '" + birthDay + '\'' + 
			",birthPlace = '" + birthPlace + '\'' + 
			",email = '" + email + '\'' + 
			",gender = '" + gender + '\'' + 
			",id = '" + id + '\'' + 
			",isAdvisor = '" + isAdvisor + '\'' + 
			",lessonsProgramList = '" + lessonsProgramList + '\'' + 
			",name = '" + name + '\'' + 
			",phoneNumber = '" + phoneNumber + '\'' + 
			",ssn = '" + ssn + '\'' + 
			",surname = '" + surname + '\'' + 
			",username = '" + username + '\'' + 
			"}";
		}
}