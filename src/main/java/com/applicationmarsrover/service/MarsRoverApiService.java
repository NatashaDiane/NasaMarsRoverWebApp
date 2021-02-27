package com.applicationmarsrover.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.applicationmarsrover.response.MarsRoverApiResponse;

@Service
public class MarsRoverApiService {
	private static final String API_KEY = "YourApiKey";
	
	public MarsRoverApiResponse getData(String roverName, Integer marsSol) {
		//Rest template comes from Spring web its a way to issue http requests and take the data and map it back into our own java objects
		RestTemplate rt = new RestTemplate();
		ResponseEntity<MarsRoverApiResponse> response = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/"+roverName+"/photos?sol="+marsSol+"&api_key=" + API_KEY, MarsRoverApiResponse.class);
		
		return response.getBody();
	}

}
