package com.tera.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "vendor")

public class Vendor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long businessentityid;
	String accountnumber;
	String name;
	long creditrating;
	long preferredvendorstatus;
	long activeflag;
	String purchasingwebserviceurl;
	String modifieddate;

	
	
	public long getBusinessentityid() {
		return businessentityid;
	}

	public void setBusinessentityid(long businessentityid) {
		this.businessentityid = businessentityid;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCreditrating() {
		return creditrating;
	}

	public void setCreditrating(long creditrating) {
		this.creditrating = creditrating;
	}

	public long getPreferredvendorstatus() {
		return preferredvendorstatus;
	}

	public void setPreferredvendorstatus(long preferredvendorstatus) {
		this.preferredvendorstatus = preferredvendorstatus;
	}

	public long getActiveflag() {
		return activeflag;
	}

	public void setActiveflag(long activeflag) {
		this.activeflag = activeflag;
	}

	public String getPurchasingwebserviceurl() {
		return purchasingwebserviceurl;
	}

	public void setPurchasingwebserviceurl(String purchasingwebserviceurl) {
		this.purchasingwebserviceurl = purchasingwebserviceurl;
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
		Vendor other = (Vendor) obj;
		if (businessentityid != other.businessentityid)
			return false;
		return true;
	}

}
