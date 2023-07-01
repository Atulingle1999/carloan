package com.getcarloan.reservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnquiryDetails {
 
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int eid;
	private int userId;
	private String carName;
	private String carBrand;
	private String carColor;
	private double price;
	private String email;
	private long mobileNo;
   	
}
