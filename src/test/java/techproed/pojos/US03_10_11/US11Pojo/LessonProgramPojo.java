package techproed.pojos.US03_10_11.US11Pojo;

public class LessonProgramPojo {
    /*
    {
    "lessonProgramId": 2379,
    "startTime": "12:25:00",
    "stopTime": "12:35:00",
    "lessonName": [
        {
            "lessonId": 1847,
            "lessonName": "xray",
            "creditScore": 11,
            "compulsory": true
        }
    ],
    "teachers": [],
    "students": [],
    "day": "FRIDAY"
}
     */
    // 1. Private variable'lar olusturulur\
    private Integer lessonProgramId;
    private String startTime;
    private String stopTime;
    private String lessonName;
    private String teachers;
    private String students;
    private String day;

    //2. Parametreli ve parametresiz constructor'lari olustur
    public LessonProgramPojo() {}
    public LessonProgramPojo(Integer lessonProgramId, String startTime, String stopTime, String lessonName, String teachers, String students, String day) {
        this.lessonProgramId = lessonProgramId;
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.lessonName = lessonName;
        this.teachers = teachers;
        this.students = students;
        this.day = day;
    }

    // 3. Public getter ve setter methodlarini olustur
    public Integer getLessonProgramId() {return lessonProgramId;}
    public void setLessonProgramId(Integer lessonProgramId) {this.lessonProgramId = lessonProgramId;}
    public String getStartTime() {return startTime;}
    public void setStartTime(String startTime) {this.startTime = startTime;}
    public String getStopTime() {return stopTime;}
    public void setStopTime(String stopTime) {this.stopTime = stopTime;}
    public String getLessonName() {return lessonName;}
    public void setLessonName(String lessonName) {this.lessonName = lessonName;}
    public String getTeachers() {return teachers;}
    public void setTeachers(String teachers) {this.teachers = teachers;}
    public String getStudents() {return students;}
    public void setStudents(String students) {this.students = students;}
    public String getDay() {return day;}
    public void setDay(String day) {this.day = day;}

    // 4. toString methodunu olustur
    @Override
    public String toString() {
        return "LessonProgramPojo{" +
                "lessonProgramId=" + lessonProgramId +
                ", startTime='" + startTime + '\'' +
                ", stopTime='" + stopTime + '\'' +
                ", lessonName='" + lessonName + '\'' +
                ", teachers='" + teachers + '\'' +
                ", students='" + students + '\'' +
                ", day='" + day + '\'' +
                '}';
    }
}
