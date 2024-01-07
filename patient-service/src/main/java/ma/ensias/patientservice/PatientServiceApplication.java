package ma.ensias.patientservice;

import ma.ensias.patientservice.domain.Patient;
import ma.ensias.patientservice.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PatientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientServiceApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner(PatientRepository patientRepository){
		return args -> {
			Patient patient1 = Patient.builder()
					.firstName("Hamza")
					.lastName("El mrabti")
					.email("elmrabti@gmail.com")
					.build();
			Patient patient2 = Patient.builder()
					.firstName("Ahmed")
					.lastName("Amrani")
					.email("amrani@gmail.com")
					.build();
			patientRepository.save(patient1);
			patientRepository.save(patient2);
		};
	}

}
