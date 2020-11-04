package com.isageek.blaztek.deployment.controller;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogController {

    @GetMapping("/dog")
    JSONObject dog() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("message", "https://upload.wikimedia.org/wikipedia/commons/e/e2/Adult_Black_Pug.jpg");
        jsonObject.put("status", "success");
        return jsonObject;
    }

}
