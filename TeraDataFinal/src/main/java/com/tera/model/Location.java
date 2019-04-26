package com.tera.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "location")
public class Location {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
long	locationid ;
String name;  ///   pk 2
float costrate ;
int availability ;
String modifieddate;
public long getLocationid() {
	return locationid;
}
public void setLocationid(long locationid) {
	this.locationid = locationid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getCostrate() {
	return costrate;
}
public void setCostrate(float costrate) {
	this.costrate = costrate;
}
public int getAvailability() {
	return availability;
}
public void setAvailability(int availability) {
	this.availability = availability;
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
	result = prime * result + (int) (locationid ^ (locationid >>> 32));
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
	Location other = (Location) obj;
	if (locationid != other.locationid)
		return false;
	return true;
}




}
