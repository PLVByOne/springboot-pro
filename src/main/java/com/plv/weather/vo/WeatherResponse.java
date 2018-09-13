package com.plv.weather.vo;

import java.io.Serializable;

/**
* <p>Title: Weather Response</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2018</p>
* @author yaohp 837965182@qq.com
* @date 2018年9月13日 下午2:36:35
* @version 1.0  
*@instructions:
*/
public class WeatherResponse implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Weather data;
	private Integer status;
	private String desc;
	
	public Weather getData() {
		return data;
	}
	public void setData(Weather data) {
		this.data = data;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}

