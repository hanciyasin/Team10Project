package techproed.pojos.US12_25.US_12;

import java.io.Serializable;

public class LessonNameResponse implements Serializable {
    private int lessonId;
    private String lessonName;
    private int creditScore;
    private boolean compulsory;

    public void setLessonId(int lessonId){
        this.lessonId = lessonId;
    }

    public int getLessonId(){
        return lessonId;
    }

    public void setLessonName(String lessonName){
        this.lessonName = lessonName;
    }

    public String getLessonName(){
        return lessonName;
    }

    public void setCreditScore(int creditScore){
        this.creditScore = creditScore;
    }

    public int getCreditScore(){
        return creditScore;
    }

    public void setCompulsory(boolean compulsory){
        this.compulsory = compulsory;
    }

    public boolean isCompulsory(){
        return compulsory;
    }

    @Override
    public String toString(){
        return
                "LessonNameResponse{" +
                        "lessonId = '" + lessonId + '\'' +
                        ",lessonName = '" + lessonName + '\'' +
                        ",creditScore = '" + creditScore + '\'' +
                        ",compulsory = '" + compulsory + '\'' +
                        "}";
    }
}
