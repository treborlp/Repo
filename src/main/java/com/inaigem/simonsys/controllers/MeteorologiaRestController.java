package com.inaigem.simonsys.controllers;

import com.inaigem.simonsys.models.dao.IMeteorologiaDao;
import com.inaigem.simonsys.models.entity.Meteorologia;
import com.inaigem.simonsys.models.services.IMeteorologiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class MeteorologiaRestController {

    @Autowired
    private IMeteorologiaService meteorologiaService;

    @GetMapping("/meteorologia")
    public List<Meteorologia> index(){
        return meteorologiaService.findAll();
    }

}
