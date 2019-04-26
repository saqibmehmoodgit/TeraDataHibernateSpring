package com.tera.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "unitmeasure")


public class UnitMeasure {

	@Id
	@GeneratedValue
	
String 	unitmeasurecode  ; //  v p,
String  modifieddate  ;///// pk
String name ;
public String getUnitmeasurecode() {
	return unitmeasurecode;
}
public void setUnitmeasurecode(String unitmeasurecode) {
	this.unitmeasurecode = unitmeasurecode;
}
public String getModifieddate() {
	return modifieddate;
}
public void setModifieddate(String modifieddate) {
	this.modifieddate = modifieddate;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((unitmeasurecode == null) ? 0 : unitmeasurecode.hashCode());
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
	UnitMeasure other = (UnitMeasure) obj;
	if (unitmeasurecode == null) {
		if (other.unitmeasurecode != null)
			return false;
	} else if (!unitmeasurecode.equals(other.unitmeasurecode))
		return false;
	return true;
}





}
