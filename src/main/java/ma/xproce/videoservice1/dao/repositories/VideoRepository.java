package ma.xproce.videoservice1.dao.repositories;

import ma.xproce.videoservice1.dao.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {


}
