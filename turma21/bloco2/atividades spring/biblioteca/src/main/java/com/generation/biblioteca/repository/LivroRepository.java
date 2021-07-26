package com.generation.biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.biblioteca.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {
	public List<Livro> findAllByTituloContainingIgnoreCase ( String titulo );

}
