package org.du.digitalschoolproject.subjects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.du.digitalschoolproject.commons.BaseEntity;

@Entity
public class SubjectEntity extends BaseEntity {


    private long trainingId;
    private String title;
    private String description;

    public long getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(long trainingId) {
        this.trainingId = trainingId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
