package lab4.repositories;

import lab4.entities.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketEntityRepository extends JpaRepository<TicketEntity, Long> {
}