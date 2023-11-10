package techproed.pojos.US04_05_16.ViceDean;

import java.io.Serializable;

public class PageableGetResponse implements Serializable {
	private SortGetResponse sort;
	private int offset;
	private int pageNumber;
	private int pageSize;
	private boolean paged;
	private boolean unpaged;

	public void setSort(SortGetResponse sort){
		this.sort = sort;
	}

	public SortGetResponse getSort(){
		return sort;
	}

	public void setOffset(int offset){
		this.offset = offset;
	}

	public int getOffset(){
		return offset;
	}

	public void setPageNumber(int pageNumber){
		this.pageNumber = pageNumber;
	}

	public int getPageNumber(){
		return pageNumber;
	}

	public void setPageSize(int pageSize){
		this.pageSize = pageSize;
	}

	public int getPageSize(){
		return pageSize;
	}

	public void setPaged(boolean paged){
		this.paged = paged;
	}

	public boolean isPaged(){
		return paged;
	}

	public void setUnpaged(boolean unpaged){
		this.unpaged = unpaged;
	}

	public boolean isUnpaged(){
		return unpaged;
	}

	@Override
 	public String toString(){
		return 
			"PageableGetResponse{" + 
			"sort = '" + sort + '\'' + 
			",offset = '" + offset + '\'' + 
			",pageNumber = '" + pageNumber + '\'' + 
			",pageSize = '" + pageSize + '\'' + 
			",paged = '" + paged + '\'' + 
			",unpaged = '" + unpaged + '\'' + 
			"}";
		}
}