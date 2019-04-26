package com.tera.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity(name = "scrapreason")

public class ScrapReason {
	@Id
	@GeneratedValue
    long scrapreasonid; 
    String  name;
    String modifieddate;
	public long getScrapreasonid() {
		return scrapreasonid;
	}
	public void setScrapreasonid(long scrapreasonid) {
		this.scrapreasonid = scrapreasonid;
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
		result = prime * result + (int) (scrapreasonid ^ (scrapreasonid >>> 32));
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
		ScrapReason other = (ScrapReason) obj;
		if (scrapreasonid != other.scrapreasonid)
			return false;
		return true;
	}



}
