package hospitalweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoggedPacientController {

    @RequestMapping("/pacientHome")
    public String pacientHome(){
        return"pacienthome";
    }

    @RequestMapping("/doctortList")
    public String pacientList(){
        return "doctors";
    }

    @RequestMapping("/pacientRegDoc")
    public String pacientRegDoc(){
        return "pacientRegDoc";
    }
}
