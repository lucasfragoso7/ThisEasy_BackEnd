package thisEasy.service;

import org.springframework.stereotype.Service;

import thisEasy.abstracts.Services;
import thisEasy.entity.Recipe;
import thisEasy.repository.RecipeRepository;

@Service
public class RecipeService extends Services <Recipe>{

	public RecipeService(RecipeRepository repository) {
		super( repository);

}
}
