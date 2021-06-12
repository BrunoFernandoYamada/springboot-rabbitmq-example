package com.bfyamada.rabbitmq.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Order {

    //somente redireciona para o link, precisar existir um requestMapping para o caminho redirecionado
    @RequestMapping("/")
    public String order(){
        return "redirect:/order/list";
    }

    @RequestMapping({"/order/list", "/order"})
    public String listProducts(Model model){
        return "order/list";
    }

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }



}
