package com.plv.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.plv.weather.service.CityDataService;
import com.plv.weather.service.WeatherReportService;

@RestController
@RequestMapping("/report")
public class WeatherReportController {
	
	@Autowired
	private CityDataService cityDataService;
	
	@Autowired
	private WeatherReportService weatherReportService;

	@GetMapping("/cityId/{cityId}")
	public ModelAndView getReportByCityId(@PathVariable("cityId") String cityId, Model model) throws Exception {
		model.addAttribute("title","PLV天气预告(PLV.com)");
		model.addAttribute("cityId",cityId);
		model.addAttribute("cityList",cityDataService.listCity());
		model.addAttribute("report",weatherReportService.getDataByCityId(cityId));
		
		return new ModelAndView("weather/report","reportModel",model);
	}
}
