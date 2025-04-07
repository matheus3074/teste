package com.example.jpa_relacionamentos;

import com.example.jpa_relacionamentos.entidades.Curso;
import com.example.jpa_relacionamentos.entidades.DetalheProfessor;
import com.example.jpa_relacionamentos.entidades.Professor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JpaRelacionamentosApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaRelacionamentosApplication.class, args);

//        Professor professor = new Professor();
//
////        Curso curso1 = new Curso("ADM");
////        Curso curso2 = new Curso("DS");
////
////        List<Curso> cursos = new ArrayList<>();
////        cursos.add(curso1);
////        cursos.add(curso2);
////
////        		professor.setId(1);
////        		professor.setNome("Jefté");
////        		professor.setIdade(33);
////        		professor.setDetalheProfessor(new DetalheProfessor("Academia", "linkedin/com/?in=adsjhasd"));
////                professor.setCursos(cursos);

    }

}
