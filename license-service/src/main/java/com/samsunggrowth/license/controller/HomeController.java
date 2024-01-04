package com.samsunggrowth.license.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    MessageSource messages;
    @GetMapping(value="/")
    public String fallback()
    {
        return  String.format(messages.getMessage("license.fallback",null,null));
    }

}
