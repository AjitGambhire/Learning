package com.altimetrik.agentFlightbooking.controller;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.altimetrik.agentFlightbooking.Utils.Flight;
import com.altimetrik.agentFlightbooking.Utils.FlightDetails;


@Controller
public class FlightsController {

	

	@GetMapping("flightBooking")
	public String getForm() {
		return "flightBooking";
	}

	@PostMapping("/flightDetails") 
	public String saveDetails(@RequestParam("sourceCity") String sourceCity,
			@RequestParam("destCity") String destCity, @RequestParam("travelDate") String travelDate,
			ModelMap modelMap) {
		ArrayList<Flight> flight=null;
		
		flight=FlightDetails.getDetails(sourceCity,destCity);
		
		
		modelMap.put("sourceCity", sourceCity);
		modelMap.put("destCity", destCity);
		modelMap.put("flights", flight);
		
		return "flightDetails"; 
	}
}
