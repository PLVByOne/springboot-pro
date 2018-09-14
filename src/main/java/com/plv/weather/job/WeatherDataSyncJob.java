package com.plv.weather.job;

import java.util.List;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.plv.weather.service.CityDataService;
import com.plv.weather.service.WeatherDataService;
import com.plv.weather.service.impl.WeatherDataServiceImpl;
import com.plv.weather.vo.City;

public class WeatherDataSyncJob extends QuartzJobBean {

	private final static Logger logger = LoggerFactory.getLogger(WeatherDataServiceImpl.class);

	@Autowired
	private CityDataService cityDataService;
	
	@Autowired
	private WeatherDataService weatherDataService;
	
	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		logger.info("Weather Data Sync Job,start!");
		//获取城市ID列表
		List<City> cityList = null;
		
		try {
			cityList = cityDataService.listCity();
		} catch (Exception e) {
			logger.error("Exception!",e);
		}
		//遍历城市ID 获取天气
		for(City city : cityList) {
			String cityId = city.getCityId();
			logger.info("Weather Data sync Job,cityId= "+cityId);
			
			weatherDataService.syncDataByCityId(cityId);
		}
		logger.info("Weather Data Sync Job, End !");
	}

}
