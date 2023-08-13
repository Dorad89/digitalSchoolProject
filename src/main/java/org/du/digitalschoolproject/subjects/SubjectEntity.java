package org.du.digitalschoolproject.subjects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SubjectEntity {

    @Id
    private long Id;
    private long trainingId;
    private String title;
    private String description;
}
