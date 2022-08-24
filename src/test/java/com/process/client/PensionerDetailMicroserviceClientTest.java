package com.process.client;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest(classes = PensionerDetailMicroserviceClient.class)
public class PensionerDetailMicroserviceClientTest {

	@MockBean
	private PensionerDetailMicroserviceClient pensionerDetailMicroserviceClient;
	
}
