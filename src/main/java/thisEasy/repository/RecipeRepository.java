package thisEasy.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import thisEasy.entity.Ingredients;
import thisEasy.entity.Recipe;

@Repository
public interface RecipeRepository extends PagingAndSortingRepository<Recipe, Long> {

	public List<Recipe> findAllByIngredients(List<Ingredients> ingredients);

}
