package com.tera.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
	@Entity(name = "passwrd")

	public class Password  {

		@Id
		@GeneratedValue
		@Column(name="businessentityid")
		long businessentityid;
		@Column(name="passwordhash")
		String passwordHash;
		@Column(name="passwordsalt")
		String passwordsalt;
		public long getBusinessentityid() {
			return businessentityid;
		}
		public void setBusinessentityid(long businessentityid) {
			this.businessentityid = businessentityid;
		}
		public String getPasswordHash() {
			return passwordHash;
		}
		public void setPasswordHash(String passwordHash) {
			this.passwordHash = passwordHash;
		}
		public String getPasswordsalt() {
			return passwordsalt;
		}
		public void setPasswordsalt(String passwordsalt) {
			this.passwordsalt = passwordsalt;
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
			Password other = (Password) obj;
			if (businessentityid != other.businessentityid)
				return false;
			return true;
		}
	

	
	
	
	
	}
