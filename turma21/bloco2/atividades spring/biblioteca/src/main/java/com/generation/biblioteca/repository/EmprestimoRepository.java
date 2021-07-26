package com.generation.biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.biblioteca.model.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long>{
	
}

