package ma.xproce.videoservice1;

import ma.xproce.videoservice1.dao.entities.Creator;
import ma.xproce.videoservice1.dao.entities.Video;
import ma.xproce.videoservice1.dao.repositories.CreatorRepository;
import ma.xproce.videoservice1.dao.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class VideoService1Application {

    public static void main(String[] args) {
        SpringApplication.run(VideoService1Application.class, args);
    }
    @Bean
    CommandLineRunner start(CreatorRepository creatorRepository, VideoRepository videoRepository) {
        return args -> {
            // Create and save creators
            List<Creator> creatorList = List.of(
                    Creator.builder().name("x").email("x@gmail.com").build(),
                    Creator.builder().name("y").email("y@gmail.com").build(),
                    Creator.builder().name("z").email("z@gmail.com").build(),
                    Creator.builder().name("r").email("r@gmail.com").build()
            );
            creatorRepository.saveAll(creatorList);

            // Create and save videos, linking them to the creators
            List<Video> videoList = List.of(
                    Video.builder()
                            .name("vEducation")
                            .url("vEducation.com")
                            .description("fghjk")
                            .datePublication("25/01/2000")
                            .creator(creatorList.get(0)) // Assigning creator
                            .build(),
                    Video.builder()
                            .name("vGaming")
                            .url("vEGaming.com")
                            .description("azertyu")
                            .datePublication("25/01/2000")
                            .creator(creatorList.get(1)) // Assigning creator
                            .build(),
                    Video.builder()
                            .name("vEntertainment")
                            .url("vEntertainment.com")
                            .description("hhhh")
                            .datePublication("25/01/2000")
                            .creator(creatorList.get(2)) // Assigning creator
                            .build()
            );
            videoRepository.saveAll(videoList);
        };
    }
}