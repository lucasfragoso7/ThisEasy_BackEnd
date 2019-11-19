package thisEasy.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import thisEasy.entity.Ambry;

@Repository
public interface AmbryRepository extends PagingAndSortingRepository<Ambry, Long> {

}
