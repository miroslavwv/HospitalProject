package hospitalweb.Services;

import hospitalweb.domain.factory.PacientFactory;
import hospitalweb.repository.PacientDao;
import hospitalweb.model.Pacient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacientServiceImpl implements PacientService {

    @Autowired
    PacientDao pacientDao;

    @Autowired
    PacientFactory factory;

    @Override
    public List<Pacient> getAllPacients() {
        List<Pacient> pc = pacientDao.findAll();
        return pc;
    }

    @Override
    public void register(Pacient pacient) {
        pacientDao.saveAndFlush(pacient);

    }

    @Override
    public List<Pacient> getByName(String name) {
        List<Pacient> pacs = pacientDao.findByName(name);
        return pacs;
    }

    @Override
    public Pacient create(String nickName, String name, String password, String egn, String illness) {
        Pacient pc = this.factory.create(nickName,name,password,egn,illness);
        return pc;
    }

    @Override
    public Pacient retrieve(long id) {
        return pacientDao.findOne(id);
    }
}
