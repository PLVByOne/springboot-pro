package com.plv.weather.config;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.plv.weather.job.WeatherDataSyncJob;

@Configuration
public class QuartzConfiguration {

	private static final int DO_TIME = 1800;
	//JobDetail
	@Bean
	public JobDetail weatherDataSyncJobDetail() {
		return JobBuilder.newJob(WeatherDataSyncJob.class).withIdentity("weatherDataSyncJob")
			.storeDurably().build();
	}
	//Trigger
	@Bean
	public Trigger weatherDataSyncTrigger() {
		SimpleScheduleBuilder schedBuilder = SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(DO_TIME)
				.repeatForever();
		return TriggerBuilder.newTrigger().forJob(weatherDataSyncJobDetail()).withIdentity("weatherDataSyncTrigger")
				.withSchedule(schedBuilder).build();
	}
}
