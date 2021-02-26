package com.applicationmarsrover.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarsRoverPhoto {
	private Long id;
	private Integer sol;
	//an object
	private MarsRoverCamera camera;
	@JsonProperty("img_src")
	private String imgSrc;
	@JsonProperty("earth_date")
	private String earthDate;
	//an object
	private MarsRover rover;

	public String getEarthDate() {
		return earthDate;
	}

	public void setEarthDate(String earthDate) {
		this.earthDate = earthDate;
	}

	public MarsRover getRover() {
		return rover;
	}

	public void setRover(MarsRover rover) {
		this.rover = rover;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getSol() {
		return sol;
	}

	public void setSol(Integer sol) {
		this.sol = sol;
	}

	public MarsRoverCamera getCamera() {
		return camera;
	}

	public void setCamera(MarsRoverCamera camera) {
		this.camera = camera;
	}

	public String getImgSrc() {
		return imgSrc;
	}

	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}

	@Override
	public String toString() {
		return "MarsPhoto [id=" + id + ", sol=" + sol + ", camera=" + camera + ", imgSrc=" + imgSrc + ", earthDate="
				+ earthDate + ", rover=" + rover + "]";
	}
	
	

}
