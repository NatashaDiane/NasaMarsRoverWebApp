package com.applicationmarsrover.response;

import java.util.ArrayList;
import java.util.List;

public class MarsRoverApiResponse {
	List<MarsRoverPhoto> photos = new ArrayList<>();

	public List<MarsRoverPhoto> getPhotos() {
		return photos;
	}

	public void setPhotos(List<MarsRoverPhoto> photos) {
		this.photos = photos;
	}
	
	@Override
	public String toString() {
		return "MarsRoverApiResponse [photos=" + photos + "]";
	}

}
