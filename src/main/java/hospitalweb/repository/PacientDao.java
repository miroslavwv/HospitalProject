package hospitalweb.repository;

import hospitalweb.model.Pacient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacientDao extends JpaRepository<Pacient,Long> {
    List<Pacient> findByName(String name);


    @Query(value = "SELECT p FROM Pacient AS p")
    List<Pacient> findAll();
}
