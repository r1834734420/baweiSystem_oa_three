package com.bawei.utils;

import java.util.List;

public class PageView<T> {

	
	private int firstIndex;
	//总记录数
	private Long  totalRecord;
	//每页记录数
	private int pageNum=10;
	//总页数
	private Long totalPage;
	//当前页码
	private int currentPage=1;
	//分页后的数据
	private List<T> records;
	
	public PageView(){}
	
	public PageView(int currentPage,int pageNum)
	{
		this.pageNum=pageNum;
		this.currentPage=currentPage;
		this.firstIndex=(this.currentPage-1)*this.pageNum;
	}

	public Long getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(Long totalRecord) {
		this.totalRecord = totalRecord;
		this.totalPage=this.totalRecord%this.pageNum==0? this.totalRecord/this.pageNum :this.totalRecord/this.pageNum+1;
		
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public Long getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
		
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public List<T> getRecords() {
		return records;
	}

	public void setRecords(List<T> records) {
		this.records = records;
	}

	public int getFirstIndex() {
		return firstIndex;
	}

	public void setFirstIndex(int firstIndex) {
		this.firstIndex = firstIndex;
	}
	
}