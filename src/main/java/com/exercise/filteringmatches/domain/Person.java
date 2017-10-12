package com.exercise.filteringmatches.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Person implements Serializable {

	private static final long serialVersionUID = 2560489512202446511L;

	@Id
	private Long id;

	@Column(nullable = false)
	private String displayName;

	@Column(nullable = false)
	private Integer age;

	@Column(nullable = false)
	private String jobTitle;

	@Column(nullable = false)
	private Integer heightInCm;

	@ManyToOne(optional = false)
	private City city;

	private String mainPhoto;

	@Column(nullable = false)
	private Float compatibilityScore;

	@Column(nullable = false)
	private Integer contactsExchanged;

	private Boolean favourite;

	@Column(nullable = false)
	private String religion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Integer getHeightInCm() {
		return heightInCm;
	}

	public void setHeightInCm(Integer heightInCm) {
		this.heightInCm = heightInCm;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getMainPhoto() {
		return mainPhoto;
	}

	public void setMainPhoto(String mainPhoto) {
		this.mainPhoto = mainPhoto;
	}

	public Float getCompatibilityScore() {
		return compatibilityScore;
	}

	public void setCompatibilityScore(Float compatibilityScore) {
		this.compatibilityScore = compatibilityScore;
	}

	public Integer getContactsExchanged() {
		return contactsExchanged;
	}

	public void setContactsExchanged(Integer contactsExchanged) {
		this.contactsExchanged = contactsExchanged;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public Boolean getFavourite() {
		return favourite;
	}

	public void setFavourite(Boolean favourite) {
		this.favourite = favourite;
	}

}
