package com.tera.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "shipmethod")
public class ShipMethod {
	@Id
	@GeneratedValue
	long shipmethodid;
	String name;/// pk,
	float shipbase;
	float shiprate;
	String modifieddate;

	public long getShipmethodid() {
		return shipmethodid;
	}

	public void setShipmethodid(long shipmethodid) {
		this.shipmethodid = shipmethodid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getShipbase() {
		return shipbase;
	}

	public void setShipbase(float shipbase) {
		this.shipbase = shipbase;
	}

	public float getShiprate() {
		return shiprate;
	}

	public void setShiprate(float shiprate) {
		this.shiprate = shiprate;
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
		result = prime * result + (int) (shipmethodid ^ (shipmethodid >>> 32));
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
		ShipMethod other = (ShipMethod) obj;
		if (shipmethodid != other.shipmethodid)
			return false;
		return true;
	}

}
