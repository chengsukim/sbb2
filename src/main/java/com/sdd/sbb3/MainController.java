package com.sdd.sbb3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/main")
    @ResponseBody
    public String showmain() {
        return "Hello Sbb";
    }
}
