package com.plv.weather.vo;

import java.io.Serializable;

/**
* <p>Title: Forecast</p>
* <p>Description: 未来的天气</p>
* <p>Copyright: Copyright (c) 2018</p>
* @author yaohp 837965182@qq.com
* @date 2018年9月13日 下午2:29:45
* @version 1.0  
*@instructions:
*/
public class Forecast implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String date;
	private String high;
	private String fengli;
	private String low;
	private String fengxiang;
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
	public String getFengli() {
		return fengli;
	}
	public void setFengli(String fengli) {
		this.fengli = fengli;
	}
	public String getLow() {
		return low;
	}
	public void setLow(String low) {
		this.low = low;
	}
	public String getFengxiang() {
		return fengxiang;
	}
	public void setFengxiang(String fengxiang) {
		this.fengxiang = fengxiang;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}

