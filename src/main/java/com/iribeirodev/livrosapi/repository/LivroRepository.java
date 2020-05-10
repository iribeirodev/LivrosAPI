package com.iribeirodev.livrosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.iribeirodevmodel.livrosapi.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{}
