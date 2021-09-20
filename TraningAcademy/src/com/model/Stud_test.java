package com.model;

public class Stud_test {
public Stud_test(int studid, int testid, int marks) {
		super();
		this.studid = studid;
		this.testid = testid;
		this.marks = marks;
	}
private int studid;
private int testid;
private int marks;
public int getStudid() {
	return studid;
}
public void setStudid(int studid) {
	this.studid = studid;
}
public int getTestid() {
	return testid;
}
public void setTestid(int testid) {
	this.testid = testid;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
}

