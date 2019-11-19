package thisEasy.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import thisEasy.abstracts.Controller;
import thisEasy.entity.Ingredients;
import thisEasy.entity.Recipe;
import thisEasy.service.RecipeService;

@RestController
@RequestMapping("/recipe")
public class RecipeController extends Controller<Recipe, RecipeService> {


	@PostMapping("/ingredients")
	public ResponseEntity<List<Recipe>> create(@Valid @RequestBody List<Ingredients> ingredients) {
		List<Recipe> recipes = super.service.getRecipesForIngredients(ingredients);
		return new ResponseEntity<List<Recipe>>(recipes, HttpStatus.OK);
	}


}
