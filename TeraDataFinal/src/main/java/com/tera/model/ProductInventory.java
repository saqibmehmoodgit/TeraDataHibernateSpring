package com.tera.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "productinventory")
public class ProductInventory {

@Id
@GeneratedValue
long	productid; 
long	locationid;  ///// 2 pk  i
String shelf;
int Bin ;
int quantity  ;
String modifieddate;
public long getProductid() {
	return productid;
}
public void setProductid(long productid) {
	this.productid = productid;
}
public long getLocationid() {
	return locationid;
}
public void setLocationid(long locationid) {
	this.locationid = locationid;
}
public String getShelf() {
	return shelf;
}
public void setShelf(String shelf) {
	this.shelf = shelf;
}
public int getBin() {
	return Bin;
}
public void setBin(int bin) {
	Bin = bin;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
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
	result = prime * result + (int) (productid ^ (productid >>> 32));
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
	ProductInventory other = (ProductInventory) obj;
	if (productid != other.productid)
		return false;
	return true;
}




}
