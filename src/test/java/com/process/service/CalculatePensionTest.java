package com.process.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.text.ParseException;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.process.entity.PensionerDetail;
import com.process.entity.ProcessPension;
import com.process.util.DateUtil;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CalculatePension.class)
public class CalculatePensionTest {
	
	
	@Autowired
	public CalculatePension calculatePension;
	
	 @Test
	    void testNotNullCalculatePensionObject() {
	        assertNotNull(calculatePension);
	    }
	
	@Test
	void CalculatePensionTest() throws NumberFormatException, ParseException {
		final String aadhar = "123456789030";
		PensionerDetail pensionerDetail = new PensionerDetail(aadhar,"Vamsi",DateUtil.parseDate("25-03-1999"),
			"TYIUI09782",Double.parseDouble("50000"),Double.parseDouble("12356"),"family","City",Long.parseLong("12345696"),"private");
			
		ProcessPension processPension = new ProcessPension(Double.parseDouble("37356.0"),550);
		
		equals(CalculatePension.calculatePension(pensionerDetail).getPensionAmount());
		equals(CalculatePension.calculatePension(pensionerDetail).getBankServiceCharge());
	}

}
