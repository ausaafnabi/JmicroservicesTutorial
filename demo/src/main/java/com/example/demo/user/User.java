package com.example.demo.user;

import java.util.Date;

public class User {
    private Integer id;

    private String name;

    private Date dateOfBirth;

    
    protected User(){
        
    }

    public Integer getId() {
        return id;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("User : [id : %s, name: %s, birthDate : %s]",id, name, dateOfBirth);
    }

    public User(Integer id, String name, Date dateOfBirth) {
        super();
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
}
