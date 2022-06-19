package board.model;

import java.sql.*;

public class BoardDTO {
	// Data Transfer Object
	
	private int num;
	
	private String name;
	
	private String password;
	
	private String subject;
	
	private String content;
	
	private Date writeDate;
	
	private Time writeTime;
	
	private int ref;
	
	private int step;
	
	private int lev;
	
	private int readCnt;
	
	private int ChildCnt;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	public Time getWriteTime() {
		return writeTime;
	}

	public void setWriteTime(Time writeTime) {
		this.writeTime = writeTime;
	}

	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public int getLev() {
		return lev;
	}

	public void setLev(int lev) {
		this.lev = lev;
	}

	public int getReadCnt() {
		return readCnt;
	}

	public void setReadCnt(int readCnt) {
		this.readCnt = readCnt;
	}

	public int getChildCnt() {
		return ChildCnt;
	}

	public void setChildCnt(int childCnt) {
		ChildCnt = childCnt;
	}
}
