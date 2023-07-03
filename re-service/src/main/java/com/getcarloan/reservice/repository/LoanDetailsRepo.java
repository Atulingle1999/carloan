package com.getcarloan.reservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getcarloan.reservice.entities.LoanDetails;

@Repository
public interface LoanDetailsRepo extends JpaRepository<LoanDetails, Integer> {


	boolean existsByUserId(int userId);

	String save(int userId);


}
