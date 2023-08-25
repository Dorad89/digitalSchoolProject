package org.du.digitalschoolproject.roles;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.du.digitalschoolproject.commons.BaseEntity;

@Entity
public class RoleEntity extends BaseEntity {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
