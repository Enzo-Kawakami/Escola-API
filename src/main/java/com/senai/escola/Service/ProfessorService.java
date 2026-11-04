package com.senai.escola.Service;

import com.senai.escola.Entity.Professor;
import com.senai.escola.Entity.Sala;
import com.senai.escola.Repository.ProfessorRepository;
import com.senai.escola.Repository.SalaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    private final ProfessorRepository ProfessorReqository;
    public ProfessorService(ProfessorRepository professorReqository) {
        ProfessorReqository = professorReqository;
    }

    public List<Professor> mostrarProfessores(){
        return ProfessorReqository.findAll();
    }

    public void cadastrarProfessor(Professor Professsor){
        Professor professor = new Professor(Professsor.getNome(),Professsor.getIdade(),Professsor.getCpf());
        ProfessorReqository.save(professor);
    }
}
