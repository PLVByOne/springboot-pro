package com.plv.weather.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
* <p>Title: City</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2018</p>
* @author yaohp 837965182@qq.com
* @date 2018年9月14日 上午9:18:05
* @version 1.0  
*@instructions:
*/
@XmlRootElement(name="d")
@XmlAccessorType(XmlAccessType.FIELD)
public class City {
	@XmlAttribute(name="d1")
	private String cityId;
	
	@XmlAttribute(name="d2")
	private String cityName;
	
	@XmlAttribute(name="d3")
	private String cityCode;
	
	@XmlAttribute(name="d4")
	private String province;

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	
}

