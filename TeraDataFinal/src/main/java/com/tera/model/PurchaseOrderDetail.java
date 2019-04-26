package com.tera.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "purchaseorderdetail")

public class PurchaseOrderDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long purchaseorderdetailid;;// pk,
	long productid; //// pk,
	Date duedate; // pk,
	long purchaseorderid;
	int orderqty;
	float unitprice;
	float linetotal;
	int receivedqty;
	int rejectedqty;
	int stockedqty;

	public long getPurchaseorderdetailid() {
		return purchaseorderdetailid;
	}

	public void setPurchaseorderdetailid(long purchaseorderdetailid) {
		this.purchaseorderdetailid = purchaseorderdetailid;
	}

	public long getProductid() {
		return productid;
	}

	public void setProductid(long productid) {
		this.productid = productid;
	}



	public Date getDuedate() {
		return duedate;
	}

	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}

	public long getPurchaseorderid() {
		return purchaseorderid;
	}

	public void setPurchaseorderid(long purchaseorderid) {
		this.purchaseorderid = purchaseorderid;
	}

	public int getOrderqty() {
		return orderqty;
	}

	public void setOrderqty(int orderqty) {
		this.orderqty = orderqty;
	}

	public float getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(float unitprice) {
		this.unitprice = unitprice;
	}

	public float getLinetotal() {
		return linetotal;
	}

	public void setLinetotal(float linetotal) {
		this.linetotal = linetotal;
	}

	public int getReceivedqty() {
		return receivedqty;
	}

	public void setReceivedqty(int receivedqty) {
		this.receivedqty = receivedqty;
	}

	public int getRejectedqty() {
		return rejectedqty;
	}

	public void setRejectedqty(int rejectedqty) {
		this.rejectedqty = rejectedqty;
	}

	public int getStockedqty() {
		return stockedqty;
	}

	public void setStockedqty(int stockedqty) {
		this.stockedqty = stockedqty;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (purchaseorderdetailid ^ (purchaseorderdetailid >>> 32));
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
		PurchaseOrderDetail other = (PurchaseOrderDetail) obj;
		if (purchaseorderdetailid != other.purchaseorderdetailid)
			return false;
		return true;
	}

}
