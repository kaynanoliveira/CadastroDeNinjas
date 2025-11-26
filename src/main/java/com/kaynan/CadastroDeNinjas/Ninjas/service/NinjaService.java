package com.kaynan.CadastroDeNinjas.Ninjas.service;

import com.kaynan.CadastroDeNinjas.Ninjas.model.Ninja;
import com.kaynan.CadastroDeNinjas.Ninjas.repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {
    public final NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Listar todos
    public List<Ninja> getAll(){
        return ninjaRepository.findAll();
    }

    // Criar
    public Ninja create(Ninja ninja){
        return ninjaRepository.save(ninja);
    }

    // Deletar
    public void delete(Long id){
        ninjaRepository.deleteById(id);
    }
}
