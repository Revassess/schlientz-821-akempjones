package com.revature.tier2.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserStudySet {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "role_id")
    private int roleId;
    @Column(name="study_set_id")
    private int studySetId;
    private String name;


    public UserStudySet() {
    }

    public UserStudySet(final String username, final String password, final String firstName, final String lastName, final int roleId, final int study_set_id, final String name) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.roleId = roleId;
        this.studySetId = study_set_id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public int getRoleId() {
        return this.roleId;
    }

    public void setRoleId(final int roleId) {
        this.roleId = roleId;
    }

    public int getStudySetId() {
        return this.studySetId;
    }

    public void setStudySetId(final int study_set_id) {
        this.studySetId = study_set_id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UserStudySet)) {
            return false;
        }
        final UserStudySet userStudySet = (UserStudySet) o;
        return id == userStudySet.id && Objects.equals(username, userStudySet.username) && Objects.equals(password, userStudySet.password) && Objects.equals(firstName, userStudySet.firstName) && Objects.equals(lastName, userStudySet.lastName) && roleId == userStudySet.roleId && studySetId == userStudySet.studySetId && Objects.equals(name, userStudySet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, firstName, lastName, roleId, studySetId, name);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", username='" + getUsername() + "'" +
            ", password='" + getPassword() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", roleId='" + getRoleId() + "'" +
            ", study_set_id='" + getStudySetId() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }
   

    
}