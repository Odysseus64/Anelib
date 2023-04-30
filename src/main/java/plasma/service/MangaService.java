package plasma.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import plasma.model.Manga;
import plasma.repository.HomeRepository;
import plasma.service.meta.MangaMeta;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MangaService implements MangaMeta {
    private final HomeRepository service;

    @Override
    public List<Manga> findAll() {
        return service.findAll();
    }

    @Override
    public Manga save(Manga manga) {
        return service.save(manga);
    }

    @Override
    public Manga findById(Long id) {
        return service.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        service.deleteById(id);
    }

    @Override
    public void update(Long id, Manga manga) {
        Manga upd = service.findById(id).orElse(null);
        assert upd != null;
        upd.setName(manga.getName());
        upd.setAlter_name(manga.getAlter_name());
        upd.setDescription(manga.getDescription());
        upd.setGenre(manga.getGenre());
        upd.setAuthor(manga.getAuthor());
        upd.setStatus(manga.getStatus());
        upd.setType(manga.getType());
        service.save(upd);
    }
}
