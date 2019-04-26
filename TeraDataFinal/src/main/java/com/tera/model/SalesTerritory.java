package com.tera.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity(name = "salesterritory")

public class SalesTerritory {
	@Id
	@GeneratedValue

long	territoryid;//   i   n pk  

String	name_;
String countryregioncode;
String group_;
float salesytd;
float	saleslastyear;
int costytd;
int costlastyear;
public long getTerritoryid() {
	return territoryid;
}
public void setTerritoryid(long territoryid) {
	this.territoryid = territoryid;
}
public String getName_() {
	return name_;
}
public void setName_(String name_) {
	this.name_ = name_;
}
public String getCountryregioncode() {
	return countryregioncode;
}
public void setCountryregioncode(String countryregioncode) {
	this.countryregioncode = countryregioncode;
}
public String getGroup_() {
	return group_;
}
public void setGroup_(String group_) {
	this.group_ = group_;
}
public float getSalesytd() {
	return salesytd;
}
public void setSalesytd(float salesytd) {
	this.salesytd = salesytd;
}
public float getSaleslastyear() {
	return saleslastyear;
}
public void setSaleslastyear(float saleslastyear) {
	this.saleslastyear = saleslastyear;
}
public int getCostytd() {
	return costytd;
}
public void setCostytd(int costytd) {
	this.costytd = costytd;
}
public int getCostlastyear() {
	return costlastyear;
}
public void setCostlastyear(int costlastyear) {
	this.costlastyear = costlastyear;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (int) (territoryid ^ (territoryid >>> 32));
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
	SalesTerritory other = (SalesTerritory) obj;
	if (territoryid != other.territoryid)
		return false;
	return true;
}



}
