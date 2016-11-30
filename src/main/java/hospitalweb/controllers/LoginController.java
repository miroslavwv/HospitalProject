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
public class LoginController {

    @Autowired
    PacientService pacientService;

    @Autowired
    DoctorService doctorService;

    @RequestMapping("/login")
    public String login(Model model){

        return "login";
    }




    @RequestMapping("/tryLogin")
    public String tryLog(@ModelAttribute("nickName") String nickName,@ModelAttribute("password") String password){

        if(checkLogin(nickName,password)==0){
            return "noUserExist";
        }

        else if(checkLogin(nickName,password)==1){
            //pacient
            return "pacienthome";
        }
        else if(checkLogin(nickName,password)==2){
            //doctor
            return "doctorhome";
        }
        return "noUserExist";
    }
    Integer checkLogin(String nickName, String password) {
        List<Pacient> pc=pacientService.getAllPacients();
        List<Doctor> dc = doctorService.getAllDoctors();

        for (Pacient pacient:pc) {
            if(pacient.getNickName().equals(nickName)&&pacient.getPassword().equals(password)){
                return 1;
            }
        }
        for(Doctor doc: dc){
            if(doc.getNickName().equals(nickName)&&doc.getPassword().equals(password)){
                return 2;
            }
        }


    return 0;
    }

}
