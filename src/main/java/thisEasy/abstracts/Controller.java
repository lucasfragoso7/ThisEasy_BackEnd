package thisEasy.abstracts;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import thisEasy.interfaces.ServiceContract;

@RestController
public abstract class Controller<T, S extends ServiceContract<T> > {

	@Autowired
	protected S service;

	@GetMapping("{id}")
	public ResponseEntity<Optional<T>> getById(@PathVariable Long id) {
		return ResponseEntity.ok(service.getById(id));
	}

	@GetMapping
	public ResponseEntity<List<T>> getAll() {
		return ResponseEntity.ok(service.getAll());
	}

	@PutMapping("{id}")
	public ResponseEntity<T> putById(@PathVariable Long id, @RequestBody T element) {
		return ResponseEntity.ok(service.putById(id, element));
	}

	@PostMapping
	public ResponseEntity<T> post(@RequestBody T element) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.post(element));
	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteById(@PathVariable Long id) {
		return ResponseEntity.ok("");
	}

}