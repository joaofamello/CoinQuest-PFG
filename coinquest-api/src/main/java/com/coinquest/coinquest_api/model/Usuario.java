package com.coinquest.coinquest_api.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String nome;
    private String email;
    private String senha;

    // mappedBy = "usuario" define que o atributo "usuario" controla a relação
    // cascade = CascadeType.ALL significa que as operações feitas em Usuario também refletem nas Contas
    // orphanRemoval = true define que se remover uma conta da lista de contas, ela também vai ser removida do banco
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private ArrayList<Conta> minhasContas = new ArrayList<>();
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private ArrayList<Cartao> meusCartoes = new ArrayList<>();
    private double saldoTotal;
    private double receitas;
    private double despesas;
    private double pago;
    private double recebido;
}
