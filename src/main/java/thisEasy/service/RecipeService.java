package thisEasy.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import thisEasy.abstracts.Services;
import thisEasy.entity.Ingredients;
import thisEasy.entity.Recipe;
import thisEasy.repository.RecipeRepository;

@Service
public class RecipeService extends Services<Recipe, RecipeRepository> {

	public List<Recipe> getRecipesForIngredients(@Valid List<Ingredients> ingredients) {
		return super.rep.findAllByIngredients(ingredients);
	}
}
