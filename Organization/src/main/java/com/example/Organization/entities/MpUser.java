package com.example.Organization.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="mpuser" , schema= "public")
public class MpUser {
		
		 @jakarta.persistence.Id
		
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    @Column(name = "eldid")
		    private long eldId; 
		 
		    @Column(name = "fullname", nullable = false, length = 255)
		    private String fullName;
		    
		  
		    
		    @Column(name = "organizationid")
		    private long organizationId;

		    @Column(name = "email", length = 255)
		    private String email;

		    @Column(name = "homeaddress", length = 255)
		    private String homeAddress;

		    @Column(name = "drivestatus", length = 50)
		    private String driveStatus;

		    @Column(name = "employmenttype", length = 50)
		    private String employmentType;

		    @Column(name = "dispatcherid")
		    private long dispatcherId;

		    @Column(name = "driverrefid", length = 50)
		    private String driverRefId;

		    @Column(name = "emergencycontactid", length = 50)
		    private String emergencyContactId;

		public long getOrganizationId() {
			return organizationId;
		}
		public void setOrganizationId(long organizationId) {
			this.organizationId = organizationId;
		}
	
		
		public String getFullName() {
			return fullName;
		}
		public void setFullName(String fullName) {
			this.fullName = fullName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getHomeAddress() {
			return homeAddress;
		}
		public void setHomeAddress(String homeAddress) {
			this.homeAddress = homeAddress;
		}
		public long getEldId() {
			return eldId;
		}
		public void setEldId(long eldId) {
			this.eldId = eldId;
		}
		public String getDriveStatus() {
			return driveStatus;
		}
		public void setDriveStatus(String driveStatus) {
			this.driveStatus = driveStatus;
		}
		public String getEmploymentType() {
			return employmentType;
		}
		public void setEmploymentType(String employmentType) {
			this.employmentType = employmentType;
		}
		public long getDispatcherId() {
			return dispatcherId;
		}
		public void setDispatcherId(long dispatcherId) {
			this.dispatcherId  = dispatcherId;
		}
		public String getDriverRefId() {
			return driverRefId;
		}
		public void setDriverRefId(String driverRefId) {
			this.driverRefId = driverRefId;
		}
		public String getEmergencyContactId() {
			return emergencyContactId;
		}
		public void setEmergencyContactId(String emergencyContactId) {
			this.emergencyContactId = emergencyContactId;
		}
		@Override
		public String toString() {
			return "MpUser [organizationId=" + organizationId +  ", fullName="
					+ fullName + ", email=" + email + ", homeAddress=" + homeAddress + ", eldId=" + eldId
					+ ", driveStatus=" + driveStatus + ", employmentType=" + employmentType + ", dispatcherId="
					+ dispatcherId + ", driverRefId=" + driverRefId + ", emergencyContactId=" + emergencyContactId
					+ "]";
		}
		public MpUser() {
			super();
			// TODO Auto-generated constructor stub
		}
		

}
