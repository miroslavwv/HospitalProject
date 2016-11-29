package hospitalweb.controllers;

import hospitalweb.domain.factory.dto.DoctorDto;
import hospitalweb.domain.factory.dto.PacientDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

@Controller
public class RegisterController {
    @RequestMapping("/register")
    public String register(Model model){
        return "register";
    }
    @RequestMapping("/docreg")
    public String docreg(Model model){
        model.addAttribute("DoctorDto", new DoctorDto());
        return "docreg";
    }
    @RequestMapping("/pacreg")
    public String pacreg(Model model){
        model.addAttribute("PacientDto", new PacientDto());
        return "pacreg";
    }
}
