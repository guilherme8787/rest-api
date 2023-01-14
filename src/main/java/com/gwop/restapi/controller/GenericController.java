package com.gwop.restapi.controller;

import com.gwop.restapi.services.SumService;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenericController {

    @GetMapping(path = "/api/sum/{num1}/{num2}")
    public String sumNumbers(@PathVariable("num1") Integer num1, @PathVariable("num2") Integer num2) {
        SumService sumService = new SumService(num1, num2);
        Integer result = sumService.sumNumbers();

        JSONObject obj = new JSONObject();

        obj.put("result", result);

        return obj.toString();
    }

}
