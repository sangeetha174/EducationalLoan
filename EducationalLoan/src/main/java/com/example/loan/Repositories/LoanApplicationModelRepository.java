package com.example.loan.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.loan.Model.LoanApplicationModel;

public interface LoanApplicationModelRepository  extends JpaRepository<LoanApplicationModel,Integer>{

}
