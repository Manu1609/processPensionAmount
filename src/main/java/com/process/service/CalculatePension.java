package com.process.service;

import com.process.entity.PensionerDetail;
import com.process.entity.ProcessPension;

public class CalculatePension {
	
	public static ProcessPension calculatePension(PensionerDetail pensionerDetail) {
		Double allowances = pensionerDetail.getAllowances();
		Double salary = pensionerDetail.getSalary();
		Integer publicBank = 500;
		Integer privateBank = 550;
		double salaryEarned;
		ProcessPension pensionDetail = new ProcessPension();

		if (pensionerDetail.getPensionType().matches("self")) {
			salaryEarned = (salary * 0.8) + allowances;
			pensionDetail.setPensionAmount(salaryEarned);
		} else if (pensionerDetail.getPensionType().matches("family")) {
			salaryEarned = (salary * 0.5) + allowances;
			pensionDetail.setPensionAmount(salaryEarned);
		}
		if (pensionerDetail.getBankType().matches("public")) {
			pensionDetail.setBankServiceCharge(publicBank);
			System.out.println(pensionDetail.getBankServiceCharge());
		} else if (pensionerDetail.getBankType().matches("private")) {
			pensionDetail.setBankServiceCharge(privateBank);
			System.out.println(pensionDetail.getBankServiceCharge());
		}
		return pensionDetail;
		
	}

}
