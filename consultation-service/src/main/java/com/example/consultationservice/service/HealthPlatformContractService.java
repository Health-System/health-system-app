package com.example.consultationservice.service;

import com.example.consultationservice.contracts.HealthPlatform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

import java.math.BigInteger;

@Service
public class HealthPlatformContractService {

    private HealthPlatform contract ;
    private final static BigInteger GAS_LIMIT = BigInteger.valueOf(6721975L);
    private final static BigInteger GAS_PRICE = BigInteger.valueOf(20000000000L);

    private static String contractAddress = null ;



    public String getAdministratorAddress() throws Exception {
        // Implement logic to get the administrator's address from the contract
//        return contract.administrator().send();
        return null;
    }

    public boolean isAdministrator(String adminAddress, Credentials adminCredentials) {
        // Implement logic to check if the provided credentials match the administrator's address
        return adminAddress.equalsIgnoreCase(adminCredentials.getAddress());
    }


    public String deployContract(String  privatekey) {
        Web3j web3j = Web3j.build(new HttpService());
        Credentials credentials = getCredentialsFromPrivateKey(privatekey);
        try {
            HealthPlatform healthPlatform = HealthPlatform.deploy(
                    web3j,
                    credentials,
                    GAS_PRICE,
                    GAS_LIMIT
            ).send();

            contractAddress = healthPlatform.getContractAddress();
            return healthPlatform.getContractAddress();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Credentials getCredentialsFromPrivateKey(String adresse) {
        return Credentials.create(adresse);
    }


    HealthPlatform  loadContract(String contractAddress, Web3j web3j, Credentials credentials){
        return HealthPlatform.load(contractAddress, web3j, credentials, GAS_PRICE, GAS_LIMIT);
    }

    public void addDoctor(String privateKey, String doctorAddress) {
        try {
            Web3j web3j = Web3j.build(new HttpService());
            Credentials credentials = Credentials.create(privateKey);
            loadContract(contractAddress , web3j, credentials);
            contract.addDoctor(doctorAddress).send();
        } catch (Exception e) {
            throw new RuntimeException("Error adding doctor: " + e.getMessage());
        }
    }


    public void addPatient(String privateKey, String patientAddress) {
        try {
            Web3j web3j = Web3j.build(new HttpService());
            Credentials credentials = Credentials.create(privateKey);
            loadContract(contractAddress , web3j, credentials);
            contract.addPatient(patientAddress).send();
        } catch (Exception e) {
            throw new RuntimeException("Error adding patient: " + e.getMessage());
        }
    }


}
