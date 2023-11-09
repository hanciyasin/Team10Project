package techproed.pojos.US08_09_15.Us08Pojo;

import java.io.Serializable;

public class US08_LessonsPojo implements Serializable {
	private boolean compulsory;
	private String creditScore;
	private String lessonName;

	public US08_LessonsPojo() {
	}

	public US08_LessonsPojo(boolean compulsory, String creditScore, String lessonName) {
		this.compulsory = compulsory;
		this.creditScore = creditScore;
		this.lessonName = lessonName;
	}

	public void setCompulsory(boolean compulsory){
		this.compulsory = compulsory;
	}

	public boolean isCompulsory(){
		return compulsory;
	}

	public void setCreditScore(String creditScore){
		this.creditScore = creditScore;
	}

	public String getCreditScore(){
		return creditScore;
	}

	public void setLessonName(String lessonName){
		this.lessonName = lessonName;
	}

	public String getLessonName(){
		return lessonName;
	}

	@Override
 	public String toString(){
		return 
			"LessonsPojo{" + 
			"compulsory = '" + compulsory + '\'' + 
			",creditScore = '" + creditScore + '\'' + 
			",lessonName = '" + lessonName + '\'' + 
			"}";
		}
}