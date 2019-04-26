package com.tera.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity(name = "salesorderheader")


public class SalesOrderHeader {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	long businessentityid;
	long salesorderid;
	Date orderdate; /// 3 pks

	int shipmethodid;
	int revisionnumber;
	Date duedate;
	Date shipdate;
	int status;
	int onlineorderflag;
	int salesordernumber;

	String purchaseordernumber;
	String accountnumber;
	String creditCardapprovalcode;
	String currencyrateid;
	int territoryid;
	int billtoaddressid;
	int shiptoaddressid;

	int creditcardid;
	int subtotal;
	int taxamt;
	int freight;
	int totaldue;	
	
//select sum(TotalDue)  from Dice_RDM.SalesOrderHeader
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

	public Date getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	public int getShipmethodid() {
		return shipmethodid;
	}

	public void setShipmethodid(int shipmethodid) {
		this.shipmethodid = shipmethodid;
	}

	public int getRevisionnumber() {
		return revisionnumber;
	}

	public void setRevisionnumber(int revisionnumber) {
		this.revisionnumber = revisionnumber;
	}

	public Date getDuedate() {
		return duedate;
	}

	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}

	public Date getShipdate() {
		return shipdate;
	}

	public void setShipdate(Date shipdate) {
		this.shipdate = shipdate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getOnlineorderflag() {
		return onlineorderflag;
	}

	public void setOnlineorderflag(int onlineorderflag) {
		this.onlineorderflag = onlineorderflag;
	}

	public int getSalesordernumber() {
		return salesordernumber;
	}

	public void setSalesordernumber(int salesordernumber) {
		this.salesordernumber = salesordernumber;
	}

	public String getPurchaseordernumber() {
		return purchaseordernumber;
	}

	public void setPurchaseordernumber(String purchaseordernumber) {
		this.purchaseordernumber = purchaseordernumber;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getCreditCardapprovalcode() {
		return creditCardapprovalcode;
	}

	public void setCreditCardapprovalcode(String creditCardapprovalcode) {
		this.creditCardapprovalcode = creditCardapprovalcode;
	}

	public String getCurrencyrateid() {
		return currencyrateid;
	}

	public void setCurrencyrateid(String currencyrateid) {
		this.currencyrateid = currencyrateid;
	}

	public int getTerritoryid() {
		return territoryid;
	}

	public void setTerritoryid(int territoryid) {
		this.territoryid = territoryid;
	}

	public int getBilltoaddressid() {
		return billtoaddressid;
	}

	public void setBilltoaddressid(int billtoaddressid) {
		this.billtoaddressid = billtoaddressid;
	}

	public int getShiptoaddressid() {
		return shiptoaddressid;
	}

	public void setShiptoaddressid(int shiptoaddressid) {
		this.shiptoaddressid = shiptoaddressid;
	}

	public int getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}


	
	
	
	public int getCreditcardid() {
		return creditcardid;
	}

	public void setCreditcardid(int creditcardid) {
		this.creditcardid = creditcardid;
	}

	public int getTaxamt() {
		return taxamt;
	}

	public void setTaxamt(int taxamt) {
		this.taxamt = taxamt;
	}

	public int getFreight() {
		return freight;
	}

	public void setFreight(int freight) {
		this.freight = freight;
	}

	public int getTotaldue() {
		return totaldue;
	}

	public void setTotaldue(int totaldue) {
		this.totaldue = totaldue;
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
		SalesOrderHeader other = (SalesOrderHeader) obj;
		if (salesorderid != other.salesorderid)
			return false;
		return true;
	}

}
