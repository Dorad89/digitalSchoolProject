package org.du.digitalschoolproject.instructors;

import jakarta.persistence.*;
import org.du.digitalschoolproject.commons.BaseEntity;

@Entity
@Table(name = "instructors")
public class InstructorEntity extends BaseEntity {

    private long userId;
    private String title;
    private double salary;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
