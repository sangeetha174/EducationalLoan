package com.example.loan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.loan.Model.LoanApplicationModel;
import com.example.loan.Service.LoanApplicationService;

@RestController
@RequestMapping("/admin")
public class LoanApplicationController {
	@Autowired
	LoanApplicationService laSer;
	@GetMapping(value="/getAllLoans")
	public List<LoanApplicationModel> get()
	{
		List<LoanApplicationModel> l=laSer.get();
		return l;
	}
	@PutMapping("/changeLoans")
	public LoanApplicationModel updateLoans(@RequestBody LoanApplicationModel loanId)
	{
		return laSer.changeLoans(loanId);
	}
	@PostMapping("/addLoans")
	public LoanApplicationModel addLoans(@RequestBody LoanApplicationModel la)
	{
		return laSer.saveLoans(la);
	}
	
	//http://localhost:8080/admin/deleteLoans/5
	@DeleteMapping("/deleteLoans/{loanid}")
	public String deleteLoans(@PathVariable ("loanid") int loanid)
	{
		laSer.deleteLoan(loanid);
		return " loan details deleted";
	}

}

