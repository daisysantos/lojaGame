package com.generation.lojagames.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

@Entity 
	@Table(name = "tb_produto") 
	public class Produto {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotBlank(message = "O nome título é Obrigatório")
		@Size(max = 100, message = "O atributo nome deve ter no minimo 05 e no máximo 100 caracteres")
		private String nome;
		
		@NotBlank(message = "O Atributo descrição é Obrigatório")
		@Size(max = 1000, message = "O atributo descrição deve ter no minimo 10 e no máximo 1000 caracteres")
		private String descricao;
		
		@NotBlank(message = "O atributo console é obrigatório!")
		private String console;
		
		/*@NotNull
		@Digits(integer = 5, fraction =2)
		private BigDecimal preco;*/
		
		@PositiveOrZero
		private int quantidade;
		
		/*@UpdateTimestamp
		private LocalDateTime data;*/
		
		@ManyToOne
		@JsonIgnoreProperties("produto")
		private Categoria categoria;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public String getConsole() {
			return console;
		}

		public void setConsole(String console) {
			this.console = console;
		}

		/*public BigDecimal getPreco() {
			return preco;
		}

		public void setPreco(BigDecimal preco) {
			this.preco = preco;
		}*/

		public int getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}

		/*public LocalDateTime getData() {
			return data;
		}

		public void setData(LocalDateTime data) {
			this.data = data;
		}*/
		
		// Get e Set da categoria
		
		public Categoria getCategoria() {
			return categoria;
		}

		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}
		
		
		
	}
	