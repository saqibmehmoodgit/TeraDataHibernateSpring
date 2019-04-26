package com.tera.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "productvendor")

public class ProductVendor {

	@Id
	@GeneratedValue
	long businessentityid;/// p
	long productid; //// p ,
	String unitmeasurecode;//// p v
	int AverageLeadTime;
	float StandardPrice;
	float lastreceiptcost;
	Date lastreceiptdate;
	int minorderqty;
	int maxorderqty;
	int onorderqty;
	String ModifiedDate;

	public long getBusinessentityid() {
		return businessentityid;
	}

	public void setBusinessentityid(long businessentityid) {
		this.businessentityid = businessentityid;
	}

	public long getProductid() {
		return productid;
	}

	public void setProductid(long productid) {
		this.productid = productid;
	}

	public String getUnitmeasurecode() {
		return unitmeasurecode;
	}

	public void setUnitmeasurecode(String unitmeasurecode) {
		this.unitmeasurecode = unitmeasurecode;
	}

	public int getAverageLeadTime() {
		return AverageLeadTime;
	}

	public void setAverageLeadTime(int averageLeadTime) {
		AverageLeadTime = averageLeadTime;
	}

	public float getStandardPrice() {
		return StandardPrice;
	}

	public void setStandardPrice(float standardPrice) {
		StandardPrice = standardPrice;
	}

	public float getLastreceiptcost() {
		return lastreceiptcost;
	}

	public void setLastreceiptcost(float lastreceiptcost) {
		this.lastreceiptcost = lastreceiptcost;
	}

	public Date getLastreceiptdate() {
		return lastreceiptdate;
	}

	public void setLastreceiptdate(Date lastreceiptdate) {
		this.lastreceiptdate = lastreceiptdate;
	}

	public int getMinorderqty() {
		return minorderqty;
	}

	public void setMinorderqty(int minorderqty) {
		this.minorderqty = minorderqty;
	}

	public int getMaxorderqty() {
		return maxorderqty;
	}

	public void setMaxorderqty(int maxorderqty) {
		this.maxorderqty = maxorderqty;
	}

	public int getOnorderqty() {
		return onorderqty;
	}

	public void setOnorderqty(int onorderqty) {
		this.onorderqty = onorderqty;
	}

	public String getModifiedDate() {
		return ModifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		ModifiedDate = modifiedDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (businessentityid ^ (businessentityid >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductVendor other = (ProductVendor) obj;
		if (businessentityid != other.businessentityid)
			return false;
		return true;
	}

}
