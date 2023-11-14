package techproed.pojos.US07_24.US07.GetMessageSearchByEmail;

import java.io.Serializable;

public class SortPojo implements Serializable {
	private boolean empty;
	private boolean sorted;
	private boolean unsorted;

	public SortPojo() {
	}


	public SortPojo(boolean empty, boolean sorted, boolean unsorted) {
		this.empty = empty;
		this.sorted = sorted;
		this.unsorted = unsorted;
	}

	public void setEmpty(boolean empty){
		this.empty = empty;
	}

	public boolean isEmpty(){
		return empty;
	}

	public void setSorted(boolean sorted){
		this.sorted = sorted;
	}

	public boolean isSorted(){
		return sorted;
	}

	public void setUnsorted(boolean unsorted){
		this.unsorted = unsorted;
	}

	public boolean isUnsorted(){
		return unsorted;
	}

	@Override
 	public String toString(){
		return 
			"SortPojo{" + 
			"empty = '" + empty + '\'' + 
			",sorted = '" + sorted + '\'' + 
			",unsorted = '" + unsorted + '\'' + 
			"}";
		}
}