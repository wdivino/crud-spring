package com.example.demo.service;

import com.example.demo.entity.Aluno;
import com.example.demo.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public Aluno cadastrarAluno(Aluno novoAluno) {
        Aluno alunoCadastrado = alunoRepository.save(novoAluno);
        return alunoCadastrado;
    }

    public Aluno consultarAlunoPorId(Long id) {
        Optional<Aluno> aluno = alunoRepository.findById(id);
        return aluno.get();
    }

}
