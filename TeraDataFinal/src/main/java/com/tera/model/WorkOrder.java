package com.tera.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity(name = "workorder")

public class WorkOrder {
	@Id
	@GeneratedValue

	long	workorderid;
	long productid ;//  2 pk and i 
	int  orderqty ;
	int stockedqty ;
	int scrappedqty;
	Date  startdate;
	Date   enddate;
	Date  duedate ;
	String scrapreasonid;
	String modifieddate;
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
	public int getOrderqty() {
		return orderqty;
	}
	public void setOrderqty(int orderqty) {
		this.orderqty = orderqty;
	}
	public int getStockedqty() {
		return stockedqty;
	}
	public void setStockedqty(int stockedqty) {
		this.stockedqty = stockedqty;
	}
	public int getScrappedqty() {
		return scrappedqty;
	}
	public void setScrappedqty(int scrappedqty) {
		this.scrappedqty = scrappedqty;
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
	public Date getDuedate() {
		return duedate;
	}
	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}
	public String getScrapreasonid() {
		return scrapreasonid;
	}
	public void setScrapreasonid(String scrapreasonid) {
		this.scrapreasonid = scrapreasonid;
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
		WorkOrder other = (WorkOrder) obj;
		if (workorderid != other.workorderid)
			return false;
		return true;
	}
	
	
	
	
	
}
