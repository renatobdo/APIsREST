package br.com.ifsp.cafeteria.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.ifsp.cafeteria.model.*;
public interface UsuarioRepository extends 
	JpaRepository<Usuarios, Long>{

	UserDetails findByLogin(String login);

}
