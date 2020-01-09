package com.spring.jpa.demo.findaccountsservice.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.jpa.demo.findaccountsservice.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, BigInteger>{

}
