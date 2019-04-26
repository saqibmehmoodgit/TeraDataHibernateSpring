package com.tera.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "specialofferproduct")

public class SpecialOfferProduct {
	@Id
	@GeneratedValue
    long	specialofferid ;
   long productid ;  ///  2 pks
public long getSpecialofferid() {
	return specialofferid;
}
public void setSpecialofferid(long specialofferid) {
	this.specialofferid = specialofferid;
}
public long getProductid() {
	return productid;
}
public void setProductid(long productid) {
	this.productid = productid;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (int) (specialofferid ^ (specialofferid >>> 32));
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
	SpecialOfferProduct other = (SpecialOfferProduct) obj;
	if (specialofferid != other.specialofferid)
		return false;
	return true;
}




}
