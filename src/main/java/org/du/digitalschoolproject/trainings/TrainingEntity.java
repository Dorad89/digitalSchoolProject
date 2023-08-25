package org.du.digitalschoolproject.trainings;

import jakarta.persistence.*;
import org.du.digitalschoolproject.commons.BaseEntity;

@Entity
@Table(name = "trainings")
public class TrainingEntity extends BaseEntity {

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
