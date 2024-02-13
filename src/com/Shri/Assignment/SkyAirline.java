package com.Shri.Assignment;

public class SkyAirline {
	private String name,source,Destinaton;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestinaton() {
		return Destinaton;
	}

	public void setDestinaton(String destinaton) {
		Destinaton = destinaton;
	}

	@Override
	public String toString() {
		return "Dear "+name+","+"welcome onboard with the service from "+source+" to "+Destinaton+"."+" Thank you for choosing Sky Airlines. Enjoy your flight.";
	}
}
