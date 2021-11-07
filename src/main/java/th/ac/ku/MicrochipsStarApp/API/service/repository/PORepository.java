package th.ac.ku.MicrochipsStarApp.API.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.MicrochipsStarApp.API.service.model.PO;

import java.util.UUID;

@Repository
public interface PORepository extends JpaRepository<PO, Integer> {
}
