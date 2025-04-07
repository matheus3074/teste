package com.example.jpa_relacionamentos.entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "estudante")
public class Estudante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "sobre_nome")
    private String sobreNome;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "estudante", cascade = CascadeType.ALL)
    private List<CursoEstudante> cursosEstudantes;

    public Estudante() {
    }

    public Estudante(String nome, String sobreNome, String email) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
