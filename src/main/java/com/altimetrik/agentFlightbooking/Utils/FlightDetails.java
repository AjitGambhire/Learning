package com.altimetrik.agentFlightbooking.Utils;

import java.util.ArrayList;



public class FlightDetails {

	public static ArrayList<Flight> getDetails(String sourceCity, String destCity) {

		
		ArrayList<Flight> list = new ArrayList<Flight>();

		if (sourceCity.toLowerCase().equals("pune")) {

			/*
			 * long flightNo; String airlineName; double deptTime; double arrivalTime;
			 * double duration; int totalStops; int price; int totalResults;
			 */
			if (destCity.toLowerCase().equals("bangalore")) {
				list.add(new Flight(12121, "Jet Airways", 13.00, 15.00, 2.00, 1, 1200, 3));
				list.add(new Flight(45214, "Kingfisher", 16.00, 19.00, 3.00, 1, 1500, 2));
				list.add(new Flight(34289, "indigo", 08.00, 11.00, 3.00, 1, 1900, 2));

				return list;
			}

			if (destCity.toLowerCase().equals("kolkata")) {

				list.add(new Flight(45214, "Kingfisher", 16.00, 19.00, 3.00, 1, 1500, 2));
				list.add(new Flight(34289, "indigo", 08.00, 11.00, 3.00, 1, 1900, 2));

				return list;
			}

			if (destCity.toLowerCase().equals("mumbai")) {

				list.add(new Flight(45214, "Kingfisher", 16.00, 19.00, 3.00, 1, 1500, 2));
				list.add(new Flight(34289, "indigo", 08.00, 11.00, 3.00, 1, 1900, 2));

				return list;
			}

			return list;
		}

		if (sourceCity.toLowerCase().equals("bangalore")) {

			if (destCity.toLowerCase().equals("pune")) {

				list.add(new Flight(45214, "Kingfisher", 16.00, 19.00, 3.00, 1, 1500, 2));
				list.add(new Flight(34289, "indigo", 08.00, 11.00, 3.00, 1, 1900, 2));

				return list;
			}

			if (destCity.toLowerCase().equals("kolkata")) {

				list.add(new Flight(45214, "Kingfisher", 16.00, 19.00, 3.00, 1, 1500, 2));
				list.add(new Flight(34289, "indigo", 08.00, 11.00, 3.00, 1, 1900, 2));

				return list;
			}

			return list;
		}

		return list;

	}

}
