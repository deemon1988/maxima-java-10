package org.example.controller;

import org.example.model.Cat;
import org.example.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //вместо @ResponseBody
public class CatController {
    @Autowired
    private CatService catService;
    @GetMapping("/cats")
    public List<Cat> getAll(){
        return catService.getCats();
    }

}
