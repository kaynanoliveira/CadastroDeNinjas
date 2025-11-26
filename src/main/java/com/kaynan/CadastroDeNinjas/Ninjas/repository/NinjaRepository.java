package com.kaynan.CadastroDeNinjas.Ninjas.repository;

import com.kaynan.CadastroDeNinjas.Ninjas.model.Ninja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<Ninja, Long> {
}
