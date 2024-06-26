package com.adminservice.main.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee")
@NoArgsConstructor
@Data
@AllArgsConstructor

public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true, nullable = true, columnDefinition = "VARCHAR(65)")
	private String gmail;

//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee")
//    @SequenceGenerator(name = "employee", sequenceName = "employee", allocationSize = 1)	
//	@Column(unique = true, nullable = true, columnDefinition = "VARCHAR(65)")
//	private String gmail;

	private String guid;

	@Column(nullable = false, columnDefinition = "VARCHAR(40)")
	private String firstname;

	@Column(nullable = false, columnDefinition = "VARCHAR(40)")
	private String lastname;

	private String password;

	@Column(name = "dateOfBirth")
	private LocalDate dob;

	@Column(columnDefinition = "VARCHAR(40)")
	private String role;

	private boolean adminStatus;

	@Column(columnDefinition = "VARCHAR(20)")
	private String gender;

	@Column(columnDefinition = "VARCHAR(40)")
	private String blood_group;

	@Column(columnDefinition = "VARCHAR(40)")
	private String marital_status;

	@Column(columnDefinition = "VARCHAR(40)")
	private String phonenumber;
	@Column(columnDefinition = "VARCHAR(40)")
	private String currentAddress;
	@Column(columnDefinition = "VARCHAR(40)")
	private String currentCountry;
	@Column(columnDefinition = "VARCHAR(40)")
	private String currentState;
	@Column(columnDefinition = "VARCHAR(40)")
	private String currentCity;
	@Column(columnDefinition = "VARCHAR(40)")
	private String currentPincode;
	@Column(columnDefinition = "VARCHAR(100)")
	private String permanentAddress;
	@Column(columnDefinition = "VARCHAR(40)")
	private String permanentCountry;
	@Column(columnDefinition = "VARCHAR(40)")
	private String permanentState;
	@Column(columnDefinition = "VARCHAR(40)")
	private String permanentCity;
	@Column(columnDefinition = "VARCHAR(40)")
	private String permanentPincode;
	@Column(columnDefinition = "VARCHAR(40)")
	private String stayingsince;
	@Column(columnDefinition = "VARCHAR(50)")
	private String livingincurrent;

	private String imgName;
	private String imgType;
	private String imgPath;

	@Lob
	@Column(name = "profile_img", length = 1000)
	private byte[] profileImage;

}
