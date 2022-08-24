package com.process;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(classes = ProcessPensionAmountApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringJUnit4ClassRunner.class)
class ProcessPensionMicroserviceApplicationTests {

	@Test
	void contextLoads() {
		ProcessPensionAmountApplication.main(new String[] {});
		assertNotNull(ProcessPensionAmountApplication.class);
	}

}
