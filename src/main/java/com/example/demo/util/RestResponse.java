package com.example.demo.util;

public class RestResponse {

	private Integer responseCode;
	private String message;
	
	public RestResponse(Integer _responseCode) {
		super();
		this.responseCode = _responseCode;
	}
	
	public RestResponse(Integer _responseCode, String _message) {
		super();
		this.responseCode = _responseCode;
		this.message = _message;
	}
	
	public Integer getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
