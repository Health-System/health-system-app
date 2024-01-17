package com.example.consultationservice.controller;

import com.example.consultationservice.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/authenticate")
    public ResponseEntity<String> authenticateAdmin(@RequestBody String privateKey) {
        if (adminService.authenticateAdmin(privateKey)) {
            return ResponseEntity.ok("Admin authenticated successfully");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid private key");
        }
    }


    @PostMapping("/deploy-contract/")
    public ResponseEntity<String> deployContract(@RequestBody String privateKey) {
        String contractAddress = adminService.deployContract(privateKey);
        if (contractAddress != null) {
            return ResponseEntity.ok("Contract deployed. Address: " + contractAddress);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to deploy contract");
        }
    }


    @PostMapping("/add-doctor")
    public ResponseEntity<String> addDoctor(@RequestBody String privateKey, @RequestBody String doctorAddress) {
        try {
            adminService.addDoctor(privateKey, doctorAddress);
            return ResponseEntity.ok("Doctor added successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error adding doctor: " + e.getMessage());
        }
    }



    @PostMapping("/add-patient")
    public ResponseEntity<String> addPatient(@RequestBody String privateKey, @RequestBody String patientAddress) {
        try {
            adminService.addPatient(privateKey, patientAddress);
            return ResponseEntity.ok("Patient added successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error adding patient: " + e.getMessage());
        }
    }






}
