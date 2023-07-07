package com.getcarloan.reservice.dto;



import java.util.List;

import com.getcarloan.reservice.entities.AccountDetails;
import com.getcarloan.reservice.entities.AllPersonalDocs;
import com.getcarloan.reservice.entities.CustomerAddress;
import com.getcarloan.reservice.entities.EnquiryDetails;
import com.getcarloan.reservice.entities.GuarantorDetails;
import com.getcarloan.reservice.entities.PreviousLoan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {


	private int cid;
	//private int eid;
	private String name;
	private String DOB;
	private int age;
	private String gender;
	private String email;
	private long mobileNo;
	private long additionalMobileNo;
	private double downPaymentAmount;
	private double totalLoanRequired;
	
	private EnquiryDetails enquiry;

//
//	private AllPersonalDocs cAllPersonalDocs;
//	
//	private CustomerAddress cAddress;
//
//	private AccountDetails cAccountDetails;
//
//	
//	private GuarantorDetails cGuarantorDetails;
//
//		private PreviousLoan cPreviousLoan;

}