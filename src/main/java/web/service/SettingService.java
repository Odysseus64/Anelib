package web.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import web.model.Settings;
import web.repository.SettingRepository;
import web.service.meta.SettingsMeta;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SettingService implements SettingsMeta {
    private final SettingRepository service;
    @Override
    public List<Settings> findAll() {
        return service.findAll();
    }

    @Override
    public Settings save(Settings setting) {
        return service.save(setting);
    }

    @Override
    public Settings findById(Long id) {
        return service.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        service.deleteById(id);
    }

    @Override
    public void update(Long id, Settings setting) {
        Settings state = service.findById(id).orElse(null);
        assert state != null;
        state.setName(setting.getName());
        state.setEmail(setting.getEmail());
        state.setPassword(setting.getPassword());
        service.save(state);
    }
}
