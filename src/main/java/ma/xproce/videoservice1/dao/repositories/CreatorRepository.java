package ma.xproce.videoservice1.dao.repositories;

import ma.xproce.videoservice1.dao.entities.Creator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CreatorRepository extends JpaRepository<Creator, Long> {
    Optional<Creator> findByEmail(String email);
}
