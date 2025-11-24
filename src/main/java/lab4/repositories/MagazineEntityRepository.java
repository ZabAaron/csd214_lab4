package lab4.repositories;

import lab4.entities.MagazineEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MagazineEntityRepository extends JpaRepository<MagazineEntity, Long> {
}