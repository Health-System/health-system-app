package ma.ensias.patientservice.controller;

import ma.ensias.patientservice.domain.Patient;
import ma.ensias.patientservice.repositories.PatientRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientRestController {

    private PatientRepository patientRepository;

    public PatientRestController(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }


    @GetMapping("patients")
    public List<Patient> patientList(){
        return patientRepository.findAll();
    }


    @GetMapping("patients/{id}")
    public Patient patientById(@PathVariable Long id){
        return patientRepository.findById(id).get();
    }

}
