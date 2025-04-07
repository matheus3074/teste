package com.example.jpa_relacionamentos.entidades;

import jakarta.persistence.*;

@Entity
public class CursoEstudante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "curso_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Curso curso;

    @Column(name = "curso_id")
    private int cursoId;

    @ManyToOne
    @JoinColumn(name = "estudante_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Estudante estudante;

    @Column(name = "estudante_id")
    private int estudanteId;

    public CursoEstudante() {
    }

    public CursoEstudante(Curso curso, Estudante estudante) {
        this.curso = curso;
        this.estudante = estudante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public int getCursoId() {
        return cursoId;
    }

    public void setCursoId(int cursoId) {
        this.cursoId = cursoId;
    }

    public int getEstudanteId() {
        return estudanteId;
    }

    public void setEstudanteId(int estudanteId) {
        this.estudanteId = estudanteId;
    }
}
