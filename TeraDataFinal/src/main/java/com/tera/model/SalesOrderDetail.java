package com.tera.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "salesorderdetail")

public class SalesOrderDetail {
	@Id
	@GeneratedValue
	long	businessentityid;
	long salesorderid;
	long productid;//3 pks
   
	int salesOrderdetailid;

	
	String carriertrackingnumber;
	
	int		orderqty;
	int specialofferid;
	float unitprice;
	float unitpricediscount	;
	float linetotal ;
	public long getBusinessentityid() {
		return businessentityid;
	}
	public void setBusinessentityid(long businessentityid) {
		this.businessentityid = businessentityid;
	}
	public long getSalesorderid() {
		return salesorderid;
	}
	public void setSalesorderid(long salesorderid) {
		this.salesorderid = salesorderid;
	}
	public long getProductid() {
		return productid;
	}
	public void setProductid(long productid) {
		this.productid = productid;
	}
	public int getSalesOrderdetailid() {
		return salesOrderdetailid;
	}
	public void setSalesOrderdetailid(int salesOrderdetailid) {
		this.salesOrderdetailid = salesOrderdetailid;
	}
	public String getCarriertrackingnumber() {
		return carriertrackingnumber;
	}
	public void setCarriertrackingnumber(String carriertrackingnumber) {
		this.carriertrackingnumber = carriertrackingnumber;
	}
	public int getOrderqty() {
		return orderqty;
	}
	public void setOrderqty(int orderqty) {
		this.orderqty = orderqty;
	}
	public int getSpecialofferid() {
		return specialofferid;
	}
	public void setSpecialofferid(int specialofferid) {
		this.specialofferid = specialofferid;
	}
	public float getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(float unitprice) {
		this.unitprice = unitprice;
	}
	public float getUnitpricediscount() {
		return unitpricediscount;
	}
	public void setUnitpricediscount(float unitpricediscount) {
		this.unitpricediscount = unitpricediscount;
	}
	public float getLinetotal() {
		return linetotal;
	}
	public void setLinetotal(float linetotal) {
		this.linetotal = linetotal;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (salesorderid ^ (salesorderid >>> 32));
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
		SalesOrderDetail other = (SalesOrderDetail) obj;
		if (salesorderid != other.salesorderid)
			return false;
		return true;
	}
	
	
	
				
}
