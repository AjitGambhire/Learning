package com.altimetrik.agentFlightbooking.Utils;


public class Flight {


	long flightNo;
	
	String airlineName;
	double deptTime;
	double arrivalTime;
	double duration;
	int totalStops;
	int price;
	int totalResults;

	public Flight(long flightNo, String airlineName, double deptTime, double arrivalTime, double duration, int totalStops,
			int price, int totalResults) {
		super();
		this.flightNo = flightNo;
		this.airlineName = airlineName;
		this.deptTime = deptTime;
		this.arrivalTime = arrivalTime;
		this.duration = duration;
		this.totalStops = totalStops;
		this.price = price;
		this.totalResults = totalResults;
	}


	public Flight() {
		// TODO Auto-generated constructor stub
	}


	


	public long getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(long flightNo) {
		this.flightNo = flightNo;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public double getDeptTime() {
		return deptTime;
	}

	public void setDeptTime(double deptTime) {
		this.deptTime = deptTime;
	}

	public double getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(double arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getTotalStops() {
		return totalStops;
	}

	public void setTotalStops(int totalStops) {
		this.totalStops = totalStops;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTotalResults() {
		return totalResults;
	}

	public void setTotalResults(int totalResults) {
		this.totalResults = totalResults;
	}
	
	@Override
	public String toString() {
		return "flight No: " + flightNo +"\n"+ "airline Name: " + airlineName +"\n"+ "departure Time=" + deptTime
				+"\n"+ ", arrivalTime=" + arrivalTime +"\n"+ " duration=" + duration +"\n"+ " totalStops=" + totalStops +"\n"+ ", price="
				+ price +"\n"+ ", totalResults=" + totalResults+"\n" ;
	}


}
