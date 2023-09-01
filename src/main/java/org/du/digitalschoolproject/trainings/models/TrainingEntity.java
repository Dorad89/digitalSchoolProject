package org.du.digitalschoolproject.trainings.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.du.digitalschoolproject.commons.BaseEntity;

@Entity
@Table(name = "trainings")
public class TrainingEntity extends BaseEntity {
    @NotBlank(message = "Title must be provided!")
    @Size(min = 2, max = 60)
    private String title;
    private String icon;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
