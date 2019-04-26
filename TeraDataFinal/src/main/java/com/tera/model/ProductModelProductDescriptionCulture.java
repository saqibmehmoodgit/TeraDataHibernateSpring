package com.tera.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "productmodelproductdescriptionculture")

public class ProductModelProductDescriptionCulture {
	@Id
	@GeneratedValue
	long	productmodelid;
	String productdescriptionid;
	String cultureid ;  // 3 pks

	String modifieddate;
	///

	public long getProductmodelid() {
		return productmodelid;
	}

	public void setProductmodelid(long productmodelid) {
		this.productmodelid = productmodelid;
	}

	public String getProductdescriptionid() {
		return productdescriptionid;
	}

	public void setProductdescriptionid(String productdescriptionid) {
		this.productdescriptionid = productdescriptionid;
	}

	public String getCultureid() {
		return cultureid;
	}

	public void setCultureid(String cultureid) {
		this.cultureid = cultureid;
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
		result = prime * result + (int) (productmodelid ^ (productmodelid >>> 32));
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
		ProductModelProductDescriptionCulture other = (ProductModelProductDescriptionCulture) obj;
		if (productmodelid != other.productmodelid)
			return false;
		return true;
	}
	
	
	
	
}
