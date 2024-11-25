package ma.xproce.videoservice1.service;

import ma.xproce.videoservice1.dao.entities.Video;
import ma.xproce.videoservice1.dtos.VideoRequest;
import ma.xproce.videoservice1.mappers.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoService {

    private final VideoMapper videoMapper;

    @Autowired
    public VideoService(VideoMapper videoMapper) {
        this.videoMapper = videoMapper;
    }

    public Video saveVideo(VideoRequest videoRequest) {
        Video video = videoMapper.fromVideoRequestToVideo(videoRequest);
        // Save video logic here
        return video;
    }
}