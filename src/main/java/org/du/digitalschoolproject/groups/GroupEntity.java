package org.du.digitalschoolproject.groups;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class GroupEntity {

    @Id
    private long id;
    private long trainingId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(long trainingId) {
        this.trainingId = trainingId;
    }
}
