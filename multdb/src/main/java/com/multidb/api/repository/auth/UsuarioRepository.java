package com.multidb.api.repository.auth;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.multidb.api.model.auth.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
