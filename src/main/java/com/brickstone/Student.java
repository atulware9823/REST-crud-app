package com.brickstone;

public class Student {
	
	private int sid;
	private String sname;
	private int spoint;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSpoint() {
		return spoint;
	}
	public void setSpoint(int spoint) {
		this.spoint = spoint;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", spoint=" + spoint + "]";
	}

}
