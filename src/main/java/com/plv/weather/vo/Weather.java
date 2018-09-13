package com.plv.weather.vo;

import java.io.Serializable;
import java.util.List;

/**
* <p>Title: Weather</p>
* <p>Description: ������Ϣ</p>
* <p>Copyright: Copyright (c) 2018</p>
* @author yaohp 837965182@qq.com
* @date 2018��9��13�� ����2:23:20
* @version 1.0  
*@instructions:
*/
public class Weather implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String city;
	private String aqi;
	private String ganmao;
	private String wendu;
	private Yesterday yesterday;
	private List<Forecast> forecast;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAqi() {
		return aqi;
	}
	public void setAqi(String aqi) {
		this.aqi = aqi;
	}
	public String getGanmao() {
		return ganmao;
	}
	public void setGanmao(String ganmao) {
		this.ganmao = ganmao;
	}
	public String getWendu() {
		return wendu;
	}
	public void setWendu(String wendu) {
		this.wendu = wendu;
	}
	public Yesterday getYesterday() {
		return yesterday;
	}
	public void setYesterday(Yesterday yesterday) {
		this.yesterday = yesterday;
	}
	public List<Forecast> getForecast() {
		return forecast;
	}
	public void setForecast(List<Forecast> forecast) {
		this.forecast = forecast;
	}
}

