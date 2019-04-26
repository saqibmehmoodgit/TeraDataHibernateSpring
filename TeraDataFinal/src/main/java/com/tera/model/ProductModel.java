package com.tera.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "productmodel")


public class ProductModel {
	@Id
	@GeneratedValue
	
	long	productmodelid;
	String name;///   2 pk 
String catalogdescription; 
String instructions ;
String  modifieddate;
public long getProductmodelid() {
	return productmodelid;
}
public void setProductmodelid(long productmodelid) {
	this.productmodelid = productmodelid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCatalogdescription() {
	return catalogdescription;
}
public void setCatalogdescription(String catalogdescription) {
	this.catalogdescription = catalogdescription;
}
public String getInstructions() {
	return instructions;
}
public void setInstructions(String instructions) {
	this.instructions = instructions;
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
	ProductModel other = (ProductModel) obj;
	if (productmodelid != other.productmodelid)
		return false;
	return true;
}
	

			
}
