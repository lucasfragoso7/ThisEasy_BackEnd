package thisEasy.interfaces;

import java.util.List;

import java.util.Optional;

public interface ServiceContract<T> {
	public Optional<T> getById(Long id);

	public List<T> getAll();

	public T putById(Long id, T element);

	public T post(T element);

	public void deleteById(Long id);

}
