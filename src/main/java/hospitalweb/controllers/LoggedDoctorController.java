package hospitalweb.controllers;

import hospitalweb.Services.DoctorService;
import hospitalweb.Services.PacientService;
import hospitalweb.model.Doctor;
import hospitalweb.model.Pacient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class LoggedDoctorController {
    @Autowired
    PacientService  pacientService;

    @RequestMapping("/tryAddPacient")
    public String tryAddPac(@ModelAttribute("name") String name, @ModelAttribute("illness") String illness){
        List<Pacient> pacs = pacientService.getAllPacients();
        for (Pacient dc: pacs
                ) {
                    // to do
            }


        return null;
    }

    @RequestMapping("/doctorHome")
    public String pacientHome(){
        return"doctorhome";
    }

    @RequestMapping("/pacientList")
    public String pacientList(Model model){
        List<Pacient> pacs = pacientService.getAllPacients();

        model.addAttribute("pacs",pacs);
        return "pacients";
    }

    @RequestMapping("/doctorRegPac")
    public String pacientRegDoc(){
        return "doctorRegPac";
    }
}
