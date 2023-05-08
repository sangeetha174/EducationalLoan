package com.example.loan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loan.Model.LoanApplicationModel;
import com.example.loan.Repositories.LoanApplicationModelRepository;

@Service
public class LoanApplicationService {
	@Autowired
	LoanApplicationModelRepository laRep;
	public List<LoanApplicationModel> get()
	{
		List<LoanApplicationModel> l=laRep.findAll();
		return l;
	}
	public LoanApplicationModel changeLoans(LoanApplicationModel c)
	{
		return laRep.saveAndFlush(c);
	}
	public LoanApplicationModel saveLoans(LoanApplicationModel l)
	{
		return laRep.save(l);
	}
	public void deleteLoan(int loanid)
		{
		laRep.deleteById(loanid);
		}

}