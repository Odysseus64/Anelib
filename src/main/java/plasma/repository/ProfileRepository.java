package plasma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import plasma.model.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
