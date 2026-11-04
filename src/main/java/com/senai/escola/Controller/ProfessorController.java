package com.senai.escola.Controller;

import com.senai.escola.Entity.Professor;
import com.senai.escola.Service.ProfessorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProfessorController {

    private final ProfessorService ProfesssorService;
    public ProfessorController(ProfessorService professsorService) {
        ProfesssorService = professsorService;
    }

    @GetMapping("/professor")
    public List<Professor> mostrarProfessores(){
        return ProfesssorService.mostrarProfessores();
    }

    @PostMapping("/professor")
    public void cadastrarProfessores(@RequestBody Professor Professsor){
        ProfesssorService.cadastrarProfessor(Professsor);
    }
}
