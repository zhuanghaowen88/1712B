package com.zhuanghaowen.bean;

public class Goods {

	private Integer gid;
	
	private String gname;
	
	private String gdatea;
	
	private Integer tid;
	
	private String gprice;
	
	private String gstatus;

	public Integer getGid() {
		return gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getGdatea() {
		return gdatea;
	}

	public void setGdatea(String gdatea) {
		this.gdatea = gdatea;
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getGprice() {
		return gprice;
	}

	public void setGprice(String gprice) {
		this.gprice = gprice;
	}

	public String getGstatus() {
		return gstatus;
	}

	public void setGstatus(String gstatus) {
		this.gstatus = gstatus;
	}

	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", gdatea=" + gdatea + ", tid=" + tid + ", gprice=" + gprice
				+ ", gstatus=" + gstatus + "]";
	}
	
	
}
