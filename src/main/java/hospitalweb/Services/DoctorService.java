package hospitalweb.Services;

import hospitalweb.model.Doctor;

import java.util.List;

public interface DoctorService {
    List<Doctor> getAllDoctors();
    void register(Doctor doctor);
    Doctor create(String nickName, String name, String pass, String egn, String specialization);
    Doctor retrieve(long id);
}
