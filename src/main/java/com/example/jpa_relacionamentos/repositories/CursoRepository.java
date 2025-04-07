package com.example.jpa_relacionamentos.repositories;

import com.example.jpa_relacionamentos.entidades.Curso;
import com.example.jpa_relacionamentos.entidades.CursoEstudante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository  extends JpaRepository<Curso, Integer> {
}
