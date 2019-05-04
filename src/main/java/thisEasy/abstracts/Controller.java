package thisEasy.abstracts;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import thisEasy.excpetions.Err;
import thisEasy.interfaces.Contract;


@RestController
public abstract class Controller< Variable extends Contract> {

protected Services<Variable> services;

	@Autowired
	public Controller(Services<Variable> services) {
		this.services = services;
	}

	@GetMapping("/")
	public Iterable<Variable> readAll() {
		return services.readAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Variable> getById(@PathVariable Long id) {
		Variable user = services.getById(id);
		return new ResponseEntity<Variable>(user, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<String> delete(@PathVariable Long id) throws Err {
		services.delete(id);
		return new ResponseEntity<String>("deleted successfully", HttpStatus.OK);
	}

	@PostMapping("/")
	public ResponseEntity<Variable> create(@Valid @RequestBody Variable variable) {
		services.create(variable);
		return new ResponseEntity<Variable>(variable, HttpStatus.CREATED);
	}

	@PutMapping("/")
	public ResponseEntity<Variable> update(@RequestBody Variable variable) throws Err {
		services.update(variable);
		return new ResponseEntity<Variable>(variable, HttpStatus.OK);
	}

}
