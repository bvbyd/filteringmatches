package com.exercise.filteringmatches;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilteringMatchesApplicationTests {

	@Autowired
	private WebApplicationContext context;

	private MockMvc mvc;

	@Before
	public void setUp() {
		this.mvc = MockMvcBuilders.webAppContextSetup(this.context).build();
	}

	@Test
	public void testApiFilter() throws Exception {
		this.mvc.perform(get("/api/persons")).andExpect(status().isOk()).andExpect(jsonPath("$.length()").value(24));
	}

	@Test
	public void testApiFilterDistance() throws Exception {
		this.mvc.perform(get("/api/persons?distance=200")).andExpect(status().isOk())
				.andExpect(jsonPath("$.length()").value(16));
	}

	@Test
	public void testApiFilterAgeAndHeight() throws Exception {
		this.mvc.perform(get("/api/persons?ageFrom=50&heightTo=150")).andExpect(status().isOk())
				.andExpect(jsonPath("$.length()").value(1)).andExpect(jsonPath("$.[0].displayName").value("Marta"));
	}

}
