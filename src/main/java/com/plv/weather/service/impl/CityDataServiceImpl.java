package com.plv.weather.service.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.plv.weather.service.CityDataService;
import com.plv.weather.utils.XmlBuilder;
import com.plv.weather.vo.City;
import com.plv.weather.vo.CityList;

/**
* <p>Title: CityDataServiceImpl</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2018</p>
* @author yaohp 837965182@qq.com
* @date 2018年9月14日 上午9:36:02
* @version 1.0  
*@instructions:
*/
@Service
public class CityDataServiceImpl implements CityDataService {

	@Override
	public List<City> listCity() throws Exception {
		//读取XML文件
		Resource resource = new ClassPathResource("cityList.xml");
		BufferedReader bf = new BufferedReader(new InputStreamReader(resource.getInputStream(), "UTF-8"));
		StringBuffer buffer = new StringBuffer();
		String line = "";
		
		while((line = bf.readLine()) != null) {
			buffer.append(line);
		}
		
		bf.close();
		
		//XML转为java对象
		CityList cityList = (CityList) XmlBuilder.xmlStrToObject(CityList.class, buffer.toString());
		
		return cityList.getCityList();
	}

}

