package com.tera;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.tera.model.Location;
import com.tera.repository.*;
import com.tera.services.LocationService;

@RunWith(SpringRunner.class)
@TestPropertySource(locations = "classpath:application-h2.properties")
@SpringBootTest
public class TeraDataFinalApplicationTests {

	@Autowired
	private LocationRepo location;

	private MockMvc mockMvc;

	@MockBean
	LocationService lSer;
	
	
	 @Autowired
	    private WebApplicationContext wac;

	    @Before
	    public void setup() {
	        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	    }
	
	
	RequestBuilder request =
			MockMvcRequestBuilders
			.get("http://localhost:8080/tera/location")
			.accept(MediaType.APPLICATION_JSON);
	@Test
	public void testGetMethod() throws Exception {
		Location location =new Location();
		location.setName("dinga");
		location.setAvailability(110);
		location.setLocationid(8);
		location.setModifieddate("06/10/2018");
		location.setCostrate((float) 12.23 );
	when(lSer.getByIdLocation()).thenReturn(location);
		MvcResult result = mockMvc.perform(request).
				andExpect(status().isOk())
				.andExpect(content().string("{\"locationid\":8,\"name\":\"dinga\",\"costrate\":12.23,\"availability\":110,\"modifieddate\":\"06/10/2018\"}"))
				.andReturn();

		///assertEquals("ALLAH KAREEM", result.getResponse().getContentAsString());
		//assertEquals(12100, result.getResponse().getContentAsString());
		
}
	
	///////////////////////////
	
	/*@Test
	public void contextLoads() {
	}*/
	
	
	@Test
	public void contextLoads() {
	}
	
	
}
