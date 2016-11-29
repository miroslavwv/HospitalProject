package hospitalweb.domain.factory;

import hospitalweb.model.Doctor;
import hospitalweb.model.Pacient;

public class PacientFactory {
    public Pacient create(String nickName, String name, String pass, String egn, String illness){
        Pacient pc = new Pacient();
        pc.setName(name);
        pc.setNickName(nickName);
        pc.setPassword(pass);
        pc.setEgn(egn);
        pc.setIllness(illness);
        return pc;
    }
}
