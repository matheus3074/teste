package com.example.jpa_relacionamentos.entidades;

import jakarta.persistence.*;
import org.hibernate.mapping.Join;

import java.util.List;

@Entity
@Table(name = "curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nome")
    private String nome;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "professor_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Professor professor;

    @Column(name = "professor_id")
    private int professorId;

    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
    private List<CursoEstudante> cursosEstudantes;

    public Curso() {
    }

    public Curso(String nome) {
        this.nome = nome;
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

//    public Professor getProfessor() {
//        return professor;
//    }
//
//    public void setProfessor(Professor professor) {
//        this.professor = professor;
//    }

    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }
}
