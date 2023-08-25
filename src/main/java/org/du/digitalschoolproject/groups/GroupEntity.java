package org.du.digitalschoolproject.groups;

import jakarta.persistence.*;
import org.du.digitalschoolproject.commons.BaseEntity;

@Entity
@Table(name = "groups")
public class GroupEntity extends BaseEntity {

    private long trainingId;

    public long getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(long trainingId) {
        this.trainingId = trainingId;
    }
}
