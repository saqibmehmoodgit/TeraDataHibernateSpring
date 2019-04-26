package com.tera.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "product")

public class Product {

	@Id
	@GeneratedValue
	long productid;
	String name;
	String productnumber;
	long ProductSubcategoryID;
	long productmodelid; // 5 pk, ,
	int makeflag;
	int finishedgoodsflag;
	String color;
	int safetystocklevel;
	int reorderpoint;
	float standardcost;
	float listprice;
	String size;
	String sizeunitmeasurecode;
	String weightunitmeasurecode;
	String weight;
	int daystomanufacture;
	String productline;
	String productclass;
	String style;
	Date sellstartdate;
	Date sellenddate;
	Date discontinueddate;
	String modifieddate;
	public long getProductid() {
		return productid;
	}
	public void setProductid(long productid) {
		this.productid = productid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductnumber() {
		return productnumber;
	}
	public void setProductnumber(String productnumber) {
		this.productnumber = productnumber;
	}
	public long getProductSubcategoryID() {
		return ProductSubcategoryID;
	}
	public void setProductSubcategoryID(long productSubcategoryID) {
		ProductSubcategoryID = productSubcategoryID;
	}
	public long getProductmodelid() {
		return productmodelid;
	}
	public void setProductmodelid(long productmodelid) {
		this.productmodelid = productmodelid;
	}
	public int getMakeflag() {
		return makeflag;
	}
	public void setMakeflag(int makeflag) {
		this.makeflag = makeflag;
	}
	public int getFinishedgoodsflag() {
		return finishedgoodsflag;
	}
	public void setFinishedgoodsflag(int finishedgoodsflag) {
		this.finishedgoodsflag = finishedgoodsflag;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSafetystocklevel() {
		return safetystocklevel;
	}
	public void setSafetystocklevel(int safetystocklevel) {
		this.safetystocklevel = safetystocklevel;
	}
	public int getReorderpoint() {
		return reorderpoint;
	}
	public void setReorderpoint(int reorderpoint) {
		this.reorderpoint = reorderpoint;
	}
	public float getStandardcost() {
		return standardcost;
	}
	public void setStandardcost(float standardcost) {
		this.standardcost = standardcost;
	}
	public float getListprice() {
		return listprice;
	}
	public void setListprice(float listprice) {
		this.listprice = listprice;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getSizeunitmeasurecode() {
		return sizeunitmeasurecode;
	}
	public void setSizeunitmeasurecode(String sizeunitmeasurecode) {
		this.sizeunitmeasurecode = sizeunitmeasurecode;
	}
	public String getWeightunitmeasurecode() {
		return weightunitmeasurecode;
	}
	public void setWeightunitmeasurecode(String weightunitmeasurecode) {
		this.weightunitmeasurecode = weightunitmeasurecode;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public int getDaystomanufacture() {
		return daystomanufacture;
	}
	public void setDaystomanufacture(int daystomanufacture) {
		this.daystomanufacture = daystomanufacture;
	}
	public String getProductline() {
		return productline;
	}
	public void setProductline(String productline) {
		this.productline = productline;
	}
	public String getProductclass() {
		return productclass;
	}
	public void setProductclass(String productclass) {
		this.productclass = productclass;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public Date getSellstartdate() {
		return sellstartdate;
	}
	public void setSellstartdate(Date sellstartdate) {
		this.sellstartdate = sellstartdate;
	}
	public Date getSellenddate() {
		return sellenddate;
	}
	public void setSellenddate(Date sellenddate) {
		this.sellenddate = sellenddate;
	}
	public Date getDiscontinueddate() {
		return discontinueddate;
	}
	public void setDiscontinueddate(Date discontinueddate) {
		this.discontinueddate = discontinueddate;
	}
	public String getModifieddate() {
		return modifieddate;
	}
	public void setModifieddate(String modifieddate) {
		this.modifieddate = modifieddate;
	}




}
