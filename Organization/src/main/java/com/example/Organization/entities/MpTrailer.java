package com.example.Organization.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="mptrailer",  schema="public")
public class MpTrailer {
	 @jakarta.persistence.Id
	 @GeneratedValue(strategy= GenerationType.IDENTITY)
	    private long Id ; //>> PK. This will be used for all joins or cross-references between and within service calls.
	    @Column(name = "organizationid")
	    private long organizationId;

	    @Column(name = "trailername", length = 255)
	    private String trailerName;

	    @Column(name = "licenstate", length = 50)
	    private String licenState;

	    @Column(name = "driverid")
	    private long driverId;

	    @Column(name = "makemodelobject", length = 255)
	    private String MAkeModelObject;

	    @Column(name = "registrationdetailsmodel", length = 255)
	    private String RegistrationDetailsModel;

	    @Column(name = "trailertype", length = 50)
	    private String trailerType;

	    @Column(name = "loadassigned", length = 50)
	    private String loadAssigned;
		public long getId() {
			return Id;
		}
		public void setId(long id) {
			Id = id;
		}
		public long getOrganizationId() {
			return organizationId;
		}
		public void setOrganizationId(long organizationId) {
			this.organizationId = organizationId;
		}
		public String getTrailerName() {
			return trailerName;
		}
		public void setTrailerName(String trailerName) {
			this.trailerName = trailerName;
		}
		public String getLicenState() {
			return licenState;
		}
		public void setLicenState(String licenState) {
			this.licenState = licenState;
		}
		public long getDriverId() {
			return driverId;
		}
		public void setDriverId(long driverId) {
			this.driverId = driverId;
		}
		public String getMAkeModelObject() {
			return MAkeModelObject;
		}
		public void setMAkeModelObject(String mAkeModelObject) {
			MAkeModelObject = mAkeModelObject;
		}
		public String getRegistrationDetailsModel() {
			return RegistrationDetailsModel;
		}
		public void setRegistrationDetailsModel(String registrationDetailsModel) {
			RegistrationDetailsModel = registrationDetailsModel;
		}
		public String getTrailerType() {
			return trailerType;
		}
		public void setTrailerType(String trailerType) {
			this.trailerType = trailerType;
		}
		public String getLoadAssigned() {
			return loadAssigned;
		}
		public void setLoadAssigned(String loadAssigned) {
			this.loadAssigned = loadAssigned;
		}
		@Override
		public String toString() {
			return "MpTrailer [Id=" + Id + ", organizationId=" + organizationId + ", trailerName=" + trailerName
					+ ", licenState=" + licenState + ", driverId=" + driverId + ", MAkeModelObject=" + MAkeModelObject
					+ ", RegistrationDetailsModel=" + RegistrationDetailsModel + ", trailerType=" + trailerType
					+ ", loadAssigned=" + loadAssigned + "]";
		}

}
