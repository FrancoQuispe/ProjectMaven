package com.example.demo.util;

import java.util.List;

public class QueryResult {

	private int totalrecords;
	private List<Object> list;
	
	public int getTotalrecords() {
		return totalrecords;
	}
	public void setTotalrecords(int totalrecords) {
		this.totalrecords = totalrecords;
	}
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
}
