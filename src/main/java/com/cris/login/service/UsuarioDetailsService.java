package com.cris.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cris.login.repository.UsuarioRepository;

@Service
public class UsuarioDetailsService implements UserDetailsService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDetails userDetails = usuarioRepository.findByUsername(username);
		if(null==userDetails) {
			throw new UsernameNotFoundException("Usuário "+username+"não encontrado"); 
		}
		return userDetails;
	}

}
