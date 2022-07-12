package com.service.three.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.three.model.FullName;
import com.service.three.service.ServiceThreeClassImpl;

@RestController
@RequestMapping("/servicethree")
public class ServiceThreeController {
	 @Autowired
	 ServiceThreeClassImpl serviceClass;
	 
	
    @PostMapping("/username")
    public ResponseEntity<String> ConcatenatedString(@RequestBody FullName name){
    	return serviceClass.ConcatenatedString(name);
    }

}
