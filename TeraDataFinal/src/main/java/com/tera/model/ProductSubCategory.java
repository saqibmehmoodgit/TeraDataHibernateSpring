package com.tera.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "productsubcategory")

public class ProductSubCategory {
	@Id
	@GeneratedValue

	long productsubcategoryid;
	String name; //////// 2 pk

	long productcategoryid;
	String modifieddate;

	public long getProductsubcategoryid() {
		return productsubcategoryid;
	}

	public void setProductsubcategoryid(long productsubcategoryid) {
		this.productsubcategoryid = productsubcategoryid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getProductcategoryid() {
		return productcategoryid;
	}

	public void setProductcategoryid(long productcategoryid) {
		this.productcategoryid = productcategoryid;
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
		result = prime * result + (int) (productsubcategoryid ^ (productsubcategoryid >>> 32));
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
		ProductSubCategory other = (ProductSubCategory) obj;
		if (productsubcategoryid != other.productsubcategoryid)
			return false;
		return true;
	}

}
