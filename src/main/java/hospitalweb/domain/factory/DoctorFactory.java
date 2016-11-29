package hospitalweb.domain.factory;

import hospitalweb.model.Doctor;

public class DoctorFactory {

    public Doctor create(String nickName, String name, String pass, String egn, String specialization){
        Doctor dc = new Doctor();
        dc.setName(name);
        dc.setNickName(nickName);
        dc.setPassword(pass);
        dc.setEgn(egn);
        dc.setDoctorSpecialization(specialization);
        return dc;
    }
}
