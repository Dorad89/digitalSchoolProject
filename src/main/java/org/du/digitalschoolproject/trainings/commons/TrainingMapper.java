package org.du.digitalschoolproject.trainings.commons;

import org.du.digitalschoolproject.trainings.models.TrainingDto;
import org.du.digitalschoolproject.trainings.models.TrainingEntity;

public class TrainingMapper {

    public static void mapDtoToEntity(TrainingDto trainingDto, TrainingEntity trainingEntity){

        if(trainingDto.getId() != null){
            trainingEntity.setId(trainingDto.getId());
        }

        if(trainingDto.getTitle() != null){
        trainingEntity.setTitle(trainingDto.getTitle());
        }

        if(trainingDto.getIcon() != null){
            trainingEntity.setIcon(trainingDto.getIcon());
        }
    }

    public static TrainingDto mapEntityToDto(TrainingEntity trainingEntity) {

        TrainingDto trainingDto = new TrainingDto();

        trainingDto.setId(trainingEntity.getId());
        trainingDto.setTitle(trainingEntity.getTitle());
        trainingDto.setIcon(trainingEntity.getIcon());
        trainingDto.setCreatedAt(trainingEntity.getCreatedAt());
        trainingDto.setCreatedBy(trainingEntity.getCreatedBy());
        trainingDto.setUpdatedAt(trainingEntity.getUpdatedAt());
        trainingDto.setUpdatedBy(trainingEntity.getUpdatedBy());
        trainingDto.setDeletedAt(trainingEntity.getDeletedAt());
        trainingDto.setDeletedBy(trainingEntity.getDeletedBy());

        return trainingDto;
    }
}
