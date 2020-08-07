package com.altimetrik.agentFlightbooking.Utils.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.altimetrik.agentFlightbooking.Utils.Flight;
import com.altimetrik.agentFlightbooking.Utils.FlightDetails;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
@SpringBootTest
public class FlightDetailsTest {

	
	@Test
	public void testCities() {
		String alirplaneName="Jet Airways";
		
		ArrayList<Flight> flight=null;
		
	flight=	FlightDetails.getDetails("pune", "bangalore");
		
		
		assertEquals(alirplaneName, flight.get(0).getAirlineName());
		
	}
	
}
