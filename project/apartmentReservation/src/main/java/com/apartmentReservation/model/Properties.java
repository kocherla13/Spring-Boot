/*This class has getters and setters of the Properties attributes. It is related to the properties table.*/
package com.apartmentReservation.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.apartmentReservation.model.User.UserBuilder;

import lombok.AllArgsConstructor;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "properties")
@Component
public class Properties {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int propertyId;

	@Column(name = "is_featured")
	private boolean isFeatured;

	@Column(name = "property_name")
	private String propertyName;

	@Column(name = "apt_number")
	private int aptNumber;

	@Column(name = "property_location")
	private String propertyLocation;
	
	@Column(name = "property_address")
	private String propertyAddress;
	
	@Column(name = "property_owner")
	private int propertyOwner;

	@Column(name = "property_image_path")
	private String propertyImagePath;

	@Column(name = "property_type")
	private String propertyType;

	@Column(name = "property_bedrooms")
	private int propertyBedrooms;

	@Column(name = "property_bath")
	private int propertyBath;
	
	@Column(name = "property_pets")
	private int propertyPets;
	
	@Column(name = "property_utility")
	private int propertyUtility;

	@Column(name = "property_rent")
	private int propertyRent;

	@Column(name = "property_description")
	private String propertyDescription;

	@Column(name = "property_deposit")
	private int propertyDeposit;
	
	@Column(name = "is_leased")
	private String Leased;


	public boolean isFeatured() {
		return isFeatured;
	}

	public void setFeatured(boolean isFeatured) {
		this.isFeatured = isFeatured;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public int getAptNumber() {
		return aptNumber;
	}

	public void setAptNumber(int aptNumber) {
		this.aptNumber = aptNumber;
	}

	public String getPropertyLocation() {
		return propertyLocation;
	}

	public void setPropertyLocation(String propertyLocation) {
		this.propertyLocation = propertyLocation;
	}

	public String getPropertyImagePath() {
		return propertyImagePath;
	}

	public void setPropertyImagePath(String propertyImagePath) {
		this.propertyImagePath = propertyImagePath;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public int getPropertyBedrooms() {
		return propertyBedrooms;
	}

	public void setPropertyBedrooms(int propertyBedrooms) {
		this.propertyBedrooms = propertyBedrooms;
	}

	public int getPropertyBath() {
		return propertyBath;
	}

	public void setPropertyBath(int propertyBath) {
		this.propertyBath = propertyBath;
	}

	
	public int getPropertyRent() {
		return propertyRent;
	}

	public void setPropertyRent(int propertyRent) {
		this.propertyRent = propertyRent;
	}

	public String getPropertyDescription() {
		return propertyDescription;
	}

	public void setPropertyDescription(String propertyDescription) {
		this.propertyDescription = propertyDescription;
	}

	public int getPropertyDeposit() {
		return propertyDeposit;
	} 

	public void setPropertyDeposit(int propertyDeposit) {
		this.propertyDeposit = propertyDeposit;
	}

	public String getPropertyAddress() {
		return propertyAddress;
	}

	public void setPropertyAddress(String propertyAddress) {
		this.propertyAddress = propertyAddress;
	}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	
	public int getPropertyPets() {
		return propertyPets;
	}

	public void setPropertyPets(int propertyPets) {
		this.propertyPets = propertyPets;
	}

	public int getPropertyUtility() {
		return propertyUtility;
	}

	public void setPropertyUtility(int propertyUtility) {
		this.propertyUtility = propertyUtility;
	}



	public int getPropertyOwner() {
		return propertyOwner;
	}

	public void setPropertyOwner(int propertyOwner) {
		this.propertyOwner = propertyOwner;
	}

	
	
	@Override
	public String toString() {
		return "Properties [propertyId=" + propertyId + ", isFeatured=" + isFeatured + ", propertyName=" + propertyName
				+ ", aptNumber=" + aptNumber + ", propertyLocation=" + propertyLocation + ", propertyAddress="
				+ propertyAddress + ", propertyOwner=" + propertyOwner + ", propertyImagePath=" + propertyImagePath
				+ ", propertyType=" + propertyType + ", propertyBedrooms=" + propertyBedrooms + ", propertyBath="
				+ propertyBath + ", propertyPets=" + propertyPets + ", propertyUtility=" + propertyUtility
				+ ", propertyRent=" + propertyRent + ", propertyDescription=" + propertyDescription
				+ ", propertyDeposit=" + propertyDeposit + "]";
	}

	

}
