package com.multidb.api.repository.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.multidb.api.model.app.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

}
