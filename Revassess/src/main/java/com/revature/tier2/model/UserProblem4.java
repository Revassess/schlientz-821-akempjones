package com.revature.tier2.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserProblem4 {

    @Id
    private String username;
    @Column(name = "name", insertable = false, updatable = false)
    private String setName;
    @Column(name = "name", insertable = false, updatable = false)
    private String categoryName;
    private String question;
    private String answer;


    public UserProblem4() {
    }

    public UserProblem4(String username, String setName, String categoryName, String question, String answer) {
        this.username = username;
        this.setName = setName;
        this.categoryName = categoryName;
        this.question = question;
        this.answer = answer;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSetName() {
        return this.setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getQuestion() {
        return this.question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return this.answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public UserProblem4 username(String username) {
        this.username = username;
        return this;
    }

    public UserProblem4 setName(String setName) {
        this.setName = setName;
        return this;
    }

    public UserProblem4 categoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    public UserProblem4 question(String question) {
        this.question = question;
        return this;
    }

    public UserProblem4 answer(String answer) {
        this.answer = answer;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UserProblem4)) {
            return false;
        }
        UserProblem4 userProblem4 = (UserProblem4) o;
        return Objects.equals(username, userProblem4.username) && Objects.equals(setName, userProblem4.setName) && Objects.equals(categoryName, userProblem4.categoryName) && Objects.equals(question, userProblem4.question) && Objects.equals(answer, userProblem4.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, setName, categoryName, question, answer);
    }

    @Override
    public String toString() {
        return "{" +
            " username='" + getUsername() + "'" +
            ", setName='" + getSetName() + "'" +
            ", categoryName='" + getCategoryName() + "'" +
            ", question='" + getQuestion() + "'" +
            ", answer='" + getAnswer() + "'" +
            "}";
    }

 
}