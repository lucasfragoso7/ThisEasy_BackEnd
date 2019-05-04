package thisEasy.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import thisEasy.abstracts.Controller;
import thisEasy.entity.Ingredients;
import thisEasy.service.IngredientsService;

@RestController
@RequestMapping("/Ingredients")
public class IngredientsController extends Controller<Ingredients> {

	private static IngredientsService services;

	public IngredientsController() {
		super(services);
	}
	
	

	@GetMapping
	public ResponseEntity<List<Ingredients>> buscaPacientePorParam(Ingredients ingredients) {
		return new ResponseEntity<List<Ingredients>>(super.services.seachForName(ingredients), HttpStatus.OK);
	}

}