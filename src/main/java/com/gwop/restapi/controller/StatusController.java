package com.gwop.restapi.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    @GetMapping(path = "/api/status")
    public String check() {
        JSONObject obj = new JSONObject();

        obj.put("status", "online");

        return obj.toString();
    }
}
