package com.example.jpa_relacionamentos.repositories;

import com.example.jpa_relacionamentos.entidades.CursoEstudante;
import com.example.jpa_relacionamentos.entidades.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
}
