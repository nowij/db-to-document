package com.dtd.dbtodocument.controller;

import com.dtd.dbtodocument.dto.ConnectDTO;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbController {

    @PostMapping("/connect")
    public String connect(@ModelAttribute ConnectDTO connectDTO) {

        return "success";
    }
}
