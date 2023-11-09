package techproed.pojos.US07_24;

import java.io.Serializable;

public class TeacherPostPojoByAdmin implements Serializable {

    private String name;
    private String surname;
    private String birthPlace;
    private String email;
    private String phone;
    private String ssn;
    private String userName;
    private String password;
    private String dateOfBirth;

    public TeacherPostPojoByAdmin(String name, String surname, String birthPlace, String email, String phone, String ssn, String userName, String password, String dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.birthPlace = birthPlace;
        this.email = email;
        this.phone = phone;
        this.ssn = ssn;
        this.userName = userName;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "TeacherPostPojoByAdmin{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", ssn='" + ssn + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
