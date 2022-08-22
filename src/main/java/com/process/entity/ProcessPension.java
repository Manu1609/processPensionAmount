package com.process.entity;

public class ProcessPension {

	Double pensionAmount;
	Integer bankServiceCharge;
	
	
	/**
	 * @param pensionAmount
	 * @param bankServiceCharge
	 */
	public ProcessPension(Double pensionAmount, Integer bankServiceCharge) {
		super();
		this.pensionAmount = pensionAmount;
		this.bankServiceCharge = bankServiceCharge;
	}
	/**
	 * 
	 */
	public ProcessPension() {
		super();
	}
	/**
	 * @return the pensionAmount
	 */
	public Double getPensionAmount() {
		return pensionAmount;
	}
	/**
	 * @param pensionAmount the pensionAmount to set
	 */
	public void setPensionAmount(Double pensionAmount) {
		this.pensionAmount = pensionAmount;
	}
	/**
	 * @return the bankServiceCharge
	 */
	public Integer getBankServiceCharge() {
		return bankServiceCharge;
	}
	/**
	 * @param bankServiceCharge the bankServiceCharge to set
	 */
	public void setBankServiceCharge(Integer bankServiceCharge) {
		this.bankServiceCharge = bankServiceCharge;
	}
	
		
}
