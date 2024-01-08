package com.example.doctorservice.controller;

import com.example.doctorservice.domain.Doctor;
import com.example.doctorservice.repositories.DoctorRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorRestController {

    private DoctorRepository doctorRepository;


    public DoctorRestController(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @GetMapping("/doctors")
    public List<Doctor> doctorList(){
        return doctorRepository.findAll();
    }

    @GetMapping("/doctors/{id}")
    public Doctor doctorById(@PathVariable Long id){
        return doctorRepository.findById(id).get();
    }

}
