package br.unicesumar.exemplorest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/livros")
public class LivroController {
	private List<Livro> livros = new ArrayList<>();
	
	public LivroController() {
		livros.add(new Livro("Big Java"));
		livros.add(new Livro("Conceitos de computaçáo com Java"));		
	}
	
	@GetMapping
	public ResponseEntity<List<Livro>> obterTodos(
			@RequestParam(name="titulo", required=false) String titulo) {
		if (titulo == null) {
			return ResponseEntity.ok(livros);
		} else {
			return ResponseEntity.ok(
					livros
					.stream()
					.filter(livro -> livro.getTitulo().equals(titulo))
					.collect(Collectors.toList()));
		}
	}
	
	/*
	@GetMapping("/{idDoLivro}")
	public Livro obterLivroPeloId(@PathVariable("idDoLivro") String id) {
		for (Livro l : livros) {
			if (l.getId().equals(id)) {
				return l;
			}
		}
		return null;
	}
	*/	
	@GetMapping("/{idDoLivro}")
	public ResponseEntity<Livro> obterLivroPeloId(@PathVariable("idDoLivro") String id) {
		for (Livro l : livros) {
			if (l.getId().equals(id)) {
				return ResponseEntity.ok(l);
			}
		}
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{idDoLivro}")
	public ResponseEntity excluirLivroPeloId(@PathVariable("idDoLivro") String id) {
		Optional<Livro> recuperado = this.livros.stream().filter(livro -> livro.getId().equals(id)).findFirst();
		if (recuperado.isPresent()) {
			this.livros.remove(recuperado.get());		
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}
	

	@PostMapping
	public ResponseEntity<String> criarNovo(@RequestBody Livro novo) {
		this.livros.add(novo);
		return ResponseEntity.ok(novo.getId());
	}

	@PutMapping("/{idDoLivro}")
	public ResponseEntity<String> alterar(
			@PathVariable("idDoLivro") String id, 
			@RequestBody Livro novo) {
		Optional<Livro> recuperado = this.livros.stream().filter(livro -> livro.getId().equals(id)).findFirst();
		if (recuperado.isPresent()) {
			this.livros.remove(recuperado.get());		
		} else {
			return ResponseEntity.notFound().build();
		}
		this.livros.add(novo);
		return ResponseEntity.ok(novo.getId());
	}
}











