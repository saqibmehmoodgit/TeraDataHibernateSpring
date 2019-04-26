package com.tera.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity(name = "workorderrouting")
public class WorkOrderRouting {

@Id
@GeneratedValue
long  workorderid; 
long productid;
long  operationsequence;
long  locationid; ////// 4 pk
Date  scheduledstartdate;
Date scheduledenddate;
Date actualstartdate; 
Date  actualenddate;
float	actualresourcehrs ;
float plannedcost;
float actualcost;
String	 modifieddate;
public long getWorkorderid() {
	return workorderid;
}
public void setWorkorderid(long workorderid) {
	this.workorderid = workorderid;
}
public long getProductid() {
	return productid;
}
public void setProductid(long productid) {
	this.productid = productid;
}
public long getOperationsequence() {
	return operationsequence;
}
public void setOperationsequence(long operationsequence) {
	this.operationsequence = operationsequence;
}
public long getLocationid() {
	return locationid;
}
public void setLocationid(long locationid) {
	this.locationid = locationid;
}
public Date getScheduledstartdate() {
	return scheduledstartdate;
}
public void setScheduledstartdate(Date scheduledstartdate) {
	this.scheduledstartdate = scheduledstartdate;
}
public Date getScheduledenddate() {
	return scheduledenddate;
}
public void setScheduledenddate(Date scheduledenddate) {
	this.scheduledenddate = scheduledenddate;
}
public Date getActualstartdate() {
	return actualstartdate;
}
public void setActualstartdate(Date actualstartdate) {
	this.actualstartdate = actualstartdate;
}
public Date getActualenddate() {
	return actualenddate;
}
public void setActualenddate(Date actualenddate) {
	this.actualenddate = actualenddate;
}
public float getActualresourcehrs() {
	return actualresourcehrs;
}
public void setActualresourcehrs(float actualresourcehrs) {
	this.actualresourcehrs = actualresourcehrs;
}
public float getPlannedcost() {
	return plannedcost;
}
public void setPlannedcost(float plannedcost) {
	this.plannedcost = plannedcost;
}
public float getActualcost() {
	return actualcost;
}
public void setActualcost(float actualcost) {
	this.actualcost = actualcost;
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
	result = prime * result + (int) (workorderid ^ (workorderid >>> 32));
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
	WorkOrderRouting other = (WorkOrderRouting) obj;
	if (workorderid != other.workorderid)
		return false;
	return true;
}






}
