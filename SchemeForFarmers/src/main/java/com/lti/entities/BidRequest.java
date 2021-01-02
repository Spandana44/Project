package com.lti.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tbl_bidRequest")
public class BidRequest {
	
	@Id
	@SequenceGenerator(name="seq_bidRequest",initialValue=3001,allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_bidRequest")
	long bidRequestId;
	double bidAmount;
	LocalDate bidDate;
	String status;
	
	@ManyToOne
	@JoinColumn(name="bid_id")
	BidderPersonalDetails bidderPersonalDetails;
	
	@OneToOne
	@JoinColumn(name="crop_id")
	CropDetails cropDetails;

	
	
	public long getBidRequestId() {
		return bidRequestId;
	}

	public void setBidRequestId(long bidRequestId) {
		this.bidRequestId = bidRequestId;
	}

	public double getBidAmount() {
		return bidAmount;
	}

	public void setBidAmount(double bidAmount) {
		this.bidAmount = bidAmount;
	}

	public LocalDate getBidDate() {
		return bidDate;
	}

	public void setBidDate(LocalDate bidDate) {
		this.bidDate = bidDate;
	}

	public BidderPersonalDetails getBidderPersonalDetails() {
		return bidderPersonalDetails;
	}

	public void setBidderPersonalDetails(BidderPersonalDetails bidderPersonalDetails) {
		this.bidderPersonalDetails = bidderPersonalDetails;
	}

	public CropDetails getCropDetails() {
		return cropDetails;
	}

	public void setCropDetails(CropDetails cropDetails) {
		this.cropDetails = cropDetails;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
