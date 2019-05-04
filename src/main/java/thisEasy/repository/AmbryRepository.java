package thisEasy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import thisEasy.entity.Ambry;

@Repository
public interface AmbryRepository extends JpaRepository<Ambry,Long> {
	
	
}
