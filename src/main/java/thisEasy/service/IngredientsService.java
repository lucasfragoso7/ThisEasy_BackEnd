package thisEasy.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import thisEasy.abstracts.Services;
import thisEasy.entity.Ingredients;
import thisEasy.repository.IngredientsRepository;

@Service
public class IngredientsService extends Services <Ingredients>{
	
	private static IngredientsRepository repository;
	public IngredientsService( ) {
		super( repository);
		}
	public List<Ingredients> seachForName(Ingredients ingredients){
		ExampleMatcher matcher = ExampleMatcher.matchingAll()
				.withMatcher("name", match -> match.contains())
				.withIgnoreCase()
				.withIgnoreNullValues();
		return repository.findAll();
	
	}
	
}

