package com.cpifppiramide.yolbell.Ejemplo1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Formulario {



    @RequestMapping("/formulario")
    String formulario(){
        return "formulario";
    }

    @PostMapping("/datos")
    String datos(User user, Model model){
        System.out.println(user);
        model.addAttribute("user", user);
        return "datos";
    }
}
