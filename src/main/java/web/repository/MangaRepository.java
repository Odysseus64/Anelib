package web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.model.Manga;

@Repository
public interface MangaRepository extends JpaRepository<Manga, Long> {
}
