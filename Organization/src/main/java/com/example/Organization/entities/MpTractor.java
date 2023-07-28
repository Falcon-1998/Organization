package com.example.Organization.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="mptractor",  schema="public")
public class MpTractor {
	 @jakarta.persistence.Id
	 @GeneratedValue(strategy= GenerationType.IDENTITY)
	private long Id ; 
	    @Column(name = "organizationid")
	    private long organizationId;

	    @Column(name = "tractorname", length = 255)
	    private String tractorName;

	    @Column(name = "driverid")
	    private long driverId;

	    @Column(name = "licencestate", length = 50)
	    private String licenceState;

	    @Column(name = "enginetype", length = 50)
	    private String engineType;

	    @Column(name = "vin", length = 50)
	    private String vin;

	    @Column(name = "makemodelobject", length = 255)
	    private String MAkeModelObject;

	    @Column(name = "registrationdetailsmodel", length = 255)
	    private String RegistrationDetailsModel;

	    @Column(name = "notes", length = 255)
	    private String Notes;

	    @Column(name = "loadassigned", length = 50)
	    private String loadAssigned;

	    @Column(name = "mp_trailer", length = 50)
	    private String mp_trailer;
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
	public String getTractorName() {
		return tractorName;
	}
	public void setTractorName(String tractorName) {
		this.tractorName = tractorName;
	}
	public long getDriverId() {
		return driverId;
	}
	public void setDriverId(long driverId) {
		this.driverId = driverId;
	}
	public String getLicenceState() {
		return licenceState;
	}
	public void setLicenceState(String licenceState) {
		this.licenceState = licenceState;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
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
	public String getNotes() {
		return Notes;
	}
	public void setNotes(String notes) {
		Notes = notes;
	}
	public String getLoadAssigned() {
		return loadAssigned;
	}
	public void setLoadAssigned(String loadAssigned) {
		this.loadAssigned = loadAssigned;
	}
	public String getMp_trailer() {
		return mp_trailer;
	}
	public void setMp_trailer(String mp_trailer) {
		this.mp_trailer = mp_trailer;
	}
	@Override
	public String toString() {
		return "MpTractor [Id=" + Id + ", organizationId=" + organizationId + ", tractorName=" + tractorName
				+ ", driverId=" + driverId + ", licenceState=" + licenceState + ", engineType=" + engineType + ", vin="
				+ vin + ", MAkeModelObject=" + MAkeModelObject + ", RegistrationDetailsModel="
				+ RegistrationDetailsModel + ", Notes=" + Notes + ", loadAssigned=" + loadAssigned + ", mp_trailer="
				+ mp_trailer + "]";
	}
  
}
