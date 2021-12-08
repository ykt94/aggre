package ru.baken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/adres")
    public String booking(
            @RequestParam(name="adres",
                    required=false, defaultValue="Тверская, 1") String adres, Model model)
    {
        model.addAttribute("adres", adres);
        return "adres";
    }

}
