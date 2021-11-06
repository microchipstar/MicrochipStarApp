package th.ac.ku.MicrochipsStarApp.API.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.MicrochipsStarApp.API.service.model.Product;
import th.ac.ku.MicrochipsStarApp.API.service.model.employee;

import java.util.UUID;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
