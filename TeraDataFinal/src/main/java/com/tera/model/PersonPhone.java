package com.tera.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
	
	
	@Entity(name = "personphone")
	public class PersonPhone  {
		@Id
		@GeneratedValue
		@Column(name="phonenumber")
		
		long phonenumber;
		
		long businessentityid;
		
		@Column(name="phonenumbertypeid")
		String phonenumbertypeid;
	
		@Column(name="modifieddate")
		String modifieddate;


		public long getBusinessentityid() {
			return businessentityid;
		}

		public void setBusinessentityid(long businessentityid) {
			this.businessentityid = businessentityid;
		}

		public long getPhonenumber() {
			return phonenumber;
		}

		public void setPhonenumber(long phonenumber) {
			this.phonenumber = phonenumber;
		}

		public String getPhonenumbertypeid() {
			return phonenumbertypeid;
		}

		public void setPhonenumbertypeid(String phonenumbertypeid) {
			this.phonenumbertypeid = phonenumbertypeid;
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
			PersonPhone other = (PersonPhone) obj;
			if (businessentityid != other.businessentityid)
				return false;
			return true;
		}
		
		
		
		
		
		
}
