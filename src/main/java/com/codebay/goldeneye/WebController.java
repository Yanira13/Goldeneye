package com.codebay.goldeneye;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class WebController {  
    @GetMapping("/")
    public String indexForm(Model model) {
        // EmailNew emailNew=new EmailNew();
        // List<String> lista= emailNew.getListOfficeLocation();
        // lista.add("spain");
        // lista.add("milan");
        model.addAttribute("emailNew", new EmailNew());
        // model.addAttribute("lista", lista);
        return "index";
    }

    @PostMapping("/")
    public String indexSubmit(@ModelAttribute @Valid EmailNew emailNew, Model model, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "index";
        }
        else{
            
            model.addAttribute("emailNew", emailNew);
            String name=emailNew.getName();
            name=name.toLowerCase();
            char letra=name.charAt(0);
            model.addAttribute("letra", letra);
            return "result";
        }
        
    }
    
}