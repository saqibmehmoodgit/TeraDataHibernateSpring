package com.tera.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

		
		@Entity(name = "person")

		public class Person  {

			@Id
			@GeneratedValue
			@Column(name="businessentityid")
 			long businessentityid;
			@Column(name="persontype")
			String persontype;
			@Column(name="namestyle")
			int namestyle;
			@Column(name="ptitle")
			String ptitle;
			@Column(name="firstname")
			String firstname;
			@Column(name="middlename")
			String middlename;
			@Column(name="lastname")
			String lastname;
			@Column(name="suffix")
			String suffix; 
			@Column(name="emailpromotion")
			int emailpromotion;
			@Column(name="additionalcontactinfo")
			String additionalcontactinfo;
			@Column(name="demographics")
            String demographics;
			@Column(name="modifieddate")
            String modifieddate;
			public long getBusinessentityid() {
				return businessentityid;
			}
			public void setBusinessentityid(long businessentityid) {
				this.businessentityid = businessentityid;
			}
			public String getPersontype() {
				return persontype;
			}
			public void setPersontype(String persontype) {
				this.persontype = persontype;
			}
			public int getNamestyle() {
				return namestyle;
			}
			public void setNamestyle(int namestyle) {
				this.namestyle = namestyle;
			}
			public String getPtitle() {
				return ptitle;
			}
			public void setPtitle(String ptitle) {
				this.ptitle = ptitle;
			}
			public String getFirstname() {
				return firstname;
			}
			public void setFirstname(String firstname) {
				this.firstname = firstname;
			}
			public String getMiddlename() {
				return middlename;
			}
			public void setMiddlename(String middlename) {
				this.middlename = middlename;
			}
			public String getLastname() {
				return lastname;
			}
			public void setLastname(String lastname) {
				this.lastname = lastname;
			}
			public String getSuffix() {
				return suffix;
			}
			public void setSuffix(String suffix) {
				this.suffix = suffix;
			}
			public int getEmailpromotion() {
				return emailpromotion;
			}
			public void setEmailpromotion(int emailpromotion) {
				this.emailpromotion = emailpromotion;
			}
			public String getAdditionalcontactinfo() {
				return additionalcontactinfo;
			}
			public void setAdditionalcontactinfo(String additionalcontactinfo) {
				this.additionalcontactinfo = additionalcontactinfo;
			}
			public String getDemographics() {
				return demographics;
			}
			public void setDemographics(String demographics) {
				this.demographics = demographics;
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
				result = prime * result + (int) (businessentityid ^ (businessentityid >>> 32));
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
				Person other = (Person) obj;
				if (businessentityid != other.businessentityid)
					return false;
				return true;
			}
			
						
            
            
            
			
}