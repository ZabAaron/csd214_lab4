package lab4.repositories;

import lab4.entities.BookEntity;
import lab4.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookEntityRepository extends JpaRepository<BookEntity, Long> {
    List<BookEntity> findByAuthor(String author);
}
