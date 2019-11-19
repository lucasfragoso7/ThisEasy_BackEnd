package thisEasy.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import thisEasy.entity.Ingredients;

@Repository
public interface IngredientsRepository extends PagingAndSortingRepository<Ingredients, Long> {

}
