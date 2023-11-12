package techproed.pojos.US03_10_11.US03Pojo;

public class ObjectPojo_US_03 {
    // 1. Private variable'lar olusturulur
    private String name;
    private String email;
    private String subject;
    private String message;
    private String date;

    //2. Parametreli ve parametresiz constructor'lari olustur

    public ObjectPojo_US_03() {
    }

    public ObjectPojo_US_03(String name, String email, String subject, String message, String date) {
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.message = message;
        this.date = date;
    }
    // 3. Public getter ve setter methodlarini olustur

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    // 4. toString methodunu olustur

    @Override
    public String toString() {
        return "ObjectPojo_US_03{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
