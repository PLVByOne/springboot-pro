package com.plv.weather.config;

import java.nio.charset.StandardCharsets;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
* <p>Title: RestConfiguration</p>
* <p>Description: Rest������</p>
* <p>Copyright: Copyright (c) 2018</p>
* @author yaohp 837965182@qq.com
* @date 2018��9��13�� ����3:12:38
* @version 1.0  
*@instructions:
*/
@Configuration
public class RestConfiguration {
	
//	@Autowired
//	private RestTemplateBuilder builder;
	
	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate(
				new HttpComponentsClientHttpRequestFactory());
		restTemplate.getMessageConverters().set(1, 
				new StringHttpMessageConverter(StandardCharsets.UTF_8));
		return restTemplate;
	}
}

