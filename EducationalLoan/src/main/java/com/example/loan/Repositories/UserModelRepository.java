package com.example.loan.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loan.Model.UserModel;

@Repository
public interface UserModelRepository extends JpaRepository<UserModel, Integer>{
	UserModel findByEmail(String email);

}
