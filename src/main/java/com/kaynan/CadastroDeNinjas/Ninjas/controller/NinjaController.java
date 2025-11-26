package com.kaynan.CadastroDeNinjas.Ninjas.controller;

import com.kaynan.CadastroDeNinjas.Ninjas.model.Ninja;
import com.kaynan.CadastroDeNinjas.Ninjas.service.NinjaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {
    public final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping
    public List<Ninja> getNinja(){
        return ninjaService.getAll();
    }

    @PostMapping
    public Ninja createNinja(@RequestBody Ninja ninja){
        return ninjaService.create(ninja);
    }
}
