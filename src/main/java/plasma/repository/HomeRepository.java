package plasma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import plasma.model.Manga;

@Repository
public interface HomeRepository extends JpaRepository<Manga, Long> {
}