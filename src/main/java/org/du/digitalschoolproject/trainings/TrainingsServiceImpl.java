package org.du.digitalschoolproject.trainings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingsServiceImpl implements TrainingsService{

    private TrainingsRepository trainingsRepository;

    @Autowired
    public TrainingsServiceImpl(TrainingsRepository trainingsRepository) {
        this.trainingsRepository = trainingsRepository;
    }

    @Override
    public List<TrainingEntity> findAll() {
        return trainingsRepository.findAll();
    }

    @Override
    public TrainingEntity findByTitle(String title) {
        return trainingsRepository.findByTitleIgnoreCase(title);
    }

    @Override
    public TrainingEntity save(TrainingEntity trainingEntity) {
        return trainingsRepository.save(trainingEntity);
    }
}
