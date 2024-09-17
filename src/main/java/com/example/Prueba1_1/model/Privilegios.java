package com.example.Prueba1_1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Privilegios")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Privilegios {
    @Id
    private Long id;
    private String nombre;
    private String descripcion;

}
