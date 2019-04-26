package com.tera.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity(name = "specialoffer")


public class SpecialOffer {

	@Id
	@GeneratedValue

   int specialofferid1 ;
   String description;
    int discountpct;
   String type_ ;
   String category ;
   Date startdate  ;
   Date enddate ;
    int minqty;
   int  maxqty ;
public int getSpecialofferid1() {
	return specialofferid1;
}
public void setSpecialofferid1(int specialofferid1) {
	this.specialofferid1 = specialofferid1;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getDiscountpct() {
	return discountpct;
}
public void setDiscountpct(int discountpct) {
	this.discountpct = discountpct;
}
public String getType_() {
	return type_;
}
public void setType_(String type_) {
	this.type_ = type_;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public Date getStartdate() {
	return startdate;
}
public void setStartdate(Date startdate) {
	this.startdate = startdate;
}
public Date getEnddate() {
	return enddate;
}
public void setEnddate(Date enddate) {
	this.enddate = enddate;
}
public int getMinqty() {
	return minqty;
}
public void setMinqty(int minqty) {
	this.minqty = minqty;
}
public int getMaxqty() {
	return maxqty;
}
public void setMaxqty(int maxqty) {
	this.maxqty = maxqty;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + specialofferid1;
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
	SpecialOffer other = (SpecialOffer) obj;
	if (specialofferid1 != other.specialofferid1)
		return false;
	return true;
}
	
	
	
}
