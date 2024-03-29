package com.example.demo.Models;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="programa")
public class ProgramaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;

    private String nombre;

    @ManyToOne
    @JoinColumn(name="id_facultad")
    private FacultadModel facultad;

    @OneToMany(mappedBy = "programa")
	Set<UsuarioRolModel> rolUsuario;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public FacultadModel getFacultad() {
        return this.facultad;
    }

    public void setFacultad(FacultadModel facultad) {
        this.facultad = facultad;
    }

}
