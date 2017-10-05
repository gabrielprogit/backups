package br.unicesumar.exemplorest.cor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unicesumar.exemplorest.util.ConnectionFactory;

@RestController
@RequestMapping("/cores")
public class CorController {
	private CorRepository repo;
	
	
	public CorController() {
		try {
			this.repo = new CorRepository(ConnectionFactory.openConnection());			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Void> atualizr(@PathVariable("id") String id, @RequestBody Cor cor) {
		if (!id.equals(cor.getId())) {
			return ResponseEntity.badRequest().build();
		}
		boolean atualizou = repo.update(cor);
		if (atualizou) {
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}
	

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> removerPeloId(@PathVariable("id") String id) {
		/* Exemplo do pattern builder, usado para construir o ResponseEntity.
		Bolo b = BoloBuilder
				.cobertura("chocolate")
				.pontoDaMassa("fofa")
				.recheio("avelã")
				.cobertura("damascos")
				.recheio("creme brullê")
				.build();
		*/
		boolean excluiu = repo.remove(id);
		if (excluiu) {
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}

	
	@GetMapping("/{id}")
	public ResponseEntity<Cor> obterPeloId(@PathVariable("id") String id) {
		Cor recuperada = repo.findById(id);
		if (recuperada == null) {
			return ResponseEntity.notFound().build();
		} 
		return ResponseEntity.ok(recuperada);
	}
	
	@GetMapping
	public ResponseEntity<List<Cor>> obterTodas() {
		return ResponseEntity.ok(repo.findAll());
	}
	
	
	@PostMapping
	public ResponseEntity<String> inserirCor(@RequestBody Cor c) {
		try {
			repo.save(c);
			return ResponseEntity.ok(c.getId());
		} catch (Exception e) {
			return ResponseEntity.status(500).build();
		}
	}
	

}
