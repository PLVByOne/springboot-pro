package com.plv.weather.service.impl;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.plv.weather.service.WeatherDataService;
import com.plv.weather.vo.WeatherResponse;

/**
* <p>Title: WeatherDataService ʵ��</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2018</p>
* @author yaohp 837965182@qq.com
* @date 2018��9��13�� ����2:44:02
* @version 1.0  
*@instructions:
*/
@Service
public class WeatherDataServiceImpl implements WeatherDataService {
	
	private final static Logger logger = LoggerFactory.getLogger(WeatherDataServiceImpl.class);
	
	private static final String WEATHER_URI="http://wthrcdn.etouch.cn/weather_mini?";

	private static final long TIME_OUT = 1800L;//1800L
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	@Override
	public WeatherResponse getDataByCityId(String cityId) {
		String uri = WEATHER_URI+"citykey="+cityId;
		return this.doGetWeather(uri);
	}

	@Override
	public WeatherResponse getDataByCityName(String cityName) {
		String uri = WEATHER_URI+"city="+cityName;
		return this.doGetWeather(uri);
	}
	
	private WeatherResponse doGetWeather(String uri) {
		String key = uri;
		String strBody = null;
		ObjectMapper mapper = new ObjectMapper();
		WeatherResponse resp = null;
		ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
		//先查缓存，缓存有的取缓存中的数据
		if(stringRedisTemplate.hasKey(key)) {
			logger.info("Redis has data");
			strBody = ops.get(key);
		}else {
			logger.info("Redis don`t has data");
			//缓存没有，再调用服务接口获取
			ResponseEntity<String> respString = restTemplate.getForEntity(uri, String.class);
			
			if(respString.getStatusCodeValue() == 200) {
				strBody = respString.getBody();
			}
			
			//数据写入缓存
			ops.set(key, strBody, TIME_OUT, TimeUnit.SECONDS);
		}
		
		try {
			resp = mapper.readValue(strBody, WeatherResponse.class);
		} catch (IOException e) {
//			e.printStackTrace();
			logger.error("Error!",e);
		}
		
		return resp;
	}

}

