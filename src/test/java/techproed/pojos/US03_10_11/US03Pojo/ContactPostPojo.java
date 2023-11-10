package techproed.pojos.US03_10_11.US03Pojo;

import java.io.Serializable;

public class ContactPostPojo implements Serializable {
    //https://managementonschools.com/app/contactMessages/save  <-- URL
    /*
    {
        "email": "string",
        "message": "string",
        "name": "string",
        "subject": "string"
    }
    */
    // 1. Private variable'lar olusturulur
    private String email;
    private String message;
    private String name;
    private String subject;

    //2. Parametreli ve parametresiz constructor'lari olustur

    public ContactPostPojo() {
    }

    public ContactPostPojo(String email, String message, String name, String subject) {
        this.email = email;
        this.message = message;
        this.name = name;
        this.subject = subject;
    }

    // 3. Public getter ve setter methodlarini olustur

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // 4. toString methodunu olustur

    @Override
    public String toString() {
        return "ContactPostPojo{" +
                "email='" + email + '\'' +
                ", message='" + message + '\'' +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
