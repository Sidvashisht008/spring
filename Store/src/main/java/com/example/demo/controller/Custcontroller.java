package com.example.demo.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class Custcontroller {
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/upload")
	public String fileUpload(@RequestParam("file") MultipartFile file) {
		return String.format("File is upload successfully", file.getOriginalFilename());
		
	}
}
