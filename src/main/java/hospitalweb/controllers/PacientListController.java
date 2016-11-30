package hospitalweb.controllers;

import hospitalweb.Services.PacientService;
import hospitalweb.Services.PacientServiceImpl;
import hospitalweb.domain.factory.dto.PacientDto;
import hospitalweb.model.Doctor;
import hospitalweb.model.Pacient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.List;

@Controller
public class PacientListController {
    @Autowired
    PacientService pacientService;

    @RequestMapping("/pacientReg")
    public String pacList(Model model,@ModelAttribute("pacs") PacientDto pd){
        Pacient pc = pacientService.create(pd.getNickName(),pd.getName(),pd.getPassword(),pd.getEgn(),pd.getIllness());
        pacientService.register(pc);

        return "pacienthome";
    }

}
