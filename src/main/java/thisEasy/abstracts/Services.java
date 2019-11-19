package thisEasy.abstracts;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import thisEasy.interfaces.EntityContract;
import thisEasy.interfaces.ServiceContract;

@Service
public abstract class Services<T extends EntityContract,R extends PagingAndSortingRepository<T, Long>> implements ServiceContract<T>{
	
	@Autowired
	protected R rep;

	public Optional<T> getById(Long id) {
		return rep.findById(id);
	}

	public List<T> getAll() {
		List<T> lista = new ArrayList<T>();
		rep.findAll().forEach(lista::add);
		return lista;
	}

	public T putById(Long id, T element) {
		element.setId(id);
		return rep.save(element);
	}

	public T post(T element) {
		return rep.save(element);
	}

	public void deleteById(Long id) {
		rep.deleteById(id);
	}
	
	
}
