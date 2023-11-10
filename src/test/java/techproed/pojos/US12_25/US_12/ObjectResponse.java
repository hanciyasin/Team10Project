package techproed.pojos.US12_25.US_12;

import java.util.List;
import java.io.Serializable;

public class ObjectResponse implements Serializable {
    private int lessonProgramId;
    private String startTime;
    private String stopTime;
    private List<LessonNameResponse> lessonName;
    private String day;

    public void setLessonProgramId(int lessonProgramId){
        this.lessonProgramId = lessonProgramId;
    }

    public int getLessonProgramId(){
        return lessonProgramId;
    }

    public void setStartTime(String startTime){
        this.startTime = startTime;
    }

    public String getStartTime(){
        return startTime;
    }

    public void setStopTime(String stopTime){
        this.stopTime = stopTime;
    }

    public String getStopTime(){
        return stopTime;
    }

    public void setLessonName(List<LessonNameResponse> lessonName){
        this.lessonName = lessonName;
    }

    public List<LessonNameResponse> getLessonName(){
        return lessonName;
    }

    public void setDay(String day){
        this.day = day;
    }

    public String getDay(){
        return day;
    }

    @Override
    public String toString(){
        return
                "ObjectResponse{" +
                        "lessonProgramId = '" + lessonProgramId + '\'' +
                        ",startTime = '" + startTime + '\'' +
                        ",stopTime = '" + stopTime + '\'' +
                        ",lessonName = '" + lessonName + '\'' +
                        ",day = '" + day + '\'' +
                        "}";
    }
}
