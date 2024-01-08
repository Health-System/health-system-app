package com.example.doctorservice;

import com.example.doctorservice.domain.Doctor;
import com.example.doctorservice.repositories.DoctorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DoctorServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DoctorServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(DoctorRepository doctorRepository){

        return args -> {
            Doctor doctor1 = Doctor.builder()
                    .firstName("Kamal")
                    .lastName("Benchekroune")
                    .email("benchekroune@gmail.com")
                    .build();
            Doctor doctor2 = Doctor.builder()
                    .firstName("Zineb")
                    .lastName("Ettazi")
                    .email("ettazi@gmail.com")
                    .build();
            doctorRepository.save(doctor1);
            doctorRepository.save(doctor2);
        };


    }

}
