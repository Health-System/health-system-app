package ma.ensias.patientservice.repositories;

import ma.ensias.patientservice.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface PatientRepository extends JpaRepository<Patient,Long> {

}
