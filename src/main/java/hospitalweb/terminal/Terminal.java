package hospitalweb.terminal;

import hospitalweb.Services.DoctorService;
import hospitalweb.Services.PacientService;
import hospitalweb.model.Doctor;
import hospitalweb.model.Pacient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Terminal implements CommandLineRunner {
    @Autowired
    DoctorService doctorService;

    @Autowired
    PacientService pacientService;

    @Override
    public void run(String... strings) throws Exception {


        Doctor doctor1 = doctorService.create("peshoasd","Ivo","1234","9601019082","bashDoctor");
        Doctor doctor = doctorService.create("mishoasd","Misho","1234","9601149082","asistent");
        Pacient pacient = pacientService.create("goshoasd","Gosho","1234","981212","Skleroza");
        Pacient pacient1 = pacientService.create("goshoasd","Pesho","1234","98121122","Skleroza");


        doctorService.register(doctor1);
        doctorService.register(doctor);
        pacientService.register(pacient);
        pacientService.register(pacient1);

    }
}
