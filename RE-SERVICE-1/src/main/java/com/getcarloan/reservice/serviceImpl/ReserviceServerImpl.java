package com.getcarloan.reservice.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.getcarloan.reservice.entities.Customer;
import com.getcarloan.reservice.entities.EnquiryDetails;
import com.getcarloan.reservice.entities.User;
import com.getcarloan.reservice.repository.ReserviceRepo;
import com.getcarloan.reservice.repository.UserRepo;
import com.getcarloan.reservice.service.ReserviceService;

@Service
public class ReserviceServerImpl implements ReserviceService {
	
	
	@Autowired
	private JavaMailSender sender;
	@Autowired
	private ReserviceRepo rerepo;
	
	
	
	
	@Override
	public EnquiryDetails getEnquiryByUserId(int userId) {
		if(rerepo.existsById(userId)) 
			return rerepo.findById(userId).get();
		else 
			return new EnquiryDetails();
	}

	@Override
	public List<EnquiryDetails> getAllEnquiry() {		
		return rerepo.findAll();
	}

	@Override
	public String createEnquiry(EnquiryDetails enquiryDetails) {
		rerepo.save(enquiryDetails);
		return "New Enquiry Details Added";
	}

	
	
	

}
