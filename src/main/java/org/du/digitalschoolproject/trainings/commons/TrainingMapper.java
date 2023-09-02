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
}
