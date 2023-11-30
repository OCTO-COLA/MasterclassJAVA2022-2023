package masterclass.java.cola.persistence.repositories;

import masterclass.java.cola.persistence.Plat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatRepository extends CrudRepository <Plat, Long>{
}