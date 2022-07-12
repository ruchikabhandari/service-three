package com.service.three.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.service.three.model.FullName;

@Service
public class ServiceThreeClassImpl {

	public ResponseEntity<String> ConcatenatedString(FullName fullName) {
		String name = fullName.getName();
		String surName = fullName.getSurName();
		return  ResponseEntity.ok().body(name+" "+surName);
	}

}
