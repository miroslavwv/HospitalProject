package hospitalweb.controllers;

import hospitalweb.Services.DoctorService;
import hospitalweb.Services.DoctorServiceImpl;
import hospitalweb.Services.PacientServiceImpl;
import hospitalweb.domain.factory.dto.DoctorDto;
import hospitalweb.model.Doctor;
import hospitalweb.model.Pacient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DoctorListController {
    @Autowired
    DoctorService doctorService;

    @RequestMapping("/doctorReg")
    public String pacList(Model model,@ModelAttribute DoctorDto dt){
       Doctor dc = doctorService.create(dt.getNickName(),dt.getName(),dt.getPassword(),dt.getEgn(),dt.getDoctorSpecialization());
        doctorService.register(dc);

        return "doctorhome";
    }

}
