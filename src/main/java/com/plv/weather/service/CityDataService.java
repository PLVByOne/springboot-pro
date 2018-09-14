package com.plv.weather.service;

import java.util.List;

import com.plv.weather.vo.City;

/**
* <p>Title: CityDataService</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2018</p>
* @author yaohp 837965182@qq.com
* @date 2018年9月14日 上午9:34:02
* @version 1.0  
*@instructions:
*/
public interface CityDataService {
	
	/**
	 * <p>Title: listCity</p>  
	 * <p>Description: 获取City列表</p>  
	 * @author yaohp  
	 * @date 2018年9月14日
	 * @return
	 * @throws Exception
	 */
	List<City> listCity() throws Exception;
}

