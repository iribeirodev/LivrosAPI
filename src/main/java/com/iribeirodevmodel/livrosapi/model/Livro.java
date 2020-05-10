package com.iribeirodevmodel.livrosapi.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entidade JPA - Livro
 * @author iribeirodev
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Livro")
public class Livro implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private Long id;
	
	@Column(name="ISBN")
	private String isbn;
	
	@Column(name="Titulo")
	private String titulo;
	
	@Column(name="AnoOriginal")
	private int anooriginal;

}
