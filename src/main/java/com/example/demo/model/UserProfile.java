package com.example.demo.model;

import jakarta.persistence.*;

@Entity

public class UserProfile(){
    private Long id;
    private String username;
    private String email;
    private String bio;
    private Boolean active;
    private Timestamp createAt;
    private Timestamp updateAt;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getBio(){
        return bio;
    }
    public void setEmail(String bio){
        this.bio=bio;
    }
    public Boolean getActive(){
        return active;
    }
    public void setActive(Boolean active){
        this.active=active;
    }
    public Timestamp getCreateat(){
        return createat;
    }
    public void setCreateat(Timestamp createat){
        this.createat=createat;
    }
    public Timestamp getUpdateat(){
        return updateat;
    }
    public void setUpdateat(Timestamp updateat){
        this.updateat=updateat;
    }
    public UserProfile(Long id,String username,String email,String bio,Boolean active,Timestamp createat,Timestamp updateat){
        this.id=id;
        this.username=username;
        this.email=email;
        this.bio=bio;
        this.active=active;
        this.createat=createat;
        this.updateat=updateat;
    }
    public UserProfile(){

    }
    
}
}
