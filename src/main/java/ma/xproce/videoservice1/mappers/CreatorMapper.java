package ma.xproce.videoservice1.mappers;

import ma.xproce.videoservice1.dao.entities.Creator;
import ma.xproce.videoservice1.dtos.CreatorRequest;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CreatorMapper {
    private final ModelMapper modelMapper;

    public CreatorMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Creator fromCreatorRequestToCreator(CreatorRequest creatorRequest) {
        if (creatorRequest == null) {
            return null;
        }
        return Creator.builder()
                .name(creatorRequest.getName())
                .email(creatorRequest.getEmail())
                .build();
    }

    public CreatorRequest fromCreatorToCreatorRequest(Creator creator) {
        return modelMapper.map(creator, CreatorRequest.class);
    }
}
