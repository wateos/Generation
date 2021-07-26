package com.generation.biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.biblioteca.model.Leitor;

public interface LeitorRepository extends JpaRepository<Leitor, Long> {
	public List<Leitor> findAllByNomeContainingIgnoreCase ( String nome );
}
