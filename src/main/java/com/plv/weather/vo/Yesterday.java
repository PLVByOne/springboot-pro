package com.plv.weather.vo;

import java.io.Serializable;

/**
* <p>Title: Yesterday</p>
* <p>Description: ��������</p>
* <p>Copyright: Copyright (c) 2018</p>
* @author yaohp 837965182@qq.com
* @date 2018��9��13�� ����2:29:38
* @version 1.0  
*@instructions:
*/
public class Yesterday implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String date;
	private String high;
	private String fx;
	private String low;
	private String fl;
	private String type;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getHigh() {
		return high;
	}
	public void setHigh(String high) {
		this.high = high;
	}
	public String getFx() {
		return fx;
	}
	public void setFx(String fx) {
		this.fx = fx;
	}
	public String getLow() {
		return low;
	}
	public void setLow(String low) {
		this.low = low;
	}
	public String getFl() {
		return fl;
	}
	public void setFl(String fl) {
		this.fl = fl;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}

