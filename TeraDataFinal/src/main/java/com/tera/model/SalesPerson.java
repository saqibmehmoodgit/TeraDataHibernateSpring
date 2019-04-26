package com.tera.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class SalesPerson {
	@Id
	@GeneratedValue
	long businessentityid;

	long territoryid;
	long salesquota;
	long Bonus;
	
	float  commissionpct ;
	float salesytd;
	float saleslastyear;
	public long getBusinessentityid() {
		return businessentityid;
	}
	public void setBusinessentityid(long businessentityid) {
		this.businessentityid = businessentityid;
	}
	public long getTerritoryid() {
		return territoryid;
	}
	public void setTerritoryid(long territoryid) {
		this.territoryid = territoryid;
	}
	public long getSalesquota() {
		return salesquota;
	}
	public void setSalesquota(long salesquota) {
		this.salesquota = salesquota;
	}
	public long getBonus() {
		return Bonus;
	}
	public void setBonus(long bonus) {
		Bonus = bonus;
	}
	public float getCommissionpct() {
		return commissionpct;
	}
	public void setCommissionpct(float commissionpct) {
		this.commissionpct = commissionpct;
	}
	public float getSalesytd() {
		return salesytd;
	}
	public void setSalesytd(float salesytd) {
		this.salesytd = salesytd;
	}
	public float getSaleslastyear() {
		return saleslastyear;
	}
	public void setSaleslastyear(float saleslastyear) {
		this.saleslastyear = saleslastyear;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (businessentityid ^ (businessentityid >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		SalesPerson other = (SalesPerson) obj;
		if (businessentityid != other.businessentityid) {
			return false;
		}
		return true;
	}
	
	
}
