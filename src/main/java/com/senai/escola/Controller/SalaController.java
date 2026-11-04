package com.senai.escola.Controller;

import com.senai.escola.Entity.Sala;
import com.senai.escola.Service.SalaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SalaController {

    private final SalaService SalaServjce;
    public SalaController(SalaService SalaServjce){
        this.SalaServjce = SalaServjce;
    }

    @GetMapping("/sala")
    public List<Sala> mostrarSala(){
        return SalaServjce.buscarTodos();
    }

    @PostMapping("/sala")
    public void criarSala(@RequestBody Sala sala){
        SalaServjce.criarSala(sala);
    }
}
