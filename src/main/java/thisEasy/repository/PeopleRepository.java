package thisEasy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import thisEasy.entity.People;
@Repository
public interface PeopleRepository extends JpaRepository<People,Long> {

}
