package techproed.pojos.US21_22.US_22;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetResponsePojo implements Serializable {

	private List<ContentPojo> content;

	public GetResponsePojo() {
	}

	public GetResponsePojo(List<ContentPojo> content) {
		this.content = content;
	}

	public void setContent(List<ContentPojo> content){
		this.content = content;
	}

	public List<ContentPojo> getContent(){
		return content;
	}

	@Override
 	public String toString(){
		return 
			"GetResponsePojo{" + 
			"content = '" + content + '\'' + 
			"}";
		}
}