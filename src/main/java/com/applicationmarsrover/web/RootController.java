package com.applicationmarsrover.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.applicationmarsrover.response.MarsRoverApiResponse;
import com.applicationmarsrover.service.MarsRoverApiService;


//a controller(mvc) listens for incoming requests(http requests), takes those requests and executes code...
@Controller
public class RootController {
	
	
	@Autowired
	private MarsRoverApiService marsService;
	
	
	@GetMapping("/")
	public String getHomePage (ModelMap model, @RequestParam(required=false) String marsRoverData, 
			@RequestParam(required=false) Integer marsSol) {
		// if request param is empty, then set a default value = curiosity
		if (StringUtils.isEmpty(marsRoverData)) {
			marsRoverData = "curiosity";}
		
		if (marsSol == null) 
			marsSol = 1;
	
		
		MarsRoverApiResponse photoData = marsService.getData(marsRoverData, marsSol);
		// model is basically key value pairs , its goal is to take data and pass this data to the front-end
		model.put("photoData", photoData);
		//returns an html page(view) called index
		return "index";
	}
	
//	@PostMapping("/")
//	public String postHomePage(ModelMap model, @RequestParam String marsRoverData) {
//		MarsRoverApiResponse photoData = marsService.getData(marsRoverData);
//		// model is basically key value pairs , its goal is to take data and pass this data to the front-end
//		model.put("photoData", photoData);
//		//returns an html page(view) called index
//		return "redirect:index";
//		
//		
//	}
}
