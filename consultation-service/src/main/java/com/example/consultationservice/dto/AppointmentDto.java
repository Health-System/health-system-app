package com.example.consultationservice.dto;

import java.math.BigInteger;

public class AppointmentDto {

    private String doctorPrivateKey;
    private String patientAddress;

    public BigInteger getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(BigInteger timeStamp) {
        this.timeStamp = timeStamp;
    }

    private BigInteger timeStamp;

    public String getDoctorPrivateKey() {
        return doctorPrivateKey;
    }

    public void setDoctorPrivateKey(String doctorPrivateKey) {
        this.doctorPrivateKey = doctorPrivateKey;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }


}

