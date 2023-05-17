package br.com.ifsp.cafeteria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifsp.cafeteria.infra.DadosTokenJWT;
import br.com.ifsp.cafeteria.infra.TokenService;
import br.com.ifsp.cafeteria.model.DadosAutenticacao;
import br.com.ifsp.cafeteria.model.Usuarios;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/login")
public class AutenticacaoController {
	@Autowired 
	private AuthenticationManager manager;
	
	@Autowired
	private TokenService tokenService;
	
	@PostMapping
	public ResponseEntity<Object> efetuarLogin
		(@RequestBody @Valid DadosAutenticacao dados) {
		var authenticationToken = new 
				UsernamePasswordAuthenticationToken(dados.login(), 
						dados.senha());
		var authentication = manager.authenticate(authenticationToken);
		var tokenJWT = tokenService.
				gerarToken((Usuarios) authentication.getPrincipal());
		return ResponseEntity.ok(new DadosTokenJWT(tokenJWT));
	}
}
