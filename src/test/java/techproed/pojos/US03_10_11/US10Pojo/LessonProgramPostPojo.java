package techproed.pojos.US03_10_11.US10Pojo;

import java.io.Serializable;

public class LessonProgramPostPojo implements Serializable {
    /*
    {
        "day": "MONDAY",
        "educationTermId": 0,
        "lessonIdList": [
        0
        ],
        "startTime": "HH:mm",
        "stopTime": "HH:mm"
    }
     */

    // 1. Private variable'lar olusturulur
    private String day;
    private String educationTermId;
    private Integer lessonIdList;
    private String startTime;
    private String stopTime;

    //2. Parametreli ve parametresiz constructor'lari olustur

    public LessonProgramPostPojo() {
    }

    public LessonProgramPostPojo(String day, String educationTermId, Integer lessonIdList, String startTime, String stopTime) {
        this.day = day;
        this.educationTermId = educationTermId;
        this.lessonIdList = lessonIdList;
        this.startTime = startTime;
        this.stopTime = stopTime;
    }
    // 3. Public getter ve setter methodlarini olustur

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getEducationTermId() {
        return educationTermId;
    }

    public void setEducationTermId(String educationTermId) {
        this.educationTermId = educationTermId;
    }

    public Integer getLessonIdList() {
        return lessonIdList;
    }

    public void setLessonIdList(Integer lessonIdList) {
        this.lessonIdList = lessonIdList;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }


    // 4. toString methodunu olustur


    @Override
    public String toString() {
        return "LessonProgramPostPojo{" +
                "day='" + day + '\'' +
                ", educationTermId='" + educationTermId + '\'' +
                ", lessonIdList=" + lessonIdList +
                ", startTime='" + startTime + '\'' +
                ", stopTime='" + stopTime + '\'' +
                '}';
    }
}
