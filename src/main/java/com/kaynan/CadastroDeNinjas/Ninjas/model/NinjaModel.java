package com.kaynan.CadastroDeNinjas.Ninjas.model;

import com.kaynan.CadastroDeNinjas.Missoes.model.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Entity transforma uma classe em uma entidade no BD
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cadastros")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    // @ManyToOne - Muitos ninjas para uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id")  // Foreing Key ou Chave estrangeira
    private MissoesModel missoes;
}
