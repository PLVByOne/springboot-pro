package com.plv.weather.service;

import com.plv.weather.vo.WeatherResponse;

/**
* <p>Title: WeatherDataService</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2018</p>
* @author yaohp 837965182@qq.com
* @date 2018��9��13�� ����2:39:49
* @version 1.0  
*@instructions:
*/
public interface WeatherDataService {

	/**
	 * <p>Title: getDataByCityId</p>  
	 * <p>Description: ���ݳ���ID��ѯ��������</p>  
	 * @author yaohp  
	 * @date 2018��9��13��
	 * @param cityId
	 * @return
	 */
	WeatherResponse getDataByCityId(String cityId);
	
	/**
	 * <p>Title: getDataByCityName</p>  
	 * <p>Description: ���ݳ������Ʋ�ѯ��������</p>  
	 * @author yaohp  
	 * @date 2018��9��13��
	 * @param cityName
	 * @return
	 */
	WeatherResponse getDataByCityName(String cityName);
	
	/**
	 * <p>Title: syncDataByCityId</p>  
	 * <p>Description: 根据城市ID同步天气</p>  
	 * @author yaohp  
	 * @date 2018年9月14日
	 * @param cityId
	 */
	void syncDataByCityId(String cityId);
}

