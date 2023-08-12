package org.du.digitalschoolproject.students;

import jakarta.persistence.Entity;

@Entity
public class StudentEntity {

    private long id;
    private String firstName;
    private String lastName;
    private byte profilePicture;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(byte profilePicture) {
        this.profilePicture = profilePicture;
    }
}
