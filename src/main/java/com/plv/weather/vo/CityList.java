package com.plv.weather.vo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
* <p>Title: CityList</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2018</p>
* @author yaohp 837965182@qq.com
* @date 2018年9月14日 上午9:23:58
* @version 1.0  
*@instructions:
*/
@XmlRootElement(name="c")
@XmlAccessorType(XmlAccessType.FIELD)
public class CityList {
	@XmlElement(name="d")
	private List<City> cityList;

	public List<City> getCityList() {
		return cityList;
	}

	public void setCityList(List<City> cityList) {
		this.cityList = cityList;
	}
	
}

