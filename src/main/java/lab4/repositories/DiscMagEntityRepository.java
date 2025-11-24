package lab4.repositories;

import lab4.entities.DiscMagEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscMagEntityRepository extends JpaRepository<DiscMagEntity, Long> {
}