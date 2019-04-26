package com.tera.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "billofmaterials")
public class BillOfMaterials {

@Id
@GeneratedValue
long BillOfMaterialsID;
long productassemblyid;
long  componentid;
Date  startdate  ;
String	 unitmeasurecode   ;////	  5 pks
	 
Date enddate   ;
int bOMlevel   ;
int perassemblyqty    ;
String modifieddate ;
public long getBillOfMaterialsID() {
	return BillOfMaterialsID;
}
public void setBillOfMaterialsID(long billOfMaterialsID) {
	BillOfMaterialsID = billOfMaterialsID;
}
public long getProductassemblyid() {
	return productassemblyid;
}
public void setProductassemblyid(long productassemblyid) {
	this.productassemblyid = productassemblyid;
}
public long getComponentid() {
	return componentid;
}
public void setComponentid(long componentid) {
	this.componentid = componentid;
}
public Date getStartdate() {
	return startdate;
}
public void setStartdate(Date startdate) {
	this.startdate = startdate;
}
public String getUnitmeasurecode() {
	return unitmeasurecode;
}
public void setUnitmeasurecode(String unitmeasurecode) {
	this.unitmeasurecode = unitmeasurecode;
}
public Date getEnddate() {
	return enddate;
}
public void setEnddate(Date enddate) {
	this.enddate = enddate;
}
public int getbOMlevel() {
	return bOMlevel;
}
public void setbOMlevel(int bOMlevel) {
	this.bOMlevel = bOMlevel;
}
public int getPerassemblyqty() {
	return perassemblyqty;
}
public void setPerassemblyqty(int perassemblyqty) {
	this.perassemblyqty = perassemblyqty;
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
	result = prime * result + (int) (BillOfMaterialsID ^ (BillOfMaterialsID >>> 32));
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
	BillOfMaterials other = (BillOfMaterials) obj;
	if (BillOfMaterialsID != other.BillOfMaterialsID)
		return false;
	return true;
}




}
