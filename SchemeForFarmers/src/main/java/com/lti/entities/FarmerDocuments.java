package com.lti.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_farmerDocuments")
public class FarmerDocuments {
	
	@Id
	long aadharNo;
	String panNo;
	
	@OneToOne
	@JoinColumn(name="farmer_id")
	FarmerPersonalDetails farmerPersonalDetails;

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public FarmerPersonalDetails getFarmerPersonalDetails() {
		return farmerPersonalDetails;
	}

	public void setFarmerPersonalDetails(FarmerPersonalDetails farmerPersonalDetails) {
		this.farmerPersonalDetails = farmerPersonalDetails;
	}
	
	

}
