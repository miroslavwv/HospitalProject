package hospitalweb.Services;

import hospitalweb.domain.factory.DoctorFactory;
import hospitalweb.repository.DoctorDao;
import hospitalweb.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService{

    @Autowired
    DoctorDao doctorDao;

    @Autowired
    DoctorFactory factory;

    @Override
    public List<Doctor> getAllDoctors() {
        return this.doctorDao.findAll();
    }

    @Override
    public void register(Doctor doctor) {
        doctorDao.saveAndFlush(doctor);
    }

    @Override
    public Doctor create(String nickName, String name, String pass, String egn, String specialization) {
        Doctor dc = this.factory.create(nickName,name,pass,egn,specialization);
        return dc;
    }

    @Override
    public Doctor retrieve(long id) {

        return doctorDao.findOne(id);
    }
}
