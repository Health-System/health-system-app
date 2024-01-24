package com.example.consultationservice.dto;

import java.math.BigInteger;

public class CompleteAppointmentDto {

    String doctorPrivateKey;
    BigInteger appointmentId;

    public String getDoctorPrivateKey() {
        return doctorPrivateKey;
    }

    public void setDoctorPrivateKey(String doctorPrivateKey) {
        this.doctorPrivateKey = doctorPrivateKey;
    }

    public BigInteger getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(BigInteger appointmentId) {
        this.appointmentId = appointmentId;
    }
}
