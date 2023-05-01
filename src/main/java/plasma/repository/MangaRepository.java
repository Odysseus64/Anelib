package plasma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import plasma.model.Manga;

import java.util.List;

@Repository
public interface MangaRepository extends JpaRepository<Manga, Long> {
}
