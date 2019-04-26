package com.tera.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "salesreason")

public class SalesReason {
	@Id
	@GeneratedValue
	long	salesreasonid;//// i n p
    String  name_; 
	String  reasontype;
	public long getSalesreasonid() {
		return salesreasonid;
	}
	public void setSalesreasonid(long salesreasonid) {
		this.salesreasonid = salesreasonid;
	}
	public String getName_() {
		return name_;
	}
	public void setName_(String name_) {
		this.name_ = name_;
	}
	public String getReasontype() {
		return reasontype;
	}
	public void setReasontype(String reasontype) {
		this.reasontype = reasontype;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (salesreasonid ^ (salesreasonid >>> 32));
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
		SalesReason other = (SalesReason) obj;
		if (salesreasonid != other.salesreasonid)
			return false;
		return true;
	}
	
	
	
	


}
