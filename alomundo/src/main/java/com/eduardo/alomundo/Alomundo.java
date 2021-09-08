package com.eduardo.alomundo;

import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Alomundo {

    @RequestMapping("/")
    public String inicio(){
        return "home";
    }
    
    @RequestMapping("/pg2")
    public String pg2(){
        return "pagina2";
    }
}
