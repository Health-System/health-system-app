package com.example.consultationservice.controller;

import com.example.consultationservice.dto.AddMedRecDto;
import com.example.consultationservice.dto.AppointmentDto;
import com.example.consultationservice.dto.CompleteAppointmentDto;
import com.example.consultationservice.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("/api/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping("/add-medical-record")
    public ResponseEntity<String> addMedicalRecord(@RequestBody AddMedRecDto addMedRecDto) {
        try {
            doctorService.addMedicalRecord(addMedRecDto.getPrivateKey(), addMedRecDto.getMedRecDto());
            return ResponseEntity.ok("Medical record added successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error adding medical record: " + e.getMessage());
        }
    }


    @PostMapping("/schedule-appointment")
    public ResponseEntity<String> scheduleAppointment(@RequestBody AppointmentDto appointmentDto) {
        try {
            doctorService.scheduleAppointment(
                    appointmentDto.getDoctorPrivateKey(),
                    appointmentDto.getPatientAddress(),
                    appointmentDto.getTimeStamp()
            );
            return ResponseEntity.ok("Appointment scheduled successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error scheduling appointment: " + e.getMessage());
        }
    }


    @PostMapping("/complete-appointment")
    public ResponseEntity<String> completeAppointment(@RequestBody CompleteAppointmentDto completeAppointmentDto) {
        try {
            doctorService.completeAppointment(
                    completeAppointmentDto.getDoctorPrivateKey(),
                    completeAppointmentDto.getAppointmentId());
            return ResponseEntity.ok("Appointment completed successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error completing appointment: " + e.getMessage());
        }
    }


}

