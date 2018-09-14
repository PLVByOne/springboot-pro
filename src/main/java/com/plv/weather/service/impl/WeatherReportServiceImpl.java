package com.plv.weather.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plv.weather.service.WeatherDataService;
import com.plv.weather.service.WeatherReportService;
import com.plv.weather.vo.Weather;
import com.plv.weather.vo.WeatherResponse;

/**
* <p>Title: WeatherReportServiceImpl</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2018</p>
* @author yaohp 837965182@qq.com
* @date 2018年9月14日 上午11:38:11
* @version 1.0  
*@instructions:
*/
@Service
public class WeatherReportServiceImpl implements WeatherReportService {

	@Autowired
	private WeatherDataService weatherDataService;
	
	@Override
	public Weather getDataByCityId(String cityId) {
		WeatherResponse resp = weatherDataService.getDataByCityId(cityId);
		return resp.getData();
	}
	

}

