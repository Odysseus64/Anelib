package web.service.meta;

import web.model.Profile;

import java.util.List;

public interface ProfileMeta {
    List<Profile> findAll();
    Profile save(Profile profile);
    Profile findById(Long id);
    void deleteById(Long id);
    void update(Long id, Profile profile);
}
