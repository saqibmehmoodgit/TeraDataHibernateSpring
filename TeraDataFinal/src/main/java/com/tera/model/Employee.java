package com.tera.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity(name = "employee")
public class Employee {
	@Id
	@GeneratedValue
		long   businessentityid;
		long   nationalidnumber;
		String loginid;
		String jobtitle; 
		int vacationhours; 
		int sickleavehours;
        String 	gender; 
        Date hiredate;
        Date 	birthdatel;
		public long getBusinessentityid() {
			return businessentityid;
		}
		public void setBusinessentityid(long businessentityid) {
			this.businessentityid = businessentityid;
		}
		public long getNationalidnumber() {
			return nationalidnumber;
		}
		public void setNationalidnumber(long nationalidnumber) {
			this.nationalidnumber = nationalidnumber;
		}
		public String getLoginid() {
			return loginid;
		}
		public void setLoginid(String loginid) {
			this.loginid = loginid;
		}
		public String getJobtitle() {
			return jobtitle;
		}
		public void setJobtitle(String jobtitle) {
			this.jobtitle = jobtitle;
		}
		public int getVacationhours() {
			return vacationhours;
		}
		public void setVacationhours(int vacationhours) {
			this.vacationhours = vacationhours;
		}
		public int getSickleavehours() {
			return sickleavehours;
		}
		public void setSickleavehours(int sickleavehours) {
			this.sickleavehours = sickleavehours;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public Date getHiredate() {
			return hiredate;
		}
		public void setHiredate(Date hiredate) {
			this.hiredate = hiredate;
		}
		public Date getBirthdatel() {
			return birthdatel;
		}
		public void setBirthdatel(Date birthdatel) {
			this.birthdatel = birthdatel;
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
			Employee other = (Employee) obj;
			if (businessentityid != other.businessentityid)
				return false;
			return true;
		}

        
        
        

}
