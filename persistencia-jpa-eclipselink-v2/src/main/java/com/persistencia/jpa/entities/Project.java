package com.persistencia.jpa.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Project {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO) 
	private int pid;
	private String pname;
	private int pduration;
	
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public String getPname() {
		return pname;
	}
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public int getPduration() {
		return pduration;
	}
	
	public void setPduration(int pduration) {
		this.pduration = pduration;
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", pduration=" + pduration + "]";
	}
}
