package techproed.pojos.US07_24.US24.GetSavedTeacherById;

import java.util.List;
import java.io.Serializable;

public class LessonsProgramListPojo implements Serializable {
	private String day;
	private int id;
	private List<LessonPojo> lesson;
	private String startTime;
	private String stopTime;

	public LessonsProgramListPojo() {
	}

	public LessonsProgramListPojo(String day, int id, List<LessonPojo> lesson, String startTime, String stopTime) {
		this.day = day;
		this.id = id;
		this.lesson = lesson;
		this.startTime = startTime;
		this.stopTime = stopTime;
	}


	public void setDay(String day){
		this.day = day;
	}

	public String getDay(){
		return day;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setLesson(List<LessonPojo> lesson){
		this.lesson = lesson;
	}

	public List<LessonPojo> getLesson(){
		return lesson;
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

	@Override
 	public String toString(){
		return 
			"LessonsProgramListPojo{" + 
			"day = '" + day + '\'' + 
			",id = '" + id + '\'' + 
			",lesson = '" + lesson + '\'' + 
			",startTime = '" + startTime + '\'' + 
			",stopTime = '" + stopTime + '\'' + 
			"}";
		}
}