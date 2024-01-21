package com.example.consultationservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web3j.crypto.Credentials;

@Service
public class AdminService {

    @Autowired
    private HealthPlatformContractService contractService;

    // Authenticates the administrator using the provided private key
    public boolean authenticateAdmin(String privateKey) {
        try {
            // Use the provided private key to load the administrator's credentials
            Credentials adminCredentials = Credentials.create(privateKey);

            // Perform a transaction on the contract (e.g., read some data) to verify the authentication
            String administratorAddress = contractService.getAdministratorAddress();
            boolean isAdmin = contractService.isAdministrator(administratorAddress, adminCredentials);

            return isAdmin;
        } catch (Exception e) {
            // Handle exceptions appropriately (e.g., log them)
            e.printStackTrace();
            return false;
        }
    }


    public String deployContract(String privateKey) {
        try {
            String contractAddress = contractService.deployContract(privateKey);
//            contractService.setContractAddress(contractAddress,privateKey);
            return contractAddress;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
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
