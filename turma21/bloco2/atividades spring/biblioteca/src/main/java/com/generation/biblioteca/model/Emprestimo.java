package com.generation.biblioteca.model;

import java.time.OffsetDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_emprestimo")
public class Emprestimo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private OffsetDateTime dataEmprestimo;
	
	private OffsetDateTime dataEntrega;
	
	@ManyToOne
	@JsonIgnoreProperties("emprestimo")
	private Leitor leitor;
	
	@ManyToOne
	@JsonIgnoreProperties("emprestimo")
	private Livro livro;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public OffsetDateTime getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(OffsetDateTime dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public OffsetDateTime getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(OffsetDateTime dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public Leitor getLeitor() {
		return leitor;
	}

	public void setLeitor(Leitor leitor) {
		this.leitor = leitor;
	}
	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
}
