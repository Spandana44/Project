package com.lti.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_bidderBankDetails")
public class BidderBankDetails {
	
	@Id
	long accountNo;
	String ifscCode;
	
	@OneToOne
	@JoinColumn(name="bidder_id")
	BidderPersonalDetails bidderPersonalDetails;

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public BidderPersonalDetails getBidderPersonalDetails() {
		return bidderPersonalDetails;
	}

	public void setBidderPersonalDetails(BidderPersonalDetails bidderPersonalDetails) {
		this.bidderPersonalDetails = bidderPersonalDetails;
	}
	
	
	

}
