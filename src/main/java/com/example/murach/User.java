package com.example.murach;
import java.io.Serializable;

public class User implements Serializable{
    private String firstName;
    private String lastName;
    private String email;
    private String hearFrom;
    private String checkYes;
    private String contactBy;
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public User()
    {
        firstName = "";
        lastName = "";
        email = "";
        hearFrom ="";
        checkYes = "";
        contactBy = "";
    }
    public User(String firstName, String lastName, String email, String hearFrom, String checkYes, String contactBy)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.hearFrom = hearFrom;
        this.checkYes = checkYes;
        this.contactBy = contactBy;
    }
    public String getContactBy() {
        return contactBy;
    }
    public void setContactBy(String contactBy) {
        this.contactBy = contactBy;
    }
    public String getCheckYes() {
        return checkYes;
    }
    public void setCheckYes(String checkYes) {
        this.checkYes = checkYes;
    }
    public String getHearFrom() {
        return hearFrom;
    }
    public void setHearFrom(String hearFrom) {
        this.hearFrom = hearFrom;
    }
}