package th.ac.ku.MicrochipsStarApp.API.service.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.MicrochipsStarApp.API.service.model.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message,Long> {
}

