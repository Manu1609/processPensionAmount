package com.process.controller;



import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.process.client.PensionerDetailMicroserviceClient;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ProcessController.class)
public class ProcessControllerTest {

	@MockBean
	private PensionerDetailMicroserviceClient pensionerDetailMicroserviceClient;
	
	@MockBean
	private ProcessController processController;
	
	@MockBean
	private MockMvc mockMvc;
	
}
