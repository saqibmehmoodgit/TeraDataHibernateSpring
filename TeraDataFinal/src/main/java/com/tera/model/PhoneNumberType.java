package com.tera.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

  @Entity(name = "phonenumbertype")
   public class PhoneNumberType {
	@Id
	@GeneratedValue
	@Column(name = "phonenumbertypeid")
	long PhoneNumberTypeID;
	String name;
	String modifieddate;
	public long getPhoneNumberTypeID() {
		return PhoneNumberTypeID;
	}
	public void setPhoneNumberTypeID(long phoneNumberTypeID) {
		PhoneNumberTypeID = phoneNumberTypeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModifieddate() {
		return modifieddate;
	}
	public void setModifieddate(String modifieddate) {
		this.modifieddate = modifieddate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (PhoneNumberTypeID ^ (PhoneNumberTypeID >>> 32));
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
		PhoneNumberType other = (PhoneNumberType) obj;
		if (PhoneNumberTypeID != other.PhoneNumberTypeID)
			return false;
		return true;
	}


  
  
  }
