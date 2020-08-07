package com.altimetrik.agentFlightbooking.controller.test;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.altimetrik.agentFlightbooking.controller.FlightsController;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
@SpringBootTest
public class FlightsControllerTest {

	@Autowired
	private FlightsController controller;

	@Autowired
	private MockMvc mvc;
	
	@Test
	public void contexLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
	
	
}
