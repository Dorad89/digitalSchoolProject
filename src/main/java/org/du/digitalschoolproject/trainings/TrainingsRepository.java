package org.du.digitalschoolproject.trainings;

import org.du.digitalschoolproject.trainings.models.TrainingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingsRepository extends JpaRepository<TrainingEntity, Long> {
    TrainingEntity findByTitleIgnoreCase(String title);
}
