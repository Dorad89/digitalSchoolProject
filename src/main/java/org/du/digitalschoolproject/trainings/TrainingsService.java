package org.du.digitalschoolproject.trainings;

import java.util.List;

public interface TrainingsService {
    List<TrainingEntity> findAll();
    TrainingEntity findByTitle(String title);
    TrainingEntity save(TrainingEntity trainingEntity);

    TrainingEntity update(TrainingEntity trainingEntity);

    void deleteById(Long id);
}
