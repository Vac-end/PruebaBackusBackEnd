package com.example.Prueba1_1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Usuarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String nombre;
    private String documento;
    private String email;
    private String telefono;
    private String direccion;
    private String passwordHash;

    @ManyToOne
    @JoinColumn(name = "rolId")
    private Roles rol;
}
