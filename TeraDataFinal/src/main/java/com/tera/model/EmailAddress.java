package com.tera.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
	@Entity(name = "emailaddress")
	public class EmailAddress  {
		@Id
		@GeneratedValue
		@Column(name="emailaddressid")
		long emailAddressID;
		long businessentityid;
		
		@Column(name="emailaddress")
		String emailaddress;
	
		@Column(name="modifieddate")
		String modifieddate;

		public long getEmailAddressID() {
			return emailAddressID;
		}

		public void setEmailAddressID(long emailAddressID) {
			this.emailAddressID = emailAddressID;
		}

		public long getBusinessentityid() {
			return businessentityid;
		}

		public void setBusinessentityid(long businessentityid) {
			this.businessentityid = businessentityid;
		}

		public String getEmailaddress() {
			return emailaddress;
		}

		public void setEmailaddress(String emailaddress) {
			this.emailaddress = emailaddress;
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
			EmailAddress other = (EmailAddress) obj;
			if (businessentityid != other.businessentityid)
				return false;
			return true;
		}
	
		
		
		
}
