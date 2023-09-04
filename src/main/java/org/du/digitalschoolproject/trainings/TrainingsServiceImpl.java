package org.du.digitalschoolproject.trainings;

import org.du.digitalschoolproject.trainings.commons.TrainingMapper;
import org.du.digitalschoolproject.trainings.models.TrainingDto;
import org.du.digitalschoolproject.trainings.models.TrainingEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

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

        trainingEntity.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        trainingEntity.setCreatedBy(1L); //to be corrected

        return trainingsRepository.save(trainingEntity);
    }

    @Override
    public TrainingEntity update(TrainingEntity trainingEntity) {

        trainingEntity.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
        trainingEntity.setUpdatedBy(1L); //to be corrected
        return trainingsRepository.save(trainingEntity);
    }

    @Override
    public void deleteById(Long id) {

        Optional<TrainingEntity> trainingEntityOptional = trainingsRepository.findById(id);

        if (trainingEntityOptional.isPresent()) {

            //trainingsRepository.deleteById(id);
         TrainingEntity trainingEntity = trainingEntityOptional.get();

            trainingEntity.setDeletedAt(new Timestamp(System.currentTimeMillis()));
            trainingEntity.setDeletedBy(1L); //to be corrected

            trainingsRepository.save(trainingEntity);

        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                                              "Training with id " + id + " not found.");
        }
    }

    @Override
    public TrainingDto partialUpdate(TrainingDto trainingDto, long id) {

        Optional<TrainingEntity>trainingEntityOptional = trainingsRepository.findById(id);

        if (trainingEntityOptional.isPresent()){
            TrainingEntity trainingEntity = trainingEntityOptional.get();


            TrainingMapper.mapDtoToEntity(trainingDto,trainingEntity);
            trainingEntity.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
            trainingEntity.setUpdatedBy(1L); //to be corrected

            TrainingEntity patchedTraining = trainingsRepository.save(trainingEntity);
            return TrainingMapper.mapEntityToDto(patchedTraining);
        } else {

            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Training with id " + id + " not found.");
        }
    }
}
