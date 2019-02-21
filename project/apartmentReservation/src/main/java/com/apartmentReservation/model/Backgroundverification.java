/*This class has getters and setters of the backgroundverification attributes. It is related to the backgroundverification table.*/
package com.apartmentReservation.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "backgroundverification")
public class Backgroundverification {
	

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int id;
	 

	 @Column(name = "address")
	 private String address;
	 
	 @Column(name = "app_bgc_status")
	 private String app_bgc_status; 
	 
	 @Column(name = "app_lease_status")
	 private String app_lease_status; 
	 
	 @Column(name = "email")
	 private String email;
	 
	 @Column(name = "firstname")
	 private String firstname; 
	 
	 @Column(name = "lastname")
	 private String lastname;

	 
	 @Column(name = "dob")
	 private String dob;
	 
	 @Column(name = "phoneno")
	 private String phonenumber;
	 
	 @Column(name = "ssn")
	 private String ssn;
	 
	 @Column(name = "intials")
	 private String initials;
	 
	 @Column(name = "lease_start_date")
	 private String leaseStartDate;
	 
	 @Column(name = "lease_end_date")
	 private String leaseEndDate;
	 
	 @Column(name = "lease_signed_date")
	 private String leaseSignedDate;
	 
	 @Column(name = "ethnicity")
	 private String ethnicity;
	 
	@Column(name = "occupation")
	 private String occupation;
	
	@Column(name = "Salary")
	 private String salary;
	
	 @Column(name = "smokinghabit")
	 private String smokinghabit;
	 
	@Column(name = "pets")
	 private String pets;
	
	@Column(name = "otherroommates")
	 private String otherroommates;
	 
	 @Column(name = "propertyid")
		private int propertyId;
	 
	 @Column(name = "propertyowner")
	 private int propertyOwner;
	 
	 @Column(name = "owner_sign")
	 private String ownerSign;
	 
	 @Column(name = "firstname_rm1")
	 private String firstname_rm1;
	 
	 @Column(name = "lastname_rm1")
	 private String lastname_rm1;
	 
	 @Column(name = "emailid_rm1")
	 private String emailid_rm1;
	 
	 @Column(name = "firstname_rm2")
	 private String firstname_rm2;
	 
	 @Column(name = "lastname_rm2")
	 private String lastname_rm2;
	 
	 @Column(name = "emailid_rm2")
	 private String emailid_rm2;
	 
	 @Column(name = "lease_doc_name")
	 private String leasedocname;
	 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getApp_bgc_status() {
		return app_bgc_status;
	}

	public void setApp_bgc_status(String app_bgc_status) {
		this.app_bgc_status = app_bgc_status;
	}

	public String getApp_lease_status() {
		return app_lease_status;
	}

	public void setApp_lease_status(String app_lease_status) {
		this.app_lease_status = app_lease_status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}


	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public String getLeaseStartDate() {
		return leaseStartDate;
	}

	public void setLeaseStartDate(String leaseStartDate) {
		this.leaseStartDate = leaseStartDate;
	}

	public String getLeaseEndDate() {
		return leaseEndDate;
	}

	public void setLeaseEndDate(String leaseEndDate) {
		this.leaseEndDate = leaseEndDate;
	}

	public String getLeaseSignedDate() {
		return leaseSignedDate;
	}

	public void setLeaseSignedDate(String leaseSignedDate) {
		this.leaseSignedDate = leaseSignedDate;
	}

	public String getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getSmokinghabit() {
		return smokinghabit;
	}

	public void setSmokinghabit(String smokinghabit) {
		this.smokinghabit = smokinghabit;
	}

	public String getPets() {
		return pets;
	}

	public void setPets(String pets) {
		this.pets = pets;
	}

	public String getOtherroommates() {
		return otherroommates;
	}

	public void setOtherroommates(String otherroommates) {
		this.otherroommates = otherroommates;
	}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public int getPropertyOwner() {
		return propertyOwner;
	}

	public void setPropertyOwner(int propertyOwner) {
		this.propertyOwner = propertyOwner;
	}

	

	public String getOwnerSign() {
		return ownerSign;
	}

	public void setOwnerSign(String ownerSign) {
		this.ownerSign = ownerSign;
	}

	public String getFirstname_rm1() {
		return firstname_rm1;
	}

	public void setFirstname_rm1(String firstname_rm1) {
		this.firstname_rm1 = firstname_rm1;
	}

	public String getLastname_rm1() {
		return lastname_rm1;
	}

	public void setLastname_rm1(String lastname_rm1) {
		this.lastname_rm1 = lastname_rm1;
	}

	public String getEmailid_rm1() {
		return emailid_rm1;
	}

	public void setEmailid_rm1(String emailid_rm1) {
		this.emailid_rm1 = emailid_rm1;
	}

	public String getFirstname_rm2() {
		return firstname_rm2;
	}

	public void setFirstname_rm2(String firstname_rm2) {
		this.firstname_rm2 = firstname_rm2;
	}

	public String getLastname_rm2() {
		return lastname_rm2;
	}

	public void setLastname_rm2(String lastname_rm2) {
		this.lastname_rm2 = lastname_rm2;
	}

	public String getEmailid_rm2() {
		return emailid_rm2;
	}

	public void setEmailid_rm2(String emailid_rm2) {
		this.emailid_rm2 = emailid_rm2;
	}

	

	public String getLeasedocname() {
		return leasedocname;
	}

	public void setLeasedocname(String leasedocname) {
		this.leasedocname = leasedocname;
	}

	@Override
	public String toString() {
		return "Backgroundverification [id=" + id + ", address=" + address + ", app_bgc_status=" + app_bgc_status
				+ ", app_lease_status=" + app_lease_status + ", email=" + email + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", dob=" + dob + ", phonenumber=" + phonenumber + ", ssn=" + ssn
				+ ", initials=" + initials + ", leaseStartDate=" + leaseStartDate + ", leaseEndDate=" + leaseEndDate
				+ ", leaseSignedDate=" + leaseSignedDate + ", ethnicity=" + ethnicity + ", occupation=" + occupation
				+ ", salary=" + salary + ", smokinghabit=" + smokinghabit + ", pets=" + pets + ", otherroommates="
				+ otherroommates + ", propertyId=" + propertyId + ", propertyOwner=" + propertyOwner + ", ownerSign="
				+ ownerSign + ", firstname_rm1=" + firstname_rm1 + ", lastname_rm1=" + lastname_rm1 + ", emailid_rm1="
				+ emailid_rm1 + ", firstname_rm2=" + firstname_rm2 + ", lastname_rm2=" + lastname_rm2 + ", emailid_rm2="
				+ emailid_rm2 + ", leasedocname=" + leasedocname + "]";
	}

	
	 
}
	