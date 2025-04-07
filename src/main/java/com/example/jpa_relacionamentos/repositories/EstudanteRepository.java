package com.example.jpa_relacionamentos.repositories;

import com.example.jpa_relacionamentos.entidades.CursoEstudante;
import com.example.jpa_relacionamentos.entidades.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<Estudante, Integer> {
}
