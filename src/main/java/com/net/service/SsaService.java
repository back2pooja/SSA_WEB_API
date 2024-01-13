package com.net.service;

import org.springframework.stereotype.Service;

@Service
public class SsaService {
	public String fetchStateName(String ssn) {
	 String stateName = null;
	 if(ssn.startsWith("4")) {
		 stateName = "Goa";
	 }else if(ssn.startsWith("5")) {
		 stateName = "Rajasthan";
	 }else if(ssn.startsWith("6")) {
		 stateName = "Delhi";
	 }else if(ssn.startsWith("7")) {
		 stateName = "Mumbai";
	 }else {
		 stateName = "Invalid SSN";
	 }
	 return stateName;
	}

}
