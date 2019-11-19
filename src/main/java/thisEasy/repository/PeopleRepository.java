package thisEasy.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import thisEasy.entity.People;

@Repository
public interface PeopleRepository extends PagingAndSortingRepository<People, Long> {

}
