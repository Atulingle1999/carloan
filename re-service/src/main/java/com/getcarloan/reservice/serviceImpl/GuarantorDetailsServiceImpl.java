package com.getcarloan.reservice.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getcarloan.reservice.entities.GuarantorDetails;
import com.getcarloan.reservice.repository.GuarantorDetailsRepo;
import com.getcarloan.reservice.service.GuarantorDetailsService;

@Service
public class GuarantorDetailsServiceImpl implements GuarantorDetailsService {

	@Autowired
	private GuarantorDetailsRepo grepo;

	@Override
	public String saveGuarantorDetails(GuarantorDetails guarantorDetails) {
		grepo.save(guarantorDetails);
		return "Guarantor Details saved";
	}

	@Override
<<<<<<< HEAD
	public GuarantorDetails getAllGuarantorDetailsByUserId(int userId) {
		if (grepo.existsById(userId)) {
=======
	public GuarantorDetails getGuarantorDetailsByUserId(int userId) {
		if (grepo.existsByUserId(userId)) {
>>>>>>> 3d8b7c183aa0c85c3e3db9ce9534c8536e4dbb8b
			return grepo.findById(userId).get();
		} else
			return new GuarantorDetails();

	}

	

	@Override
	public String deleteGuarantorDetailsByUserId(int userId) {
		grepo.deleteById(userId);
		return "Delete Guarantor Details";
	}

	@Override
	public List<GuarantorDetails> getAllGuarantorDetails() {
		return grepo.findAll();

	}

	@Override
	public String updateGuarantorDetailsByUserId(int userId) {
		grepo.save(userId);
		return "Update guarantor";
	}

}
