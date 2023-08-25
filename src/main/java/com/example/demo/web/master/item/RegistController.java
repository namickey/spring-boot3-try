package com.example.demo.web.master.item;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistController {
    
    @GetMapping("/master/item/regist/index")
    public String index(ItemForm form) {
        
        return "master/item/index";
    }
}
