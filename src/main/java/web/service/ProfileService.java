package web.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import web.model.Profile;
import web.repository.ProfileRepository;
import web.service.meta.ProfileMeta;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProfileService implements ProfileMeta {
    private final ProfileRepository service;

    @Override
    public List<Profile> findAll() {
        return service.findAll();
    }

    @Override
    public Profile save(Profile profile) {
        return service.save(profile);
    }

    @Override
    public Profile findById(Long id) {
        return service.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        service.deleteById(id);
    }

    @Override
    public void update(Long id, Profile profile) {
        Profile state = service.findById(id).orElse(null);
        assert state != null;
        state.setUser_name(profile.getUser_name());
        state.setDescription(profile.getDescription());
        service.save(state);
    }
}
