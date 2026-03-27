package com.dtd.dbtodocument.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Controller
public class PageController {
    @RequestMapping("/")
    public String home() {
        return "pages/connect";
    }

    @RequestMapping("/tables")
    public String tableList(Model model) {
        // 테스트용 데이터
        model.addAttribute("schemas", List.of("public", "dbo", "test"));
        model.addAttribute("tables", List.of("user", "order", "product"));
        return "pages/tableList";
    }
}
