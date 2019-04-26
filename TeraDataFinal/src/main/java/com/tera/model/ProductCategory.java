package com.tera.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "productcategory")

public class ProductCategory {

	@Id
	@GeneratedValue

	long productcategoryid;
	String name; //////// 2 pk
	String modifieddate;
	public long getProductcategoryid() {
		return productcategoryid;
	}
	public void setProductcategoryid(long productcategoryid) {
		this.productcategoryid = productcategoryid;
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
		result = prime * result + (int) (productcategoryid ^ (productcategoryid >>> 32));
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
		ProductCategory other = (ProductCategory) obj;
		if (productcategoryid != other.productcategoryid)
			return false;
		return true;
	}




}
