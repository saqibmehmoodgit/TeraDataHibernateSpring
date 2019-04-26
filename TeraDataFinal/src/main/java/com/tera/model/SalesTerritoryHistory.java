package com.tera.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity(name = "salesterritoryhistory")

public class SalesTerritoryHistory {

@Id
@GeneratedValue


long	businessentityid;
long territoryid;
Date startdate;
Date	enddate;
public long getBusinessentityid() {
	return businessentityid;
}
public void setBusinessentityid(long businessentityid) {
	this.businessentityid = businessentityid;
}
public long getTerritoryid() {
	return territoryid;
}
public void setTerritoryid(long territoryid) {
	this.territoryid = territoryid;
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
	SalesTerritoryHistory other = (SalesTerritoryHistory) obj;
	if (businessentityid != other.businessentityid)
		return false;
	return true;
}


	
	
	
}
