package com.plv.weather.service;

import com.plv.weather.vo.WeatherResponse;

/**
* <p>Title: WeatherDataService</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2018</p>
* @author yaohp 837965182@qq.com
* @date 2018年9月13日 下午2:39:49
* @version 1.0  
*@instructions:
*/
public interface WeatherDataService {

	/**
	 * <p>Title: getDataByCityId</p>  
	 * <p>Description: 根据城市ID查询天气数据</p>  
	 * @author yaohp  
	 * @date 2018年9月13日
	 * @param cityId
	 * @return
	 */
	WeatherResponse getDataByCityId(String cityId);
	
	/**
	 * <p>Title: getDataByCityName</p>  
	 * <p>Description: 根据城市名称查询天气数据</p>  
	 * @author yaohp  
	 * @date 2018年9月13日
	 * @param cityName
	 * @return
	 */
	WeatherResponse getDataByCityName(String cityName);
}

