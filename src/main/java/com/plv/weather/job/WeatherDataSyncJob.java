package com.plv.weather.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.plv.weather.service.impl.WeatherDataServiceImpl;

public class WeatherDataSyncJob extends QuartzJobBean {

	private final static Logger logger = LoggerFactory.getLogger(WeatherDataServiceImpl.class);

	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		logger.info("WeatherDataSyncJob");
	}

}
