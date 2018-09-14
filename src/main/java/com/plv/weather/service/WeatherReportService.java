package com.plv.weather.service;

import com.plv.weather.vo.Weather;

/**
* <p>Title: WeatherReportService</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2018</p>
* @author yaohp 837965182@qq.com
* @date 2018年9月14日 上午11:35:54
* @version 1.0  
*@instructions:
*/
public interface WeatherReportService {

	Weather getDataByCityId(String cityId);
}

