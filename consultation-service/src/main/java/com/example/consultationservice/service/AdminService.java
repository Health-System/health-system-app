package com.example.consultationservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web3j.crypto.Credentials;

@Service
public class AdminService {

    @Autowired
    private HealthPlatformContractService contractService;


    public String deployContract(String privateKey) {
        try {
            String contractAddress = contractService.deployContract(privateKey);
            return contractAddress;
        } catch (Exception e) {
            throw new RuntimeException("Error deploying the contract: " + e.getMessage());
        }
    }




    public void addDoctor(String privateKey, String doctorAddress) {
        try {
            contractService.addDoctor(privateKey, doctorAddress);
        } catch (Exception e) {
            throw new RuntimeException("Error adding doctor: " + e.getMessage());
        }
    }



    public void addPatient(String privateKey, String doctorAddress) {
        try {
            contractService.addPatient(privateKey, doctorAddress);
        } catch (Exception e) {
            throw new RuntimeException("Error adding patient: " + e.getMessage());
        }
    }



}
