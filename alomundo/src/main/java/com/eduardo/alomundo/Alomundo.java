package com.eduardo.alomundo;

import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Alomundo {

    @RequestMapping("alo")
    public String alo(Model modelo){
        Random r = new Random();
        modelo.addAttribute("nro1", r.nextInt());
        modelo.addAttribute("nro2", r.nextInt());
        modelo.addAttribute("nro3", r.nextInt());
        modelo.addAttribute("nro4", r.nextInt());
        modelo.addAttribute("nro5", r.nextInt());
        modelo.addAttribute("nro6", r.nextInt());
        return "home";
    }
    
}
