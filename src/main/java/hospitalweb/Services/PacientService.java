package hospitalweb.Services;

import hospitalweb.model.Pacient;

import java.util.List;

public interface PacientService {
    List<Pacient> getAllPacients();
    void register(Pacient pacient);
    List<Pacient> getByName(String name);
    Pacient create(String nickName, String name, String password, String egn, String illness);
    Pacient retrieve(long id);
}
