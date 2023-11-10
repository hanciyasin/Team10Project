package techproed.pojos.US12_25.US_25;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StudentGetResponse implements Serializable {
    private boolean active;
    private String advisorTeacherEmail;
    private int advisorTeacherId;
    private String advisorTeacherName;
    private String advisorTeacherSurname;
    private String birthDay;
    private String birthPlace;
    private String email;
    private String fatherName;
    private String gender;
    private int id;
    private String motherName;
    private String name;
    private String phoneNumber;
    private String ssn;
    private int studentNumber;
    private String surname;
    private String username;

    public StudentGetResponse(boolean active, String advisorTeacherEmail, int advisorTeacherId, String advisorTeacherName, String advisorTeacherSurname, String birthDay, String birthPlace, String email, String fatherName, String gender, int id, String motherName, String name, String phoneNumber, String ssn, int studentNumber, String surname, String username) {
        this.active = active;
        this.advisorTeacherEmail = advisorTeacherEmail;
        this.advisorTeacherId = advisorTeacherId;
        this.advisorTeacherName = advisorTeacherName;
        this.advisorTeacherSurname = advisorTeacherSurname;
        this.birthDay = birthDay;
        this.birthPlace = birthPlace;
        this.email = email;
        this.fatherName = fatherName;
        this.gender = gender;
        this.id = id;
        this.motherName = motherName;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.ssn = ssn;
        this.studentNumber = studentNumber;
        this.surname = surname;
        this.username = username;
    }

    public void setActive(boolean active){
        this.active = active;
    }

    public boolean isActive(){
        return active;
    }

    public void setAdvisorTeacherEmail(String advisorTeacherEmail){
        this.advisorTeacherEmail = advisorTeacherEmail;
    }

    public String getAdvisorTeacherEmail(){
        return advisorTeacherEmail;
    }

    public void setAdvisorTeacherId(int advisorTeacherId){
        this.advisorTeacherId = advisorTeacherId;
    }

    public int getAdvisorTeacherId(){
        return advisorTeacherId;
    }

    public void setAdvisorTeacherName(String advisorTeacherName){
        this.advisorTeacherName = advisorTeacherName;
    }

    public String getAdvisorTeacherName(){
        return advisorTeacherName;
    }

    public void setAdvisorTeacherSurname(String advisorTeacherSurname){
        this.advisorTeacherSurname = advisorTeacherSurname;
    }

    public String getAdvisorTeacherSurname(){
        return advisorTeacherSurname;
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

    public void setFatherName(String fatherName){
        this.fatherName = fatherName;
    }

    public String getFatherName(){
        return fatherName;
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

    public void setMotherName(String motherName){
        this.motherName = motherName;
    }

    public String getMotherName(){
        return motherName;
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

    public void setStudentNumber(int studentNumber){
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber(){
        return studentNumber;
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
                "StudentGetResponse{" +
                        "active = '" + active + '\'' +
                        ",advisorTeacherEmail = '" + advisorTeacherEmail + '\'' +
                        ",advisorTeacherId = '" + advisorTeacherId + '\'' +
                        ",advisorTeacherName = '" + advisorTeacherName + '\'' +
                        ",advisorTeacherSurname = '" + advisorTeacherSurname + '\'' +
                        ",birthDay = '" + birthDay + '\'' +
                        ",birthPlace = '" + birthPlace + '\'' +
                        ",email = '" + email + '\'' +
                        ",fatherName = '" + fatherName + '\'' +
                        ",gender = '" + gender + '\'' +
                        ",id = '" + id + '\'' +
                        ",motherName = '" + motherName + '\'' +
                        ",name = '" + name + '\'' +
                        ",phoneNumber = '" + phoneNumber + '\'' +
                        ",ssn = '" + ssn + '\'' +
                        ",studentNumber = '" + studentNumber + '\'' +
                        ",surname = '" + surname + '\'' +
                        ",username = '" + username + '\'' +
                        "}";
    }
}
