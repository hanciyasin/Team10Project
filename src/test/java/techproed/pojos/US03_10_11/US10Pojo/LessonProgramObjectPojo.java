package techproed.pojos.US03_10_11.US10Pojo;

import java.util.List;

public class LessonProgramObjectPojo {
    /*
     "object": {
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
        "day": "FRIDAY"
    }
     */
    // 1. Private variable'lar olusturulur
    private Integer lessonProgramId;
    private String startTime;
    private String stopTime;
    private String lessonName;
    private String day;

    //2. Parametreli ve parametresiz constructor'lari olustur
    public LessonProgramObjectPojo() {
    }
    public LessonProgramObjectPojo(Integer lessonProgramId, String startTime, String stopTime, String lessonName, String day) {
        this.lessonProgramId = lessonProgramId;
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.lessonName = lessonName;
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
    public String getDay() {return day;}
    public void setDay(String day) {this.day = day;}

    // 4. toString methodunu olustur
    @Override
    public String toString() {
        return "LessonProgramObjectPojo{" +
                "lessonProgramId=" + lessonProgramId +
                ", startTime='" + startTime + '\'' +
                ", stopTime='" + stopTime + '\'' +
                ", lessonName='" + lessonName + '\'' +
                ", day='" + day + '\'' +
                '}';
    }
}
