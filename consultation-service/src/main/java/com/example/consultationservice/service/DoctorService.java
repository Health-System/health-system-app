package com.example.consultationservice.service;

import com.example.consultationservice.dto.MedRecDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class DoctorService {

    @Autowired
    private HealthPlatformContractService contractService;

    public void addMedicalRecord(String privateKey, MedRecDto medRecDto) {
        try {
            contractService.addMedicalRecord(privateKey,medRecDto);
        }
        catch (Exception e){
            throw new RuntimeException("Error adding medical record : "+e.getMessage());
        }
    }

    public void scheduleAppointment(String doctorPrivateKey, String patientAddress, BigInteger timeStamp) {
        try {
            contractService.scheduleAppointment(doctorPrivateKey, patientAddress, timeStamp);
        } catch (Exception e) {
            throw new RuntimeException("Error scheduling appointment: " + e.getMessage());
        }
    }

    


}
