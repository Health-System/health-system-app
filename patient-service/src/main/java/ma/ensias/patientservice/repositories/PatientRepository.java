package ma.ensias.patientservice.repositories;

import ma.ensias.patientservice.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {

}
