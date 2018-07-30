package com.cris.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cris.login.bean.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public Usuario findByUsername(String username);

}
