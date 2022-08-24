package com.process.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;

import com.process.entity.PensionerDetail;

@FeignClient(name = "pensionDetailMicroservice",url="http://18.234.64.9:8080/pension")
public interface PensionerDetailMicroserviceClient {

	
	@GetMapping(value = "/find/{aadhar}")
	public PensionerDetail findPensionerByAadhar(@PathVariable("aadhar") String aadhar);
	
	
}
