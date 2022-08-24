package com.process.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.process.client.PensionerDetailMicroserviceClient;
import com.process.entity.PensionerDetail;
import com.process.entity.ProcessPension;
import com.process.service.CalculatePension;

@RestController
@RequestMapping("/process")
public class ProcessController {

	@Autowired
	private PensionerDetailMicroserviceClient pensionerDetailMicroserviceClient;

	@GetMapping(value = "/healthcheck")
	public ResponseEntity<String> healthcheck() {
		return new ResponseEntity<>("Healthcheck-ok",HttpStatus.OK);
	}
	
	@GetMapping(value = "/find/{aadhar}")
	public  ResponseEntity<ProcessPension> findPensionerByAadhar(@PathVariable("aadhar") String aadhar) {
		PensionerDetail pensionerDetail = pensionerDetailMicroserviceClient.findPensionerByAadhar(aadhar);
		ProcessPension pensionDetail = CalculatePension.calculatePension(pensionerDetail);
		return new ResponseEntity<ProcessPension>(pensionDetail, HttpStatus.OK);
	}
}
