package thisEasy.abstracts;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import thisEasy.excpetions.Err;
import thisEasy.interfaces.Contract;

@Service
public abstract class Services<Variable extends  Contract> {

protected CrudRepository<Variable, Long> crudRepository;

	public Services(CrudRepository<Variable,Long> crudRepository) {
		this.crudRepository = crudRepository;
	}

	public Variable create(Variable variable) {
		return crudRepository.save(variable);
	}

	public Variable update(Variable variable) throws Err {
		if (!crudRepository.existsById(variable.getId()))
			throw new Err("Não existe");
		return crudRepository.save(variable);
	}

	public void delete(Long id) throws Err {
		if (!crudRepository.existsById(id)) {
			throw new Err("Não Existe");
		}
		crudRepository.deleteById(id);
	}

	public Iterable<Variable> readAll() {
		return crudRepository.findAll();
	}

	public Variable getById(Long id) {
		return crudRepository.findById(id).get();
	}
}
