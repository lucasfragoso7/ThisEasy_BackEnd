package thisEasy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import thisEasy.entity.Recipe;
@Repository
public interface RecipeRepository extends JpaRepository<Recipe,Long> {

}