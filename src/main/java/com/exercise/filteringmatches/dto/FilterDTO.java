package com.exercise.filteringmatches.dto;

import com.exercise.filteringmatches.domain.Person;

public class FilterDTO {

	private Boolean hasPhoto;
	private Boolean inContact;
	private Boolean favourite;
	private Integer compatibilityFrom;
	private Integer compatibilityTo;
	private Integer ageFrom;
	private Integer ageTo;
	private Integer heightFrom;
	private Integer heightTo;
	private Integer distance;
	private Person person;

	public Boolean getHasPhoto() {
		return hasPhoto;
	}

	public void setHasPhoto(Boolean hasPhoto) {
		this.hasPhoto = hasPhoto;
	}

	public Boolean getInContact() {
		return inContact;
	}

	public void setInContact(Boolean inContact) {
		this.inContact = inContact;
	}

	public Boolean getFavourite() {
		return favourite;
	}

	public void setFavourite(Boolean favourite) {
		this.favourite = favourite;
	}

	public Integer getCompatibilityFrom() {
		return compatibilityFrom;
	}

	public void setCompatibilityFrom(Integer compatibilityFrom) {
		this.compatibilityFrom = compatibilityFrom;
	}

	public Integer getCompatibilityTo() {
		return compatibilityTo;
	}

	public void setCompatibilityTo(Integer compatibilityTo) {
		this.compatibilityTo = compatibilityTo;
	}

	public Integer getAgeFrom() {
		return ageFrom;
	}

	public void setAgeFrom(Integer ageFrom) {
		this.ageFrom = ageFrom;
	}

	public Integer getAgeTo() {
		return ageTo;
	}

	public void setAgeTo(Integer ageTo) {
		this.ageTo = ageTo;
	}

	public Integer getHeightFrom() {
		return heightFrom;
	}

	public void setHeightFrom(Integer heightFrom) {
		this.heightFrom = heightFrom;
	}

	public Integer getHeightTo() {
		return heightTo;
	}

	public void setHeightTo(Integer heightTo) {
		this.heightTo = heightTo;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}