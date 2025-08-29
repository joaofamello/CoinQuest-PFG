package com.coinquest.coinquest_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Metas")
public class Meta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private double valor;
    private Categoria categoria;
    private LocalDate prazo;

    public Meta(String titulo, double valor) {
        this.titulo = titulo;
        this.valor = valor;
    }
}
