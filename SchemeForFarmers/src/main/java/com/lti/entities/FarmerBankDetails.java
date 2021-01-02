package com.lti.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_farmerBankDetails")
public class FarmerBankDetails {
	
	@Id
	long farmerAccountNo;
	String ifscCode;
	
	@OneToOne
	@JoinColumn(name="farmer_id")
	FarmerPersonalDetails farmerPersonalDetails;

	public long getAccountNo() {
		return farmerAccountNo;
	}

	public void setAccountNo(long accountNo) {
		this.farmerAccountNo = accountNo;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public FarmerPersonalDetails getFarmerPersonalDetails() {
		return farmerPersonalDetails;
	}

	public void setFarmerPersonalDetails(FarmerPersonalDetails farmerPersonalDetails) {
		this.farmerPersonalDetails = farmerPersonalDetails;
	}
	
}
