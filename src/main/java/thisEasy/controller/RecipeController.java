package thisEasy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import thisEasy.abstracts.Controller;
import thisEasy.abstracts.Services;
import thisEasy.entity.Recipe;

@RestController
@RequestMapping("/Recipe")
public class RecipeController extends Controller<Recipe> {

	public RecipeController(Services<Recipe> services) {
		super(services);
		}


}
