package plasma.service.meta;

import plasma.model.Manga;

import java.util.List;

public interface MangaMeta {
    List<Manga> findAll();
    Manga save(Manga manga);
    Manga findById(Long id);
    void deleteById(Long id);
    void update(Long id, Manga manga);
}
