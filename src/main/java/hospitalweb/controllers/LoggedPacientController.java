package hospitalweb.controllers;

import hospitalweb.Services.DoctorService;
import hospitalweb.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class LoggedPacientController {

    @Autowired
    DoctorService doctorService;

    @RequestMapping("/tryAddDoctor")
    public String tryAddDoc(@ModelAttribute("name") String name, @ModelAttribute("specialization") String spec){
        List<Doctor> docs = doctorService.getAllDoctors();
        for (Doctor dc: docs
             ) {
            if(name.equals(dc.getName())&&spec.equals(dc.getDoctorSpecialization())){
                // to do add in manytomany table
            }

        }
        return null;
    }

    @RequestMapping("/pacientHome")
    public String pacientHome(){
        return"pacienthome";
    }

    @RequestMapping("/doctorList")
    public String pacientList(Model model){
        List<Doctor> docs = doctorService.getAllDoctors();

        model.addAttribute("docs",docs);
        return "doctors";
    }

    @RequestMapping("/pacientRegDoc")
    public String pacientRegDoc(){
        return "pacientRegDoc";
    }
}
