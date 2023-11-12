package techproed.pojos.US17_18_19_20;

import java.util.List;
import java.io.Serializable;

public class MeetSaveBodyResponsePojo implements Serializable {
	private String date;
	private String description;
	private String startTime;
	private String stopTime;
	private List<String> studentIds;

	public MeetSaveBodyResponsePojo() {
	}

	public MeetSaveBodyResponsePojo(String date, String description, String startTime, String stopTime, List<String> studentIds) {
		this.date = date;
		this.description = description;
		this.startTime = startTime;
		this.stopTime = stopTime;
		this.studentIds = studentIds;
	}

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
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

	public void setStudentIds(List<String> studentIds){
		this.studentIds = studentIds;
	}

	public List<String> getStudentIds(){
		return studentIds;
	}

	@Override
 	public String toString(){
		return 
			"MeetSaveBodyResponsePojo{" + 
			"date = '" + date + '\'' + 
			",description = '" + description + '\'' + 
			",startTime = '" + startTime + '\'' + 
			",stopTime = '" + stopTime + '\'' + 
			",studentIds = '" + studentIds + '\'' + 
			"}";
		}
}