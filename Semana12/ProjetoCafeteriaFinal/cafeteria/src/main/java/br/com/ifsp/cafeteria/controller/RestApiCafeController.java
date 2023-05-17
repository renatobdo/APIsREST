package br.com.ifsp.cafeteria.controller;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifsp.cafeteria.infra.CafeNotFoundException;
import br.com.ifsp.cafeteria.model.Cafe;
import br.com.ifsp.cafeteria.repository.CafeRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/cafes")
public class RestApiCafeController {
	// private List<Cafe> cafes = new ArrayList<>();
	@Autowired
	private CafeRepository cafeRepository;

	/*
	 * public RestApiCafeController() { cafes.addAll(List.of(new
	 * Cafe("Café Arábica"), new Cafe("Café Bourbon"), new Cafe("Café Acaiá"), new
	 * Cafe("Café Atuaí"), new Cafe("Café Robusta"), new Cafe("Café Geisha"), new
	 * Cafe("Café Kona") )); }
	 */
	// https://platform.openai.com/docs/guides/images/introduction?lang=curl
	// https://platform.openai.com/account/api-keys
	// https://iphotochannel.com.br/os-5-melhores-geradores-de-imagens-com-inteligencia-artificial-ia-em-2022/
	// https://drive.google.com/drive/folders/1QE31cY3Dz95nw3Vvu1cBlX7IGsYOY6ch?usp=share_link
	// https://docs.google.com/spreadsheets/d/1HnSgIJyqTI_nIJgPWmNfMYIbaegtInpggosH4BK_uB0/edit?usp=sharing
	public RestApiCafeController(CafeRepository cafeRepository) {
		this.cafeRepository = cafeRepository;
		/*
		 * this.cafeRepository.saveAll(List.of(new Cafe("Café Arábica"), new
		 * Cafe("Café Bourbon"), new Cafe("Café Acaiá"), new Cafe("Café Atuaí"), new
		 * Cafe("Café 	Robusta"), new Cafe("Café Geisha"), new Cafe("Café Kona")));
		 */
	}

	
   /* @GetMapping Iterable<Cafe> getCafes() { 
    	return cafeRepository.findAll();
    	}
	 */
	@GetMapping
	public ResponseEntity<Iterable<Cafe>> getCafes() {
		var cafes = cafeRepository.findAll();
		return ResponseEntity.ok(cafes);
	}

	/*
	 * @GetMapping("/{id}") Optional<Cafe> getCafeById(@PathVariable String id) {
	 * return cafeRepository.findById(id); }
	 */
	@GetMapping("/{id}")
	public ResponseEntity<Object> getCafeById(@PathVariable Long id) throws CafeNotFoundException {
		Optional<Cafe> cafe = cafeRepository.findById(id);
	    if (cafe.isPresent()) {
	        return ResponseEntity.ok(cafe.get());
	    } else {
	       // ErrorResponse errorResponse = 
	       // 		new ErrorResponse(404, "id não existe");
	       // return ResponseEntity.
	       // 		status(HttpStatus.NOT_FOUND).
	       // 			body(errorResponse);
	    	throw new CafeNotFoundException("café não encontrado!");
	    }
	}

	@PostMapping("/cafe")
	@Transactional
	public ResponseEntity<Cafe> postCafe(@Valid @RequestBody Cafe cafe) {
		 Cafe newCafe = cafeRepository.save(cafe);
		    return ResponseEntity
		            .created(URI.create("/cafe/" + newCafe.getId()))
		            .body(newCafe);
	}
	

	@PutMapping("/cafe/{id}")
	public ResponseEntity<Cafe> putCafe(@PathVariable Long id, 
			@RequestBody Cafe cafe) throws CafeNotFoundException {

		 Optional<Cafe> cafeOpt = cafeRepository.findById(id);
	        if (cafeOpt.isPresent()) {
	            cafe.setId(id);
	            cafe = cafeRepository.save(cafe);
	            return ResponseEntity.ok(cafe);
	        } else {
	        	throw new CafeNotFoundException("Café não encontrado com o ID " + id);
	        }
	}

	// @DeleteMapping("/{id}")
	// public ResponseEntity
	// void deleteCafe(@PathVariable String id) {
	// cafeRepository.deleteById(id);
	// return ResponseEntity.noContent().build();

	// }

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCafe(@PathVariable Long id) throws CafeNotFoundException {
		Optional<Cafe> cafe = cafeRepository.findById(id);
		if (cafe.isPresent()) {
			cafeRepository.deleteById(id);
			return ResponseEntity.ok("Eliminado");
		} else {
			throw new CafeNotFoundException("Café não encontrado com o ID " + id);
		}
	}

	/*
	 * @DeleteMapping("/{id}") ResponseEntity<String> deleteCafe(@PathVariable
	 * String id) { boolean del = false; del = cafes.removeIf(c ->
	 * c.getId().equals(id)); ResponseEntity<String> delOk = new
	 * ResponseEntity<String> ("Eliminado", HttpStatus.OK); return (del) ? new
	 * ResponseEntity<> ("Eliminado", HttpStatus.OK) : new
	 * ResponseEntity<>("Não localizado!", HttpStatus.NOT_FOUND); }
	 */

}