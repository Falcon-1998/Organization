package com.example.Organization.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "mporganization", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = {"dot"}))
public class MpOrganization {


  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
 private long Id  ;

  @Column(name = "dot", nullable = false, length = 255, unique = true)
  private String DOT;

  @Column(name = "organization_name", length = 255)
  private String Organization_name;

  @Column(name = "carrier_level", length = 255)
  private String Carrier_level;

  @Column(name = "address", length = 255)
  private String Address;

  @Column(name = "fleet_size")
  private int fleet_size;

  @Column(name = "primaryemailid", length = 255)
  private String primaryemailid;

  @Column(name = "phonenumber", length = 20)
  private String phonenumber;

  @Column(name = "subscriptiontype", length = 50)
  private String subscriptiontype;

  @Column(name = "subscriptionstatus", length = 50)
  private String subscriptionstatus;

  @Column(name = "subscriptionbilling", length = 50)
  private String subscriptionbilling;



public long getId() {
	return Id;
}
public void setId(long id) {
	Id = id;
}
public String getDOT() {
	return DOT;
}
public void setDOT(String dOT) {
	DOT = dOT;
}
public String getOrganization_name() {
	return Organization_name;
}
public void setOrganization_name(String organization_name) {
	Organization_name = organization_name;
}
public String getCarrier_level() {
	return Carrier_level;
}
public void setCarrier_level(String carrier_level) {
	Carrier_level = carrier_level;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public int getFleet_size() {
	return fleet_size;
}
public void setFleet_size(int fleet_size) {
	this.fleet_size = fleet_size;
}
public String getPrimaryemailid() {
	return primaryemailid;
}
public void setPrimaryemailid(String primaryemailid) {
	this.primaryemailid = primaryemailid;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
public String getSubscriptiontype() {
	return subscriptiontype;
}
public void setSubscriptiontype(String subscriptiontype) {
	this.subscriptiontype = subscriptiontype;
}
public String getSubscriptionstatus() {
	return subscriptionstatus;
}
public void setSubscriptionstatus(String subscriptionstatus) {
	this.subscriptionstatus = subscriptionstatus;
}
public String getSubscriptionbilling() {
	return subscriptionbilling;
}
public void setSubscriptionbilling(String subscriptionbilling) {
	this.subscriptionbilling = subscriptionbilling;
}
@Override
public String toString() {
	return "MpOrganization [Id=" + Id + ", DOT=" + DOT + ", Organization_name=" + Organization_name + ", Carrier_level="
			+ Carrier_level + ", Address=" + Address + ", fleet_size=" + fleet_size + ", primaryemailid="
			+ primaryemailid + ", phonenumber=" + phonenumber + ", subscriptiontype=" + subscriptiontype
			+ ", subscriptionstatus=" + subscriptionstatus + ", subscriptionbilling=" + subscriptionbilling + "]";
}


}
 

