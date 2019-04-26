package com.tera.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "culture")

public class Culture {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
long  cultureid; 
String  name; ////  2 pks
String 	modifieddate;
public long getCultureid() {
	return cultureid;
}
public void setCultureid(long cultureid) {
	this.cultureid = cultureid;
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
	result = prime * result + (int) (cultureid ^ (cultureid >>> 32));
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
	Culture other = (Culture) obj;
	if (cultureid != other.cultureid)
		return false;
	return true;
}



}
