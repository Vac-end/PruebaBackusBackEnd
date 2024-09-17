package com.example.Prueba1_1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Roles")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Roles {
    @Id
    private Long id;
    private String nombre;
    private String descripcion;

    @OneToMany(mappedBy = "rol", cascade = CascadeType.ALL)
    private List<Usuarios> usuarios;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "rol_privilegio",
            joinColumns = @JoinColumn(name = "rolId"),
            inverseJoinColumns = @JoinColumn(name = "privilegioId")
    )
    private List<Privilegios> privilegios;
}
