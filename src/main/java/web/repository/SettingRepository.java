package web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.model.Settings;

@Repository
public interface SettingRepository extends JpaRepository<Settings, Long> {

}
