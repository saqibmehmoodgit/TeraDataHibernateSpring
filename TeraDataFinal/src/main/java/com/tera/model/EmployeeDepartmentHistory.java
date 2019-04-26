package com.tera.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "employeedepartmenthistory")
public class EmployeeDepartmentHistory {

	@Id
	@GeneratedValue
    long	businessentityid;
	long departmentid;
	Date Startdate;
	long Shiftid; 
	Date endDate;
    String modifiedDate;
	public long getBusinessentityid() {
		return businessentityid;
	}
	public void setBusinessentityid(long businessentityid) {
		this.businessentityid = businessentityid;
	}
	public long getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(long departmentid) {
		this.departmentid = departmentid;
	}
	public Date getStartdate() {
		return Startdate;
	}
	public void setStartdate(Date startdate) {
		Startdate = startdate;
	}
	public long getShiftid() {
		return Shiftid;
	}
	public void setShiftid(long shiftid) {
		Shiftid = shiftid;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (Shiftid ^ (Shiftid >>> 32));
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
		EmployeeDepartmentHistory other = (EmployeeDepartmentHistory) obj;
		if (Shiftid != other.Shiftid)
			return false;
		return true;
	}
    
    
    
    
}
