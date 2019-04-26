package com.tera.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "purchaseorderheader")

public class PurchaseOrderHeader {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	long purchaseorderid;
	long vendorid;// p,
	Date orderdate; // p
	int revisionnumber;
	String status;
	long employeeid;
	long shipmethodid;
	Date ShipDate;
	float subtotal;
	float taxamt;
	float freight;
	float totaldue;

	public long getPurchaseorderid() {
		return purchaseorderid;
	}

	public void setPurchaseorderid(long purchaseorderid) {
		this.purchaseorderid = purchaseorderid;
	}

	public long getVendorid() {
		return vendorid;
	}

	public void setVendorid(long vendorid) {
		this.vendorid = vendorid;
	}

	public Date getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	public int getRevisionnumber() {
		return revisionnumber;
	}

	public void setRevisionnumber(int revisionnumber) {
		this.revisionnumber = revisionnumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(long employeeid) {
		this.employeeid = employeeid;
	}

	public long getShipmethodid() {
		return shipmethodid;
	}

	public void setShipmethodid(long shipmethodid) {
		this.shipmethodid = shipmethodid;
	}

	public Date getShipDate() {
		return ShipDate;
	}

	public void setShipDate(Date shipDate) {
		ShipDate = shipDate;
	}

	public float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	public float getTaxamt() {
		return taxamt;
	}

	public void setTaxamt(float taxamt) {
		this.taxamt = taxamt;
	}

	public float getFreight() {
		return freight;
	}

	public void setFreight(float freight) {
		this.freight = freight;
	}

	public float getTotaldue() {
		return totaldue;
	}

	public void setTotaldue(float totaldue) {
		this.totaldue = totaldue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (purchaseorderid ^ (purchaseorderid >>> 32));
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
		PurchaseOrderHeader other = (PurchaseOrderHeader) obj;
		if (purchaseorderid != other.purchaseorderid)
			return false;
		return true;
	}

}
