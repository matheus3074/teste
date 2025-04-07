package com.example.jpa_relacionamentos.entidades;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "professor")
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "idade")
    private int idade;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "detalhe_professor_id", referencedColumnName = "id")
    private DetalheProfessor detalheProfessor;

    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL)
    private List<Curso> cursos = new ArrayList<>();

    public Professor() {
    }

    public Professor(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.detalheProfessor = detalheProfessor;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public DetalheProfessor getDetalheProfessor() {
        return detalheProfessor;
    }

    public void setDetalheProfessor(DetalheProfessor detalheProfessor) {
        this.detalheProfessor = detalheProfessor;
    }

//    public List<Curso> getCursos() {
//        return cursos;
//    }

//    public void setCursos(List<Curso> cursos) {
//        this.cursos = cursos;
//    }
}
