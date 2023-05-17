package br.com.ifsp.cafeteria.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ifsp.cafeteria.model.Cafe;

public interface CafeRepository extends JpaRepository<Cafe, Long> {
/*
	List<Cafe> findAll();

	Optional<Cafe> findById(String id);

	boolean existsById(String id);

	void deleteById(String id);*/

}
