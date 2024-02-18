package com.java8.emp.storing;


public class emps {
	Integer eid;
	String ename;
	Double esalary;
	public emps(Integer eid, String ename, double esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "emps [eid=" + eid + ", name=" + ename + ", salary=" + esalary + "]";
	}
	

}
