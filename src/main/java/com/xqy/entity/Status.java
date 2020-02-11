package com.xqy.entity;

public enum Status {
	
	CHECKED(1,"已审"),UNCHECKED(0,"未审"),REJECT(2,"驳回");
	
	private Integer code;
	private String name;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private Status(Integer code, String name) {
		this.code = code;
		this.name = name;
	}
	
	
}
