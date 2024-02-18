package com.java8;

public class EMP {
	int eid;
	String ename;
	double esal;

	public EMP(int eid, String string, double esal) {
		super();
		this.eid = eid;
		this.ename = string;
		this.esal = esal;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "EMP [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}

}
