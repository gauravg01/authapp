package com.tms.service;

import org.springframework.stereotype.Service;

@Service
public interface ForgetPassService {
	
	public String getForgetPass(String email);

}