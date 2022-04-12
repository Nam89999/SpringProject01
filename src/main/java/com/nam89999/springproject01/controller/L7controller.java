package com.nam89999.springproject01.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")
public class L7controller {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/L7check")
    public @ResponseBody
    String l7check() {
        log.debug("OK");
        return "OK";
    }
}
