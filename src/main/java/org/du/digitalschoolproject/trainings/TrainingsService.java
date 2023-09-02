package org.du.digitalschoolproject.trainings;

import org.du.digitalschoolproject.trainings.models.TrainingDto;
import org.du.digitalschoolproject.trainings.models.TrainingEntity;

import java.util.List;

public interface TrainingsService {
    List<TrainingEntity> findAll();
    TrainingEntity findByTitle(String title);
    TrainingEntity save(TrainingEntity trainingEntity);

    TrainingEntity update(TrainingEntity trainingEntity);

    void deleteById(Long id);

    TrainingDto partialUpdate(TrainingDto trainingDto, long id);
}
