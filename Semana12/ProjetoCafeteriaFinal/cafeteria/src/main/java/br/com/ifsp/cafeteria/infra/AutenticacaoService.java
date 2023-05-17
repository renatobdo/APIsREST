package br.com.ifsp.cafeteria.infra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import br.com.ifsp.cafeteria.repository.*;
@Service
public class AutenticacaoService implements UserDetailsService{
	@Autowired
	private UsuarioRepository repository;
	
	public UserDetails loadUserByUsername(String username) {
		return repository.findByLogin(username);
	}
}
