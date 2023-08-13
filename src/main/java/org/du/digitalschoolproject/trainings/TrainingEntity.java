package org.du.digitalschoolproject.trainings;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TrainingEntity {

    @Id
    private long Id;
    private String title;
    private String icon;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

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
