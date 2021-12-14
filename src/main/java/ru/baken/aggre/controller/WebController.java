package ru.baken.aggre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.baken.aggre.repository.TaxiRepository;

@Controller
public class WebController {
    @GetMapping("/")
    public String index()
    {
        return "index";
    }

    @Autowired
    TaxiRepository taxiRepo;
    @RequestMapping("/adres")
    public String home(@RequestParam(name="adres", required=false, defaultValue="не указан") String adres, Model model)

    {
        model.addAttribute("taxi", taxiRepo.findAll());
        model.addAttribute("adres", adres);
        return "adres";
    }
/*
    @GetMapping("/adres")
    public String adres(
            @RequestParam(name="adres", required=false, defaultValue="не указан") String adres, Model model)
    {
        model.addAttribute("adres", adres);
        return "adres";
    }
*/
    @GetMapping("/booking")
    public String booking(
            @RequestParam(name="adres", required=false, defaultValue="не указан") String adres, Model model)
    {
        model.addAttribute("adres", adres);

        return "booking";
    }

}
