package com.coinquest.coinquest_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Cartoes")
public class Cartao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private double limiteTotal;
    private double fatura;
    private LocalDate fechamento;
    private LocalDate vencimento;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario dono;
    private StatusFatura statusFatura;
}
