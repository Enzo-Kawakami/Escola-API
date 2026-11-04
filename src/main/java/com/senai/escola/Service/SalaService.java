package com.senai.escola.Service;

import com.senai.escola.Entity.Sala;
import com.senai.escola.Repository.SalaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaService {

    private final SalaRepository SalaReqository;
    public SalaService(SalaRepository SalaReqository){
        this.SalaReqository = SalaReqository;
    }

    public List<Sala> buscarTodos(){
        return SalaReqository.findAll();
    }

    public void criarSala(Sala Sale){
        Sala sala = new Sala(Sale.getNome(),Sale.getCadeiras(),Sale.getMesas(),Sale.getAlunos());
        SalaReqository.save(sala);
    }
}
