package com.kaynan.CadastroDeNinjas.Missoes.model;

import com.kaynan.CadastroDeNinjas.Ninjas.model.Ninja;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_missoes")
public class Missoes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    // @OneToMany - Uma missao pode ter vários ninjas
    @OneToMany(mappedBy = "missoes")
    private List<Ninja> ninjas;
}
