package hospitalweb.repository;

import hospitalweb.model.Doctor;
import hospitalweb.model.Pacient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.print.Doc;
import java.util.List;

@Repository
public interface DoctorDao extends JpaRepository<Doctor, Long> {

    @Query(value = "SELECT d FROM Doctor AS d")
    List<Doctor> findAll();

}
