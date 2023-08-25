package org.du.digitalschoolproject.students;

import jakarta.persistence.*;
import org.du.digitalschoolproject.commons.BaseEntity;

@Entity
@Table(name = "students")
public class StudentEntity extends BaseEntity {

    private long userId;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
