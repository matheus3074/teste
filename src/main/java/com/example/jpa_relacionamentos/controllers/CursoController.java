package com.example.jpa_relacionamentos.controllers;

import com.example.jpa_relacionamentos.entidades.Curso;
import com.example.jpa_relacionamentos.entidades.Professor;
import com.example.jpa_relacionamentos.repositories.CursoRepository;
import com.example.jpa_relacionamentos.repositories.ProfessorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/curso/")
public class CursoController {
    private final CursoRepository cursoRepository;
//    private final ProfessorRepository professorRepository;

    @Autowired
    public CursoController(CursoRepository cursoRepository, ProfessorRepository professorRepository) {
        this.cursoRepository = cursoRepository;
//        this.professorRepository = professorRepository;
    }

    @GetMapping("")
    public List<Curso> getAll() {
        return this.cursoRepository.findAll();
    }

    @GetMapping("{id}")
    public Curso getById(@PathVariable int id) {
        return this.cursoRepository.findById(id).get();
    }

    @PostMapping("")
    public Curso save(@RequestBody Curso curso) {
//        Professor professor = this.professorRepository.findById(curso.getProfessor().getId()).get();
//        curso.setProfessor(professor);
        return this.cursoRepository.save(curso);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
         this.cursoRepository.deleteById(id);
    }

    @PutMapping("")
    public Curso getById(@RequestBody Curso curso) {
//        Professor professor = this.professorRepository.findById(curso.getProfessor().getId()).get();
//        curso.setProfessor(professor);
        return this.cursoRepository.save(curso);
    }
}
